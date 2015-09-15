package aspects;
import java.util.Arrays;
import java.util.Calendar;

import java.util.List;
import java.lang.reflect.*;
import java.sql.Timestamp;

import org.aspectj.lang.JoinPoint;



/**
 * 
 * @author Pravisani Santiago & Malcorra Nicolas.
 * El objetivo del siguiente aspecto es proveer un Log de los eventos ocurridos en el modelo de Jbici.
 * Nota: Podria utilizarse el patron Reflection, sin embargo para evitar errores inesperados crearemos pointcuts por
 * clase del modelo que desee generarse logs.
 */
public aspect LogAspect {
	
	private LoggerDAOhiberJPA logdao = new LoggerDAOhiberJPA();
	
	Object around(): execution(* daoHiberJPA.GenericDAOhiberJPA.*(..)) 
	&& !execution(* daoHiberJPA.GenericDAOhiberJPA.recuperar(..))
	&& !execution(* daoHiberJPA.GenericDAOhiberJPA.existe(..))
	
	{
	
	Object obj = proceed();
	//despues de guardar
	Logger abmLog = new Logger();
	abmLog.setTime(new java.sql.Timestamp(Calendar.getInstance().getTime().getTime()));
	Object[] args = thisJoinPoint.getArgs();
	String calledMethod = thisJoinPoint.getSignature().getName();
	for (Object object : args) {
		List<Class<?>> interfaces = Arrays.asList(object.getClass().getInterfaces());
		doLog(abmLog, object, interfaces, calledMethod);
	}
	return obj; 
}

private void doLog(Logger abmLog, Object entity, List<Class<?>> interfaces, String calledMethod) {
	Long entityId = null;
	String entityClass = null;
	Method[] methods = entity.getClass().getDeclaredMethods();
	
	for(Method m : methods){
		if(m.getName().equals("getId")){
			entityId = getEntityId(entity,m);
			break;
		}
	}
	entityClass = entity.getClass().getName();
	if(entityId!=null && entityClass != null && calledMethod != null){
		abmLog.setEntity_id(entityId);
		abmLog.setClass_name(entityClass);
		abmLog.setOperation(calledMethod);
		logdao.persistir(abmLog);
	}

	
}


	//Helpers
	
/*	private <T> void generate_log(Long id,T entity,JoinPoint jp){
		
		String method_name = jp.getSignature().getName();
		String class_name = entity.getClass().getSimpleName();
		Timestamp time = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
		Logger log = new Logger(method_name,time,class_name,id);
		logdao.persistir(log);
	}*/
	
	private Long getEntityId(Object entity,Method method) {
		Long id = null;
		try {
			id = ((Long)method.invoke(entity,null));
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		return id;
	}

	
}
