package daoHiberJPA;

import interfacesDAO.DenunciaDAO;
import model.Denuncia;

public class DenunciaDAOhiberJPA extends GenericDAOhiberJPA<Denuncia> implements DenunciaDAO{
	public DenunciaDAOhiberJPA() {
		super(Denuncia.class);
	}
	
}