/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t04.json;

import pe.edu.cibertec.dswii.u01.t04.archivosserializados.*;
import java.io.Serializable;



public class LibroInfo implements Serializable {
    public static final long serialVersionUID = 1L;

    private Long libroId;
    private String tituloLibro;
    private String isbnLibro;
    private Integer anioPublicacionLibro;

    public LibroInfo() {}

    public LibroInfo(Long libroId, String tituloLibro, String isbnLibro, Integer anioPublicacionLibro) {
        this.libroId = libroId;
        this.tituloLibro = tituloLibro;
        this.isbnLibro = isbnLibro;
        this.anioPublicacionLibro = anioPublicacionLibro;
    }

    // Nuevo constructor solicitado
    public LibroInfo(String isbnLibro, String tituloLibro, String autor) {
        this.isbnLibro = isbnLibro;
        this.tituloLibro = tituloLibro;
        // Los campos adicionales pueden ser inicializados con valores por defecto
        this.libroId = null; // Asumir null como predeterminado si no se especifica
        this.anioPublicacionLibro = 0; // Año predeterminado
    }

    public Long getLibroId() {
        return libroId;
    }

    public void setLibroId(Long libroId) {
        this.libroId = libroId;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getIsbnLibro() {
        return isbnLibro;
    }

    public void setIsbnLibro(String isbnLibro) {
        this.isbnLibro = isbnLibro;
    }

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
