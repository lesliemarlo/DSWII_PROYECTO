/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.model;

/**
 *
 * @author LENOVO
 */
import java.io.Serializable;
import java.time.LocalDateTime;

public class Copia implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id; // Identificador único de la copia física
    private LibroInfo libroInfo; // Información replicada del libro
    private String codigoBarras; // Código interno de la copia, identificador único
    private EstadoCopia estadoCopia; // Relación con el estado actual de la copia
    private String ubicacionFisica; // Ubicación física de la copia (ej. "Estante A3", "Bodega", etc.)
    private LocalDateTime fechaCreacion; // Fecha/hora de creación del registro
    private LocalDateTime fechaActualizacion; // Última fecha/hora de actualización del registro

    // Constructor completo
    public Copia(Long id, LibroInfo libroInfo, String codigoBarras, EstadoCopia estadoCopia,
                 String ubicacionFisica, LocalDateTime fechaCreacion, LocalDateTime fechaActualizacion) {
        this.id = id;
        this.libroInfo = libroInfo;
        this.codigoBarras = codigoBarras;
        this.estadoCopia = estadoCopia;
        this.ubicacionFisica = ubicacionFisica;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
    }

    // Constructor vacío
    public Copia() {
    }

    // Getters y Setters
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

    // Método toString para depuración
    @Override
    public String toString() {
        return "Copia{" +
               "id=" + id +
               ", libroInfo=" + libroInfo +
               ", codigoBarras='" + codigoBarras + '\'' +
               ", estadoCopia=" + estadoCopia +
               ", ubicacionFisica='" + ubicacionFisica + '\'' +
               ", fechaCreacion=" + fechaCreacion +
               ", fechaActualizacion=" + fechaActualizacion +
               '}';
    }
}

