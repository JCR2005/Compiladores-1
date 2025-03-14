
package sHTTP;

/**
 *
 * @author carlos
 */
public class Metodo {
    
    private final String GET="GET";
    
    private final String POST="POST";
     
     
    public String metodo(int metodo){
        
        switch (metodo) {
            case 1 -> {
                return GET;
            }
            case 2 -> {
                return POST;
            }
            case 3 -> {
            }
            default -> throw new AssertionError();
        }
    
        return null;
    
    }
    
    public String GET(){
    
        return this.GET;
    
    }
    
    public String POST(){
    
        return this.POST;
    
    }
    
    public String PATCH(){
    
        return null;
    
    }
    
    public String DELETE(){
    
        return null;
    
    }
    
}
