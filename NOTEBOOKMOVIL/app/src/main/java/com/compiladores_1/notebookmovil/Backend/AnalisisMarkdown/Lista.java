package com.compiladores_1.notebookmovil.Backend.AnalisisMarkdown;

/**
 * Clase que contiene metodos para analizar y ordenar listas en cadenas de texto.
 *
 * @autor Carlos Rodriguez
 */
public class Lista {

    /**
     * Separa una cadena de texto en una lista de elementos utilizando el signo '+' como delimitador.
     *
     * @param listaNormal La cadena de texto a analizar.
     * @return Un arreglo de cadenas con los elementos separados por '+'.
     */
    public String[] lista(String listaNormal){

        String lista[] = listaNormal.split("(?=\\+)");

        return lista;
    }

    /**
     * Separs una cadena de texto en una lista numerica ordenada, utilizando numeros seguidos de un punto como delimitadores.
     *
     * @param listaNumerica La cadena de texto con elementos numeradod.
     * @return Un arreglo de cadenas ordenado numéricamente segun los numeros que preceden a cada item.
     */
    public String[] listaNumerica(String listaNumerica) {

        String lista[] = listaNumerica.split("(?=\\d+\\.)");

        // ordena los eleentos de la lista numerica
        for (int i = 1; i < lista.length; i++) {
            String actual = lista[i].trim();

            int j = i - 1;
            int numActual = Integer.parseInt(actual.split("\\.", 2)[0].trim());

            while (j >= 0 && Integer.parseInt(lista[j].split("\\.", 2)[0].trim()) > numActual) {
                lista[j + 1] = lista[j];
                j--;
            }

            lista[j + 1] = actual;
        }
        return lista;
    }
}
