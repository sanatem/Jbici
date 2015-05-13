package jbprototipo;

public class Alquiler {
	private Cliente cliente;
	private Denuncia denuncia;
	private DateTime fecha_inicio;
	private DateTime fecha_fin;
	private DateTime fecha_devuelve;
	private Estacion estacion_retira;
	private Estacion estacion_devuelve;
	private Bicicleta bicicleta;
	
	public Alquiler(Cliente cliente, DateTime fecha_inicio, DateTime fecha_fin,
			Estacion estacion_retira, Bicicleta bicicleta) {
		super();
		this.cliente = cliente;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.estacion_retira = estacion_retira;
		this.bicicleta = bicicleta;
		this.fecha_devuelve = null;
		this.estacion_devuelve = null;
		this.denuncia = null;
	}
	
	
	
	
	

}
