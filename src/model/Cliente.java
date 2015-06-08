package model;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.*;

@Entity
@DiscriminatorValue("cliente")
public class Cliente extends Usuario {
	
	private Boolean estado;

	@OneToMany(mappedBy="cliente",cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	private List<Alquiler> alquileres;
	
	public Cliente(){
		
	}
	
	public Cliente(String nombre, String apellido, int dni, String domicilio,
			char sexo, Date fecha_nacimiento, String email,String password) {
		super(nombre, apellido, dni, domicilio, sexo, fecha_nacimiento, email,password);
		this.estado = true;
		this.alquileres = new LinkedList<Alquiler>();
	}
	
	public Alquiler retirar_bici(Bicicleta bicicleta){
		return null;
	}
	
	public Alquiler estacionar_bici(Bicicleta bicicleta){
		return null;
	}
	
	public Denuncia denunciar_bici(Bicicleta bicicleta){
		return null;
	}
	
	//setters y getters

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public List<Alquiler> getAlquileres() {
		return alquileres;
	}

	public void setAlquileres(List<Alquiler> alquileres) {
		this.alquileres = alquileres;
	}

	public void agregarAlquiler(Alquiler unAlquiler) {
		this.alquileres.add(unAlquiler);
	}
	
	public void removerAlquiler(Alquiler unAlquiler) {
		this.alquileres.remove(unAlquiler);
	}
	
}
