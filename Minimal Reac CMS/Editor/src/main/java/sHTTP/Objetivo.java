
package sHTTP;

/**
 *
 * @author carlos
 */
public class Objetivo {
    
     private final String SITIO="SITIO";
    
    private final String PAGINA="PAGINA";
    
      public String objetivo(int objetivo){
        
        switch (objetivo) {
            case 1 -> {
                return SITIO;
            }
            case 2 -> {
                return PAGINA;
            }
            case 3 -> {
            }
            default -> throw new AssertionError();
        }
    
        return null;
    
    }
    
     public String SITIO(){
    
        return SITIO;
    
    }
     
      public String PAGINA(){
    
        return PAGINA;
    
    }
}
