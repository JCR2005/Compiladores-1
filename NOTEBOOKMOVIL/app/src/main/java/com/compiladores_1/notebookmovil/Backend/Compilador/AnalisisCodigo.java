package com.compiladores_1.notebookmovil.Backend.Compilador;

import com.compiladores_1.notebookmovil.Backend.ArchivoCodigo.AnalizadorLexicoCodigo;
import com.compiladores_1.notebookmovil.Backend.ArchivoCodigo.parser;

import java.io.BufferedReader;
import java.io.StringReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AnalisisCodigo {
    private String mesaje="";

    private String intruccion="";
    private Boolean analisisExito=false;
    private boolean print = false;
    private boolean expresion = false;


    public void reiniciarBanderas() {
        mesaje = "";
        intruccion = "";
        analisisExito = false;
        print = false;
        expresion = false;
    }

    public Boolean compilar(String instruccion) {


            try {
                reiniciarBanderas();
                BufferedReader reader = new BufferedReader(new StringReader(instruccion));
                AnalizadorLexicoCodigo s = new AnalizadorLexicoCodigo(reader);
                parser p = new parser(s);

                    p.reiniciarBanderas();

                var resultado = p.parse().value;
                System.out.println("Resultado final: " + resultado);
                intruccion=resultado.toString();

                if (p.instruccionValida){

                    setAnalisisExito(true);
                    analisisCodigo(p);
                }else {
                    setMesaje("❌ ERROR DE SINTAXIS");
                }

                return getAnalisisExito();
            }catch (RuntimeException e) {
                String mensajeLexico = e.getMessage();

                Pattern pattern = Pattern.compile("'(.+)' en línea (\\d+), columna (\\d+)");
                Matcher matcher = pattern.matcher(mensajeLexico);

                if (matcher.find()) {
                    String token = matcher.group(1);
                    int linea = Integer.parseInt(matcher.group(2));
                    int columna = Integer.parseInt(matcher.group(3));

                    intruccion=(new ErroresLExicos(token, linea, columna)).toString();
                }
                setMesaje("❌ ERROR DE LEXICO");
            } catch (Exception e){
                setMesaje("❌ ERROR DE COMPILACION");
                System.err.println("Error en la compilación: " + e.getMessage());
                e.printStackTrace();
            }
            return false;
        }

    public void analisisCodigo( parser p) {

        if (p.expresion) {
            setMesaje("✔ COMPILACION EXITOSA: OPRECION EJECUTADA");
            expresion=true;
        }
        if (p.print) {
            setMesaje("✔ COMPILACION EXITOSA: PRINT EJECUTADO");
            print=true;
        }
    }

    public String getMesaje() {
        return mesaje;
    }

    public void setMesaje(String mesaje) {
        this.mesaje = mesaje;
    }

    public String getIntruccion() {
        return intruccion;
    }



    public Boolean getAnalisisExito() {
        return analisisExito;
    }

    public void setAnalisisExito(Boolean analisisExito) {
        this.analisisExito = analisisExito;
    }
}
