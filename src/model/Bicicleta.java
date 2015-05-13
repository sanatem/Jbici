package model;

import java.util.Date;
import java.util.LinkedList;

public class Bicicleta {
	
	private Date fechaIngreso;
	private EstadoBicicleta estadoActual;
	private LinkedList<Alquiler> alquileres;
	

	public Bicicleta(Date fechaIngreso, EstadoBicicleta estadoActual) {
		super();
		this.fechaIngreso = fechaIngreso;
		this.estadoActual = estadoActual;
		this.alquileres = new LinkedList<Alquiler>();
	}

	//Getter & setter
	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public LinkedList<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(LinkedList<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}

	public EstadoBicicleta getEstadoActual() {
		return estadoActual;
	}

	public void setEstadoActual(EstadoBicicleta estadoActual) {
		this.estadoActual = estadoActual;
	}
	
	
	
}
