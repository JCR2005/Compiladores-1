package AnalisisInstrucciones;

import RESPONSES.RespuestaErroresDeCompilacion;
import RESPONSES.RespuestaPaginaSitiosDisponibles;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author carlos
 */
public class Modificar {

    String contenido = "";
    private ArrayList<String> Errores = new ArrayList<>();
    private String json;

    public void convertirGsonContenido(ArrayList<String> contenido) {
        RespuestaErroresDeCompilacion rpsd = new RespuestaErroresDeCompilacion();

        rpsd.setErrores(contenido);
        Gson gson = new Gson();

        json = gson.toJson(rpsd);
        System.out.println("jason: " + getJson());
    }

    /**
     * @return the Errores
     */
    public ArrayList<String> getErrores() {
        return Errores;
    }

    /**
     * @param Errores the Errores to set
     */
    public void setErrores(ArrayList<String> Errores) {
        this.Errores = Errores;
    }

    /**
     * @return the json
     */
    public String getJson() {
        return json;
    }

  

    public String obtenerContenido() {

        try {
            File archivo = new File("arquitectura.toml");
            FileReader fileReader = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(fileReader);

            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
                contenido += linea + " ";
            }

            buffer.close();
            fileReader.close();
            return contenido;
        } catch (Exception e) {
        }

        return "";
    }

    public void ObtenerPathPagina(String contenido, String pagina, String body) {
        String[] declaracion = contenido.split("\\[");
        for (int i = 0; i < declaracion.length; i++) {
            if (declaracion[i].trim().isEmpty()) {
                continue;
            }
            declaracion[i] = "[" + declaracion[i];
            
          

            if (declaracion[i].contains("[" + pagina + "]")) {
                Pattern path = Pattern.compile("path:\\s*\"(.*?)\"");
                Matcher matcherPath = path.matcher(declaracion[i]);

                if (matcherPath.find()) {
                    String pathEncontrado = matcherPath.group(1);
                    modificarPagina(pathEncontrado, body);
                }
                break;
            }
        }
    }

    public void modificarPagina(String path, String contenido) {
        try {
            File archivo = new File(path);
            FileWriter fileWriter = new FileWriter(archivo, false); // false para sobrescribir
            BufferedWriter buffer = new BufferedWriter(fileWriter);

            buffer.write(contenido); // Escribe el nuevo contenido
            buffer.close(); // Cierra el buffer
            fileWriter.close(); // Cierra el FileWriter
            System.out.println("Archivo sobrescrito exitosamente.");

        } catch (Exception e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
