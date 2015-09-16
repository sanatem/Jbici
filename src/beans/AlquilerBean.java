package beans;

import java.util.ArrayList;

import interfacesDAO.EstacionDAO;
import interfacesDAO.FactoryDAO;
import interfacesDAO.UsuarioDAO;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import model.Estacion;
import model.Usuario;

@ManagedBean(name="alquiler")
@SessionScoped

public class AlquilerBean {

	private FactoryDAO factory = new FactoryDAO();
	
	private ArrayList<Estacion> estaciones = getAllEstaciones();;
	
	private Usuario user;
	
	public AlquilerBean(){
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

	private ArrayList<Estacion> getAllEstaciones() {
        EstacionDAO estaciondao = factory.getEstacionDAO();
        this.estaciones = (ArrayList<Estacion>) estaciondao.getAllEstaciones();
        return estaciones;

	}
	
	
	
	
}
