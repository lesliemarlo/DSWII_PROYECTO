package inventario.sgb.ms.dswii.cibertec.edu.pe.ws_soap_ms_sgb_inventario.ws.copia;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import java.util.Calendar;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import pe.edu.cibertec.dswii.ms.sgb.inventario.WS_SOAP_ms_sgb_inventario.model.copia.Copia;
import pe.edu.cibertec.dswii.ms.sgb.inventario.WS_SOAP_ms_sgb_inventario.model.copia.EstadoCopia;
import pe.edu.cibertec.dswii.ms.sgb.inventario.WS_SOAP_ms_sgb_inventario.model.copia.GetCopiaRequest;
import pe.edu.cibertec.dswii.ms.sgb.inventario.WS_SOAP_ms_sgb_inventario.model.copia.GetCopiaResponse;
import pe.edu.cibertec.dswii.ms.sgb.inventario.WS_SOAP_ms_sgb_inventario.model.copia.LibroInfo;


@Endpoint
public class CopiaEndpoint {

private static final String NAMESPACE_URI = "http://pe.edu.cibertec.dswii.ms.sgb.inventario/WS_SOAP_ms_sgb_inventario/copia-service";

// Método para manejar la solicitud GetCopiaRequest
@PayloadRoot(namespace = NAMESPACE_URI, localPart = "GetCopiaRequest")
@ResponsePayload
public GetCopiaResponse getCopia(@RequestPayload GetCopiaRequest request) throws DatatypeConfigurationException {
    GetCopiaResponse response = new GetCopiaResponse();
    Copia copia = new Copia();
    
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
                    calendar.get(Calendar.MILLISECOND), 
                    calendar.get(Calendar.ZONE_OFFSET) / (60 * 1000) // Offset en minutos
                );

            copia.setFechaCreacion(fechaCreacion);

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
            LibroInfo libInf = new LibroInfo();
            libInf.setTitulo("Caballero Carmelo");
            libInf.setAutor("Abraham Valdelomar");
            libInf.setAnioPublicacion(2020);
            
            EstadoCopia estCop = new EstadoCopia();
            estCop.setFechaCreacion(fechaCreacion);
            estCop.setFechaActualizacion(fechaActualizacion);
            estCop.setId(2);
            estCop.setDescripcion("Libro de fantasías y aventuras");
            estCop.setNombre("El Principito");
    
    copia.setFechaActualizacion(fechaActualizacion);
    copia.setId(request.getId());
    copia.setLibroInfo(libInf);
    copia.setUbicacionFisica("Estante A2");
    copia.setCodigoBarras("12345ABC");
    copia.setEstadoCopia(estCop);


    response.setCopia(copia);
    return response;
    }
}