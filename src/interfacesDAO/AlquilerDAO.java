package interfacesDAO;
import java.io.Serializable;

import model.Alquiler;

public interface AlquilerDAO extends GenericDAO<Alquiler>{
	@Override
	public Alquiler actualizar(Alquiler alquiler);
	@Override
	public void borrar(Alquiler alquiler);
	@Override
	public Alquiler borrar(Serializable id);
	@Override
	public boolean existe(Serializable id);
	@Override
	public Alquiler persistir(Alquiler alquiler);
	@Override
	public Alquiler recuperar(Serializable id);

}
