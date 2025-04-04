package Compilador;


import Compilador.Funcion;
import Compilador.Resultado;
import Compilador.TipeScriptBaseVisitor;
import Compilador.TipeScriptParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.tree.ParseTree;

public class MyVisitor extends TipeScriptBaseVisitor<Object> {
  
 @Override
public Object visitBloque_instrucciones(TipeScriptParser.Bloque_instruccionesContext ctx) {
    System.out.println("Ejecutando bloque_instrucciones: " + ctx.getText());
    if (ctx.children != null) {
        for (ParseTree child : ctx.children) {
            visit(child);
        }
    } else {
        System.out.println("No hay hijos en el bloque de instrucciones.");
    }
    return null;
}

}
