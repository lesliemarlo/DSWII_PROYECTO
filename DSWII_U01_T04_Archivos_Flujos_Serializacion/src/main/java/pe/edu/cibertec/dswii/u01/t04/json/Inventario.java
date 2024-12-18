/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t04.json;

import pe.edu.cibertec.dswii.u01.t04.archivosserializados.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class Inventario implements Serializable {
    public static final long serialVersionUID = 1L;

    private Long id;
    private LibroInfo libroInfo;
    private Integer totalCopias;
    private Integer copiasDisponibles;


    private List<Copia> copias;

    public Inventario() {}

    public Inventario(Long id, LibroInfo libroInfo, Integer totalCopias, Integer copiasDisponibles, List<Copia> copias) {
        this.id = id;
      
        this.totalCopias = totalCopias;
        this.copiasDisponibles = copiasDisponibles;

        this.copias = copias;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LibroInfo getLibroInfo() {
        return libroInfo;
    }

    public void setLibroInfo(LibroInfo libroInfo) {
        this.libroInfo = libroInfo;
    }

    public Integer getTotalCopias() {
        return totalCopias;
    }

    public void setTotalCopias(Integer totalCopias) {
        this.totalCopias = totalCopias;
    }

    public Integer getCopiasDisponibles() {
        return copiasDisponibles;
    }

    public void setCopiasDisponibles(Integer copiasDisponibles) {
        this.copiasDisponibles = copiasDisponibles;
    }

    

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

