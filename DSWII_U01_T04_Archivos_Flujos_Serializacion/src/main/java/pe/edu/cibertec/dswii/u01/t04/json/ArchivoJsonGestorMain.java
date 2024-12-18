package pe.edu.cibertec.dswii.u01.t04.json;

import pe.edu.cibertec.dswii.u01.t04.json.Inventario;
import pe.edu.cibertec.dswii.u01.t04.json.LibroInfo;
import pe.edu.cibertec.dswii.u01.t04.json.Copia;
import pe.edu.cibertec.dswii.u01.t04.json.EstadoCopia;

import java.util.Arrays;
import java.util.List;

/**
 * Clase principal para probar la lectura y escritura de archivos JSON para la clase Inventario
 */
public class ArchivoJsonGestorMain {

    public static void main(String[] args) {
        // Instancia del gestor de archivos JSON
        ArchivoJsonGestor archivoJsonGestor = new ArchivoJsonGestor();

        // Creación del objeto de prueba: Inventario
        LibroInfo libroInfo = new LibroInfo(1L, "El arte de programar", "Donald Knuth", 3);
        
        // Crear los objetos EstadoCopia sin fechas (se eliminan los LocalDateTime)
        EstadoCopia disponible = new EstadoCopia(1L, "Disponible", "Copia disponible para préstamo");
        EstadoCopia prestado = new EstadoCopia(2L, "Prestado", "Copia prestada a un usuario");
        
        // Crear las copias usando los objetos EstadoCopia
        List<Copia> copias = Arrays.asList(
                new Copia(1L, disponible),
                new Copia(2L, prestado)
        );

        // Crear el inventario con las copias
        Inventario inventario = new Inventario(
                1L,
                libroInfo,
                10,
                8,
                copias
        );

        // Ruta del archivo JSON donde se almacenará el objeto
        String rutaArchivo = "D:\\DSWII\\inventario.json";

        // Escritura del archivo JSON
        archivoJsonGestor.escribirArchivo(rutaArchivo, inventario);

        // Lectura del archivo JSON usando generics
        Inventario inventarioLeido = archivoJsonGestor.leerArchivo(rutaArchivo, Inventario.class);

        // Impresión del objeto leído desde el archivo JSON
        System.out.println("Objeto leído desde el archivo JSON:");
        System.out.println(inventarioLeido);
    }
}
