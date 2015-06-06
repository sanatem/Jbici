package interfacesDAO;

import daoHiberJPA.*;

public class FactoryDAO {
	/**
	 * El patron factory se encargara de devolver las clases concretas.
	 * 
	 */
	
	public static AdministradorDAO getAdministradorDAO(){
		return new AdministradorDAOhiberJPA();
	}
	
	public static AlquilerDAO getAlquilerDAO(){
		return new AlquilerDAOhiberJPA();
	}
	
	public static BicicletaDAO getBicicletaDAO(){
		return new BicicletaDAOhiberJPA();
	}
	
	
	
}

