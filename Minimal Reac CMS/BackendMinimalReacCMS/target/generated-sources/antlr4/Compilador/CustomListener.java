package Compilador;

import Compilador.Resultado;
import Compilador.TipeScriptBaseListener;
import Compilador.TipeScriptParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;

/**
 *
 * @author carlos
 */
public class CustomListener extends TipeScriptBaseListener {

    private String error = "";
    private String expresionNoValida;
    private Map<String, Object> tablaSimbolos;
    private ArrayList<String> intruccionesValidas = new ArrayList<>();
    private ArrayList<String> Errores = new ArrayList<>();

    public ArrayList<String> getIntruccionesValidas() {
        return this.intruccionesValidas;
    }

    public ArrayList<String> getErrores() {
        return this.Errores;
    }

    public CustomListener(Map<String, Object> tablaSimbolos) {
        this.tablaSimbolos = tablaSimbolos;
    }

    TipeScriptParser parser;

    public void obtnerParse(TipeScriptParser parse) {
        this.parser = parse;
    }

    @Override
    public void exitImpresion_consola(TipeScriptParser.Impresion_consolaContext ctx) {
        Resultado resultado = (Resultado) ctx.value;

        if (resultado != null) {
            if (resultado.isBandera1() == true) {
                error = ctx.getText();
                System.out.println("ERROR SEMANTICO → ^" + error + "^ | error dentro de log(^^^) |");

                String mensaje = "ERROR SEMANTICO → ^" + error + "^ | error dentro de log(^^^) |";
                Errores.add(mensaje);
            } else if (resultado.isBandera2() == true) {
                error = ctx.getText();

                System.out.println("ERROR SEMANTICO → ^" + resultado.value + "^ | no es posible imprimir estos parametros de esta manera|");
                System.out.println("ERROR SEMANTICO → ^" + error + "^ | error log() |");

                String mensaje = "ERROR SEMANTICO → ^" + resultado.value + "^ | no es posible imprimir estos parametros de esta manera|";
                Errores.add(mensaje);
                mensaje = "ERROR SEMANTICO → ^" + error + "^ | error log() |";
                Errores.add(mensaje);

            }
        }

    }

    @Override
    public void exitInstruccion_tipo_script(TipeScriptParser.Instruccion_tipo_scriptContext ctx) {

        Resultado resultado = (Resultado) ctx.value;

        if (resultado != null) {
            error = ctx.getText();
            if (!error.isEmpty()) {

                System.out.println("ERROR  → ^ " + error + " ^ | Instruccion invalida |");
                String mensaje = "ERROR  → ^ " + error + " ^ | Instruccion invalida |";
                Errores.add(mensaje);
            }
        } else if (ctx.error) {

            error = "";
            List<Token> tokens = ((CommonTokenStream) parser.getTokenStream())
                    .getTokens(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());

            for (Token t : tokens) {

                error += t.getText() + " ";

            }

            System.out.println(error + "|Instruccion valida|");

            if (!ctx.funcion && !ctx.if_) {
                String mensaje = error + "|Instruccion valida|";
                intruccionesValidas.add(mensaje);
            }
        } else {

            error = ctx.getText();
            if (!error.isEmpty()) {

                System.out.println("ERROR  → ^ " + error + " ^ | Instruccion invalida |");

                String mensaje = "ERROR  → ^ " + error + " ^ | Instruccion invalida |";
                Errores.add(mensaje);

            }

        }

    }

    @Override
    public void exitDeclaracion_funcion(TipeScriptParser.Declaracion_funcionContext ctx) {

        if (ctx != null) {

            error = "";
            List<Token> tokens = ((CommonTokenStream) parser.getTokenStream())
                    .getTokens(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());

            for (Token t : tokens) {

                error += t.getText() + " ";

            }

            if (ctx.error) {
                System.out.println("ERROR SEMANTICO → ^ " + error + " ^ | Instruccion invalida |");

                String mensaje = "ERROR SEMANTICO → ^ " + error + " ^ | Instruccion invalida |";
                Errores.add(mensaje);
            } else {
                System.out.println(error + "|Instruccion valida|");

                String mensaje = error + "|Instruccion valida|";
                intruccionesValidas.add(mensaje);
            }

        } else {

            error = ctx.getText();
            if (!error.isEmpty()) {

                System.out.println("ERROR SINTACTICO → ^ " + error + " ^ | Instruccion invalida |");

                String mensaje = "ERROR SINTACTICO → ^ " + error + " ^ | Instruccion invalida |";
                Errores.add(mensaje);

            }

        }

    }

    @Override
    public void exitCondicional(TipeScriptParser.CondicionalContext ctx) {

        if (ctx != null) {
            System.out.println(ctx.error1 + "SSSSSSSSSSSSSSS" + ctx);
            if (ctx.error1) {
                error = ctx.getText();
                String mensaje = "ERROR SEMANTICO → ^ " + error + " ^ | Problema en el if |";
                Errores.add(mensaje);
            }
            if (ctx.error2) {
                error = ctx.Instvalido;
                String mensaje = "ERROR SEMANTICO → ^ " + error + " ^ | condicion no valida |";
                Errores.add(mensaje);
            }
            if (ctx.error3) {
                error = ctx.Instvalido;
                String mensaje = "ERROR SEMANTICO → ^ " + error + " ^ | condicion no boleana |";
                Errores.add(mensaje);
            }

        } else {

            error = ctx.getText();
            if (!error.isEmpty()) {

                System.out.println("ERROR SINTACTICO → ^ " + error + " ^ | Instruccion invalida |");

                String mensaje = "ERROR SINTACTICO → ^ " + error + " ^ | Instruccion invalida |";
                Errores.add(mensaje);

            }

        }

    }

    @Override
    public void exitRegreso_if(TipeScriptParser.Regreso_ifContext ctx) {

        System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ");
        if (ctx != null) {
            System.out.println(ctx.error3);
            if (ctx.error3) {
                System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ1");
                String mensaje = "ERROR SEMANTICO → ^ " + ctx.getText() + " ^ | retunr mal declarado, if fuera de una funcion |";
                Errores.add(mensaje);
            } else if (ctx.error1) {
                String mensaje = "ERROR SEMANTICO → ^ " + ctx.getText() + " ^ | retunr ya declarado |";
                Errores.add(mensaje);
            } else if (ctx.error2) {
                String mensaje = "ERROR SEMANTICO → ^ " + ctx.getText() + " ^ | esta funcion no retorna niguna funcion |";
                Errores.add(mensaje);
            }

        } else {
            System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ2");
            error = ctx.getText();
            if (!error.isEmpty()) {
                System.out.println("ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ3");
                System.out.println("ERROR SINTACTICO → ^ " + error + " ^ | Instruccion invalida |");

                String mensaje = "ERROR SINTACTICO → ^ " + error + " ^ | Instruccion invalida |";
                Errores.add(mensaje);

            }

        }

    }

    @Override
    public void exitAsignacionVariable(TipeScriptParser.AsignacionVariableContext ctx) {
        Resultado resultado = (Resultado) ctx.value;
        if (resultado != null) {
            error = ctx.getText();
            String mensaje = "";
            if (resultado.isBandera1()) {

                System.out.println("ERROR SEMANTICO → ^ " + resultado.intruccion + " ^ | error tipo | " + resultado.mensajes.get(0) + " |");

                mensaje = "ERROR SEMANTICO → ^ " + resultado.intruccion + " ^ | error tipo | " + resultado.mensajes.get(0) + " |";
                Errores.add(mensaje);
            } else if (resultado.isBandera2()) {

                System.out.println("ERROR SEMANTICO → ^ " + resultado.intruccion + "^ |" + ctx.IDENTIFICADOR.getText() + " no definida |");

                mensaje = "ERROR SEMANTICO → ^ " + resultado.intruccion + "^ |" + ctx.IDENTIFICADOR.getText() + " no definida |";
                Errores.add(mensaje);
            } else if (resultado.isBandera3()) {
                
               
                System.out.println("ERROR SEMANTICO → ^ " + ctx.getText() + "^ | Error en asignacion |");

                mensaje = "ERROR SEMANTICO → ^ " +  ctx.getText() + "^ | " + ctx.IDENTIFICADOR.getText() + " no compatible con "+ ctx.tipoAsignacionVariable().getText()+" |";
                Errores.add(mensaje);
                
            }
        }
    }

    @Override
    public void exitCreacionVariable(TipeScriptParser.CreacionVariableContext ctx) {
        Resultado resultado = (Resultado) ctx.value;

        if (resultado != null) {
            error = ctx.getText();
            String mensaje = "";
            if (resultado.isBandera1() == true) {

                System.out.println("ERROR SEMANTICO → ^ " + resultado.intruccion + " ^ | error tipo | " + resultado.mensajes.get(0) + " |");
                mensaje = "ERROR SEMANTICO → ^ " + resultado.intruccion + " ^ | error tipo | " + resultado.mensajes.get(0) + " |";
                Errores.add(mensaje);
            } else if (resultado.isBandera2() == true) {

                System.out.println("ERROR SINTACTICO → ^ " + resultado.intruccion + " ^ | error tipo |");

                mensaje = "ERROR SINTACTICO → ^ " + resultado.intruccion + " ^ | error tipo |";
                Errores.add(mensaje);

            } else if (resultado.isBandera3() == true) {

                System.out.println("ERROR SINTACTICO → ^ " + resultado.intruccion + " ^ | error asignacion |");

                mensaje = "ERROR SINTACTICO → ^ " + resultado.intruccion + " ^ | error asignacion |";
                Errores.add(mensaje);

            } else if (resultado.isBandera4() == true) {

                System.out.println("ERROR SINTACTICO → ^ " + resultado.intruccion + " ^ | error id |");

                mensaje = "ERROR SINTACTICO → ^ " + resultado.intruccion + " ^ | error id |";
                Errores.add(mensaje);

            } else if (resultado.isBandera5() == true) {

                System.out.println("ERROR SEMANTICO → ^ " + resultado.intruccion + " ^ | esta variable ya esta declarada |");

                mensaje = "ERROR SEMANTICO → ^ " + resultado.intruccion + " ^ | esta variable ya esta declarada |";
                Errores.add(mensaje);

            }
        }

    }

    @Override
    public void exitTipo_impresion(TipeScriptParser.Tipo_impresionContext ctx) {

        Resultado resultado = (Resultado) ctx.value;
        if (resultado.isBandera1() == true && ctx.IDENTIFICADOR != null) {
            System.out.println("ERROR SEMANTICO → ^" + ctx.IDENTIFICADOR.getText() + "^ |" + ctx.IDENTIFICADOR.getText() + " no definida |");
            String mensaje = "ERROR SEMANTICO → ^" + ctx.IDENTIFICADOR.getText() + "^ |" + ctx.IDENTIFICADOR.getText() + " no definida |";
            Errores.add(mensaje);
        }
    }

    @Override
    public void exitRegreso_funcion(TipeScriptParser.Regreso_funcionContext ctx) {

        if (ctx.error1) {
            System.out.println("ERROR SEMANTICO → ^ " + ctx.getText() + " ^ | Ya se declaro un retorno |");

            String mensaje = "ERROR SEMANTICO → ^ " + ctx.getText() + " ^ | Ya se declaro un retorno |";
            Errores.add(mensaje);
        } else if (ctx.error2) {
            System.out.println("ERROR SEMANTICO → ^ " + ctx.getText() + " ^ | Esta funcion no retorna ningun valor|");
            String mensaje = "ERROR SEMANTICO → ^ " + ctx.getText() + " ^ | Esta funcion no retorna ningun valor|";
            Errores.add(mensaje);
        }

    }

    @Override
    public void exitLlamada_funcion(TipeScriptParser.Llamada_funcionContext ctx) {

       
        if (ctx.error1) {
            System.out.println("ERROR SEMANTICO → ^ " + ctx.getText() + " ^ | Esta funcion no esta declarada |");
            String mensaje = "ERROR SEMANTICO → ^ " + ctx.getText() + " ^ | Esta funcion no esta declarada |";
            Errores.add(mensaje);
        }
        if (ctx.error2) {
            System.out.println("ERROR SEMANTICO → ^ " + ctx.llamada_parametros_funcion.getText() + " ^ | Esta funcion no necesita parametros |");
            String mensaje = "ERROR SEMANTICO → ^ " + ctx.llamada_parametros_funcion.getText() + " ^ | Esta funcion no necesita parametros |";
            Errores.add(mensaje);
        }
        if (ctx.error3) {
            String parametros = " ";
            if (ctx.llamada_parametros_funcion != null) {
                parametros = ctx.llamada_parametros_funcion.getText();
            }

            String mensaje = "ERROR SEMANTICO → ^  parametros registrados:" + ctx.parametros + ", tipo: " + ctx.tiposParama + " ^ | Parametros de la funcion →" + ctx.IDENTIFICADOR.getText() + "← |";
            Errores.add(mensaje);
            
            
            mensaje = "ERROR SEMANTICO → ^  (" + parametros + ") ^ | Cantidad de parametros incorrecto |";
            Errores.add(mensaje);
        }
         if (ctx.error4) {
            System.out.println("ERROR SEMANTICO → ^ tipos compatibles: " + ctx.tiposParama + " ^ | parametros ingresados incopantibles  |");
            String mensaje = "ERROR SEMANTICO → ^ tipos compatibles: " + ctx.tiposParama + " ^ | parametros ingresados: " + ctx.tiposParamalos+ " incopantibles  |";
            Errores.add(mensaje);
        }

    }

    @Override
    public void exitRegreso(TipeScriptParser.RegresoContext ctx) {

        if (ctx != null) {

            if (!ctx.exito) {
                String mensaje = "ERROR INSTRUCCION → ^ " + ctx.getText() + " ^ | Error en retorno de declaracion de pagina |";
                Errores.add(mensaje);
            } else {

            }

        }

    }

    @Override
    public void exitBloque_main(TipeScriptParser.Bloque_mainContext ctx) {

        if (ctx != null) {

            if (!ctx.exito) {

                if (ctx.getText().isEmpty()) {
                    String mensaje = "ERROR SINTACTICO → ^ " + ctx.getText() + " ^ | No existe etiqueta main |";
                    Errores.add(mensaje);
                }
                String mensaje = "ERROR INSTRUCCION → ^ " + ctx.getText() + " ^ | Error en bloque main |";
                Errores.add(mensaje);

            } else {

            }

        }

    }

    @Override
    public void exitVariableTipeScript(TipeScriptParser.VariableTipeScriptContext ctx) {

        if (ctx != null) {

            if (!ctx.exito) {

                if (ctx.errorId) {
                    String mensaje = "ERROR SEMANTICO → ^ " + ctx.getText() + " ^ | Variable no declarada |";
                    Errores.add(mensaje);
                }
                

            } else {

            }

        }

    }
    
    
    

    
       @Override
    public void exitOnclick(TipeScriptParser.OnclickContext ctx) {

        if (ctx != null) {

            if (!ctx.exito) {

                if (ctx.errorLlamadaFuncion) {
                    String mensaje = "ERROR SEMANTICO → ^ " + ctx.llamada_funcion.getText() + " ^ | Llamdo de funcio no valido |";
                    Errores.add(mensaje);
                }
                String mensaje = "ERROR INSTRUCCION → ^ {" +  ctx.llamada_funcion.getText() + "} ^ | Error dentro de onClick |";
                Errores.add(mensaje);
                
            } else {

            }

        }

    }

    @Override
    public void exitTipoAsignacionVariable(TipeScriptParser.TipoAsignacionVariableContext ctx) {

        if (ctx != null) {

            if (ctx.errorId) {

                if (ctx.errorId) {
                    String mensaje = "ERROR SEMANTICO → ^ " + ctx.getText() + " ^ | Variable no declarada |";
                    Errores.add(mensaje);
                }

            } else {

            }

        }

    }

    @Override
    public void exitEtiquetaEncabezado(TipeScriptParser.EtiquetaEncabezadoContext ctx) {

        if (ctx != null) {

            if (!ctx.exito) {

                if (ctx.errorId) {
                    String mensaje = "ERROR SEMANTICO → ^ " + ctx.ids + " ^ | Error al referenciar variable |";
                    Errores.add(mensaje);
                }

                if (ctx.errorTipo) {
                    String mensaje = "ERROR SEMANTICO → ^  <" + ctx.h1.getText() + "> .....</" + ctx.h2.getText() + "> ^ | El tipo " + ctx.h1.getText() + " debe de se igual a " + ctx.h2.getText() + " |";
                    Errores.add(mensaje);
                }
                String mensaje = "ERROR INSTRUCCION → ^ " + ctx.getText() + " ^ | Error en etiqueta de encabezado |";
                Errores.add(mensaje);

            } else {
                List<Token> tokens = ((CommonTokenStream) parser.getTokenStream())
                    .getTokens(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());

                String instruccion="";
                for (Token t : tokens) {

                    instruccion += t.getText() + " ";

                }
                System.out.println(instruccion); 
               intruccionesValidas.add(instruccion);
            }

        }

    }

    @Override
    public void exitEtiquetaParrafo(TipeScriptParser.EtiquetaParrafoContext ctx) {

        if (ctx != null) {

            if (!ctx.exito) {

                if (ctx.errorId) {
                    String mensaje = "ERROR SEMANTICO → ^ " + ctx.ids + " ^ | Error al referenciar variable |";
                    Errores.add(mensaje);
                }

                if (ctx.errorTipo) {
                    String mensaje = "ERROR SEMANTICO → ^  < p > .....< /p > ^ | Error,  etiqueta parrafo mal definida|";
                    Errores.add(mensaje);
                }
                String mensaje = "ERROR INSTRUCCION → ^ " + ctx.getText() + " ^ | Error en parrafo |";
                Errores.add(mensaje);

            } else {
                List<Token> tokens = ((CommonTokenStream) parser.getTokenStream())
                    .getTokens(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());

                String instruccion="";
                for (Token t : tokens) {

                    instruccion += t.getText() + " ";

                }
                System.out.println(instruccion); 
               intruccionesValidas.add(instruccion);
            }

        }

    }
    
    
    @Override
    public void exitEtiquetaInput(TipeScriptParser.EtiquetaInputContext ctx) {
      
        if (ctx != null) {

            if (!ctx.exito) {

                if (ctx.errorId) {
                    String mensaje = "ERROR SEMANTICO → ^ " + ctx.ids + " ^ | Error al referenciar variable |";
                    Errores.add(mensaje);
                }

                if (ctx.errorTipo) {
                    String mensaje = "ERROR SEMANTICO → ^  < input  ..... /> ^ | Error,  etiqueta input mal definida|";
                    Errores.add(mensaje);
                }
                String mensaje = "ERROR INSTRUCCION → ^ " + ctx.getText() + " ^ | Error en imput |";
                Errores.add(mensaje);

            } else {
                List<Token> tokens = ((CommonTokenStream) parser.getTokenStream())
                    .getTokens(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());

                String instruccion="";
                for (Token t : tokens) {

                    instruccion += t.getText() + " ";

                }
                System.out.println(instruccion); 
               intruccionesValidas.add(instruccion);
            }

        }

    }
    
      @Override
    public void exitEtiquetaBoton(TipeScriptParser.EtiquetaBotonContext ctx) {

        if (ctx != null) {

            if (!ctx.exito) {

                if (ctx.errorId) {
                    String mensaje = "ERROR SEMANTICO → ^ " + ctx.ids + " ^ | Error al referenciar variable |";
                    Errores.add(mensaje);
                }

                
                if (ctx.errorOnClock) {
                    String mensaje = "ERROR SEMANTICO → ^ "+ctx.onclick.getText()+" ^ | Error onClock |";
                    Errores.add(mensaje);
                }
                
                
                if (ctx.errorTipo) {
                    String mensaje = "ERROR SEMANTICO → ^  < button > .....< /button > ^ | Error,  etiqueta button mal definida|";
                    Errores.add(mensaje);
                }
                String mensaje = "ERROR INSTRUCCION → ^ " + ctx.getText() + " ^ | Error en button |";
                Errores.add(mensaje);

            } else {
                List<Token> tokens = ((CommonTokenStream) parser.getTokenStream())
                    .getTokens(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());

                String instruccion="";
                for (Token t : tokens) {

                    instruccion += t.getText() + " ";

                }
                System.out.println(instruccion); 
               intruccionesValidas.add(instruccion);

            }

        }

    }

    @Override
    public void exitNumero(TipeScriptParser.NumeroContext ctx) {
        Resultado resultado = (Resultado) ctx.value;
        String mensaje = "";
        if (resultado.isBandera1() == true && ctx.IDENTIFICADOR != null) {
            System.out.println("ERROR SEMANTICO → ^" + expresionNoValida + "^ |" + ctx.IDENTIFICADOR.getText() + " no definida |");

            mensaje = "ERROR SEMANTICO → ^" + expresionNoValida + "^ |" + ctx.IDENTIFICADOR.getText() + " no definida |";
            Errores.add(mensaje);
        } else if (resultado.isBandera2() == true && ctx.IDENTIFICADOR != null) {
            System.out.println("ERROR SEMANTICO → ^" + expresionNoValida + "^ | tipos incopantibles |");

            mensaje = "ERROR SEMANTICO → ^" + expresionNoValida + "^ | tipos incopantibles |";
            Errores.add(mensaje);
        } else if (ctx.value == null) {
            System.out.println("ERROR SEMANTICO → ^" + expresionNoValida + "^ | tipos incopantibles |");

            mensaje = "ERROR SEMANTICO → ^" + expresionNoValida + "^ | tipos incopantibles |";
            Errores.add(mensaje);
        }

    }

    @Override
    public void enterNumero(TipeScriptParser.NumeroContext ctx) {

    }

    @Override
    public void enterExpresion(TipeScriptParser.ExpresionContext ctx) {

        expresionNoValida = (ctx.getText());

    }

}
