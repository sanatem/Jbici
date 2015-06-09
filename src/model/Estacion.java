package model;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="estacion")
public class Estacion {
	

	@Id@GeneratedValue
	@Column(name="id")
	private Long idEstacion;
	
	private String nombre;
	private int estacionamientosLibres;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="estacion_id")
	private List<Bicicleta> bicicletas;
	
	@OneToOne(optional = false)
	private Ubicacion ubicacionEstacion;
	
	@OneToOne(optional = false)
	private EstadoEstacion estadoEstacion;
	
	
	//Constructor
	
	public Estacion(){
		
	}
	
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
	
	public Long getIdEstacion(){
		return this.idEstacion;
	}
	
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
	public List<Bicicleta> getBicicletas() {
		return bicicletas;
	}
	public void setBicicletas(List<Bicicleta> bicicletas) {
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
	
	//agregar bicicleta a la estacion
	public void agregarBicicleta(Bicicleta bici){
		this.bicicletas.add(bici);
	}
	
}
