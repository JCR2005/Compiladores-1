package TOML;

import AnalisisInstrucciones.AnalisisDeAccion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class TOML {

    private Definir definir = new Definir();

    private String Segmento = "";

    public void añadirContenido(String nuevoContenido) {
        FileWriter escritor = null;
        try {

            System.out.println("www");
            String nombreArchivo = "arquitectura.toml";

            escritor = new FileWriter(nombreArchivo, true);
            BufferedWriter buffer = new BufferedWriter(escritor);
            buffer.write(nuevoContenido);
            buffer.newLine();
            buffer.close();
            escritor.close();
        } catch (IOException ex) {
            Logger.getLogger(TOML.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                escritor.close();
            } catch (IOException ex) {
                Logger.getLogger(TOML.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void crearToml() {

        String nombreArchivo = "arquitectura.toml";

        try {
            File archivo = new File(nombreArchivo);

            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("el archivo ya exite");
            }
        } catch (IOException e) {
        }

    }

    public boolean validarExixtencia(String parametro) {

        boolean existe = false;

        String nombreArchivo = "arquitectura.toml";

        try {
            File archivo = new File(nombreArchivo);
            FileReader fileReader = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(fileReader);

            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);

                if (linea.contains("[" + parametro + "]")) {
                    existe = true;
                }

            }

            buffer.close();
            fileReader.close();
        } catch (IOException ex) {
            Logger.getLogger(AnalisisDeAccion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return existe;
    }

    public void añadirComentario(int objetivo) {
        this.definir.Comentario(objetivo);
    }

    public void añadirEtiquete(String parametro) {

        this.Segmento += definir.etiqueta(parametro) + "\n";

    }

    public void añadirNombre(String parametro) {

        this.Segmento += definir.nombre(parametro) + "\n";

    }

    public void añadirTipo(int objetivo) {

        this.Segmento += definir.tipo(objetivo) + "\n";

    }

    public void añadirPath(String path) {

        this.Segmento += definir.path(path);

    }

    /**
     * @return the Segmento
     */
    public String getSegmento() {
        return Segmento;
    }

}
