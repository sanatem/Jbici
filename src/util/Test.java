package util;

import interfacesDAO.*;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.*;


public class Test {

	public static void main(String[] args) {
		FactoryDAO factory = new FactoryDAO();
		
		/**
		 * Obtengo mis Daos
		 */
		AdministradorDAO admindao = factory.getAdministradorDAO();
		AlquilerDAO alquilerdao = factory.getAlquilerDAO();
		BicicletaDAO bicidao = factory.getBicicletaDAO();
		ClienteDAO clientedao = factory.getClienteDAO();
		DenunciaDAO denunciadao = factory.getDenunciaDAO();
		EstacionDAO estaciondao = factory.getEstacionDAO();
		EstadoBicicletaDAO estadobicidao = factory.getEstadoBicicleta();
		EstadoEstacionDAO estadoestaciondao = factory.getEstadoEstacion();
		UbicacionDAO ubicaciondao = factory.getUbicacionDAO();
		/**
		 * Test de Administrador
		 */
		System.out.println("=====================================");
		System.out.println("Test Administrador");
		System.out.println("--Test persistencia");
		Administrador admin = new Administrador("Benedict", "Cumberbatch" , 37456987, "Baker st.",'M',new Date(1989,05,03),"sherlock@holmes.com","1234");
		admindao.persistir(admin);
		//Comprobamos si persistio
		Long id = admin.getIdUsuario();
		System.out.println("Administrador persistio con id="+id);
		System.out.println("--Test recuperar");
		Administrador admin_recuperado = admindao.recuperar(id);
		System.out.println("Admin recuperado:"+admin_recuperado.getNombre());
		System.out.println("--Test");
		

		
	}
}
