package model;

import java.sql.Time;
import java.util.Date;

public class DateTime {
	private Date fecha;
	private Time hora;
	
	public DateTime(Date fecha, Time hora) {
		super();
		this.fecha = fecha;
		this.hora = hora;
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
	
	
	
	
	

}
