package jbprototipo;

import java.sql.Time;
import java.util.Date;

public class Devolucion extends Operacion {

	public Devolucion(Date fecha, Time hora, Bicicleta bicicleta,
			EstadoBicicleta estado_bicicleta, Estacion estacion) {
		super(fecha, hora, bicicleta, estado_bicicleta, estacion);
	}
}
