package model;

public class Denuncia {
	private DateTime fecha_denuncia;
	private String descripcion;
	
	public Denuncia(DateTime fecha_denuncia, String descripcion) {
		super();
		this.fecha_denuncia = fecha_denuncia;
		this.descripcion = descripcion;
	}

	public DateTime getFecha_denuncia() {
		return fecha_denuncia;
	}

	public void setFecha_denuncia(DateTime fecha_denuncia) {
		this.fecha_denuncia = fecha_denuncia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
