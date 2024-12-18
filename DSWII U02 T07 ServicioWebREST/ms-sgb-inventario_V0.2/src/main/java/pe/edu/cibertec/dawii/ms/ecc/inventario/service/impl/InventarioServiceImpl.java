package pe.edu.cibertec.dawii.ms.ecc.inventario.service.impl; 

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.dawii.ms.ecc.inventario.model.Inventario;
import pe.edu.cibertec.dawii.ms.ecc.inventario.repository.InventarioRepository;
import pe.edu.cibertec.dawii.ms.ecc.inventario.service.InventarioService;

@Service 
public class InventarioServiceImpl implements InventarioService {

	@Autowired
	InventarioRepository inventarioRepository;
	
	@Override
	public List<Inventario> listaInventariosTodos() {
		return inventarioRepository.findAll();
	}

	@Override
	public Optional<Inventario> buscarInventarioId(Long idInventario) {
		return inventarioRepository.findById(idInventario);
	}

	@Override
	public Inventario registrarInventario(Inventario inventario) {
		//Guardar inventario - registro síncrono, depende de la BD
		return inventarioRepository.save(inventario);
	}

	@Override
	public Optional<Inventario> actualizarInventario(Long idInventario, Inventario inventario) {
	    Optional<Inventario> inventarioBuscado = inventarioRepository.findById(idInventario);
	    return inventarioBuscado.map(inventarioExiste -> {
	        // Solo actualizamos los campos permitidos si no son nulos
	        if (inventario.getTotalCopias() != null) {
	            inventarioExiste.setTotalCopias(inventario.getTotalCopias());
	        }
	        if (inventario.getCopiasDisponibles() != null) {
	            inventarioExiste.setCopiasDisponibles(inventario.getCopiasDisponibles());
	        }
	        if (inventario.getLibroInfo() != null) {
	            inventarioExiste.setLibroInfo(inventario.getLibroInfo()); 
	        }

	        return inventarioRepository.save(inventarioExiste);
	    });
	}

	@Override
	public void eliminarInventario(Long idInventario) {
		 inventarioRepository.deleteById(idInventario);
	}
}

/*
 	@Override
	public Optional<Inventario> actualizarEstadoInventario(Long idInventario) {
		Optional<Inventario> inventarioBuscado = inventarioRepository.findById(idInventario);
		return inventarioBuscado.map(inventarioExiste -> {
			inventarioExiste.setEstado("No disponible");
			return inventarioRepository.save(inventarioExiste);
		});
	}
 * */
