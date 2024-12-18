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

import pe.edu.cibertec.dawii.ms.ecc.inventario.model.Copia;
import pe.edu.cibertec.dawii.ms.ecc.inventario.service.CopiaService;


import org.springframework.http.MediaType;

@RestController
@RequestMapping("/api/copia")
public class CopiaController {

	@Autowired
	CopiaService copiaService;
	
	@GetMapping
	public List<Copia> listaCopiasTodos() {
		return copiaService.listaCopiasTodos();
	}

	@GetMapping("/{idCopia}")
	public Optional<Copia> obtenerCopiaPorId(@PathVariable("idCopia") Long idCopia) {
		return copiaService.obtenerCopiaPorId(idCopia);
	}

	@PostMapping
	public Copia registrarCopia(@RequestBody Copia copia) {
		return copiaService.registrarCopia(copia);
	}

	@PutMapping("/{idCopia}")
	public ResponseEntity<Copia> actualizarCopia(@RequestBody Copia copia, @PathVariable("idCopia") Long idCopia) {
		Optional<Copia> copiaActualizar = copiaService.actualizarCopia(copia, idCopia);
		return copiaActualizar.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{idCopia}")
	public void eliminarCopia(@PathVariable Long idCopia) {
		copiaService.eliminarCopia(idCopia);
	}
	
	
	//_________________________ OBTENCIÓN DE DATOS EN DISTINTOS FORMATOS ________________________
	@GetMapping(value ="/xml", produces = MediaType.APPLICATION_XML_VALUE)
	public List<Copia> listaCopiasTodosXML() {
		return copiaService.listaCopiasTodos();
	} 
	
	@GetMapping(value ="/json", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Copia> listaCopiasTodosJSON() {
		return copiaService.listaCopiasTodos();
	} 
	
	@GetMapping(value = "/html", produces = MediaType.TEXT_HTML_VALUE)
	public String listaCopiasTodosHTML() {
	    List<Copia> lista = copiaService.listaCopiasTodos();
	    
	    StringBuilder html = new StringBuilder();
	    html.append("""
	            <html>
	                <head>
	                    <title>Lista de Copias</title>
	                    <style>
	                        table { width: 100%; border-collapse: collapse; }
	                        th, td { border: 1px solid black; padding: 8px; text-align: left; }
	                        th { background-color: #f2f2f2; }
	                    </style>
	                </head>
	                <body>
	                    <h1>Lista de Copias</h1>
	                    <table>
	                        <tr>
	                            <th>ID</th>
	                            <th>Título</th>
	                            <th>Código de Barras</th>
	                            <th>Ubicación Física</th>
	                            <th>Estado</th>
	                            <th>Fecha de Creación</th>
	                        </tr>
	            """);

	    for (Copia copia : lista) {
	        html.append("<tr>")
	            .append("<td>").append(copia.getId()).append("</td>")
	            .append("<td>").append(copia.getLibroInfo().getTitulo()).append("</td>")
	            .append("<td>").append(copia.getCodigoBarras()).append("</td>")
	            .append("<td>").append(copia.getUbicacionFisica()).append("</td>")
	            .append("<td>").append(copia.getEstadoCopia().getNombre()).append("</td>")
	            .append("<td>").append(copia.getFechaCreacion()).append("</td>")
	            .append("</tr>");
	    }

	    html.append("""
	                    </table>
	                </body>
	            </html>
	            """);

	    return html.toString();
	}
}
