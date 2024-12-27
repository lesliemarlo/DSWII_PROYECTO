/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.servidor.mensaje;

/**
 *
 * @author LENOVO
 */
// SERVIDOR MENSAJE
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServidorMensaje {

    private int puerto;
    private boolean prendido;
    private ServerSocket socketServidor;

    public ServidorMensaje(int puerto) throws IOException {
        this.puerto = puerto;
        this.socketServidor = new ServerSocket(this.puerto);
        System.out.println("Servidor configurado en el puerto " + this.puerto);
    }

    public void iniciarServidor() {
        this.prendido = true;
        System.out.println("El servidor está en funcionamiento...");

        while (this.prendido) {
            try {
                Socket conexionEntrante = this.socketServidor.accept();

                String hostCliente = conexionEntrante.getInetAddress().getHostName();
                System.out.println("Conexión desde: " + hostCliente);

                InputStream flujoEntrada = conexionEntrante.getInputStream();
                InputStreamReader isr = new InputStreamReader(flujoEntrada);
                BufferedReader br = new BufferedReader(isr);

                String mensaje = br.readLine();
                System.out.println("Mensaje recibido: " + mensaje);

                br.close();
                isr.close();
                flujoEntrada.close();
                conexionEntrante.close();

            } catch (IOException e) {
                e.printStackTrace();
                this.prendido = false;
            }
        }
    }
}
