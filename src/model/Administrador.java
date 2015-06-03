package model;

import java.util.Date;

import javax.persistence.*;

@Entity
@DiscriminatorValue("admin")
public class Administrador extends Usuario {
	

	public Administrador(){
		
	}
	
	public Administrador(String nombre, String apellido, int dni,
			String domicilio, char sexo, Date fecha_nacimiento, String email) {
		super(nombre, apellido, dni, domicilio, sexo, fecha_nacimiento, email);
	}
		
	public void habilitar_usuario(){
		
	}
	
	public void deshabilitar_usuario(){
		
	}	
	
}
