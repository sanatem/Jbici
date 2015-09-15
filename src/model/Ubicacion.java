package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ubicacion")
public class Ubicacion implements aspects.LogInterface{

	@Id@GeneratedValue
	@Column(name="id")
	private Long idUbicacion;
	
	private int latitud;

	private int longitud;
	private String direccionPostal;
	
	//Constructor
	public Ubicacion() {
		
	}
	
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
	
	public Long getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(Long idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	@Override
	public Long getId() {
		return getIdUbicacion();
	}
	
}
