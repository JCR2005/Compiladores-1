package Compilador;



import Compilador.TipeScriptParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.Token;


/**
 *
 * @author carlos   
 */
public class Funcion {

    private  String nombre = null;
 private  Map<String, String> parametros = new HashMap<>();
 private  Map<String, Object> variables = null;
 private Object tipoRetorno;
   List<Token> tokens=null;
    private  TipeScriptParser.Bloque_instruccionesContext  cuerpo = null;
     public Funcion(){}
     public Funcion(String nombre,Map<String, String> parametros, Map<String, Object> variables, TipeScriptParser.Bloque_instruccionesContext cuerpo,Object tipoRetorno,  List<Token> tokens) {
        this.nombre = nombre;
        this.parametros = parametros;
        this.cuerpo = cuerpo;
        this.variables= variables;
        this.tipoRetorno=tipoRetorno;
    }
     
     private ArrayList<String> instrucciones = new ArrayList<>();
    private ArrayList<Integer> tipoInstruccion = new ArrayList<>();

    public void setInstrucciones(ArrayList<String> instrucciones) {
        this.instrucciones = instrucciones;
    }

    public void setTipoInstruccion(ArrayList<Integer> tipoInstruccion) {
        this.tipoInstruccion = tipoInstruccion;
    }

    public ArrayList<String> getInstrucciones() {
        return instrucciones;
    }

    public ArrayList<Integer> getTipoInstruccion() {
        return tipoInstruccion;
    }
     
      public String getNombre() {
        return nombre;
    }
      
        public Object getTipoRetorno() {
        return tipoRetorno;
    }

    public   List<Token> getTokens() {
        return tokens;
    }

      public Map<String, Object>  getVariables() {
        return variables;
    }
    public Map<String, String>  getParametros() {
        return parametros;
    }

    public TipeScriptParser.Bloque_instruccionesContext  getCuerpo() {
        return cuerpo;
    }
}
