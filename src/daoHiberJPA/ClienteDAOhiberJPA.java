package daoHiberJPA;

import interfacesDAO.ClienteDAO;
import model.Cliente;

public class ClienteDAOhiberJPA extends GenericDAOhiberJPA<Cliente> implements ClienteDAO{
	public ClienteDAOhiberJPA() {
		super(Cliente.class);
	}
	
}
