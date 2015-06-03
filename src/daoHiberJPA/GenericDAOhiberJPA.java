package daoHiberJPA;
import java.io.Serializable;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;




import interfacesDAO.GenericDAO;

public class GenericDAOhiberJPA<T> implements GenericDAO<T> {

		private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("nombreDeLaUnidadDePersistencia");
		
		@Override
		public T actualizar(T entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public void borrar(T entity) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public T borrar(Serializable id) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public boolean existe(Serializable id) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T persistir(T entity) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public T recuperar(Serializable id) {
			// TODO Auto-generated method stub
			return null;
		}
}

