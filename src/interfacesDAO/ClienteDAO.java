package interfacesDAO;

import java.io.Serializable;

import model.Cliente;

public interface ClienteDAO extends GenericDAO<Cliente>{
		@Override
		public Cliente actualizar(Cliente cliente);
		@Override
		public void borrar(Cliente cliente);
		@Override
		public Cliente borrar(Serializable id);
		@Override
		public boolean existe(Serializable id);
		@Override
		public Cliente persistir(Cliente cliente);
		@Override
		public Cliente recuperar(Serializable id);

}


