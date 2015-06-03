package model;

import java.sql.Timestamp;

import javax.persistence.*;
@Entity
@Table(name="denuncia")
public class Denuncia {
	
	private Timestamp fecha_denuncia;
	
	private String descripcion;
	
	@Id@GeneratedValue
	@Column(name="id")
	private Long idDenuncia;
	
	public Denuncia(){
		
	}
	
	public Denuncia(Timestamp fecha_denuncia, String descripcion) {
		super();
		this.fecha_denuncia = fecha_denuncia;
		this.descripcion = descripcion;
	}

	public Timestamp getFecha_denuncia() {
		return fecha_denuncia;
	}

	public void setFecha_denuncia(Timestamp fecha_denuncia) {
		this.fecha_denuncia = fecha_denuncia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
