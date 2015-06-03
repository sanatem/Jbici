package model;

import java.util.Date;
import java.util.LinkedList;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bicicleta")

public class Bicicleta {
	
	@Id@GeneratedValue
	private Long bicicletaId;
	private Date fechaIngreso;
	private EstadoBicicleta estadoActual;
	
	public Long getBicicletaId() {
		return bicicletaId;
	}


	public Bicicleta() {
		
	}


	public void setBicicletaId(Long bicicletaId) {
		this.bicicletaId = bicicletaId;
	}

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
