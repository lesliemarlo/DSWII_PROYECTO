/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t04.archivosserializados;

import java.util.Date;

import java.time.LocalDateTime;
import java.util.Arrays;

public class ArchivoSerializadoGestorMain {

    public static void main(String[] args) {
        // Crear un objeto de ejemplo
        LibroInfo libroInfo = new LibroInfo(1L, "Java Básico", "123-456-789", 2024);
        EstadoCopia estado = new EstadoCopia(1L, "Disponible", "Copia en buen estado", LocalDateTime.now(), LocalDateTime.now());
        Copia copia = new Copia(1L, libroInfo, "123456789", estado, "Estante A3", LocalDateTime.now(), LocalDateTime.now());

        Inventario inventario = new Inventario();
        inventario.setId(1L);
        inventario.setLibroInfo(libroInfo);
        inventario.setTotalCopias(5);
        inventario.setCopiasDisponibles(3);
        inventario.setFechaCreacion(LocalDateTime.now());
        inventario.setFechaActualizacion(LocalDateTime.now());
        inventario.setCopias(Arrays.asList(copia));

        // Serializar el archivo
        ArchivoSerializadoGestor archivoGestor = new ArchivoSerializadoGestor();
        String rutaCarpeta = "D:\\DSWII";
        String nombreArchivo = "inventario.dat";
        archivoGestor.serializarArchivo(rutaCarpeta, nombreArchivo, inventario);
        System.out.println("El archivo de datos se escribió correctamente en... " + rutaCarpeta + " -> " + nombreArchivo);

        // Deserializar el archivo
        String rutaCompleta = "D:\\DSWII\\inventario.dat";
        Object objetoLeido = archivoGestor.deserializarArchivo(rutaCompleta);
        Inventario inventarioDeserializado = (Inventario) objetoLeido;

        // Mostrar los datos deserializados
        System.out.println("------ Objeto Leído ------ ");
        System.out.println(inventarioDeserializado);
        System.out.println("------ Fin del Objeto Leído ------ ");
    }
}
