
package Backend;

import Empaquetado.Empaquetado;



/**
 *
 * @author carlos
 */
public class Crear {
    
    
    Empaquetado empaquetado = new Empaquetado();
    
    public void crearPagina(String nombre){     
        empaquetado.encabezado(2, 2);
        empaquetado.instruccion(1, 2, nombre);
        empaquetado.body(null);
        empaquetado.empaquetado();
    }
    
}
