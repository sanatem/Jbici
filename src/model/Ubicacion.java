package model;

public class Ubicacion {

	private int latitud;
	private int longitud;
	private String direccionPostal;
	
	//Constructor
	public Ubicacion(int latitud, int longitud, String direccionPostal) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
		this.direccionPostal = direccionPostal;
	}
	
	//getter & setter
	public int getLatitud() {
		return latitud;
	}
	public void setLatitud(int latitud) {
		this.latitud = latitud;
	}
	public int getLongitud() {
		return longitud;
	}
	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}
	public String getDireccionPostal() {
		return direccionPostal;
	}
	public void setDireccionPostal(String direccionPostal) {
		this.direccionPostal = direccionPostal;
	}
	
	
}
