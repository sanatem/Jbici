package jbprototipo;

import java.sql.Time;
import java.util.Date;

public class Alquiler extends Operacion {

	public Alquiler(Date fecha, Time hora, Bicicleta bicicleta,
			EstadoBicicleta estado_bicicleta, Estacion estacion) {
		super(fecha, hora, bicicleta, estado_bicicleta,estacion);
	}
}
