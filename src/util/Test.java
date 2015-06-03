package util;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import model.Usuario;


public class Test {

	public static void main(String[] args) {
	
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jyaa");
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction etx = em.getTransaction();
		etx.begin(); //Abre transaccion
			//Creo un mensaje y lo persisto
			Usuario us = new Usuario();
			us.setApellido("malcorra");
			us.setDni(123456);
			us.setDomicilio("por alla");
			us.setEmail("nico@sarasa.com");
			us.setFechaNacimiento(new Date());
			us.setNombre("nico");
			us.setSexo('T');
			em.persist(us); //Guarda DB
			
		etx.commit(); //Cierra transaccion
		em.close();
		//Obtengo todos los mensajes
		/*
		List<Mensaje> mensajes=(List<Mensaje>)(em.createQuery("from jyaa.Mensaje m order by
		m.texto asc")).getResultList();
		for (Mensaje men:mensajes) {System.out.println("Mensaje : " +men.getTexto());}
		etx.commit();
		em.close();
		 */
	}
}
