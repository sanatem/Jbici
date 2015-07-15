package daoHiberJPA;

import java.io.Serializable;
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



	@Override
	public Bicicleta actualizar(Bicicleta entity) {
		// TODO Auto-generated method stub
		return super.actualizar(entity);
	}



	@Override
	public void borrar(Bicicleta entity) {
		// TODO Auto-generated method stub
		super.borrar(entity);
	}



	@Override
	public Bicicleta borrar(Serializable id) {
		// TODO Auto-generated method stub
		return super.borrar(id);
	}



	@Override
	public boolean existe(Serializable id) {
		// TODO Auto-generated method stub
		return super.existe(id);
	}



	@Override
	public Bicicleta persistir(Bicicleta entity) {
		// TODO Auto-generated method stub
		return super.persistir(entity);
	}



	@Override
	public Bicicleta recuperar(Serializable id) {
		// TODO Auto-generated method stub
		return super.recuperar(id);
	}
	
	
}
