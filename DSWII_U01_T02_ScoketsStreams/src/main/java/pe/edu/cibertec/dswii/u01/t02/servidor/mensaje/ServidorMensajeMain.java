/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.servidor.mensaje;

/**
 *
 * @author LENOVO
 */
// SERVIDOR MENSAJE MAIN
import java.io.IOException;

public class ServidorMensajeMain {

    public static void main(String[] args) {
        try {
            ServidorMensaje servidorMensaje = new ServidorMensaje(2999);
            servidorMensaje.iniciarServidor();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}