
package RESPONSES;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class RespuestaErroresDeCompilacion {
    
     private ArrayList<String> Errores = new ArrayList<>();

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
    
}
