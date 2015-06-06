package daoHiberJPA;

import interfacesDAO.EstadoEstacionDAO;
import model.EstadoEstacion;

public class EstadoEstacionDAOhiberJPA extends GenericDAOhiberJPA<EstadoEstacion> implements EstadoEstacionDAO{
	public EstadoEstacionDAOhiberJPA() {
		super(EstadoEstacion.class);
	}
	
}
