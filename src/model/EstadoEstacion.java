package model;

import javax.persistence.*;

@Entity
@Table(name="estado_estacion")
public class EstadoEstacion {
	
	@Id@GeneratedValue
	@Column(name="id")
	private Long idEstadoEstacion;
	private String descripcion;

	
	//constructores
	public EstadoEstacion(){
		
	}
	
	public EstadoEstacion(String descripcion) {
		super();
		this.descripcion = descripcion;
	}
	
	//Getter & Setter
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
