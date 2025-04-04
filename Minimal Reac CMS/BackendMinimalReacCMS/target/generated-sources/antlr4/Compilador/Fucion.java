package Compilador;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author carlos
 */
public class Fucion {

    private final String nombre;
    private final Map<String, String> parametros;
    
    private final Map<String, Object> variables;
    private Object tipoRetorno;

    private final TipeScriptParser.Intrucciones_tipe_scripContext cuerpo;

    public Fucion(String nombre, Map<String, String> parametros, Map<String, Object> variables, TipeScriptParser.Intrucciones_tipe_scripContext cuerpo, Object tipoRetorno) {
        this.nombre = nombre;
        this.parametros = parametros;
        this.cuerpo = cuerpo;
        this.variables = variables;
        this.tipoRetorno = tipoRetorno;
    }

    public String getNombre() {
        return nombre;
    }

    public Map<String, Object> getVariables() {
        return variables;
    }

    public Map<String, String> getParametros() {
        return parametros;
    }

    public TipeScriptParser.Intrucciones_tipe_scripContext getCuerpo() {
        return cuerpo;
    }
}
