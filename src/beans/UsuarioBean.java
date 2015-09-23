package beans;

import interfacesDAO.FactoryDAO;
import interfacesDAO.UsuarioDAO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import model.Usuario;

import java.util.Date;
@ManagedBean(name="userBean")
@SessionScoped
public class UsuarioBean {

	private FactoryDAO factory = new FactoryDAO();
		
	public Usuario user;
	public String message;
	private String pass_verify;
	
	public UsuarioBean(){	
		super();
		HttpSession session = (HttpSession)
		          FacesContext.
		          getCurrentInstance().
		          getExternalContext().
		          getSession(true);
		Long user_id = (Long) session.getAttribute("userid");	
		UsuarioDAO userdao = factory.getUsuarioDAO();
		Usuario found_user = userdao.recuperar(user_id);
		
		if(found_user!=null){			
			this.user = found_user;

		}
	}
	
	public String actualizar(){
		UsuarioDAO userdao = factory.getUsuarioDAO();
		if(user.getPassword().equals(getPass_verify())){
			userdao.actualizar(user);
			this.message="<div class='alert alert-success' role='alert'>Datos actualizados!</div>";
		}
		else{
			this.message="<div class='alert alert-danger' role='alert'>No pueden actualizarse los datos, contraseña erronea</div>";
		}

		return "modificar_datos";
	}
	
	
	//Getters & Setters
	
	public FactoryDAO getFactory() {
		return factory;
	}

	public void setFactory(FactoryDAO factory) {
		this.factory = factory;
	}

	public String getNombre() {
		return user.getNombre();
	}

	public void setNombre(String nombre) {
		this.user.setNombre(nombre);
	}

	public String getApellido() {
		return user.getApellido();
	}

	public void setApellido(String apellido) {
		this.user.setApellido(apellido);
	}

	public Integer getDni() {
		return user.getDni();
	}

	public void setDni(Integer dni) {
		this.user.setDni(dni);
	}

	public String getDomicilio() {
		return user.getDomicilio();
	}

	public void setDomicilio(String domicilio) {
		this.user.setDomicilio(domicilio);
	}

	public char getSexo() {
		return user.getSexo();
	}

	public void setSexo(char sexo) {
		this.user.setSexo(sexo);
	}

	public Date getFechan() {
		return user.getFecha_nacimiento();
	}

	public void setFechan(Date fechan) {
		this.user.setFechaNacimiento(fechan);
	}

	public String getEmail() {
		return user.getEmail();
	}

	public void setEmail(String email) {
		this.user.setEmail(email);
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	public Usuario getUser(){
		return user;
	}
	
	public void setUser( Usuario _user){
		this.user=_user;
	}

	public String getPass_verify() {
		return pass_verify;
	}

	public void setPass_verify(String pass_verify) {
		this.pass_verify = pass_verify;
	}
	
	
	
}
