package Compilador;

/**
 *
 * @author carlos
 */
public class AnalisisSemanticoPrincipal {

    public boolean analisisSemantico(int metodo, int objetivo_sCL, int accion, int objetivo_sHTTP) {

        boolean instruccionValida = false;
        System.out.println("que "+metodo);
        System.out.println(accion);
        
        
        if (metodo == 1 && accion == 1) {
            instruccionValida = true;
        }
        if (metodo == 1 && accion == 2) {
            instruccionValida = true;
        }

        if (metodo == 2 && accion == 5) {
            instruccionValida = true;
        }
        if (metodo == 3 && accion == 3) {
            instruccionValida = true;
        }
        if (metodo == 4 && accion == 4) {
            instruccionValida = true;
        }
        if (objetivo_sCL != objetivo_sHTTP) {
            instruccionValida = false;
        }

        return instruccionValida;
    }

}
