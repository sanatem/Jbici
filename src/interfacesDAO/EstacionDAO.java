package interfacesDAO;

import java.io.Serializable;

import model.Estacion;
import model.Bicicleta;

import java.util.ArrayList;
import java.util.List;

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

	public List<Bicicleta> recuperarBicicletas(Long estacion_id);
	public List<Estacion> getAllEstaciones();
}
