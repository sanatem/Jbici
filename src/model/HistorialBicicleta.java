package model;

import java.sql.Timestamp;

import javax.persistence.*;

@Entity
@Table(name="historial_bicicleta")
public class HistorialBicicleta {
	
	
	@Id@GeneratedValue
	@Column(name="id_historial")
	private Long idHistorialBicicleta;

	private Timestamp fecha;
	
	@OneToOne(optional=false)
	private EstadoBicicleta estado;
	
	public HistorialBicicleta(){
		
	}
	
	public Timestamp getFecha() {
		return fecha;
	}
	public void setFecha(Timestamp fecha) {
		this.fecha = fecha;
	}
	public EstadoBicicleta getEstado() {
		return estado;
	}
	public void setEstado(EstadoBicicleta estado) {
		this.estado = estado;
	}

	public Long getHistorialBicicletaId() {
		return idHistorialBicicleta;
	}

	public void setHistorialBicicletaId(Long historialBicicletaId) {
		this.idHistorialBicicleta = historialBicicletaId;
	}
	

}
