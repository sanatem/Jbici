package beans;

import interfacesDAO.EstacionDAO;
import interfacesDAO.EstadoEstacionDAO;
import interfacesDAO.FactoryDAO;
import interfacesDAO.UbicacionDAO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Estacion;
import model.EstadoEstacion;
import model.Ubicacion;

@ManagedBean(name="EstacionBean")
@SessionScoped
public class EstacionBean {
	
	Estacion estacion;
	public String message;
	Ubicacion ubicacion;
	EstadoEstacion estado_estacion;
	
	private FactoryDAO factory = new FactoryDAO();
	
	public EstacionBean(){
		super();
		this.estacion = new Estacion();
		this.ubicacion = new Ubicacion();
		this.estado_estacion= new EstadoEstacion();
	}
	
	public void borrarCampos(){
		this.estacion = new Estacion();
		this.ubicacion = new Ubicacion();
		this.estado_estacion= new EstadoEstacion();
	}
	
	
	public String agregar_estacion(){
		EstacionDAO estacionDAO = this.factory.getEstacionDAO();
		EstadoEstacionDAO estadoEstacionDAO = this.factory.getEstadoEstacion();
		UbicacionDAO ubicacionDAO = this.factory.getUbicacionDAO();
		boolean existe = estacionDAO.existeConNombre(getNombre());
		if (!existe){
			ubicacionDAO.persistir(this.ubicacion);
			estadoEstacionDAO.persistir(this.estado_estacion);
			this.estacion.setUbicacionEstacion(ubicacion);
			this.estacion.setEstadoEstacion(estado_estacion);
			estacionDAO.persistir(this.estacion);	
			this.message="<div class='alert alert-success' role='alert'>Estacion agregada con exito!</div>";
			this.borrarCampos();
			return "alta_estacion";
		}else{
			this.message="<div class='alert alert-danger' role='alert'>Ya existe una estacion con ese nombre</div>";
			return "alta_estacion";
		}
	}
	
	public String modificar_estacion(){
		UbicacionDAO ubidao = this.factory.getUbicacionDAO();
		EstadoEstacionDAO estadao = this.factory.getEstadoEstacion();
		EstacionDAO estacionDAO = this.factory.getEstacionDAO();
		estacionDAO.actualizar(this.estacion);	
		ubidao.actualizar(this.estacion.getUbicacionEstacion());
		estadao.actualizar(this.estacion.getEstadoEstacion());
		this.borrarCampos();
		return "administrar_estaciones";

	}

	 public String vista_modificar(Long id_estacion){
		 EstacionDAO estaDAO = this.factory.getEstacionDAO();
		 this.estacion = estaDAO.recuperar(id_estacion);
		 this.ubicacion=this.estacion.getUbicacionEstacion();
		 this.estado_estacion=this.estacion.getEstadoEstacion();
		 return "mod_estacion";
	 }
	

	//Setters and Getters

	
	
	public String getNombre() {
		return estacion.getNombre();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public double getLatitud() {
		return this.ubicacion.getLatitud();
	}

	public void setLatitud(double latitud) {
		this.ubicacion.setLatitud(latitud); 
	}

	public double getLongitud() {
		return this.ubicacion.getLongitud();
	}

	public void setLongitud(double longitud) {
		this.ubicacion.setLongitud(longitud); 
	}

	public EstadoEstacion getEstado_estacion() {
		return estacion.getEstadoEstacion();
	}

	public void setEstado_estacion(EstadoEstacion estado_estacion) {
		this.estacion.setEstadoEstacion(estado_estacion);;
	}

	public void setNombre(String nombre) {
		this.estacion.setNombre(nombre);
	}

	public Integer getCant_bicis() {
		return this.estacion.getEstacionamientosOcupados();
	}

	public void setCant_bicis(Integer cant_bicis) {
		this.estacion.setEstacionamientosOcupados(cant_bicis);
	}

	public Integer getCant_lugares() {
		return this.estacion.getEstacionamientosLibres();
	}

	public void setCant_lugares(Integer cant_lugares) {
		this.estacion.setEstacionamientosLibres(cant_lugares);
	}

	public String getCodpostal() {
		return this.ubicacion.getDireccionPostal();
	}

	public void setCodpostal(String codpostal) {
		this.ubicacion.setDireccionPostal(codpostal); 
	}

	public String getEstado() {
		return this.estado_estacion.getDescripcion();
	}

	public void setEstado(String estado) {
		this.estado_estacion.setDescripcion(estado);
	}

	public Ubicacion getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}

	public FactoryDAO getFactory() {
		return factory;
	}

	public void setFactory(FactoryDAO factory) {
		this.factory = factory;
	}
	
	

}
