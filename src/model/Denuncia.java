package jbprototipo;

import java.sql.Time;
import java.util.Date;

public class Denuncia extends Operacion {
	
	private String descripcion;

	public Denuncia(Date fecha, Time hora, Bicicleta bicicleta,
			EstadoBicicleta estado_bicicleta, Estacion estacion, String descripcion) {
		super(fecha, hora, bicicleta, estado_bicicleta, estacion);
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
