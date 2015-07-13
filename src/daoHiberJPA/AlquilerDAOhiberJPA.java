package daoHiberJPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import interfacesDAO.AlquilerDAO;
import model.Alquiler;
import model.Denuncia;

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
	public List<Alquiler> recuperarAlquileres(Long cliente_id) {
		EntityManager em = super.emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
			Query q = em.createQuery("FROM Alquiler as a where a.cliente.idUsuario = ?1");
			q.setParameter(1, cliente_id);
			List<Alquiler> result =(List<Alquiler>) q.getResultList();
		etx.commit();
		em.close();
		return result;
	}
	
	
	
}
