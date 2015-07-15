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
	
	public pointcut logAdmin():execution(Administrador daoHiberJPA.AdministradorDAOhiberJPA.*(..));
	public pointcut logCliente():execution(Cliente interfacesDAO.ClienteDAO.*(..));
	public pointcut logAlquiler():execution(Alquiler daoHiberJPA.AlquilerDAOhiberJPA.*(..));
	public pointcut logBicicleta():execution(Bicicleta daoHiberJPA.BicicletaDAOhiberJPA.*(..));
	public pointcut logDenuncia():execution(Denuncia daoHiberJPA.DenunciaDAOhiberJPA.*(..));
	public pointcut logEstacion():execution(Estacion daoHiberJPA.EstacionDAOhiberJPA.*(..));
	public pointcut logEstadoBicicleta():execution(EstadoBicicleta daoHiberJPA.EstadoBicicletaDAOhiberJPA.*(..));
	public pointcut logEstadoEstacion():execution(EstadoEstacion daoHiberJPA.EstadoEstacionDAOhiberJPA.*(..));
	public pointcut logHistorialBicicleta():execution(HistorialBicicleta daoHiberJPA.HistorialBicicletaDAOhiberJPA.*(..));
	public pointcut logUbicacion():execution(Ubicacion daoHiberJPA.UbicacionDAOhiberJPA.*(..));
	
	
	
	//public pointcut recuperarPointcut():execution(* daoHiberJPA.*.recuperar(..));
	
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
	
	Object around():logAlquiler(){
		Object obj = proceed();
		Alquiler alq =(Alquiler) obj;
		if(alq!=null){	
			Long id = alq.getAlquilerId();
			this.generate_log(id,alq,thisJoinPoint);
		}
		
		return obj;
	}
	
	Object around():logBicicleta(){
		Object obj = proceed();
		Bicicleta bici =(Bicicleta) obj;
		if(bici!=null){	
			Long id = bici.getIdBicicleta();
			this.generate_log(id,bici,thisJoinPoint);
		}
		
		return obj;
	}	
	
	Object around():logDenuncia(){
		Object obj = proceed();
		Denuncia denuncia =(Denuncia) obj;
		if(denuncia!=null){	
			Long id = denuncia.getIdDenuncia();
			this.generate_log(id,denuncia,thisJoinPoint);
		}
		
		return obj;
	}	
	
	Object around():logEstacion(){
		Object obj = proceed();
		Estacion est =(Estacion) obj;
		if(est!=null){	
			Long id = est.getIdEstacion();
			this.generate_log(id,est,thisJoinPoint);
		}
		
		return obj;
	}		
	
	Object around():logEstadoBicicleta(){
		Object obj = proceed();
		EstadoBicicleta est =(EstadoBicicleta) obj;
		if(est!=null){	
			Long id = est.getIdEstadoBicicleta();
			this.generate_log(id,est,thisJoinPoint);
		}
		
		return obj;
	}
	
	Object around():logEstadoEstacion(){
		Object obj = proceed();
		EstadoEstacion est =(EstadoEstacion) obj;
		if(est!=null){	
			Long id = est.getIdEstadoEstacion();
			this.generate_log(id,est,thisJoinPoint);
		}
		
		return obj;
	}

	Object around():logHistorialBicicleta(){
		Object obj = proceed();
		HistorialBicicleta hist =(HistorialBicicleta) obj;
		if(hist!=null){	
			Long id = hist.getHistorialBicicletaId();
			this.generate_log(id,hist,thisJoinPoint);
		}
		
		return obj;
	}
	
	Object around():logUbicacion(){
		Object obj = proceed();
		Ubicacion ubicacion =(Ubicacion) obj;
		if(ubicacion!=null){	
			Long id = ubicacion.getIdUbicacion();
			this.generate_log(id,ubicacion,thisJoinPoint);
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
