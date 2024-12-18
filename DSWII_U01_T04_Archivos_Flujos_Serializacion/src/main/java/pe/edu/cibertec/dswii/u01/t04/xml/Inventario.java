package pe.edu.cibertec.dswii.u01.t04.xml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@XmlRootElement // Esta anotación marca la clase como la raíz del XML
public class Inventario implements Serializable {
    public static final long serialVersionUID = 1L;

    private Long id;
    private LibroInfo libroInfo;
    private Integer totalCopias;
    private Integer copiasDisponibles;
    private List<Copia> copias;

    // Constructor vacío (requerido para JAXB)
    public Inventario() {}

    // Constructor con todos los parámetros
    public Inventario(Long id, LibroInfo libroInfo, Integer totalCopias, Integer copiasDisponibles, List<Copia> copias) {
        this.id = id;
        this.libroInfo = libroInfo;
        this.totalCopias = totalCopias;
        this.copiasDisponibles = copiasDisponibles;
        this.copias = copias;
    }

    // Getter y setter para id
    @XmlElement // Marcar el getter de id para que sea parte del XML
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // Getter y setter para libroInfo
    @XmlElement // Marcar el getter de libroInfo para que sea parte del XML
    public LibroInfo getLibroInfo() {
        return libroInfo;
    }

    public void setLibroInfo(LibroInfo libroInfo) {
        this.libroInfo = libroInfo;
    }

    // Getter y setter para totalCopias
    @XmlElement // Marcar el getter de totalCopias para que sea parte del XML
    public Integer getTotalCopias() {
        return totalCopias;
    }

    public void setTotalCopias(Integer totalCopias) {
        this.totalCopias = totalCopias;
    }

    // Getter y setter para copiasDisponibles
    @XmlElement // Marcar el getter de copiasDisponibles para que sea parte del XML
    public Integer getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(Integer copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    // Getter y setter para copias
    @XmlElement // Marcar el getter de copias para que sea parte del XML
    public List<Copia> getCopias() {
        return copias;
    }

    public void setCopias(List<Copia> copias) {
        this.copias = copias;
    }

    @Override
    public String toString() {
        return "Inventario{" + "id=" + id + ", libroInfo=" + libroInfo + ", totalCopias=" + totalCopias + ", copiasDisponibles=" + copiasDisponibles  + ", copias=" + copias + '}';
    }
}
