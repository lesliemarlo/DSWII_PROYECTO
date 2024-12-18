/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.s02manejohilos;

//se están creando 4 hilos para simular la operación con libros
//Cada hilo simula la operación de manejar un libro,lo cual es 
//representado por el objeto InventarioSimple.
//
public class InventarioSimpleMain {

    public static void main(String[] args) {

        //Creación de 4 hilos relacionados con libros
        Thread hilo1 = new Thread(new InventarioSimple("Libro 1"));
        Thread hilo2 = new Thread(new InventarioSimple("Libro 2"));
        Thread hilo3 = new Thread(new InventarioSimple("Libro 3"));
        Thread hilo4 = new Thread(new InventarioSimple("Libro 4"));

        //Iniciar los hilos
        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        
        //Desde el Main Thread
        System.out.println("Hilos de libros iniciados desde el hilo principal");

    }

}
