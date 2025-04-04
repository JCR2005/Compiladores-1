package TOML;

/**
 *
 * @author carlos
 */
public class Definir {

    public String Comentario(int opcion) {

        String comentario = " ";

        switch (opcion) {
            case 1 -> {

                comentario = "#Definicion de pagina";
            }
            case 2 -> {
                comentario = "#Definicion de sitio";
            }
            default ->
                throw new AssertionError();
        }

        return comentario;
    }

    public String etiqueta(String parametro) {

        String etiqueta = " ";

        etiqueta = "[" + parametro + "]";

        return etiqueta;
    }

    public String nombre(String parametro) {

        String nombre = " ";
        String[] partes;
        
        if (parametro.contains(".")) {
            partes=parametro.split("\\.");
            parametro=partes[1];
        }

        nombre = "nombre: " + "\"" + parametro.replace("_", " ") + "\"";

        return nombre;
    }

    public String tipo(int objetivo) {
        String tipo = " ";

        switch (objetivo) {
            case 1 -> {

                tipo = "tipo: pagina";
            }
            case 2 -> {
                tipo = "tipo: sitio";
            }
            case 3 -> {
                 tipo = "tipo: paginaSitio";
            }
            default ->
                throw new AssertionError();
        }

        return tipo;
    }

    public String path(String path) {

        path = "path: \"" + path + "\"";

        return path;
    }

}
