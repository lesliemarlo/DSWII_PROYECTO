package inventario.sgb.ms.dswii.cibertec.edu.pe.ws_soap_ms_sgb_inventario.ws.estado_copia;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import java.util.Calendar;
import javax.xml.datatype.DatatypeConfigurationException;

import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import pe.edu.cibertec.dswii.ms.sgb.inventario.WS_SOAP_ms_sgb_inventario.model.estado_copia.GetEstadoCopiaRequest;
import pe.edu.cibertec.dswii.ms.sgb.inventario.WS_SOAP_ms_sgb_inventario.model.estado_copia.GetEstadoCopiaResponse;
import pe.edu.cibertec.dswii.ms.sgb.inventario.WS_SOAP_ms_sgb_inventario.model.estado_copia.EstadoCopia;

@Endpoint
public class EstadoCopiaEndpoint {

private static final String NAMESPACE_URI = "http://pe.edu.cibertec.dswii.ms.sgb.inventario/WS_SOAP_ms_sgb_inventario/estado-copia-service";

// Método para manejar la solicitud GetEstadoCopiaRequest
@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetEstadoCopiaRequest")
@ResponsePayload
public GetEstadoCopiaResponse getEstadoCopia(@RequestPayload GetEstadoCopiaRequest request) throws DatatypeConfigurationException {
    GetEstadoCopiaResponse response = new GetEstadoCopiaResponse();
    EstadoCopia estadoCopia = new EstadoCopia();
            // Obtener la fecha actual
            Calendar calendar = Calendar.getInstance();

            // Convertir a XMLGregorianCalendar
            XMLGregorianCalendar fechaCreacion = DatatypeFactory.newInstance()
            .newXMLGregorianCalendar(
                calendar.get(Calendar.YEAR),
                calendar.get(Calendar.MONTH) + 1, // Los meses son 0-indexed
                calendar.get(Calendar.DAY_OF_MONTH),
                calendar.get(Calendar.HOUR_OF_DAY),
                calendar.get(Calendar.MINUTE),
                calendar.get(Calendar.SECOND),
                calendar.get(Calendar.MILLISECOND), // Valor correcto para milisegundos
                calendar.get(Calendar.ZONE_OFFSET) / (60 * 1000) // Zona horaria en minutos
            );


            estadoCopia.setFechaCreacion(fechaCreacion);

            // Actualizar la fecha de actualización
            XMLGregorianCalendar fechaActualizacion = DatatypeFactory.newInstance().newXMLGregorianCalendar(
                    calendar.get(Calendar.YEAR),
                    calendar.get(Calendar.MONTH) + 1,
                    calendar.get(Calendar.DAY_OF_MONTH),
                    calendar.get(Calendar.HOUR_OF_DAY),
                    calendar.get(Calendar.MINUTE),
                    calendar.get(Calendar.SECOND),
                    calendar.get(Calendar.MILLISECOND), 
                    calendar.get(Calendar.ZONE_OFFSET) / (60 * 1000)
                );

            // Ejemplo de datos; aquí se podría hacer una consulta a la base de datos
            // para este caso, datos en duro
            estadoCopia.setFechaActualizacion(fechaActualizacion);

            estadoCopia.setId(request.getId());
            estadoCopia.setDescripcion("Libro de fantasías y aventuras");
            estadoCopia.setNombre("El Principito");


    response.setEstadoCopia(estadoCopia);
    return response;
    }
}