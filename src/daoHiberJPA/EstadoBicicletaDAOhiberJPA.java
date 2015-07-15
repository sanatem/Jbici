package daoHiberJPA;

import java.io.Serializable;

import interfacesDAO.EstadoBicicletaDAO;
import model.EstadoBicicleta;

public class EstadoBicicletaDAOhiberJPA extends GenericDAOhiberJPA<EstadoBicicleta> implements EstadoBicicletaDAO {
	
	public EstadoBicicletaDAOhiberJPA(){
		super(EstadoBicicleta.class);
	}

	@Override
	public EstadoBicicleta actualizar(EstadoBicicleta entity) {
		// TODO Auto-generated method stub
		return super.actualizar(entity);
	}

	@Override
	public void borrar(EstadoBicicleta entity) {
		// TODO Auto-generated method stub
		super.borrar(entity);
	}

	@Override
	public EstadoBicicleta borrar(Serializable id) {
		// TODO Auto-generated method stub
		return super.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return super.existe(id);
	}

	@Override
	public EstadoBicicleta persistir(EstadoBicicleta entity) {
		// TODO Auto-generated method stub
		return super.persistir(entity);
	}

	@Override
	public EstadoBicicleta recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return super.recuperar(id);
	}
	

}
