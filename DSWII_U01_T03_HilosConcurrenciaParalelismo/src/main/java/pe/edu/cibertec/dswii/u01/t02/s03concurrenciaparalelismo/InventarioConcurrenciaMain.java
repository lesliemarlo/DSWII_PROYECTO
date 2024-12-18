/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.s03concurrenciaparalelismo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class InventarioConcurrenciaMain {

    public static void main(String[] args) {
        //--- PRUEBA DE CONCURRENCIA ---

        //Crear un ExecutorService con pool de 2 hilos
        // Simular la concurrencia, porque solo 2 tareas se van a ejecutar simultáneamente
        ExecutorService executorServiceConcurrencia = Executors.newFixedThreadPool(2);

        //Crear las tareas para libros
        Runnable tarea1 = new InventarioConcurrencia("Libro 1");
        Runnable tarea2 = new InventarioConcurrencia("Libro 2");
        Runnable tarea3 = new InventarioConcurrencia("Libro 3");
        Runnable tarea4 = new InventarioConcurrencia("Libro 4");

        //Ejecutar las tareas en el pool de hilos
        executorServiceConcurrencia.execute(tarea1);
        executorServiceConcurrencia.execute(tarea2);
        executorServiceConcurrencia.execute(tarea3);
        executorServiceConcurrencia.execute(tarea4);

        //Cerrar el executor
        executorServiceConcurrencia.shutdown();

        System.out.println("Las tareas concurrentes para libros han sido enviadas");

        // PRUEBA DE PARALELISMO
        //Obtener el número de núcleos
        int numeroNucleos = Runtime.getRuntime().availableProcessors();
        ExecutorService executorServiceParalelismo = Executors.newFixedThreadPool(numeroNucleos);

        //Crear y ejecutar tareas paralelas para libros
        for (int i = 0; i < numeroNucleos; i++) {
            executorServiceParalelismo.execute(new InventarioConcurrencia("Libro Paralelo " + i)); // Ajustado para libros
        }

        executorServiceParalelismo.shutdown();
        System.out.println("Las tareas paralelas para libros han sido enviadas");
    }

}
