package daoHiberJPA;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import interfacesDAO.ClienteDAO;
import model.Alquiler;
import model.Cliente;
import model.Usuario;

public class ClienteDAOhiberJPA extends GenericDAOhiberJPA<Cliente> implements ClienteDAO{
	public ClienteDAOhiberJPA() {
		super(Cliente.class);
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

	@Override
	public List<Usuario> getAllClients() {
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		List<Usuario> result = null;
		etx.begin();
			Query q = em.createQuery("FROM Cliente");
			result = q.getResultList();
		etx.commit();
		
		return  result;
	}
	
}
