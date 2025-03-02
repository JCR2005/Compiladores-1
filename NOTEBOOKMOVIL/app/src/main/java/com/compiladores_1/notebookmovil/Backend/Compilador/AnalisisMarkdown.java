package com.compiladores_1.notebookmovil.Backend.Compilador;

import com.compiladores_1.notebookmovil.Backend.AnalisisMarkdown.Formato;
import com.compiladores_1.notebookmovil.Backend.AnalisisMarkdown.Heander;
import com.compiladores_1.notebookmovil.Backend.AnalisisMarkdown.Lista;
import com.compiladores_1.notebookmovil.Backend.ArchivoTexto.analizadorLexico;
import com.compiladores_1.notebookmovil.Backend.ArchivoTexto.parser;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase encargada del análisis y compilación de texto en formato Markdown.
 * Procesa encabezados, listas, párrafos y formatos de texto.
 *
 * @author Carlos Rodriguez
 */
public class AnalisisMarkdown {

    private String mesaje="";
    private String intruccion="";
    private double tamaño = 0;
    private double estilo = 0;
    private boolean encabezado = false;
    private boolean textoFormato = false;
    private boolean parrafo = false;
    private boolean lista = false;
    private String[] listanormal;
    private String[] listaNumerica;
    private boolean lista_Numeros = false;
    private Boolean analisisExito=false;
    private Formato formato = new Formato();
    private Heander heander = new Heander();
    private Lista listas = new Lista();

    /**
     * Método principal para compilar una instrucción en Markdown.
     *
     * @param instruccion Texto en formato Markdown a analizar.
     * @return true si el análisis fue exitoso, false en caso contrario.
     */
    public Boolean compilar(String instruccion) {
        try {
            reestablecerBanderass();
            BufferedReader reader = new BufferedReader(new StringReader(instruccion));
            analizadorLexico s = new analizadorLexico(reader);
            parser p = new parser(s);

            if (p.action_obj != null) {
                p.action_obj.reestablecerBanderas();
            } else {
                System.err.println("Error: action_obj es null");
            }

            var resultado = p.parse().value;
            System.out.println("Resultado final: " + resultado);
            setIntruccion(resultado.toString());
            setMesaje(p.action_obj.mensaje);

            if (p.action_obj.instruccionValida) {
                analisisExito = true;
                analisisMArcado(resultado.toString(), p);
            }

            return analisisExito;
        } catch (RuntimeException e) {
            String mensajeLexico = e.getMessage();
            Pattern pattern = Pattern.compile("'(.+)' en línea (\\d+), columna (\\d+)");
            Matcher matcher = pattern.matcher(mensajeLexico);

            if (matcher.find()) {
                String token = matcher.group(1);
                int linea = Integer.parseInt(matcher.group(2));
                int columna = Integer.parseInt(matcher.group(3));
                intruccion = (new ErroresLExicos(token, linea, columna)).toString();
            }
            setMesaje("❌ ERROR DE LEXICO");
        } catch (Exception e) {
            System.err.println("Error en la compilación: " + e.getMessage());
            e.printStackTrace();
        }
        return false;
    }

    /**
     * Analiza y clasifica el contenido Markdown en sus distintos elementos.
     *
     * @param resultado Resultado del analis lexico y sintctico.
     * @param p Objeto del parser utilizado en el ananisis.
     */
    public void analisisMArcado(String resultado, parser p) {
        if (p.action_obj.encabezado) {
            setEncabezado(true);
            setTamaño(heander.definirHeader(resultado));
            setIntruccion(getIntruccion().replace("#", ""));
        }
        if (p.action_obj.tipoFormsto) {
            setTextoFormato(true);
            setEstilo(formato.definirFormato(resultado));
            setIntruccion(getIntruccion().replace("*", ""));
        }
        if (p.action_obj.parrafo) {
            setParrafo(true);
        }
        if (p.action_obj.lista) {
            setLista(true);
            setListanormal(listas.lista(resultado));
        }
        if (p.action_obj.lista_numerica) {
            setLista_Numeros(true);
            setListaNumerica(listas.listaNumerica(resultado));
        }
    }

    /**
     * Restablece las banderas y valores de la clase a su estado inicial.
     */
    public void reestablecerBanderass() {
        analisisExito = false;
        setMesaje("");
        setIntruccion("");
        setTamaño(0);
        setEstilo(0);
        setEncabezado(false);
        setTextoFormato(false);
        setParrafo(false);
        setLista(false);
        setListanormal(null);
        setListaNumerica(null);
        setLista_Numeros(false);
    }

    // Metodos getter y setter para los atributos de la clase.
    public String getMesaje() { return mesaje; }
    public void setMesaje(String mesaje) { this.mesaje = mesaje; }
    public String getIntruccion() { return intruccion; }
    public void setIntruccion(String intruccion) { this.intruccion = intruccion; }
    public double getTamaño() { return tamaño; }
    public void setTamaño(double tamaño) { this.tamaño = tamaño; }
    public double getEstilo() { return estilo; }
    public void setEstilo(double estilo) { this.estilo = estilo; }
    public boolean isEncabezado() { return encabezado; }
    public void setEncabezado(boolean encabezado) { this.encabezado = encabezado; }
    public boolean isTextoFormato() { return textoFormato; }
    public void setTextoFormato(boolean textoFormato) { this.textoFormato = textoFormato; }
    public boolean isParrafo() { return parrafo; }
    public void setParrafo(boolean parrafo) { this.parrafo = parrafo; }
    public boolean isLista() { return lista; }
    public void setLista(boolean lista) { this.lista = lista; }
    public String[] getListanormal() { return listanormal; }
    public void setListanormal(String[] listanormal) { this.listanormal = listanormal; }
    public String[] getListaNumerica() { return listaNumerica; }
    public void setListaNumerica(String[] listaNumerica) { this.listaNumerica = listaNumerica; }
    public boolean isLista_Numeros() { return lista_Numeros; }
    public void setLista_Numeros(boolean lista_Numeros) { this.lista_Numeros = lista_Numeros; }
}
