package aspects;
import java.util.Calendar;
import java.util.Date;
import java.sql.Timestamp;

import org.aspectj.lang.JoinPoint;

import model.*;
/**
 * 
 * @author Pravisani Santiago & Malcorra Nicolas.
 * El objetivo del siguiente aspecto es proveer un Log de los eventos ocurridos en el modelo de Jbici.
 * Nota: Podria utilizarse el patron Reflection, sin embargo para evitar errores inesperados crearemos pointcuts por
 * clase del modelo que desee generarse logs.
 */
public aspect LogAspect {
	
	private LoggerDAOhiberJPA logdao = new LoggerDAOhiberJPA();
	
	//Pointcuts
	//private pointcut persistirPointcut():execution(* daoHiberJPA.*.persistir(..));
	
	public pointcut logAdmin():execution(* daoHiberJPA.AdministradorDAOhiberJPA.*(..));
	public pointcut logCliente():execution(* interfacesDAO.ClienteDAO.*(..));
	public pointcut recuperarPointcut():execution(* daoHiberJPA.*.recuperar(..));
	
	
	//Advices
/*	Object around():persistirPointcut(){
		System.out.println(">>>>>>Se ejecutara el metodo :: " + thisJoinPoint.getSignature());
		Object obj = proceed();
		System.out.println(obj.getClass().getCanonicalName());
		System.out.println("------>Se ejecuto el metodo :: " + thisJoinPoint.getSignature());
		return obj;
	}*/
	
	Object around():logAdmin(){
		Object obj = proceed();
		Administrador admin =(Administrador) obj;
		if(admin!=null){
			System.out.println(">>>>>>>>>>>>>>DATOS A GUARDAR EN DB<<<<<<<<");
			Long id = admin.getIdUsuario();
			
			String method_name = thisJoinPoint.getSignature().getName();
			String class_name = admin.getClass().getSimpleName();
			Timestamp time = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
			Logger log = new Logger(method_name,time,class_name,id);
			logdao.persistir(log);
		}
		
		return obj;
	}
	
	Object around():logCliente(){
		Object obj = proceed();
		Cliente cli =(Cliente) obj;
		if(cli!=null){	
			Long id = cli.getIdUsuario();
			this.generate_log(id,cli,thisJoinPoint);
		}
		
		return obj;
		
	}
	

	//Helpers
	
	private <T> void generate_log(Long id,T entity,JoinPoint jp){
		
		String method_name = jp.getSignature().getName();
		String class_name = entity.getClass().getSimpleName();
		Timestamp time = new java.sql.Timestamp(Calendar.getInstance().getTime().getTime());
		Logger log = new Logger(method_name,time,class_name,id);
		logdao.persistir(log);
	}


}
