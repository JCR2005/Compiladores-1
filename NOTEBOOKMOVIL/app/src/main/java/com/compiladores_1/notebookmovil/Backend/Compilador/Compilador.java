package com.compiladores_1.notebookmovil.Backend.Compilador;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase principal del compilador que gestiona el análisis de Markdown y código.
 */
public class Compilador {

    private AnalisisMarkdown analizadorMarkdown = new AnalisisMarkdown();
    private AnalisisCodigo analizadorCodigo = new AnalisisCodigo();
    private Boolean analisisExito = false;
    private String mesaje = "";
    private String intruccion = "";

    /**
     * Método que ejecuta el proceso de compilacian según el tipo de analizador.
     *
     * @param texto           El código fuente o texto a compilar.
     * @param AnalizadorEnUso Si es true, usa el analizador de Markdown; si es false, usa el analizador de código.
     */
    public void compilar(String texto, Boolean AnalizadorEnUso) {
        try {
            if (AnalizadorEnUso) {
                analisisExito = analizadorMarkdown.compilar(texto);
                mesaje = analizadorMarkdown.getMesaje();
                intruccion = analizadorMarkdown.getIntruccion();
                System.out.println(mesaje + " mesajeee");
                System.out.println(intruccion + " intruccionnn");
            } else {
                analisisExito = analizadorCodigo.compilar(texto);
                mesaje = analizadorCodigo.getMesaje();
                intruccion = analizadorCodigo.getIntruccion();
            }
        } catch (Exception e) {
            System.err.println("Otro error durante la compilación: " + e.getMessage());
        }
    }

    /**
     * Obtiene el analizador de Markdown.
     *
     * @return El objeto AnalisisMarkdown utilizado para el análisis de Markdown.
     */
    public AnalisisMarkdown getAnalizadorMarkdown() {
        return analizadorMarkdown;
    }

    /**
     * Indaca si el análisis fue exitoso.
     *
     * @return true si la compilación fue exitosa, false en caso contrario.
     */
    public Boolean getAnalisisExito() {
        return analisisExito;
    }

    /**
     * Obtiene el analizador de codigo.
     *
     * @return El objeto AnalisisCodigo utilizado para analizar de codigo.
     */
    public AnalisisCodigo getAnalizadorCodigo() {
        return analizadorCodigo;
    }

    /**
     * Obtiene el mensaje generado durante la compilación.
     *
     * @return El mensaje resultante del analisis.
     */
    public String getMesaje() {
        return mesaje;
    }

    /**
     * Obtiene la instruccion generada durante la compilacion.
     *
     * @return La instruccion resultante del analisis.
     */
    public String getIntruccion() {
        return intruccion;
    }
}
