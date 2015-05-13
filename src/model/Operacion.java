package jbprototipo;

import java.sql.Time;
import java.util.Date;

public abstract class Operacion {
	private Date fecha;
	private Time hora;
	private Bicicleta bicicleta;
	private EstadoBicicleta estado_bicicleta;
	private Estacion estacion;
	
	public Operacion(Date fecha, Time hora, Bicicleta bicicleta, EstadoBicicleta estado_bicicleta, Estacion estacion) {
		this.fecha = fecha;
		this.hora = hora;
		this.bicicleta = bicicleta;
		this.estado_bicicleta = estado_bicicleta;
		this.estacion = estacion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Time getHora() {
		return hora;
	}

	public void setHora(Time hora) {
		this.hora = hora;
	}

	public Bicicleta getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}

	public EstadoBicicleta getEstado_bicicleta() {
		return estado_bicicleta;
	}

	public void setEstado_bicicleta(EstadoBicicleta estado_bicicleta) {
		this.estado_bicicleta = estado_bicicleta;
	}

	public Estacion getEstacion() {
		return estacion;
	}

	public void setEstacion(Estacion estacion) {
		this.estacion = estacion;
	}
	
	

}
