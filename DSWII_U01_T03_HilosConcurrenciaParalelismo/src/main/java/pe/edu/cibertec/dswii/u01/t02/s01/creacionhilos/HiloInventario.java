/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.s01.creacionhilos;

public class HiloInventario extends Thread {
    
    private String nombreLibro; 

    public HiloInventario(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    
    @Override
    public void run (){
        System.out.println("Iniciando operación para el libro: " + nombreLibro); // Ajustado para libros
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Operación para el libro " + nombreLibro + " fue interrumpida."); // Ajustado para libros
        }
        System.out.println("Operación finalizada para el libro: " + nombreLibro); // Ajustado para libros
    }
}
