/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.s01.creacionhilos;

/**
 *
 * @author Leslie
 */

//este hilo es el que ledice a los otros que empiecen a trabajar
public class HiloInventarioMain {
// hilos creados mediante la clase HiloInventario
     public static void main(String[] args) {
        // Crear hilos mediante herencia de clase Thread para libros
        HiloInventario hilo1 = new HiloInventario("Libro A");
        HiloInventario hilo2 = new HiloInventario("Libro B");

        // Hilos con implementación de interfaz Runnable para gestionar otras copias de libros
        Thread hilo3 = new Thread(new HiloRunnable("Libro C"));
        Thread hilo4 = new Thread(new HiloRunnable("Libro D"));

        // Iniciar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();

        // Desde el Main Thread
        System.out.println("Operaciones de inventario de libros iniciadas desde el hilo principal");
    }
}
