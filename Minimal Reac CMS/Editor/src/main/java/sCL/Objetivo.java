
package sCL;

/**
 *
 * @author carlos
 */
public class Objetivo {
    
        private final String SITIO="sitio";
    
    private final String PAGINA="pagina";
    
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
    
    public String sitio(){
    
        return null;
    
    }
    
     public String pagina(){
    
        return null;
    
    }
}
