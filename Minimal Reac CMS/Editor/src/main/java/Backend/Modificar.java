
package Backend;

import Empaquetado.Empaquetado;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author carlos
 */
public class Modificar {
    
    
    public String AnalisarCodigo(String parametro, String body){
    
        Empaquetado empaquetado = new Empaquetado();
        
        try {
            empaquetado.encabezado(3, 2);
            empaquetado.instruccion(4, 2, parametro);
            empaquetado.body(body);
            empaquetado.empaquetado();

          
        } catch (InterruptedException ex) {
            Logger.getLogger(Obtener.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
    
}
