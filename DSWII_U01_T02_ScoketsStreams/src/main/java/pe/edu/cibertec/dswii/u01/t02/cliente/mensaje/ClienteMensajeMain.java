/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.cliente.mensaje;

/**
 *
 * @author LENOVO
 */
// CLIENTE MENSAJE MAIN
import java.io.IOException;

public class ClienteMensajeMain {

    public static void main(String[] args) {
        ClienteMensaje cliente = new ClienteMensaje("localhost", 2999);
        try {
            cliente.enviarMensaje("Hola desde ClienteMensaje");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
