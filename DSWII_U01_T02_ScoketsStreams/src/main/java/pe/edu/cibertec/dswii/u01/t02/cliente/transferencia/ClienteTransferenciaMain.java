/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t02.cliente.transferencia;

/**
 *
 * @author LENOVO
 */
// CLIENTE TRANSFERENCIA MAIN

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;
import pe.edu.cibertec.dswii.u01.t02.model.Inventario;
import pe.edu.cibertec.dswii.u01.t02.model.LibroInfo;
import pe.edu.cibertec.dswii.u01.t02.model.Copia;
import pe.edu.cibertec.dswii.u01.t02.model.EstadoCopia;

public class ClienteTransferenciaMain {
    public static void main(String[] args) {
        ClienteTransferencia clienteTransferencia = new ClienteTransferencia("localhost", 3000);

        LibroInfo libroInfo = new LibroInfo(1L, "Java Programming", "1234567890", 2022);
        EstadoCopia estadoDisponible = new EstadoCopia(1L, "DISPONIBLE", "La copia está disponible", LocalDateTime.now(), LocalDateTime.now());
        Copia copia1 = new Copia(1L, libroInfo, "12345-001", estadoDisponible, "Estante A3", LocalDateTime.now(), LocalDateTime.now());
        Copia copia2 = new Copia(2L, libroInfo, "12345-002", estadoDisponible, "Estante A3", LocalDateTime.now(), LocalDateTime.now());

        Inventario inventario = new Inventario(1L, libroInfo, 2, 1, LocalDateTime.now(), LocalDateTime.now(), Arrays.asList(copia1, copia2));

        try {
            clienteTransferencia.enviarInventario(inventario);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
