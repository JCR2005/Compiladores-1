package Flujo;

import AnalisisInstrucciones.AnalisisDeAccion;
import Compilador.Compilador;
import Response.Empaquetado;

/**
 *
 * @author carlos
 */
public class Flujo {

    Compilador compilador = new Compilador();
    AnalisisDeAccion analisisDeAccion = new AnalisisDeAccion();

    Empaquetado empaquetado = new Empaquetado();

    public void flujo(String mensaje) {

        compilar(mensaje);

        if (compilador.isPeticionValida()) {
            analizarAccion();
        }

    }

    public String empaquetado() {
       
        return empaquetado.empaqutado(1,analisisDeAccion.getDatos());
    }

    public void compilar(String mensaje) {

        compilador.compilar(mensaje);

    }

    public void analizarAccion() {
        AnalisisAccion(compilador.getObjetivo_sCL(), compilador.getAccion());
    }

    public void AnalisisAccion(int objetivo_sCL, int accion) {

        try {

            analisisDeAccion.setAccion(accion);
            analisisDeAccion.setObjetivo(objetivo_sCL);
            analisisDeAccion.setsCL(compilador.getsCl());
            analisisDeAccion.setBody(compilador.getBody());
            analisisDeAccion.analisis();
        } catch (Exception e) {
        }

    }
}
