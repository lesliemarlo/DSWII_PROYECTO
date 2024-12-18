/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t04.archivostexto;



public class ArchivoTextoGestorMain {

    public static void main(String[] args) {
        
        ArchivoTextoGestor archivoTextoGestor = new ArchivoTextoGestor();
        
        // Escritura del archivo de inventarios
        String contenido = """
                           1, 'Harry Potter', 'J.K. Rowling', 15, 5, 2024-01-01, 2024-05-01
                           2, 'The Hobbit', 'J.R.R. Tolkien', 10, 8, 2023-05-12, 2024-02-20
                           3, '1984', 'George Orwell', 20, 10, 2023-08-10, 2024-03-15
                           """;
        
        String rutaCarpeta = "D:\\DSWII";
        String rutaArchivo = "inventarios.txt";
        archivoTextoGestor.escribirArchivo(rutaCarpeta, rutaArchivo, contenido);
        System.out.println("El archivo se escribió correctamente en... "
                + rutaCarpeta + " -> " + rutaArchivo);
        
        // Lectura del archivo de inventarios
        String rutaArchivoLectura = "D:\\DSWII\\inventarios.txt";
        String contenidoLeido = archivoTextoGestor.leerArchivoTexto(rutaArchivoLectura);
        System.out.println("------ Contenido Leído ------ ");
        System.out.println(contenidoLeido);
        System.out.println("------ Fin del Contenido Leído ------ ");
    }
}
