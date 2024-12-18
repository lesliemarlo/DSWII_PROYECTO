package pe.edu.cibertec.dawii.ms.ecc.inventario.controller;

  
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.cibertec.dawii.ms.ecc.inventario.model.EstadoCopia;
import pe.edu.cibertec.dawii.ms.ecc.inventario.service.EstadoCopiaService;

@RestController
@RequestMapping("/api/estadoCopia")
public class EstadoCopiaController {

	@Autowired
	EstadoCopiaService estadoCopiaService;
	
	@GetMapping
	public List<EstadoCopia> listaEstadoCopiasTodos() {
		return estadoCopiaService.listaEstadoCopiasTodos();
	}

	@GetMapping("/{idEstadoCopia}")
	public Optional<EstadoCopia> obtenerEstadoCopiaPorId(@PathVariable("idEstadoCopia") Long idEstadoCopia) {
		return estadoCopiaService.obtenerEstadoCopiaPorId(idEstadoCopia);
	}

	@PostMapping
	public EstadoCopia registrarEstadoCopia(@RequestBody EstadoCopia estadoCopia) {
		return estadoCopiaService.registrarEstadoCopia(estadoCopia);
	}

	@PutMapping("/{idEstadoCopia}")
	public ResponseEntity<EstadoCopia> actualizarEstadoCopia(@RequestBody EstadoCopia estadoCopia, @PathVariable Long idEstadoCopia) {
		Optional<EstadoCopia> estadoCopiaActualizar = estadoCopiaService.actualizarEstadoCopia(estadoCopia, idEstadoCopia);
		return estadoCopiaActualizar.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}

	@DeleteMapping("/{idEstadoCopia}")
	public void eliminarEstadoCopia(@PathVariable Long idEstadoCopia) {
		estadoCopiaService.eliminarEstadoCopia(idEstadoCopia);
	}
	
	
	//_________________________ OBTENCIÓN DE DATOS EN DISTINTOS FORMATOS ________________________
		@GetMapping(value ="/xml", produces = MediaType.APPLICATION_XML_VALUE)
		public List<EstadoCopia> listaCopiasTodosXML() {
			return estadoCopiaService.listaEstadoCopiasTodos();
		} 
		
		@GetMapping(value ="/json", produces = MediaType.APPLICATION_JSON_VALUE)
		public List<EstadoCopia> listaCopiasTodosJSON() {
			return estadoCopiaService.listaEstadoCopiasTodos();
		} 
		
		@GetMapping(value = "/html", produces = MediaType.TEXT_HTML_VALUE)
		public String listaEstadoCopiasTodosHTML() {
		    List<EstadoCopia> lista = estadoCopiaService.listaEstadoCopiasTodos();
		    
		    StringBuilder html = new StringBuilder();
		    html.append("""
		            <html>
		                <head>
		                    <title>Lista de Estados de Copias</title>
		                    <style>
		                        table { width: 100%; border-collapse: collapse; }
		                        th, td { border: 1px solid black; padding: 8px; text-align: left; }
		                        th { background-color: #f2f2f2; }
		                    </style>
		                </head>
		                <body>
		                    <h1>Estados de Copia Disponibles</h1>
		                    <table>
		                        <tr>
		                            <th>ID</th>
		                            <th>Nombre</th>
		                            <th>Descripción</th>
		                            <th>Fecha de Creación</th>
		                            <th>Fecha de Actualización</th>
		                        </tr>
		    """);

		    for (EstadoCopia estadoCopia : lista) {
		        html.append("<tr>")
		            .append("<td>").append(estadoCopia.getId()).append("</td>")
		            .append("<td>").append(estadoCopia.getNombre()).append("</td>")
		            .append("<td>").append(estadoCopia.getDescripcion()).append("</td>")
		            .append("<td>").append(estadoCopia.getFechaCreacion()).append("</td>")
		            .append("<td>").append(estadoCopia.getFechaActualizacion()).append("</td>")
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
