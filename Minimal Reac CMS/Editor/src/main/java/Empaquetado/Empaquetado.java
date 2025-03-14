package Empaquetado;

import sHTTP.Request;
import sCL.Instruccion;

/**
 *
 * @author carlos
 */
public class Empaquetado {

    Request request = new Request();
    Instruccion instruccion_sCL = new Instruccion();

    String empaquetado;

    public void empaquetado() {
        System.out.println(request.getEncabezado());
    }

    public void encabezado(int metodo, int objetivo) {
        request.encabezado(metodo, objetivo);
    }

    public void instruccion(int accion, int objetivo, String parametro) {
        String instruccion = "";
        instruccion_sCL.getParametro().setParametro(parametro);
        instruccion = instruccion_sCL.instruccion_sCl(accion, objetivo);
        request.instruccion_sCl(instruccion);
    }

    public void body(String body) {
        request.body(body);
    }

}
