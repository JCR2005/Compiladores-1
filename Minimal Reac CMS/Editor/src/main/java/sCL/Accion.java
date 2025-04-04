
package sCL;

/**
 *
 * @author carlos
 */
public class Accion {
    
    
     private final String CREAR="crear";
    private final String OBTENER="obtener";
    private final String ELIMINAR="eliminar";
     private final String AGREGAR="agregar";
    private final String MODIFICAR="modificar";
     
    public String accion(int accion){
        
        switch (accion) {
            case 1 -> {
                return CREAR;
            }
            case 2 -> {
                return AGREGAR;
            }
            case 3 -> {
                return  ELIMINAR;
            }
            case 4 -> {
                return  MODIFICAR;
            }
            case 5 -> {
                return  OBTENER;
            }
            default -> throw new AssertionError();
        }
    
       
    
    }
    
   
}
