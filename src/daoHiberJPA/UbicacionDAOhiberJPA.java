package daoHiberJPA;

import java.io.Serializable;

import interfacesDAO.UbicacionDAO;
import model.Ubicacion;

public class UbicacionDAOhiberJPA extends GenericDAOhiberJPA<Ubicacion> implements UbicacionDAO{
	public UbicacionDAOhiberJPA() {
		super(Ubicacion.class);
	}

	@Override
	public Ubicacion actualizar(Ubicacion entity) {
		// TODO Auto-generated method stub
		return super.actualizar(entity);
	}

	@Override
	public void borrar(Ubicacion entity) {
		// TODO Auto-generated method stub
		super.borrar(entity);
	}

	@Override
	public Ubicacion borrar(Serializable id) {
		// TODO Auto-generated method stub
		return super.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return super.existe(id);
	}

	@Override
	public Ubicacion persistir(Ubicacion entity) {
		// TODO Auto-generated method stub
		return super.persistir(entity);
	}

	@Override
	public Ubicacion recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return super.recuperar(id);
	}
	
	
	
	
	
}
