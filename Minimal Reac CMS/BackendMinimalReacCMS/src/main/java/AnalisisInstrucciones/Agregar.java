package AnalisisInstrucciones;

import ArchivosMTSX.Creacion;
import TOML.TOML;

/**
 *
 * @author carlos
 */
public class Agregar {

    TOML toml = new TOML();
    Creacion creacion = new Creacion();

    public void crear(String parametro) {

        boolean existe = false;
        toml.crearToml();
        existe = toml.validarExixtencia(parametro);
        if (!existe) {

            añadirContenido(parametro);
            verficarObjetivo(parametro);
            toml.añadirContenido(toml.getSegmento());
        }

    }

    public void añadirContenido(String parametro) {

        toml.añadirEtiquete(parametro);
        toml.añadirNombre(parametro);
        toml.añadirTipo(3);

    }

    public void verficarObjetivo(String parametro) {

        creacion.crearPagina(parametro);
        toml.añadirPath(creacion.getPath());

    }
    
  
}
