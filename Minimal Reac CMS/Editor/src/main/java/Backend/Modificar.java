package Backend;

import Empaquetado.Empaquetado;
import Responses.RespuestaErroresDeCompilacion;
import Responses.RespuestaPaginaSitiosDisponibles;
import com.google.gson.Gson;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class Modificar {
 Empaquetado empaquetado = new Empaquetado();
    public String modificarPagina(String parametro, String body) {

       

        try {
            empaquetado.encabezado(3, 2);
            empaquetado.instruccion(4, 2, parametro);
            empaquetado.body(body);
            empaquetado.empaquetado();
            return Errores(empaquetado.getBodyResponse());

        } catch (InterruptedException ex) {
            Logger.getLogger(Obtener.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
     public String AnalisarCodigo(String parametro, String body) {

       

        try {
            empaquetado.encabezado(2, 2);
            empaquetado.instruccion(6, 2, parametro);
            empaquetado.body(body);
            empaquetado.empaquetado();
            return Errores(empaquetado.getBodyResponse());

        } catch (InterruptedException ex) {
            Logger.getLogger(Obtener.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }

    public String Errores(String objeto) {

        System.out.println(objeto + "OBJETO");

        Gson gson = new Gson();

        String Errores = "";
        if (objeto != null) {
            RespuestaErroresDeCompilacion respuesta = gson.fromJson(objeto, RespuestaErroresDeCompilacion.class);
            System.out.println(respuesta.getErrores() + "errores");
            if (respuesta != null) {
                for (int i = 0; i < respuesta.getErrores().size(); i++) {
                    Errores += respuesta.getErrores().get(i) + "\n";
                }
            }
        }

        return Errores;
    }

    public String response() {
        return empaquetado.getResponse();
    }

}
