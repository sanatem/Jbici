package daoHiberJPA;
import java.util.List;

import model.Bicicleta;

public interface CompuestoDAO {

	public List <Bicicleta> listar();
	
	public void guardar(Bicicleta b);
	
	public void eliminar(Long idBicicleta); 
	
	public Bicicleta encontrar(Long idBicicleta);

	public void modificar(Bicicleta bicicleta);

}
