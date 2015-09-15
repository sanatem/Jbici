package daoHiberJPA;

import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;



import interfacesDAO.UsuarioDAO;

import model.Usuario;

public class UsuarioDAOhiberJPA extends GenericDAOhiberJPA<Usuario> implements UsuarioDAO{
	
	public UsuarioDAOhiberJPA() {
		super(Usuario.class);
	}
	
	public List<Usuario> getAllUsers() {
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		List<Usuario> result = null;
		etx.begin();
			Query q = em.createQuery("FROM Usuario");
			result = q.getResultList();
		etx.commit();
		
		return result;
	}

	@Override
	public Usuario actualizar(Usuario entity) {
		return super.actualizar(entity);
	}

	@Override
	public void borrar(Usuario entity) {
		// TODO Auto-generated method stub
		super.borrar(entity);
	}

	@Override
	public Usuario borrar(Serializable id) {
		// TODO Auto-generated method stub
		return super.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return super.existe(id);
	}

	@Override
	public Usuario persistir(Usuario entity) {
		// TODO Auto-generated method stub
		return super.persistir(entity);
	}

	@Override
	public Usuario recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return super.recuperar(id);
	}
	
	public Usuario autenticacion(String email,String password){
		EntityManager em = this.emf.createEntityManager();
		EntityTransaction etx = em.getTransaction();
		List<Usuario> result = null;
		etx.begin();
			Query q = em.createQuery("FROM Usuario as u WHERE u.email = :email and u.password = :password");
			q.setParameter("email", email);
			q.setParameter("password", password);
			result = q.getResultList();
			etx.commit();
			if (result.isEmpty()){
				return null;
			}
			else{
				return result.get(0);
			}
			
	}
	
}
