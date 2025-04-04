
package sHTTP;

/**
 *
 * @author carlos
 */
public class Objetivo {
    
     private final String SITIO="SITIO";
    
    private final String PAGINA="PAGINA";
      private final String SITIOS="SITIOS";
     private final String PAGINAS="PAGINAS";
      private final String PAGINASITIOS="PAGINASITIOS";
      public String objetivo(int objetivo){
        
        switch (objetivo) {
            case 1 -> {
                return SITIO;
            }
            case 2 -> {
                return PAGINA;
            }
           case 3 -> {
                return SITIOS;
            }
           case 4 -> {
                return PAGINAS;
            }
            case 5 -> {
                return PAGINASITIOS;
            }
            default -> throw new AssertionError();
        }
    
    
    
    }
    
     public String SITIO(){
    
        return SITIO;
    
    }
     
      public String PAGINA(){
    
        return PAGINA;
    
    }
}
