package model;

import java.util.Date;
import java.util.LinkedList;

public class Cliente extends Usuario {
	private Boolean estado;
	private LinkedList<Alquiler> alquileres;
	
	public Cliente(String nombre, String apellido, int dni, String domicilio,
			char sexo, Date fecha_nacimiento, String email) {
		super(nombre, apellido, dni, domicilio, sexo, fecha_nacimiento, email);
		this.estado = true;
		this.alquileres = new LinkedList<Alquiler>();
	}
	
	public Alquiler retirar_bici(Bicicleta bicicleta){
		return null;
	}
	
	public Alquiler estacionar_bici(Bicicleta bicicleta){
		return null;
	}
	
	public Denuncia denunciar_bici(Bicicleta bicicleta){
		return null;
	}
	
	//setters y getters

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public LinkedList<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(LinkedList<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}
	
	
}
