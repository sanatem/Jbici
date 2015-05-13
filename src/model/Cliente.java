package jbprototipo;

import java.util.Date;

public class Cliente extends Usuario {
	private Boolean estado;

	public Cliente(String nombre, String apellido, int dni, String domicilio,
			char sexo, Date fecha_nacimiento, String email) {
		super(nombre, apellido, dni, domicilio, sexo, fecha_nacimiento, email);
		this.estado=true;
	}
	
	public Alquiler retirar_bici(Bicicleta bicicleta){
		return null;
		
	}
	
	public Denuncia denunciar_bici(Bicicleta bicicleta,String descripcion){
		return null;
		
	}
	
	public Devolucion estacionar_bici(Bicicleta bicicleta){
		return null;
	}
	
	
	/**
	 * Devuelve el estado de el usuario-cliente (  true = habilitado / false = deshabilitado )
	 * @return Boolean
	 */

	public Boolean getEstado() {
		return estado;
	}

	/**
	 * setea un estado para el usuario-cliente ( true = habilitado / false = deshabilitado)
	 * @param estado
	 */
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
	
	
	
	

}
