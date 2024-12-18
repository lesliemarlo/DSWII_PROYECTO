package pe.edu.cibertec.dswii.u01.t04.xml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class EstadoCopia {
    private Long id;
    private String estado;
    private String descripcion;

    // Constructor con tres parámetros: Long, String, String
    public EstadoCopia(Long id, String estado, String descripcion) {
        this.id = id;
        this.estado = estado;
        this.descripcion = descripcion;
    }
public EstadoCopia(){}
    // Getters y setters
 @XmlElement
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
 @XmlElement
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
 @XmlElement
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "EstadoCopia{" + "id=" + id + ", estado='" + estado + "', descripcion='" + descripcion + "'}";
    }
}
