package Backend;

import Empaquetado.Empaquetado;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class Agregar {

    Empaquetado empaquetado = new Empaquetado();

    String body = "<main>\n"
            + " <h1>Hola Mundo</h1>\n"
            + "</main>";

    public boolean agregarPagina(String parametro) {
        try {
            empaquetado.encabezado(2, 2);
            empaquetado.instruccion(2, 2, parametro);
            empaquetado.body(body);
            empaquetado.empaquetado();
            return empaquetado.isExito();
        } catch (InterruptedException ex) {
            Logger.getLogger(Crear.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }

    public String response() {
        return empaquetado.getResponse();
    }

   

}
