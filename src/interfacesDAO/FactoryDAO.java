package interfacesDAO;

import daoHiberJPA.BicicletaDAOhiberJPA;

public class FactoryDAO {
	
	public BicicletaDAO getBicicletaDAO(){
		return new BicicletaDAOhiberJPA();
	}

}

