package pe.edu.cibertec.dawii.ms.ecc.inventario.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.cibertec.dawii.ms.ecc.inventario.model.Inventario;
import pe.edu.cibertec.dawii.ms.ecc.inventario.service.InventarioService;

@RestController
@RequestMapping("/api/inventario")
public class InventarioController {
 
	@Autowired
	InventarioService inventarioService;
	
	@GetMapping
	public List<Inventario> listaInventariosTodos() {
		return inventarioService.listaInventariosTodos();
	} 
  
	@GetMapping("/buscarInventarioId/{idInventario}")
	public Optional<Inventario> buscarInventarioId(@PathVariable Long idInventario) {
		return inventarioService.buscarInventarioId(idInventario);
	}

	@PostMapping
	public Inventario registrarInventario(@RequestBody Inventario inventario) {
		return inventarioService.registrarInventario(inventario);
	}

	@PutMapping("/{idInventario}")
	public ResponseEntity<Inventario> actualizarInventario(@PathVariable Long idInventario,@RequestBody Inventario inventario) {
		Optional<Inventario> inventarioActualizado = inventarioService.actualizarInventario(idInventario, inventario);
		return inventarioActualizado.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{idInventario}")
	public void eliminarInventario(@PathVariable Long idInventario) {
		inventarioService.eliminarInventario(idInventario);
	}
}

/*
 @PutMapping("/actualizaEstadoInventario/{idInventario}")
	public ResponseEntity<Inventario> actualizarEstadoInventario(@PathVariable int idInventario) {
		Optional<Inventario> inventarioActualizado = inventarioService.actualizarEstadoInventario(idInventario);
		return inventarioActualizado.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
 * */
