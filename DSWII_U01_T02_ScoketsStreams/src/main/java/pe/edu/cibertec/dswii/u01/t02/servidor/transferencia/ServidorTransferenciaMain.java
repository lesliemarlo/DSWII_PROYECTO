/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.servidor.transferencia;

/**
 *
 * @author LENOVO
 */
// SERVIDOR TRANSFERENCIA MAIN
import java.io.IOException;

public class ServidorTransferenciaMain {

    public static void main(String[] args) {
        try {
            ServidorTransferencia servidorTransferencia = new ServidorTransferencia(3000);
            servidorTransferencia.iniciarServidor();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
