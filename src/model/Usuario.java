package model;

import java.util.Date;

public abstract class Usuario {
	private String nombre;
	private String apellido;
	private int dni;
	private String domicilio;
	private char sexo;
	private Date fechaNacimiento;
	private String email;

	public Usuario(String nombre, String apellido, int dni, String domicilio,
			char sexo, Date fecha_nacimiento, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.domicilio = domicilio;
		this.sexo = sexo;
		this.fechaNacimiento = fecha_nacimiento;
		this.email = email;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getFecha_nacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fecha_nacimiento) {
		this.fechaNacimiento = fecha_nacimiento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
