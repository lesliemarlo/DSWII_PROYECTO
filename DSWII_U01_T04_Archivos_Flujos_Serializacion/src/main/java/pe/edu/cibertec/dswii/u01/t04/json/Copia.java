package pe.edu.cibertec.dswii.u01.t04.json;

import pe.edu.cibertec.dswii.u01.t04.archivosserializados.*;
import java.io.Serializable;

public class Copia implements Serializable {
    private Long id;
    private EstadoCopia estadoCopia;

    // Constructor modificado para aceptar Long y EstadoCopia
    public Copia(Long id, EstadoCopia estadoCopia) {
        this.id = id;
        this.estadoCopia = estadoCopia;
    }

    // Getters y setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EstadoCopia getEstadoCopia() {
        return estadoCopia;
    }

    public void setEstadoCopia(EstadoCopia estadoCopia) {
        this.estadoCopia = estadoCopia;
    }

    @Override
    public String toString() {
        return "Copia{" + "id=" + id + ", estadoCopia=" + estadoCopia + '}';
    }
}
