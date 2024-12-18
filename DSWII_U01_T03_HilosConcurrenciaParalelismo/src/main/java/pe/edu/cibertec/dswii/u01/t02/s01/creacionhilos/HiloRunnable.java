/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.s01.creacionhilos;

import java.util.logging.Level;
import java.util.logging.Logger;

//Este también es un hilo, pero en vez de heredar de Thread,
//implementa la interfaz Runnable. Eso significa que define cómo debe trabajar el hilo

public class HiloRunnable implements Runnable {
    
    private String nombreLibro; // Modificado para reflejar el libro en inventario

    public HiloRunnable(String nombreLibro) {
        this.nombreLibro = nombreLibro;
    }
    
    @Override
    public void run (){
        System.out.println("Iniciando operación para el libro: " + nombreLibro); // Ajustado para libros
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("La operación para el libro " + nombreLibro + " fue interrumpida."); // Ajustado para libros
        }
        System.out.println("Operación finalizada para el libro: " + nombreLibro); // Ajustado para libros
    }
}
