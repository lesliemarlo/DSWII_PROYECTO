package pe.edu.cibertec.dswii.u01.t04.xml;

import jakarta.xml.bind.annotation.XmlElement;  // Importación de anotaciones JAXB
import jakarta.xml.bind.annotation.XmlRootElement;
import pe.edu.cibertec.dswii.u01.t04.json.*; // Asegúrate de que EstadoCopia esté correctamente definido en el paquete JSON
import pe.edu.cibertec.dswii.u01.t04.archivosserializados.*; // Asegúrate de que EstadoCopia sea serializable
import java.io.Serializable;  // Necesario para la serialización

@XmlRootElement
public class Copia implements Serializable {

    private Long id; // Identificador de la copia
    private EstadoCopia estadoCopia; // Estado de la copia, probablemente un enum o clase adicional

    // Constructor modificado para aceptar Long y EstadoCopia
    // Es importante tener un constructor que reciba los parámetros necesarios para crear la clase
    public Copia(Long id, EstadoCopia estadoCopia) {
        this.id = id;
        this.estadoCopia = estadoCopia;
    }

    // Constructor sin parámetros necesario para JAXB
    public Copia() {
        // Constructor vacío requerido por JAXB para deserialización
    }

    // Métodos getters y setters que permiten acceder a los atributos privados
    @XmlElement // Especifica que este método es un punto de acceso al XML
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @XmlElement // Anotación JAXB para el mapeo de estadoCopia en el XML
    public EstadoCopia getEstadoCopia() {
        return estadoCopia;
    }

    public void setEstadoCopia(EstadoCopia estadoCopia) {
        this.estadoCopia = estadoCopia;
    }

    // Método toString sobreescrito para representar la clase como una cadena de texto
    @Override
    public String toString() {
        return "Copia{" + "id=" + id + ", estadoCopia=" + estadoCopia + '}';
    }
}
