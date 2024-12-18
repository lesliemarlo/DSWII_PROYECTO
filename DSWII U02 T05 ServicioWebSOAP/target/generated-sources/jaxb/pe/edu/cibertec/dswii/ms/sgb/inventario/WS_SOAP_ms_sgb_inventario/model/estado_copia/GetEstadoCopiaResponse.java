//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.18 a las 01:47:58 AM PET 
//


package pe.edu.cibertec.dswii.ms.sgb.inventario.WS_SOAP_ms_sgb_inventario.model.estado_copia;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="estadoCopia" type="{http://pe.edu.cibertec.dswii.ms.sgb.inventario/WS_SOAP_ms_sgb_inventario/estado-copia-service}EstadoCopia"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "estadoCopia"
})
@XmlRootElement(name = "GetEstadoCopiaResponse")
public class GetEstadoCopiaResponse {

    @XmlElement(required = true)
    protected EstadoCopia estadoCopia;

    /**
     * Obtiene el valor de la propiedad estadoCopia.
     * 
     * @return
     *     possible object is
     *     {@link EstadoCopia }
     *     
     */
    public EstadoCopia getEstadoCopia() {
        return estadoCopia;
    }

    /**
     * Define el valor de la propiedad estadoCopia.
     * 
     * @param value
     *     allowed object is
     *     {@link EstadoCopia }
     *     
     */
    public void setEstadoCopia(EstadoCopia value) {
        this.estadoCopia = value;
    }

}
