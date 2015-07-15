package daoHiberJPA;

import java.io.Serializable;

import interfacesDAO.EstadoEstacionDAO;
import model.EstadoEstacion;

public class EstadoEstacionDAOhiberJPA extends GenericDAOhiberJPA<EstadoEstacion> implements EstadoEstacionDAO{
	public EstadoEstacionDAOhiberJPA() {
		super(EstadoEstacion.class);
	}

	@Override
	public EstadoEstacion actualizar(EstadoEstacion entity) {
		// TODO Auto-generated method stub
		return super.actualizar(entity);
	}

	@Override
	public void borrar(EstadoEstacion entity) {
		// TODO Auto-generated method stub
		super.borrar(entity);
	}

	@Override
	public EstadoEstacion borrar(Serializable id) {
		// TODO Auto-generated method stub
		return super.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return super.existe(id);
	}

	@Override
	public EstadoEstacion persistir(EstadoEstacion entity) {
		// TODO Auto-generated method stub
		return super.persistir(entity);
	}

	@Override
	public EstadoEstacion recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return super.recuperar(id);
	}
	
}
