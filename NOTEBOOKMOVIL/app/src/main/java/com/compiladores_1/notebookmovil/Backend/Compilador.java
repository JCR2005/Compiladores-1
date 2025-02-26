package com.compiladores_1.notebookmovil.Backend;

import java.io.BufferedReader;
import java.io.StringReader;

public class Compilador {

    private Boolean analisisExito=false;
    private String mesaje="";
    private String intruccio="";
    private  double tamaño=0;

    private double estilo=0;
    private AnalisisMArcado analisisMArcado;
    private boolean encabezado=false;
    private boolean TextoFormato=false;
    private boolean parrafo=false;
    private boolean lista= false;

    private boolean print= false;

    private String[] listanormal;
    private String[] listaNumerica;
    private boolean lista_Numeros=false;
    public void compilar(String texto) {
        analisisExito=false;
        encabezado=false;
        TextoFormato=false;
        String result = null;
        try {
            setAnalisisMArcado(new AnalisisMArcado());
            BufferedReader reader = new BufferedReader(new StringReader(texto));
            analizadorLexico s = new analizadorLexico(reader);
            parser p = new parser(s);

            var resultado = p.parse().value;
            System.out.println("Resultado final: " + resultado);
            setIntruccio(resultado.toString());
            setMesaje(parser.CUP$parser$actions.mensaje);

            if (parser.CUP$parser$actions.instruccionValida){
                setAnalisisExito(true);
                analisisMArcado(resultado.toString());

            }

        } catch (Exception e) {
            System.err.println("Error en la compilación: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public void analisisMArcado(String resultado){

        if (parser.CUP$parser$actions.encabezado){
            setEncabezado(true);
            setTamaño(getAnalisisMArcado().anailisHeader(resultado));
            setIntruccio(getIntruccio().replace("#",""));
        }
        if (parser.CUP$parser$actions.encabezado){
            setEncabezado(true);
            setTamaño(getAnalisisMArcado().anailisHeader(resultado));
            setIntruccio(getIntruccio().replace("#",""));
        }
        if (parser.CUP$parser$actions.tipoFormsto){
            setTextoFormato(true);
            setEstilo(getAnalisisMArcado().formato(resultado));
            setIntruccio(getIntruccio().replace("*",""));

        }
        if (parser.CUP$parser$actions.parrafo){
            setParrafo(true);

        }
        if (parser.CUP$parser$actions.lista){
            setLista(true);
            setListanormal(getAnalisisMArcado().lista(resultado));

        }
        if (parser.CUP$parser$actions.lista_numerica){
            setLista_Numeros(true);
            setListaNumerica(getAnalisisMArcado().listaNumerica(resultado));

        }
        if (parser.CUP$parser$actions.print){
            setPrint(true);

        }

    }

    public Boolean getAnalisisExito() {
        return analisisExito;
    }

    public void setAnalisisExito(Boolean analisisExito) {
        this.analisisExito = analisisExito;
    }

    public String getMesaje() {
        return mesaje;
    }

    public void setMesaje(String mesaje) {
        this.mesaje = mesaje;
    }

    public String getIntruccio() {
        return intruccio;
    }

    public void setIntruccio(String intruccio) {
        this.intruccio = intruccio;
    }

    public AnalisisMArcado getAnalisisMArcado() {
        return analisisMArcado;
    }

    public void setAnalisisMArcado(AnalisisMArcado analisisMArcado) {
        this.analisisMArcado = analisisMArcado;
    }

    public boolean isEncabezado() {
        return encabezado;
    }

    public void setEncabezado(boolean encabezado) {
        this.encabezado = encabezado;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }

    public boolean isTextoFormato() {
        return TextoFormato;
    }

    public void setTextoFormato(boolean textoFormato) {
        TextoFormato = textoFormato;
    }

    public double getEstilo() {
        return estilo;
    }

    public void setEstilo(double estilo) {
        this.estilo = estilo;
    }

    public boolean isParrafo() {
        return parrafo;
    }

    public void setParrafo(boolean parrafo) {
        this.parrafo = parrafo;
    }

    public boolean isLista_Numeros() {
        return lista_Numeros;
    }

    public void setLista_Numeros(boolean lista_Numeros) {
        this.lista_Numeros = lista_Numeros;
    }

    public boolean isLista() {
        return lista;
    }

    public void setLista(boolean lista) {
        this.lista = lista;
    }

    public String[] getListanormal() {
        return listanormal;
    }

    public void setListanormal(String[] listanormal) {
        this.listanormal = listanormal;
    }

    public String[] getListaNumerica() {
        return listaNumerica;
    }

    public void setListaNumerica(String[] listaNumerica) {
        this.listaNumerica = listaNumerica;
    }

    public boolean isPrint() {
        return print;
    }

    public void setPrint(boolean print) {
        this.print = print;
    }
}
