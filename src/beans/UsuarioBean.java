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
	
	String nombre;
	String apellido;
	int dni;
	String domicilio;
	char sexo;
	Date fechan;
	String email;
	String password;
	String message;
	
	public UsuarioBean(){
		
		super();
		HttpSession session = (HttpSession)
		          FacesContext.
		          getCurrentInstance().
		          getExternalContext().
		          getSession(true);
		Long user_id = (Long) session.getAttribute("userid");	
		UsuarioDAO userdao = factory.getUsuarioDAO();
		Usuario user = userdao.recuperar(user_id);
		
		if(user!=null){
			this.nombre=user.getNombre();
			this.apellido=user.getApellido();
			this.dni=user.getDni();
			this.domicilio = user.getDomicilio();
			this.sexo = user.getSexo();
			this.fechan = user.getFecha_nacimiento();
			this.email=user.getEmail();
			
			
		}
	}
	

	
	
	
	public FactoryDAO getFactory() {
		return factory;
	}

	public void setFactory(FactoryDAO factory) {
		this.factory = factory;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Date getFechan() {
		return fechan;
	}

	public void setFechan(Date fechan) {
		this.fechan = fechan;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	
	
	
}
