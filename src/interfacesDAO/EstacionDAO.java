package interfacesDAO;

import java.io.Serializable;

import model.Estacion;

public interface EstacionDAO extends GenericDAO<Estacion> {
	@Override
	public Estacion actualizar(Estacion estacion);
	@Override
	public void borrar(Estacion estacion);
	@Override
	public Estacion borrar(Serializable id);
	@Override
	public boolean existe(Serializable id);
	@Override
	public Estacion persistir(Estacion estacion);
	@Override
	public Estacion recuperar(Serializable id);


}
