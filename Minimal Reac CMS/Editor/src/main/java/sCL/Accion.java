
package sCL;

/**
 *
 * @author carlos
 */
public class Accion {
    
    
     private final String CREAR="crear";
    
    private final String ELIMINAR="eliminar";
     
     
    public String accion(int accion){
        
        switch (accion) {
            case 1 -> {
                return CREAR;
            }
            case 2 -> {
                return ELIMINAR;
            }
            case 3 -> {
            }
            default -> throw new AssertionError();
        }
    
        return null;
    
    }
    
    public String crear(){
    
        return null;
    
    }
    
    public String agregar(){
    
        return null;
    
    }
    
    public String eliminar(){
    
        return null;
    
    }
    
    public String modificar(){
    
        return null;
    
    }
}
