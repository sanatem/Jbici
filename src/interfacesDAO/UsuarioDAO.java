package interfacesDAO;

import java.io.Serializable;
import model.Usuario;

public interface UsuarioDAO extends GenericDAO<Usuario> {

	public Usuario autenticacion(String email,String password);
}
