package model;

import java.util.LinkedList;

public class Estacion {
	private String nombre;
	private int estacionamientosLibres;
	private LinkedList<Bicicleta> bicicletas;
	private Ubicacion ubicacionEstacion;
	private EstadoEstacion estadoEstacion;
	
	
	//Constructor
	public Estacion(String nombre, int estacionamientosLibres,
			Ubicacion ubicacionEstacion, EstadoEstacion estadoEstacion) {
		super();
		this.nombre = nombre;
		this.estacionamientosLibres = estacionamientosLibres;
		this.ubicacionEstacion = ubicacionEstacion;
		this.estadoEstacion = estadoEstacion;
		this.bicicletas = new LinkedList<Bicicleta>();
	}
	//Getter & Setter
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEstacionamientosLibres() {
		return estacionamientosLibres;
	}
	public void setEstacionamientosLibres(int estacionamientosLibres) {
		this.estacionamientosLibres = estacionamientosLibres;
	}
	public LinkedList<Bicicleta> getBicicletas() {
		return bicicletas;
	}
	public void setBicicletas(LinkedList<Bicicleta> bicicletas) {
		this.bicicletas = bicicletas;
	}
	public Ubicacion getUbicacionEstacion() {
		return ubicacionEstacion;
	}
	public void setUbicacionEstacion(Ubicacion ubicacionEstacion) {
		this.ubicacionEstacion = ubicacionEstacion;
	}
	public EstadoEstacion getEstadoEstacion() {
		return estadoEstacion;
	}
	public void setEstadoEstacion(EstadoEstacion estadoEstacion) {
		this.estadoEstacion = estadoEstacion;
	}
	
	
	
}
