package Backend;

import Empaquetado.Empaquetado;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class Crear {

    Empaquetado empaquetado = new Empaquetado();

    public boolean crearPagina(String nombre) {
        try {
            empaquetado.encabezado(2, 2);
            empaquetado.instruccion(1, 2, nombre);
            empaquetado.body(null);
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

    public boolean crearSitio(String nombre) {
        try {
            empaquetado.encabezado(2, 1);
            empaquetado.instruccion(1, 1, nombre);
            empaquetado.body(null);
            empaquetado.empaquetado();
            return empaquetado.isExito();
        } catch (InterruptedException ex) {
            Logger.getLogger(Crear.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

}
