package pe.edu.cibertec.dawii.ms.ecc.inventario.service;
 
import java.util.List;
import java.util.Optional;

import pe.edu.cibertec.dawii.ms.ecc.inventario.model.EstadoCopia;

public interface EstadoCopiaService {
	List<EstadoCopia> listaEstadoCopiasTodos();
	Optional<EstadoCopia> obtenerEstadoCopiaPorId(Long idEstadoCopia);
	EstadoCopia registrarEstadoCopia(EstadoCopia libro);
	Optional<EstadoCopia> actualizarEstadoCopia(EstadoCopia libro, Long idEstadoCopia);
	void eliminarEstadoCopia(Long idEstadoCopia);
  
}
