package pe.edu.cibertec.dswii.u01.t04.json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Clase para gestionar la lectura y escritura de archivos JSON.
 */
public class ArchivoJsonGestor {

    /**
     * Método que permite escribir un archivo JSON.
     *
     * @param ruta Ruta del archivo donde se guardará el JSON.
     * @param contenido El objeto que será convertido y escrito como JSON.
     */
    public void escribirArchivo(String ruta, Object contenido) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
        // Conversión de objeto a JSON (String).
        String json = gson.toJson(contenido);
        try (FileWriter archivo = new FileWriter(ruta);
             PrintWriter print = new PrintWriter(archivo)) {
            print.print(json);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error al escribir el archivo JSON", ex);
        }
    }

    /**
     * Método que permite leer un archivo JSON.
     *
     * @param ruta Ruta del archivo desde donde se obtendrá el JSON.
     * @param claseObjeto Clase del objeto esperado al deserializar el JSON.
     * @param <T> Tipo genérico del objeto esperado.
     * @return Objeto leído y deserializado del JSON.
     */
    public <T> T leerArchivo(String ruta, Class<T> claseObjeto) {
        File refArchivo = new File(ruta);
        if (!refArchivo.exists()) {
            throw new RuntimeException("El archivo no existe en la ruta: " + ruta);
        }
        try (FileReader fileReader = new FileReader(refArchivo)) {
            Gson gson = new Gson();
            // Conversión de JSON a objeto.
            return gson.fromJson(fileReader, claseObjeto);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Archivo no encontrado", ex);
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new RuntimeException("Error al leer el archivo JSON", ex);
        }
    }
}
