package interfacesDAO;
import java.io.Serializable;

import model.Alquiler;

public interface AlquilerDAO extends GenericDAO<Alquiler>{

	public void borrarDenuncia(Long id);

}
