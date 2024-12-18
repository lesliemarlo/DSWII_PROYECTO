/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t04.xml;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author SUITE
 */
public class ArchivoXMLGestorMain {

    public static void main(String[] args) {

        ArchivoXMLGestor archivoXMLGestor = new ArchivoXMLGestor();

        //------------------ ESCRITURA DE XML
        // 1. LIBRO
        LibroInfo libro = new LibroInfo(1L, "Java para Todos", "123-456-789", 2023);

        String rutaLibro = "D:\\DSWII\\libro.xml";
        archivoXMLGestor.escribirArchivo(rutaLibro, libro);
        System.out.println("El archivo XML de Libro se escribió correctamente en... " + rutaLibro);

        // 2. ESTADO COPIA
        EstadoCopia estadoCopia = new EstadoCopia(1L, "Disponible", "Copia en buen estado");

        // 3. COPIA
        Copia copia = new Copia(1L, estadoCopia);

        // 4. INVENTARIO
        List<Copia> copias = new ArrayList<>();
        copias.add(copia);
        Inventario inventario = new Inventario(1L, libro, 100, 80, copias);

        String rutaInventario = "D:\\DSWII\\inventario.xml";
        archivoXMLGestor.escribirArchivo(rutaInventario, inventario);
        System.out.println("El archivo XML de Inventario se escribió correctamente en... " + rutaInventario);

        //------------------ LECTURA DE XML
        // 1. LIBRO
        System.out.println("\n\n Inicio de Lectura de XML de Libro... ");
        Object libroObj = archivoXMLGestor.leerArchivo(rutaLibro, LibroInfo.class);
        LibroInfo libroLeido = (LibroInfo) libroObj;
        System.out.println("Datos del Libro Leído: ");
        System.out.println(libroLeido);

        // 2. INVENTARIO
        System.out.println("\n\n Inicio de Lectura de XML de Inventario... ");
        Object inventarioObj = archivoXMLGestor.leerArchivo(rutaInventario, Inventario.class);
        Inventario inventarioLeido = (Inventario) inventarioObj;
        System.out.println("Datos del Inventario Leído: ");
        System.out.println(inventarioLeido);
    }
}