package daoHiberJPA;

import interfacesDAO.EstadoBicicletaDAO;
import model.EstadoBicicleta;

public class EstadoBicicletaDAOhiberJPA extends GenericDAOhiberJPA<EstadoBicicleta> implements EstadoBicicletaDAO {
	
	public EstadoBicicletaDAOhiberJPA(){
		super(EstadoBicicleta.class);
	}

}
