package com.compiladores_1.notebookmovil.Backend.Compilador;

/**
 * Clase que muetra error lexico detectado durante el analisis del cadigo fuente.
 */
public class ErroresLExicos {
    private String token;
    private int linea;
    private int columna;

    /**
     * Constructor para inicializar un error léxico con el token malo y su posición en el codigo.
     *
     * @param token   El token que causó el error léxico.
     * @param linea   La línea en la que se encuentra el error.
     * @param columna La columna en la que se encuentra el error.
     */
    public ErroresLExicos(String token, int linea, int columna) {
        this.token = token;
        this.linea = linea;
        this.columna = columna;
    }

    /**
     * Cadena del error lexico.
     *
     * @return El error lexico.
     */
    @Override
    public String toString() {
        return "Error léxico: '" + token + "' en línea " + linea + ", columna " + columna;
    }
}
