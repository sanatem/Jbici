package interfacesDAO;
import java.io.Serializable;
import java.util.List;

import model.Alquiler;

public interface AlquilerDAO extends GenericDAO<Alquiler>{

	public void borrarDenuncia(Long id);

	List<Alquiler> recuperarAlquileres(Long cliente_id);

}
