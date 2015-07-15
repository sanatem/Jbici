package daoHiberJPA;

import java.io.Serializable;

import interfacesDAO.HistorialBicicletaDAO;
import model.HistorialBicicleta;

public class HistorialBicicletaDAOhiberJPA extends GenericDAOhiberJPA<HistorialBicicleta> implements HistorialBicicletaDAO{
	public HistorialBicicletaDAOhiberJPA() {
		super(HistorialBicicleta.class);
	}

	@Override
	public HistorialBicicleta actualizar(HistorialBicicleta entity) {
		// TODO Auto-generated method stub
		return super.actualizar(entity);
	}

	@Override
	public void borrar(HistorialBicicleta entity) {
		// TODO Auto-generated method stub
		super.borrar(entity);
	}

	@Override
	public HistorialBicicleta borrar(Serializable id) {
		// TODO Auto-generated method stub
		return super.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return super.existe(id);
	}

	@Override
	public HistorialBicicleta persistir(HistorialBicicleta entity) {
		// TODO Auto-generated method stub
		return super.persistir(entity);
	}

	@Override
	public HistorialBicicleta recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return super.recuperar(id);
	}



}
