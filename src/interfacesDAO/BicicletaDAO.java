package interfacesDAO;

import java.io.Serializable;
import java.util.List;

import model.Bicicleta;
import model.Alquiler;
import model.HistorialBicicleta;

public interface BicicletaDAO extends GenericDAO<Bicicleta>{
	@Override
	public Bicicleta actualizar(Bicicleta bicicleta);
	@Override
	public void borrar(Bicicleta bicicleta);
	@Override
	public Bicicleta borrar(Serializable id);
	@Override
	public boolean existe(Serializable id);
	@Override
	public Bicicleta persistir(Bicicleta bicicleta);
	@Override
	public Bicicleta recuperar(Serializable id);

	public List<Alquiler> recuperarAlquileres(Long bicicleta_id);
	
	public Bicicleta recuperarconHistorial(Long id_bici);
	

}
