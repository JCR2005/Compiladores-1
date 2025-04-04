package AnalisisInstrucciones;

import RESPONSES.RespuestaPaginaSitiosDisponibles;
import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author carlos
 */
public class Obtener {

    String exprecionEtiqueta = "\\[([^\\s]+)\\.";

    String exprecionTipo = "tipo:\\s*([^\\s]+)\\s*";
    String contenido;
    private String nombreSitio;
    String json;
    private String parametro;

    public void obtener(int objetivo) {

        switch (objetivo) {
            case 1:
                System.out.println(getParametro() + "este es ek parametro");
                obtenerPagina(getParametro());
                break;
            case 2:
                obtenerSitio(getParametro());
                break;
            case 3:
                obtenerLista("sitio");
                break;
            case 4:
                obtenerLista("pagina");
                break;
            case 5:

                obtenerLista("paginaSitio");
                break;
            default:

        }

    }

    public void obtenerContenido() {

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

        } catch (Exception e) {
        }

    }

    public void obtenerLista(String tipo) {
        obtenerContenido();
        buscarSitios(contenido, tipo, exprecionTipo);

    }

    private void obtenerSitio(String sitio) {

        obtenerContenido();

        nombreSitio = sitio;
        
        buscarSitios(contenido, sitio, exprecionEtiqueta);

    }

    public void buscarSitios(String contenido, String tipoBuscado, String expresion) {
        ArrayList<String> Tipos = new ArrayList<>();
        String[] declaracion = contenido.split("\\[");

        for (int i = 0; i < declaracion.length; i++) {
            if (declaracion[i].trim().isEmpty()) {
                continue;
            }
             declaracion[i] = "[" + declaracion[i];
            System.out.println(declaracion[i] + ":::");

            Pattern tipo = Pattern.compile(expresion);
            Matcher matcherTipo = tipo.matcher(declaracion[i]);

            if (matcherTipo.find()) {
                String tipoEncontrado = matcherTipo.group(1);
                System.out.println("Tipo encontrado: " + tipoEncontrado);

                if (tipoEncontrado.equals(tipoBuscado)) {

                    Pattern nombre = Pattern.compile("nombre:\\s*\"(.*?)\"\\s*");
                    Matcher matcherNombre = nombre.matcher(declaracion[i]);

                    if (matcherNombre.find()) {
                        String resultado = matcherNombre.group(1);
                        Tipos.add(resultado);
                        System.out.println("Nombre agregado: " + resultado);
                    } else {
                        System.out.println("No se encontró el nombre.");
                    }
                }
            } else {
                System.out.println("No se encontró tipo en esta declaración.");
            }
        }

        convertirGsonLista(Tipos);
    }

    public void convertirGsonLista(ArrayList lista) {
        RespuestaPaginaSitiosDisponibles rpsd = new RespuestaPaginaSitiosDisponibles();

        rpsd.setLista(lista);
        Gson gson = new Gson();

        json = gson.toJson(rpsd);
        System.out.println("jason: " + json);
    }

    public void convertirGsonContenido(String contenido) {
        RespuestaPaginaSitiosDisponibles rpsd = new RespuestaPaginaSitiosDisponibles();

        rpsd.setContenido(contenido);
        Gson gson = new Gson();

        json = gson.toJson(rpsd);
        System.out.println("jason: " + json);
    }

    public String obtenrJson() {
        return json;
    }

    private void obtenerPagina(String pagina) {

        obtenerContenido();

        ObtenerPathPagina(contenido, pagina);

    }

    public void ObtenerPathPagina(String contenido, String pagina) {
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
                    obtenerContenidoPagina(pathEncontrado);
                }
                break;
            }
        }
    }

    public void obtenerContenidoPagina(String path) {
        String contenido = "";
        try {
            File archivo = new File(path);
            FileReader fileReader = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(fileReader);

            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = buffer.readLine()) != null) {
                System.out.println(linea);
                contenido += linea + "\n";
            }

            buffer.close();
            fileReader.close();
            convertirGsonContenido(contenido);

        } catch (Exception e) {
        }

    }

    /**
     * @return the parametro
     */
    public String getParametro() {
        return parametro;
    }

    /**
     * @param parametro the parametro to set
     */
    public void setParametro(String parametro) {
        this.parametro = parametro;
    }

    /**
     * @return the nombreSitio
     */
    public String getNombreSitio() {
        return nombreSitio;
    }

    /**
     * @param nombreSitio the nombreSitio to set
     */
    public void setNombreSitio(String nombreSitio) {
        this.nombreSitio = nombreSitio;
    }

}
