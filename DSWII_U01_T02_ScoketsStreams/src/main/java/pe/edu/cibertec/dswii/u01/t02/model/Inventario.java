/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.model;

/**
 *
 * @author LENOVO
 */
// CLASE INVENTARIO
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class Inventario implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private LibroInfo libroInfo;
    private Integer totalCopias;
    private Integer copiasDisponibles;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;
    private List<Copia> copias;

    public Inventario(Long id, LibroInfo libroInfo, Integer totalCopias, Integer copiasDisponibles, LocalDateTime fechaCreacion, LocalDateTime fechaActualizacion, List<Copia> copias) {
        this.id = id;
        this.libroInfo = libroInfo;
        this.totalCopias = totalCopias;
        this.copiasDisponibles = copiasDisponibles;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualizacion = fechaActualizacion;
        this.copias = copias;
    }
}