package com.compiladores_1.notebookmovil.Backend.AnalisisMarkdown;

/**
 * Clase que determina el nivel de formato en una cadena de texto segun los asteriscos iniciales.
 *
 * @autor Carlos Rodriguez
 */
public class Formato {

    /**
     * Devuelve el nivel de formato basado en los asteriscos al inicio de la cadena.
     *
     * @param formato La cadena a analizar.
     * @return 3.0 para "***", 2.0 para "**", 1.0 para "*", o 0.0 si no hay asteriscos.
     */
    public double definirFormato(String formato){

        if (formato.startsWith("***")){
            return 3.0;
        }
        else if (formato.startsWith("**")){
            return 2.0;
        }
        else if (formato.startsWith("*")){
            return 1.0;
        }

        return 0.0;
    }
}
