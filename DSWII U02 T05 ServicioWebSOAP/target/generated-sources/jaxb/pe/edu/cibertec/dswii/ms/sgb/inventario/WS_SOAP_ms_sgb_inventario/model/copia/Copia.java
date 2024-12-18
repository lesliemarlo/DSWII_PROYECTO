//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.12.18 a las 01:47:58 AM PET 
//


package pe.edu.cibertec.dswii.ms.sgb.inventario.WS_SOAP_ms_sgb_inventario.model.copia;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Copia complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Copia"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="libroInfo" type="{http://pe.edu.cibertec.dswii.ms.sgb.inventario/WS_SOAP_ms_sgb_inventario/copia-service}LibroInfo"/&gt;
 *         &lt;element name="codigoBarras" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="estadoCopia" type="{http://pe.edu.cibertec.dswii.ms.sgb.inventario/WS_SOAP_ms_sgb_inventario/copia-service}EstadoCopia"/&gt;
 *         &lt;element name="ubicacionFisica" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaCreacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="fechaActualizacion" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Copia", propOrder = {
    "id",
    "libroInfo",
    "codigoBarras",
    "estadoCopia",
    "ubicacionFisica",
    "fechaCreacion",
    "fechaActualizacion"
})
public class Copia {

    protected long id;
    @XmlElement(required = true)
    protected LibroInfo libroInfo;
    @XmlElement(required = true)
    protected String codigoBarras;
    @XmlElement(required = true)
    protected EstadoCopia estadoCopia;
    protected String ubicacionFisica;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaCreacion;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaActualizacion;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public long getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(long value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad libroInfo.
     * 
     * @return
     *     possible object is
     *     {@link LibroInfo }
     *     
     */
    public LibroInfo getLibroInfo() {
        return libroInfo;
    }

    /**
     * Define el valor de la propiedad libroInfo.
     * 
     * @param value
     *     allowed object is
     *     {@link LibroInfo }
     *     
     */
    public void setLibroInfo(LibroInfo value) {
        this.libroInfo = value;
    }

    /**
     * Obtiene el valor de la propiedad codigoBarras.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoBarras() {
        return codigoBarras;
    }

    /**
     * Define el valor de la propiedad codigoBarras.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoBarras(String value) {
        this.codigoBarras = value;
    }

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

    /**
     * Obtiene el valor de la propiedad ubicacionFisica.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUbicacionFisica() {
        return ubicacionFisica;
    }

    /**
     * Define el valor de la propiedad ubicacionFisica.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUbicacionFisica(String value) {
        this.ubicacionFisica = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaCreacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * Define el valor de la propiedad fechaCreacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaCreacion(XMLGregorianCalendar value) {
        this.fechaCreacion = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaActualizacion.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaActualizacion() {
        return fechaActualizacion;
    }

    /**
     * Define el valor de la propiedad fechaActualizacion.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaActualizacion(XMLGregorianCalendar value) {
        this.fechaActualizacion = value;
    }

}
