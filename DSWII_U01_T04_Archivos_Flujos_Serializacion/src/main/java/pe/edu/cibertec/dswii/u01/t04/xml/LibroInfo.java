package pe.edu.cibertec.dswii.u01.t04.xml;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement // Esta anotación marca a la clase como la raíz del XML
public class LibroInfo implements Serializable {
    public static final long serialVersionUID = 1L;

    private Long libroId;
    private String tituloLibro;
    private String isbnLibro;
    private Integer anioPublicacionLibro;

    // Constructor vacío (requerido para JAXB)
    public LibroInfo() {}

    // Constructor con todos los parámetros
    public LibroInfo(Long libroId, String tituloLibro, String isbnLibro, Integer anioPublicacionLibro) {
        this.libroId = libroId;
        this.tituloLibro = tituloLibro;
        this.isbnLibro = isbnLibro;
        this.anioPublicacionLibro = anioPublicacionLibro;
    }

    // Constructor adicional
    public LibroInfo(String isbnLibro, String tituloLibro, String autor) {
        this.isbnLibro = isbnLibro;
        this.tituloLibro = tituloLibro;
        this.libroId = null; // Asumir null como predeterminado si no se especifica
        this.anioPublicacionLibro = 0; // Año predeterminado
    }

    // Getter y setter para libroId
    @XmlElement // Marcar el getter de libroId para que sea parte del XML
    public Long getLibroId() {
        return libroId;
    }

    public void setLibroId(Long libroId) {
        this.libroId = libroId;
    }

    // Getter y setter para tituloLibro
    @XmlElement // Marcar el getter de tituloLibro para que sea parte del XML
    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    // Getter y setter para isbnLibro
    @XmlElement // Marcar el getter de isbnLibro para que sea parte del XML
    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

    // Getter y setter para anioPublicacionLibro
    @XmlElement // Marcar el getter de anioPublicacionLibro para que sea parte del XML
    public Integer getAnioPublicacionLibro() {
        return anioPublicacionLibro;
    }

    public void setAnioPublicacionLibro(Integer anioPublicacionLibro) {
        this.anioPublicacionLibro = anioPublicacionLibro;
    }

    @Override
    public String toString() {
        return "LibroInfo{" +
               "libroId=" + libroId +
               ", tituloLibro='" + tituloLibro + '\'' +
               ", isbnLibro='" + isbnLibro + '\'' +
               ", anioPublicacionLibro=" + anioPublicacionLibro +
               '}';
    }
}
