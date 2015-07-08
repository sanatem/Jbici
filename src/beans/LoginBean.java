package beans;
import interfacesDAO.FactoryDAO;
import interfacesDAO.UsuarioDAO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import model.Usuario;

@ManagedBean(name="loginBean")
@RequestScoped
public class LoginBean {

	String email;
	String password;
	String message;
	
	public LoginBean(){
		
	}
	
	public LoginBean(String email,String password){
		this.email = email;
		this.password = password;
   	}
	
    public String login(){
    	//Traer el dao del usuario. X 
    	//Hacer la consulta a la DB usando el dao. -> User | null X
    	
    	FactoryDAO factory = new FactoryDAO();
    	UsuarioDAO userdao = factory.getUsuarioDAO();
    	Usuario user = userdao.autenticacion(email, password);
    	if(user != null) {
    		
    		if(user instanceof model.Cliente){
        		//Es cliente
        		return "/user/home"+"?faces-redirect=true";
    		}
    		else{
    			//Es admin
        		return "admin/admin"+"?faces-redirect=true";
    		}
    		

    	} else {
    		message ="<div class='alert alert-danger'>Nombre de usuario o Contrase�a inv�lidos</div>";
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
