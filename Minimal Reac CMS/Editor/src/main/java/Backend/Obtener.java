package Backend;

import Empaquetado.Empaquetado;
import Responses.RespuestaPaginaSitiosDisponibles;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class Obtener {

    Empaquetado empaquetado = new Empaquetado();

    public ArrayList<String> obtenerSitios() {
        try {
            empaquetado.encabezado(1, 3);
            empaquetado.instruccion(5, 3, "");
            empaquetado.body(null);
            empaquetado.empaquetado();

            return obtenrLista(empaquetado.getBodyResponse());
        } catch (InterruptedException ex) {
            Logger.getLogger(Obtener.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<String> obtenerPaginas() {
        try {
            empaquetado.encabezado(1, 4);
            empaquetado.instruccion(5, 4, "");
            empaquetado.body(null);
            empaquetado.empaquetado();

            return obtenrLista(empaquetado.getBodyResponse());
        } catch (InterruptedException ex) {
            Logger.getLogger(Obtener.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public ArrayList<String> obtenrLista(String objeto) {
        Gson gson = new Gson();

        RespuestaPaginaSitiosDisponibles respuesta = gson.fromJson(objeto, RespuestaPaginaSitiosDisponibles.class);

        for (int i = 0; i < respuesta.getLista().size(); i++) {
            System.out.println(respuesta.getLista().get(i) + "daotooo");
        }
        return respuesta.getLista();
    }

    public String obtenerContenidoPagina(String parametro) {
        try {
            empaquetado.encabezado(1, 2);
            empaquetado.instruccion(5, 2, parametro);
            empaquetado.body(null);
            empaquetado.empaquetado();
            return obtenerContenido(empaquetado.getBodyResponse());

        } catch (InterruptedException ex) {
            Logger.getLogger(Obtener.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

   
    public ArrayList<String> obtenerPaginasSitio(String nomre) {
        try {
            System.out.println(nomre+"aassss");
            empaquetado.encabezado(1, 1);
            empaquetado.instruccion(5, 1, nomre);
            empaquetado.body(null);
            empaquetado.empaquetado();

            return obtenrLista(empaquetado.getBodyResponse());
        } catch (InterruptedException ex) {
            Logger.getLogger(Obtener.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String obtenerContenido(String objeto) {
        Gson gson = new Gson();

        RespuestaPaginaSitiosDisponibles respuesta = gson.fromJson(objeto, RespuestaPaginaSitiosDisponibles.class);

        return respuesta.getContenido();
    }
}
