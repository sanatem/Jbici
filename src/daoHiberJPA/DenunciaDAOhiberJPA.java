package daoHiberJPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import interfacesDAO.DenunciaDAO;
import model.Alquiler;
import model.Denuncia;

public class DenunciaDAOhiberJPA extends GenericDAOhiberJPA<Denuncia> implements DenunciaDAO{
	public DenunciaDAOhiberJPA() {
		super(Denuncia.class);
	}
	
	
}