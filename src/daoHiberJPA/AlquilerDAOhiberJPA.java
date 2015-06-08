package daoHiberJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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
	
	
	
}
