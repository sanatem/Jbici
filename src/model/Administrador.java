package jbprototipo;

import java.util.Date;
import java.util.LinkedList;

public class Administrador extends Usuario {

	public Administrador(String nombre, String apellido, int dni,
			String domicilio, char sexo, Date fecha_nacimiento, String email) {
		super(nombre, apellido, dni, domicilio, sexo, fecha_nacimiento, email);
	}
	
	public Bicicleta alta_bicicleta(Date fecha_ingreso, Estacion estacion){
		//Bicicleta bici = new Bicicleta(fecha_ingreso);
		//  estacion.agregar(bici);
		//return bici
		return null;
	}
	
	public Estacion alta_estacion(String nombre,Ubicacion ubicacion,int cant_bici,int estacionamientos_libres, EstadoEstacion estado){
		return null;
	}
	
	public LinkedList<Usuario> getUsuarios(){
		return null;
	}
	
	public void habilitar_usuario(){
		
	}
	
	public void deshabilitar_usuario(){
		
	}
	
	public Bicicleta modificar_bicicleta(Date fecha_ingreso){
		return null;
	}
	
	public Estacion modificar_estacion(String nombre,Ubicacion ubicacion,int cant_bici,int estacionamientos_libres, EstadoEstacion estado){
		return null;
	}

	public void eliminar_bicicleta(int id){
		
	}
	
	public void eliminar_estacion(int id){
		
	}
	
	public LinkedList<Estacion> getEstaciones(){
		return null;
	}
	
	public LinkedList<Bicicleta> getBicicletas(){
		return null;
	}
	
	public Bicicleta getBicicleta(int id){
		return null;
	}
	
	public Estacion getEstacion(int id){
		return null;
	}
	
	public Usuario getUsuario(int id){
		return null;
	}
	
	
	
	
}
