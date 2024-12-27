/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.servidor.transferencia;

/**
 *
 * @author LENOVO
 */
// SERVIDOR TRANSFERENCIA
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import pe.edu.cibertec.dswii.u01.t02.model.Inventario;

public class ServidorTransferencia {

    private int puerto;
    private boolean prendido;
    private ServerSocket socketServidor;

    public ServidorTransferencia(int puerto) throws IOException {
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
                ObjectInputStream entrada = new ObjectInputStream(flujoEntrada);

                Inventario inventario = (Inventario) entrada.readObject();

                System.out.println("Inventario recibido: " + inventario);

                conexionEntrante.close();

            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
                this.prendido = false;
            }
        }
    }
}
