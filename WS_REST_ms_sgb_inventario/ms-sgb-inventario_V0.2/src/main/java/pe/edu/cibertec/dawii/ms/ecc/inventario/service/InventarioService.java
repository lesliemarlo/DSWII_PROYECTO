package pe.edu.cibertec.dawii.ms.ecc.inventario.service;

import java.util.List;
import java.util.Optional;

import pe.edu.cibertec.dawii.ms.ecc.inventario.model.Inventario;

public interface InventarioService {
	List<Inventario> listaInventariosTodos();
	Optional<Inventario> buscarInventarioId(Long idInventario);
	Inventario registrarInventario(Inventario recurso);
	Optional<Inventario> actualizarInventario(Long idInventario, Inventario recurso);
	//Optional<Inventario> actualizarEstadoInventario(Long idInventario);
	void eliminarInventario(Long idInventario);   
}
