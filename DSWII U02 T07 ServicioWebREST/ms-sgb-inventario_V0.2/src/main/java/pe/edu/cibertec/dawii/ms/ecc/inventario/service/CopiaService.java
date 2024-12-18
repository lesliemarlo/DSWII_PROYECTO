package pe.edu.cibertec.dawii.ms.ecc.inventario.service;
  
import java.util.List;
import java.util.Optional;

import pe.edu.cibertec.dawii.ms.ecc.inventario.model.Copia;

public interface CopiaService {
	List<Copia> listaCopiasTodos();
	Optional<Copia> obtenerCopiaPorId(Long idCopia);
	Copia registrarCopia(Copia sala);
	Optional<Copia> actualizarCopia(Copia sala, Long idProd);
	void eliminarCopia(Long idCopia); 

}
