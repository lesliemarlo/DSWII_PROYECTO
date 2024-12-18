/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.edu.cibertec.dswii.u01.t04.xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;
import jakarta.xml.bind.Unmarshaller;
import java.io.File;

/**
 *
 * @author SUITE
 */
public class ArchivoXMLGestor {

    /**
     * Método que permite escribir un archivo XML
     *
     * @param ruta Ruta del archivo donde se guardará el XML
     * @param contenido Es el objeto que será escrito dentro del archivo
     */
    public void escribirArchivo(String ruta, Object contenido) {
        File refArchivo = new File(ruta);
        try {
            JAXBContext contexto = JAXBContext.newInstance(contenido.getClass());
            Marshaller escritor = contexto.createMarshaller();
            escritor.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            escritor.marshal(contenido, refArchivo);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * Método que permite leer un archivo XML
     *
     * @param ruta Ruta del archivo de donde se obtendrá el XML
     * @param parametros Clases para leer el archivo
     * @return objeto leído
     */
    public Object leerArchivo(String ruta, Class<?>... parametros) {

        Object objetoLeido = null;
        if (parametros == null || parametros.length == 0) {
            throw new UnsupportedOperationException("No hay parámetros");
        }
        if (parametros[0] instanceof Class<?>) {
            Class<?> defClase = (Class<?>) parametros[0];
            File refArchivo = new File(ruta);
            try {
                JAXBContext contexto = JAXBContext.newInstance(defClase);
                Unmarshaller lector = contexto.createUnmarshaller();
                objetoLeido = lector.unmarshal(refArchivo);
            } catch (JAXBException e) {
                e.printStackTrace();
            }
        } else {
            throw new UnsupportedOperationException("Parámetro incorrecto");
        }
        return objetoLeido;
    }
}