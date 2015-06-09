package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="estado_bicicleta")

public class EstadoBicicleta {
	
	@Id@GeneratedValue
	@Column(name="id")
	private Long idEstadoBicicleta;
	
	private String descripcion;
	
	
	public EstadoBicicleta(){
		
	}
	
	
	public EstadoBicicleta(String descripcion) {
		this.descripcion = descripcion;
	}
	
	//Getter y Setter
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Long getIdEstadoBicicleta() {
		return this.idEstadoBicicleta;
	}
	
	
	
}
