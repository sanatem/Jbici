package model;

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

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Denuncia getDenuncia() {
		return denuncia;
	}

	public void setDenuncia(Denuncia denuncia) {
		this.denuncia = denuncia;
	}

	public DateTime getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(DateTime fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public DateTime getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(DateTime fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public DateTime getFecha_devuelve() {
		return fecha_devuelve;
	}

	public void setFecha_devuelve(DateTime fecha_devuelve) {
		this.fecha_devuelve = fecha_devuelve;
	}

	public Estacion getEstacion_retira() {
		return estacion_retira;
	}

	public void setEstacion_retira(Estacion estacion_retira) {
		this.estacion_retira = estacion_retira;
	}

	public Estacion getEstacion_devuelve() {
		return estacion_devuelve;
	}

	public void setEstacion_devuelve(Estacion estacion_devuelve) {
		this.estacion_devuelve = estacion_devuelve;
	}

	public Bicicleta getBicicleta() {
		return bicicleta;
	}

	public void setBicicleta(Bicicleta bicicleta) {
		this.bicicleta = bicicleta;
	}
	
	
	
	
	

}
