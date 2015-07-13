package daoHiberJPA;
import java.io.Serializable;

import interfacesDAO.AdministradorDAO;
import model.Administrador;

public class AdministradorDAOhiberJPA extends GenericDAOhiberJPA<Administrador> implements AdministradorDAO {

	public AdministradorDAOhiberJPA() {
		super(Administrador.class);
	}

	@Override
	public Administrador actualizar(Administrador entity) {
		return super.actualizar(entity);
	}

	@Override
	public void borrar(Administrador entity) {
		super.borrar(entity);
	}

	@Override
	public Administrador borrar(Serializable id) {
		return super.borrar(id);
	}

	@Override
	public boolean existe(Serializable id) {
		return super.existe(id);
	}

	@Override
	public Administrador persistir(Administrador entity) {
		return super.persistir(entity);
	}

	@Override
	public Administrador recuperar(Serializable id) {
		return super.recuperar(id);
	}

	
	
}
