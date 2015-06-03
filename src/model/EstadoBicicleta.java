package model;

import javax.persistence.*;

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
	
	
	
}
