/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.s03concurrenciaparalelismo;

public class InventarioConcurrencia implements Runnable {
    
    private String nombreLibro; // Ajustado para manejar libros

    public InventarioConcurrencia(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }

    //Método para la lógica concurrente
    @Override
    public void run() {
        System.out.println("Iniciando operación para el libro: " + nombreLibro); // Ajustado para libros
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.println(nombreLibro + " - Progreso " + (i + 1) * 20 + "%"); // Ajustado para libros
            } catch (InterruptedException ex) {
                System.out.println(nombreLibro + " fue interrumpido."); // Ajustado para libros
            }
        }
        
        System.out.println("Operación finalizada para el libro: " + nombreLibro); // Ajustado para libros
    }
}
