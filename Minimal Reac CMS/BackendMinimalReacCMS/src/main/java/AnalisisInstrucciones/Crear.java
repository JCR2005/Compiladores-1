package AnalisisInstrucciones;

import ArchivosMTSX.Creacion;
import TOML.TOML;
import carlosrodriguez.backendminimalreaccms.EnviarCosas;

/**
 *
 * @author carlos
 */
public class Crear {

    TOML toml = new TOML();
    Creacion creacion = new Creacion();

    public void crear(String parametro, int objetivo) {

        boolean existe = false;
        toml.crearToml();
        existe = toml.validarExixtencia(obtenerParametro(parametro));
        if (!existe) {

            añadirContenido(parametro, objetivo);
            verficarObjetivo(obtenerParametro(parametro), objetivo);
            toml.añadirContenido(toml.getSegmento());
        }
        
        
    }

    public void añadirContenido(String parametro, int objetivo) {

        toml.añadirEtiquete(obtenerParametro(parametro));
        toml.añadirNombre(obtenerParametro(parametro));
        toml.añadirTipo(objetivo);

    }

    public String obtenerParametro(String sCL) {
        String[] partes = sCL.split(" ", 3);
        System.out.println(partes[2]);
        return partes[2];
    }

    public void verficarObjetivo(String parametro, int objetivo) {

        switch (objetivo) {
            case 1 -> {
                creacion.crearPagina(parametro);
                toml.añadirPath(creacion.getPath());
            }

            case 2 -> {
                creacion.crearSitio(parametro);
                toml.añadirPath(creacion.getPath());
            }
            default ->
                throw new AssertionError();
        }

    }
}
