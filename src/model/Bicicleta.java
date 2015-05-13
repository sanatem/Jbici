package model;

import java.util.Date;

public class Bicicleta {
	
	//Instance variables
	private Date fechaIngreso;
	private EstadoBicicleta estadoBicicleta;
	
	//Constructors
	public Bicicleta(Date fechaIngreso) {
		super();
		this.fechaIngreso = fechaIngreso;
	}

	//Getters & Setters
	
	/**
	 * Devuelve la fecha de ingreso de la bicicleta
	 * @return Date
	 */
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	/**
	 * Setea una fecha de ingreso.
	 * @param fechaIngreso
	 */
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	
	/**
	 * Devuelve el estado de la bicicleta
	 * @return EstadoBicicleta
	 */
	public EstadoBicicleta getEstadoBicicleta() {
		return estadoBicicleta;
	}
	/**
	 * Setea el estado de la bicicleta
	 * @param estadoBicicleta
	 */
	public void setEstadoBicicleta(EstadoBicicleta estadoBicicleta) {
		this.estadoBicicleta = estadoBicicleta;
	}
	
}
