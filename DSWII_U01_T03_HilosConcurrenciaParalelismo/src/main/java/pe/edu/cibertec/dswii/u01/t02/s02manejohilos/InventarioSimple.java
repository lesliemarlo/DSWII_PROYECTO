/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.s02manejohilos;

public class InventarioSimple implements Runnable {
    private String nombreLibro; // Modificado para reflejar el libro

    public InventarioSimple(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    @Override
    public void run() {
        System.out.println("Iniciando operación para el libro: " + nombreLibro); // Ajustado para libros
        
        System.out.println("Procesando el libro: " + nombreLibro); // Ajustado para libros
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            System.out.println("La operación para el libro " + nombreLibro + " fue interrumpida."); // Ajustado para libros
        }
        
        System.out.println("Operación finalizada para el libro: " + nombreLibro); // Ajustado para libros
    }
}
