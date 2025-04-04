package Compilador;

import Archivos_sHTTP.analizadorLexico_sHTTP;
import Archivos_sHTTP.parser;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author carlos
 */
public class Compilador_sHTTP {

    private String mesaje = "";
    private String intruccion = "";
    private Boolean analisisExito = false;
    private int metodo=0;
    private int objetivo=0;

    public Boolean compilar(String instruccion) {
        try {

            BufferedReader reader = new BufferedReader(new StringReader(instruccion));
            analizadorLexico_sHTTP s = new analizadorLexico_sHTTP(reader);
            parser p = new parser(s);

            var resultado = p.parse().value;
            System.out.println("Resultado final: " + resultado);
            setIntruccion(resultado.toString());
            setMesaje(p.mensaje);

            if (p.instruccionValida) {
                setAnalisisExito((Boolean) true);
                metodo=p.metodo;
                objetivo=p.objetivo;
                System.out.println(this.mesaje);

            }

            return getAnalisisExito();
        } catch (RuntimeException e) {

        } catch (Exception e) {
            System.err.println("Error en la compilación: " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

    /**
     * @return the mesaje
     */
    public String getMesaje() {
        return mesaje;
    }

    /**
     * @param mesaje the mesaje to set
     */
    public void setMesaje(String mesaje) {
        this.mesaje = mesaje;
    }

    /**
     * @return the intruccion
     */
    public String getIntruccion() {
        return intruccion;
    }

    /**
     * @param intruccion the intruccion to set
     */
    public void setIntruccion(String intruccion) {
        this.intruccion = intruccion;
    }

    /**
     * @return the analisisExito
     */
    public Boolean getAnalisisExito() {
        return analisisExito;
    }

    /**
     * @param analisisExito the analisisExito to set
     */
    public void setAnalisisExito(Boolean analisisExito) {
        this.analisisExito = analisisExito;
    }

    /**
     * @return the metodo
     */
    public int getMetodo() {
        return metodo;
    }

    /**
     * @return the objetivo
     */
    public int getObjetivo() {
        return objetivo;
    }

}
