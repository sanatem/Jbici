package daoHiberJPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import interfacesDAO.BicicletaDAO;
import model.Alquiler;
import model.Bicicleta;
import model.HistorialBicicleta;

public class BicicletaDAOhiberJPA extends GenericDAOhiberJPA<Bicicleta> implements BicicletaDAO {
	
	public BicicletaDAOhiberJPA() {
		super(Bicicleta.class);
	}

	@Override
	public List<Alquiler> recuperarAlquileres(Long bicicleta_id) {
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
	public Bicicleta recuperarconHistorial(Long id_bici) {
		EntityManager em = super.emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		etx.begin();
			Bicicleta entity = em.find(Bicicleta.class, id_bici);
			if(entity!= null){
				entity.getHistorial().size();
			}
			etx.commit();
		em.close();
		
		return entity;
	}
	
}
