package daoHiberJPA;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import interfacesDAO.EstacionDAO;
import model.Bicicleta;
import model.Estacion;

public class EstacionDAOhiberJPA extends GenericDAOhiberJPA<Estacion> implements EstacionDAO{
	public EstacionDAOhiberJPA() {
		super(Estacion.class);
	}

	@Override
	public List<Bicicleta> recuperarBicicletas(Long estacion_id) {
		EntityManager em = super.emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
			Query q = em.createQuery("FROM Bicicleta as b WHERE b.estacionActual.idEstacion = :idest");
			q.setParameter("idest", estacion_id);
			List<Bicicleta> res = q.getResultList(); 
		etx.commit();
		em.close();
		return res;
	}

	@Override
	public Estacion actualizar(Estacion entity) {
		// TODO Auto-generated method stub
		return super.actualizar(entity);
	}

	@Override
	public void borrar(Estacion entity) {
		// TODO Auto-generated method stub
		super.borrar(entity);
	}

	@Override
	public Estacion borrar(Serializable id) {
		// TODO Auto-generated method stub
		return super.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return super.existe(id);
	}

	@Override
	public Estacion persistir(Estacion entity) {
		// TODO Auto-generated method stub
		return super.persistir(entity);
	}

	@Override
	public Estacion recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return super.recuperar(id);
	}
	
}