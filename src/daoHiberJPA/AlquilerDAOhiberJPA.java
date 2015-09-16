package daoHiberJPA;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import interfacesDAO.AlquilerDAO;
import model.Alquiler;
import model.Cliente;


public class AlquilerDAOhiberJPA extends GenericDAOhiberJPA<Alquiler> implements AlquilerDAO {
	
	public AlquilerDAOhiberJPA(){
		super(Alquiler.class);
	}

	public void borrarDenuncia(Long id) {
		EntityManager em =  emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
			Alquiler alquiler = em.find(Alquiler.class, id);
			alquiler.quitarDenuncia();
			em.merge(alquiler);
			em.flush();
		etx.commit();
		em.close();
	}
	
	@Override
	public List<Alquiler> recuperarAlquileresPorCliente(Long cliente_id) {
		EntityManager em = super.emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
			Query q = em.createQuery("FROM Alquiler as a where a.cliente.id = :id_cli and a.fecha_devuelve = NULL");
			q.setParameter("id_cli", cliente_id);
			List<Alquiler> result = q.getResultList();
		etx.commit();
		em.close();
		return result;
	}
	
	@Override
	public List<Alquiler> recuperarAlquileresPorBicicleta(Long bicicleta_id) {
		EntityManager em = super.emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
			Query q = em.createQuery("FROM Alquiler as a where a.bicicleta.idBicicleta = :id_bici");
			q.setParameter("id_bici", bicicleta_id);
			List<Alquiler> result = q.getResultList();
		etx.commit();
		em.close();
		return result;
	}

	@Override
	public Alquiler actualizar(Alquiler entity) {
		// TODO Auto-generated method stub
		return super.actualizar(entity);
	}

	@Override
	public void borrar(Alquiler entity) {
		// TODO Auto-generated method stub
		super.borrar(entity);
	}

	@Override
	public Alquiler borrar(Serializable id) {
		// TODO Auto-generated method stub
		return super.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return super.existe(id);
	}

	@Override
	public Alquiler persistir(Alquiler entity) {
		// TODO Auto-generated method stub
		return super.persistir(entity);
	}

	@Override
	public Alquiler recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return super.recuperar(id);
	}
	
	
	
}
