package pe.edu.cibertec.dawii.ms.ecc.inventario.service.impl;
  
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.dawii.ms.ecc.inventario.model.EstadoCopia;
import pe.edu.cibertec.dawii.ms.ecc.inventario.repository.EstadoCopiaRepository;
import pe.edu.cibertec.dawii.ms.ecc.inventario.service.EstadoCopiaService;

@Service
public class EstadoCopiaServiceImpl implements EstadoCopiaService{

	@Autowired
	EstadoCopiaRepository estadoCopiaRepository;
	 
	
	@Override
	public List<EstadoCopia> listaEstadoCopiasTodos() {
		return estadoCopiaRepository.findAll();
	}

	@Override
	public Optional<EstadoCopia> obtenerEstadoCopiaPorId(Long idEstadoCopia) {
		return estadoCopiaRepository.findById(idEstadoCopia);
	}

	@Override
	public EstadoCopia registrarEstadoCopia(EstadoCopia estadoCopia) {
		return estadoCopiaRepository.save(estadoCopia);
	}

	@Override
	public Optional<EstadoCopia> actualizarEstadoCopia(EstadoCopia estadoCopia, Long idEstadoCopia) {
	    Optional<EstadoCopia> estadoCopiaBuscado = estadoCopiaRepository.findById(idEstadoCopia);
	    return estadoCopiaBuscado.map(estadoCopiaExiste -> {
	        // Solo actualizamos los campos permitidos si no son nulos
	        if (estadoCopia.getNombre() != null) {
	            estadoCopiaExiste.setNombre(estadoCopia.getNombre());
	        }
	        if (estadoCopia.getDescripcion() != null) {
	            estadoCopiaExiste.setDescripcion(estadoCopia.getDescripcion());
	        }

	        return estadoCopiaRepository.save(estadoCopiaExiste);
	    });
	}
	
	@Override
	public void eliminarEstadoCopia(Long idEstadoCopia) {
		estadoCopiaRepository.deleteById(idEstadoCopia);
	}

}
