package daoHiberJPA;

import interfacesDAO.EstadoEstacionDAO;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

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
	
	@Override
	public List<EstadoEstacion> getAllEstadoEstacion(){
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		List<EstadoEstacion> result = null;
		etx.begin();
			Query q = em.createQuery("FROM EstadoEstacion");
			result = q.getResultList();
		etx.commit();
		return result;
	}
	
	
}
