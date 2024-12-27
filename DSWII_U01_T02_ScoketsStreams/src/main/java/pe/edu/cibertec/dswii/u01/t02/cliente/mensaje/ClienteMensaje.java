/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.cliente.mensaje;

/**
 *
 * @author LENOVO
 */
// CLIENTE MENSAJE
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;

public class ClienteMensaje {

    private String host;
    private int puerto;

    public ClienteMensaje(String host, int puerto) {
        this.host = host;
        this.puerto = puerto;
    }

    public void enviarMensaje(String mensaje) throws IOException {
        Socket socketCliente = new Socket(this.host, this.puerto);
        OutputStream flujoSalida = socketCliente.getOutputStream();
        PrintWriter escritorMensaje = new PrintWriter(flujoSalida, true);
        escritorMensaje.println(mensaje);

        System.out.println("Mensaje enviado!");
        escritorMensaje.close();
        flujoSalida.close();
        socketCliente.close();
    }
}
