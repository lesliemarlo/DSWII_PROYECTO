/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.cliente.transferencia;

/**
 *
 * @author LENOVO
 */
// CLIENTE TRANSFERENCIA
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import pe.edu.cibertec.dswii.u01.t02.model.Inventario;

public class ClienteTransferencia {

    private String host;
    private int puerto;

    public ClienteTransferencia(String host, int puerto) {
        this.host = host;
        this.puerto = puerto;
    }

    public void enviarInventario(Inventario inventario) throws IOException {
        Socket socketCliente = new Socket(this.host, this.puerto);
        OutputStream flujoSalida = socketCliente.getOutputStream();

        ObjectOutputStream escritorMensaje = new ObjectOutputStream(flujoSalida);
        escritorMensaje.writeObject(inventario);
        System.out.println("Inventario enviado!");
        escritorMensaje.close();
        flujoSalida.close();
        socketCliente.close();
    }
}
