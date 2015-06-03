package interfacesDAO;

import java.io.Serializable;

import model.EstadoBicicleta;

public interface EstadoBicicletaDAO extends GenericDAO<EstadoBicicleta>{
	@Override
	public EstadoBicicleta actualizar(EstadoBicicleta estado);
	@Override
	public void borrar(EstadoBicicleta estado);
	@Override
	public EstadoBicicleta borrar(Serializable id);
	@Override
	public boolean existe(Serializable id);
	@Override
	public EstadoBicicleta persistir(EstadoBicicleta estado);
	@Override
	public EstadoBicicleta recuperar(Serializable id);


}
