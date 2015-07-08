package beans;
import interfacesDAO.FactoryDAO;
import interfacesDAO.UsuarioDAO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import model.Usuario;

@ManagedBean(name="loginBean")
@RequestScoped
public class LoginBean {

	public String email;
	public String password;
	public String message;
	private FactoryDAO factory = new FactoryDAO();
    
	public String login(){
    	
    	UsuarioDAO userdao = factory.getUsuarioDAO();
    	Usuario user = userdao.autenticacion(email, password);
    	if(user != null) {
    		
    		if(user instanceof model.Cliente){
        		message ="ES CLIENTE";
        		return "success"+"?faces-redirect=true";
    		}
    		else{
        		message ="ES ADMIN";
        		return "admin/admin"+"?faces-redirect=true";
    		}
    		

    	} else {
    		message ="<div class='alert alert-danger'>Nombre de usuario o Contraseña inválidos</div>";
    		return "login";
    	}
    }
    
    public String logout(){
    	return null;
    }
    
    
    
    public String getMessage() {
	return message;
    }
    public void setMessage(String message) {
	this.message = message;
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
	
	
}
