package interfacesDAO;

import java.io.Serializable;

import model.Bicicleta;

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

}
