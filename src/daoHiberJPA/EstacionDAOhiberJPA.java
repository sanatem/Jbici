package daoHiberJPA;

import interfacesDAO.EstacionDAO;
import model.Estacion;

public class EstacionDAOhiberJPA extends GenericDAOhiberJPA<Estacion> implements EstacionDAO{
	public EstacionDAOhiberJPA() {
		super(Estacion.class);
	}
	
}