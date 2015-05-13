package model;

public class EstadoBicicleta {
	//Instance variables
	private int codigo;
	private String descripcion;
	
	//Constructors
	public EstadoBicicleta(int codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	//Getters & Setters
	/**
	 * Devuelve el codigo del estado.
	 * @return int
	 */
	public int getCodigo() {
		return codigo;
	}
	/**
	 * Setea un codigo.
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * Devuelve la descripcion del estado.
	 * @return String
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	/**
	 * Setea una descripcion
	 * @param descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
