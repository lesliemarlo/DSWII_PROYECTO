/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t04.json;

import pe.edu.cibertec.dswii.u01.t04.archivosserializados.*;
import java.io.Serializable;
import java.time.LocalDateTime;

public class EstadoCopia implements Serializable {
    public static final long serialVersionUID = 1L;
    
    private Long id;
    private String nombre;
    private String descripcion;
 

    public EstadoCopia() {}

    public EstadoCopia(Long id, String nombre, String descripcion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
     
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }


    @Override
    public String toString() {
        return "EstadoCopia{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion  + '}';
    }
}
