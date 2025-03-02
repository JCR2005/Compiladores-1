package com.compiladores_1.notebookmovil.Backend.AnalisisMarkdown;

/**
 * Clase que analiz el encavezado de una cadena de texto y devuelve un valor segun los signos de formato.
 *
 * @autor Carlos Rodriguez
 */
public class Heander {

    /**
     * Analiza el encabezado de una cadena y devuelve un valor basado en el nmero de caracteres de
     * marcador que se encuentran al inicio de la cadena.
     *
     * @param header La cadena que representa el encabezado.
     * @return Un valor que representa el tamaño del encabezado segun el número de asteriscos.
     *         0.00 si no corresponde a ningun formato de encabezado conocido.
     */
    public Double definirHeader(String header){

        if (header.startsWith("######")){ return 60.00; }
        else if (header.startsWith("#####")){ return 450.00; }
        else if (header.startsWith("####")){ return 35.00; }
        else if (header.startsWith("###")){ return 25.00; }
        else if (header.startsWith("##")){ return 16.00; }
        else if (header.startsWith("·")){ return 10.00; }

        return 0.00;
    }
}
