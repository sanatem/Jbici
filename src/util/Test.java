package util;

import interfacesDAO.*;

import java.sql.Timestamp;
import java.util.Date;

import model.*;


public class Test {

	@SuppressWarnings({ "deprecation", "deprecation" })
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
		HistorialBicicletaDAO historialdao = factory.getHistorialBicicleta();
		UbicacionDAO ubicaciondao = factory.getUbicacionDAO();

		/**
		 * Test de Administrador
		 */
		System.out.println("=====================================");
		System.out.println("Test Administrador");
		System.out.println("--Test persistencia");
		Administrador admin = new Administrador("Benedict", "Cumberbatch" , 37456987, "Baker st.",'M',new Date(1989,05,03),"sherlock@holmes.com","1234");
		admindao.persistir(admin);
		Long id = admin.getIdUsuario();
		System.out.println("Administrador persistio con id="+id);
		
		System.out.println("--Test recuperar");
		Administrador admin_recuperado = admindao.recuperar(id);
		if (admin_recuperado != null){
			System.out.println(" - Admin recuperado con id="+id);
		}
		admin_recuperado = admindao.recuperar(new Long(99999)); //Esto no existe
		if (admin_recuperado == null){
			System.out.println(" - No existe admin con id 999999");
		}
		
		System.out.println("--Test actualizar");
		admin.setEmail("nuevoemailadmin@mail.com"); //Actualizamos e-mail.
		admin= admindao.actualizar(admin);
		System.out.println(" - Nuevo email:"+admin.getEmail());
		
		System.out.println("--Test borrar");
		admindao.borrar(id);
		if(admindao.recuperar(id) == null){
			System.out.println(" - Entidad admin ya no existe");
		}
		
		/**
		 * Test cliente
		 */
		System.out.println("=====================================");
		System.out.println("Test Cliente");
		System.out.println("--Test persistencia");
		Cliente cliente =  new Cliente("Matthew","McConaughey",8596321,"Los Angeles",'M',new Date(1969,11,04),"matthew@mail.com","interstellar321"); 
		clientedao.persistir(cliente);
		System.out.println(" - Cliente persistido con id="+id);
		Alquiler alquiler = getAlquilerPersistido(ubicaciondao, estadoestaciondao, bicidao, estadobicidao, alquilerdao, estaciondao, cliente);
		//Probamos agregar un alquiler
		cliente.agregarAlquiler(alquiler);
		clientedao.actualizar(cliente);
		id = cliente.getIdUsuario();
		Long id_alquiler = alquiler.getCliente().getIdUsuario();
		System.out.println(" - Alquiler con id de cliente:"+id_alquiler);
		
		System.out.println("--Test recuperar");
		Cliente cliente_recuperado = clientedao.recuperar(id);
		if (cliente_recuperado != null){
			System.out.println(" - Cliente recuperado con id="+id);
		}
		cliente_recuperado = clientedao.recuperar(new Long(99999));
		if (cliente_recuperado == null){
			System.out.println(" - No existe cliente con id 999999");
		}
		
		System.out.println("--Test actualizar");
		cliente.setNombre("Cooper"); //Actualizamos nombre.
		cliente= clientedao.actualizar(cliente);
		System.out.println(" - Nuevo nombre "+cliente.getNombre());
		
		System.out.println("--Test borrar");
		clientedao.borrar(id);
		if(clientedao.recuperar(id) == null){
			System.out.println(" - Entidad cliente ya no existe!");
		}
		
		/**
		 * Test Alquiler
		 */
		System.out.println("=====================================");
		System.out.println("Test Alquiler");
		System.out.println("--Test persistencia");
		//Creamos cliente 
		cliente =  new Cliente("Tiffany","Hwang",12345678,"Los Angeles",'F',new Date(1969,11,04),"Tiffany@gmail.com","snsd"); 
		clientedao.persistir(cliente);
		alquiler = getAlquilerPersistido(ubicaciondao, estadoestaciondao, bicidao, estadobicidao, alquilerdao, estaciondao, cliente);
		id = alquiler.getAlquilerId();
		System.out.println(" - Alquiler persistido con id:"+id);
		
		System.out.println("--Test recuperar");
		Alquiler alquiler_recuperado = alquilerdao.recuperar(id);
		if (alquiler_recuperado != null){
			System.out.println(" - Alquiler recuperado con id="+id);
		}
		alquiler_recuperado = alquilerdao.recuperar(new Long(99999));
		if (alquiler_recuperado == null){
			System.out.println(" - No existe alquiler con id 999999");
		}
		
		System.out.println("--Test actualizar");
		alquiler.setFecha_devuelve(new Timestamp(new Date().getTime())); //Nueva fecha para devolucion. 
		alquiler= alquilerdao.actualizar(alquiler);
		System.out.println(" - Nueva fecha de devolucion "+alquiler.getFecha_devuelve());
		
		System.out.println("--Test borrar");
		alquilerdao.borrar(id);
		if(alquilerdao.recuperar(id) == null){
			System.out.println(" - Entidad alquiler ya no existe!");
		}
		
		
		/**
		 * Test Denuncia
		 */
		System.out.println("=====================================");
		System.out.println("Test Denuncia");
		System.out.println("--Test persistencia");
		Denuncia denuncia = new Denuncia(new Timestamp(new Date().getTime()),"Bicicleta le falta una rueda");
		denunciadao.persistir(denuncia);
		id = denuncia.getIdDenuncia();
		System.out.println(" - Denuncia persistida con id="+id);
		//Testeamos agregar una denuncia a un alquiler,dada la naturaleza del objeto.
		cliente = new Cliente("Gabriel","Macht",5698745,"New York",'M',new Date(1975,05,12),"suits@gmail.com","suits1234"); 
		clientedao.persistir(cliente);
		alquiler = getAlquilerPersistido(ubicaciondao, estadoestaciondao, bicidao, estadobicidao, alquilerdao, estaciondao, cliente);
		alquiler.setDenuncia(denuncia);
		alquiler = alquilerdao.actualizar(alquiler);
		System.out.println(" - Denuncia agregada al alquiler con id="+alquiler.getDenuncia().getIdDenuncia());
		
		System.out.println("--Test recuperar");
		denuncia = null;
		denuncia = denunciadao.recuperar(id);
		if (denuncia != null){
			System.out.println(" - Denuncia recuperada con id="+id);
		}
		denuncia = denunciadao.recuperar(new Long(-1));
		if (denuncia == null){
			System.out.println(" - No existe denuncia con id -1");
		}
		
		System.out.println("--Test actualizar");
		denuncia = denunciadao.recuperar(id); 
		denuncia.setDescripcion("Bicicleta robada"); //Nueva descripcion
		denuncia= denunciadao.actualizar(denuncia);
		System.out.println(" - Nueva descripcion "+denuncia.getDescripcion());
		
		System.out.println("--Test borrar");
		//Prueba de borrado desde un alquiler.
		alquilerdao.borrarDenuncia(alquiler.getAlquilerId());
		if(denunciadao.recuperar(id) == null){
			System.out.println(" - Entidad Denuncia ya no existe en alquiler!");
		}
		//Prueba de borrado independiente
		denuncia = new Denuncia(new Timestamp(new Date().getTime()),"Manubrio roto");
		denunciadao.persistir(denuncia);
		denunciadao.borrar(denuncia.getIdDenuncia());
		if(denunciadao.recuperar(id) == null){
			System.out.println(" - Entidad Denuncia independiente ya no existe!");
		}
		
		
		
		/**
		 * Test Ubicacion
		 */
		System.out.println("=====================================");
		System.out.println("Test Ubicacion");
		System.out.println("--Test persistencia");
		Ubicacion ubicacion = new Ubicacion(123456,654321,"1900 - La Plata");
		ubicaciondao.persistir(ubicacion);
		id = ubicacion.getIdUbicacion();
		System.out.println(" - Ubicacion persistida con id="+id);
		
		System.out.println("--Test recuperar");
		ubicacion = null;
		ubicacion = ubicaciondao.recuperar(id);
		if (ubicacion != null){
			System.out.println(" - Ubicacion recuperada con id="+id);
		}
		ubicacion = ubicaciondao.recuperar(new Long(-1));
		if (ubicacion == null){
			System.out.println(" - No existe ubicacion con id -1");
		}
		
		System.out.println("--Test actualizar");
		ubicacion = ubicaciondao.recuperar(id);
		ubicacion.setDireccionPostal("1923 - Berisso");
		ubicacion= ubicaciondao.actualizar(ubicacion);
		System.out.println(" - Nueva direccion postal "+ubicacion.getDireccionPostal());
		
		System.out.println("--Test borrar");
		ubicaciondao.borrar(id);
		if(ubicaciondao.recuperar(id) == null){
			System.out.println(" - Entidad Ubicacion ya no existe!");
		}
		
	}
	
	/**
	 * Metodo para testear con alquileres persistidos.
	 * 
	 */
	private static Alquiler getAlquilerPersistido(UbicacionDAO ubicaciondao, EstadoEstacionDAO estadoestaciondao, BicicletaDAO bicidao,
			EstadoBicicletaDAO estadobicidao, AlquilerDAO alquilerdao,EstacionDAO estaciondao,Cliente cliente){
		Ubicacion ubicacion = new Ubicacion();
		ubicaciondao.persistir(ubicacion);
		EstadoEstacion estadoest = new EstadoEstacion();
		estadoestaciondao.persistir(estadoest);
		Estacion estacion = new Estacion("Pza Malvinas", 11, ubicacion, estadoest);
		estaciondao.persistir(estacion);
		EstadoBicicleta estadobici = new EstadoBicicleta("bueno");
		estadobicidao.persistir(estadobici);
		Bicicleta bicicleta = new Bicicleta(new Date(),estadobici);
		bicidao.persistir(bicicleta);
		Alquiler alquiler = new Alquiler(cliente, new Timestamp(new Date().getTime()), new Timestamp(new Date().getTime()),
							estacion, bicicleta);
		alquilerdao.persistir(alquiler);
		return alquiler;
	}
}
