/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t04.archivosserializados;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Copia implements Serializable {
    public static final long serialVersionUID = 1L;

    private Long id;
    private LibroInfo libroInfo;
    private String codigoBarras;
    private EstadoCopia estadoCopia;
    private String ubicacionFisica;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;

    public Copia() {}

    public Copia(Long id, LibroInfo libroInfo, String codigoBarras, EstadoCopia estadoCopia, String ubicacionFisica, LocalDateTime fechaCreacion, LocalDateTime fechaActualizacion) {
        this.id = id;
        this.libroInfo = libroInfo;
        this.codigoBarras = codigoBarras;
        this.estadoCopia = estadoCopia;
        this.ubicacionFisica = ubicacionFisica;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
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

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public EstadoCopia getEstadoCopia() {
        return estadoCopia;
    }

    public void setEstadoCopia(EstadoCopia estadoCopia) {
        this.estadoCopia = estadoCopia;
    }

    public String getUbicacionFisica() {
        return ubicacionFisica;
    }

    public void setUbicacionFisica(String ubicacionFisica) {
        this.ubicacionFisica = ubicacionFisica;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public LocalDateTime getFechaActualizacion() {
        return fechaActualizacion;
    }

    public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
        this.fechaActualizacion = fechaActualizacion;
    }

    @Override
    public String toString() {
        return "Copia{" + "id=" + id + ", libroInfo=" + libroInfo + ", codigoBarras=" + codigoBarras + ", estadoCopia=" + estadoCopia + ", ubicacionFisica=" + ubicacionFisica + ", fechaCreacion=" + fechaCreacion + ", fechaActualizacion=" + fechaActualizacion + '}';
    }
}
