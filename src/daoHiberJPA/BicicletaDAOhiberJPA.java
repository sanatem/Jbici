package daoHiberJPA;

import interfacesDAO.BicicletaDAO;
import model.Bicicleta;

public class BicicletaDAOhiberJPA extends GenericDAOhiberJPA<Bicicleta> implements BicicletaDAO {
	
	public BicicletaDAOhiberJPA() {
		super(Bicicleta.class);
	}
	
}
