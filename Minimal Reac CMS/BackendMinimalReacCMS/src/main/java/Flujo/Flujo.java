package Flujo;

import AnalisisInstrucciones.AnalisisDeAccion;
import Compilador.Compilador;
import Response.Empaquetado;

/**
 *
 * @author carlos
 */
public class Flujo {

    private String empaquetadoJason = "";
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

        if (!compilador.isPeticionValida() || !compilador.isBodyValido()) {
            empaquetadoJason = empaquetado.empaqutado(2, analisisDeAccion.getDatos());
        } else {

            empaquetadoJason = empaquetado.empaqutado(1, analisisDeAccion.getDatos());
        }
        return empaquetadoJason;
    }

    public void compilar(String mensaje) {

        compilador.compilar(mensaje);

    }

    public void analizarAccion() {
        AnalisisAccion(compilador.getObjetivo_sCL(), compilador.getAccion());
    }

    public void AnalisisAccion(int objetivo_sCL, int accion) {

        try {
            analisisDeAccion.setErrorSintasis(compilador.isBodyValido());
            analisisDeAccion.getModificar().setErrores(compilador.getCompilador_Body().getErrores());
            analisisDeAccion.setAccion(accion);
            analisisDeAccion.setObjetivo(objetivo_sCL);
            analisisDeAccion.setsCL(compilador.getsCl());
            analisisDeAccion.setBody(compilador.getBody());
            analisisDeAccion.analisis();
        } catch (Exception e) {
        }

    }
}
