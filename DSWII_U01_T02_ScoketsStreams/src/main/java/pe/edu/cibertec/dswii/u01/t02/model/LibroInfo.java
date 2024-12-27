/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.model;

import java.io.Serializable;

/**
 *
 * @author LENOVO
 */
public class LibroInfo implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String titulo;
    private String isbn;
    private Integer anioPublicacion;

    public LibroInfo(Long id, String titulo, String isbn, Integer anioPublicacion) {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.anioPublicacion = anioPublicacion;
    }

    public LibroInfo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Integer getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(Integer anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "LibroInfo{" +
               "id=" + id +
               ", titulo='" + titulo + '\'' +
               ", isbn='" + isbn + '\'' +
               ", anioPublicacion=" + anioPublicacion +
               '}';
    }
}

