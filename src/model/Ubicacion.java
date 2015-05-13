package model;

public class Ubicacion {
	//Instance variables
	private int codigoPostal;
	private long latitud;
	private long longitud;
	
	//Constructors
	public Ubicacion(int codigoPostal, long latitud, long longitud) {
		super();
		this.codigoPostal = codigoPostal;
		this.latitud = latitud;
		this.longitud = longitud;
	}
	
	//Getters & Setters
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public long getLatitud() {
		return latitud;
	}
	public void setLatitud(long latitud) {
		this.latitud = latitud;
	}
	public long getLongitud() {
		return longitud;
	}
	public void setLongitud(long longitud) {
		this.longitud = longitud;
	}
}
