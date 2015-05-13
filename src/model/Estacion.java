package model;

import java.util.LinkedList;

public class Estacion {
	
	//Instance variables
	private String nombre;
	private int estacionamientosLibres;
	private EstadoEstacion estadoEstacion;
	private LinkedList<Bicicleta> bicicletas;
	private Ubicacion ubicacionEstacion;

	public Estacion(String nombre, int estacionamientosLibres,
			EstadoEstacion estadoEstacion) {
		super();
		this.nombre = nombre;
		this.estacionamientosLibres = estacionamientosLibres;
		this.estadoEstacion = estadoEstacion;
		this.setBicicletas(new LinkedList<Bicicleta>());
	}

	//Getters & Setters
	public int getEstacionamientosLibres() {
		return estacionamientosLibres;
	}

	public void setEstacionamientosLibres(int estacionamientosLibres) {
		this.estacionamientosLibres = estacionamientosLibres;
	}

	public EstadoEstacion getEstadoEstacion() {
		return estadoEstacion;
	}

	public void setEstadoEstacion(EstadoEstacion estadoEstacion) {
		this.estadoEstacion = estadoEstacion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	
}
