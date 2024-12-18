//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.18 a las 01:47:58 AM PET 
//


package pe.edu.cibertec.dswii.ms.sgb.inventario.WS_SOAP_ms_sgb_inventario.model.copia;

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
 *         &lt;element name="copia" type="{http://pe.edu.cibertec.dswii.ms.sgb.inventario/WS_SOAP_ms_sgb_inventario/copia-service}Copia"/&gt;
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
    "copia"
})
@XmlRootElement(name = "GetCopiaResponse")
public class GetCopiaResponse {

    @XmlElement(required = true)
    protected Copia copia;

    /**
     * Obtiene el valor de la propiedad copia.
     * 
     * @return
     *     possible object is
     *     {@link Copia }
     *     
     */
    public Copia getCopia() {
        return copia;
    }

    /**
     * Define el valor de la propiedad copia.
     * 
     * @param value
     *     allowed object is
     *     {@link Copia }
     *     
     */
    public void setCopia(Copia value) {
        this.copia = value;
    }

}
