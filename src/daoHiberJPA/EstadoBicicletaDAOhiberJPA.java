package daoHiberJPA;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import interfacesDAO.EstadoBicicletaDAO;
import model.Estacion;
import model.EstadoBicicleta;

public class EstadoBicicletaDAOhiberJPA extends GenericDAOhiberJPA<EstadoBicicleta> implements EstadoBicicletaDAO {
	
	public EstadoBicicletaDAOhiberJPA(){
		super(EstadoBicicleta.class);
	}

	@Override
	public EstadoBicicleta actualizar(EstadoBicicleta entity) {
		return super.actualizar(entity);
	}

	@Override
	public void borrar(EstadoBicicleta entity) {
		super.borrar(entity);
	}

	@Override
	public EstadoBicicleta borrar(Serializable id) {

		return super.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {

		return super.existe(id);
	}

	@Override
	public EstadoBicicleta persistir(EstadoBicicleta entity) {

		return super.persistir(entity);
	}

	@Override
	public EstadoBicicleta recuperar(Serializable id) {

		return super.recuperar(id);
	}

	@Override
	public List<EstadoBicicleta> getAllEstadoBicicleta() {
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		List<EstadoBicicleta> result = null;
		etx.begin();
			Query q = em.createQuery("FROM EstadoBicicleta");
			result = q.getResultList();
		etx.commit();
		return result;		

	}
	

}
