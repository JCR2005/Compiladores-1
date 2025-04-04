package Compilador;


import Traductor.transpiladorHtml;
import Compilador.CustomListener;
import Compilador.Funcion;
import Compilador.TipeScriptLexer;
import Compilador.TipeScriptParser;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

/**
 *
 * @author carlos
 */
public class CompiladorBody {

     private ArrayList<String> Errores = new ArrayList<>();
    public  Boolean compilado(String instruccion) {

        String imput = "const NombrePagina = ( ) => { \n"
                + "var texto: string = \"Hola Mundo\";\n"
                + "var variable: number = 10;\n"
                + "function funcion(): void {\n"
                + "     console.log(\"texto\");\n"
                + "     var e: number = 10;\n"
                + "     variable = variable + 1;\n"
                + " }\n"
                + "return (<main> "
                + "<h1>{variable} \"Hola mi nombre es\"{variable} \" mi  es\"</h1>"
                + "<input value={variable} />"
                + "<p>{variable} \"Hola mi nombre es\"{variable} \" mi  es\"</p>"
                + "<button onClick={funcion();}>\"Sumar\"</button>"
                + "<input value={variable} />"
                + " </main>);\n"
                + "\n"
                + "}";

        Scanner entras = new Scanner(System.in);

        System.out.println("ingrse se algo");

        TipeScriptLexer lexer = new TipeScriptLexer(CharStreams.fromString(instruccion));

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        tokens.fill(); // <<< IMPORTANTE: Forzar el consumo de tokens

        List<Token> tokenList = tokens.getTokens();
        for (Token token : tokenList) {
            System.out.println("Token: " + token.getText() + " | Tipo: " + token.getType());
        }

        TipeScriptParser parse = new TipeScriptParser(tokens);

        ParseTree tree = parse.inicio();

        ParseTreeWalker walker = new ParseTreeWalker();

        CustomListener listener = new CustomListener(parse.getTablaSimbolos());
        listener.obtnerParse(parse);
        walker.walk(listener, tree);

        System.out.println("ANALISISI__________________________________________________________________________________________________");
        for (int i = 0; i < listener.getIntruccionesValidas().size(); i++) {

            System.out.println(listener.getIntruccionesValidas().get(i).toString());
        }
        Errores=listener.getErrores();
        System.out.println("ERRORES---------------------------------------------------------------------------------------------------");
        for (int i = 0; i < listener.getErrores().size(); i++) {

            System.out.println(listener.getErrores().get(i).toString());
        }

        System.out.println("___________________________________________________________________________________________________________");

        
        System.out.println("\n");
      
        
        System.out.println("INSTRUCCIONES__________________________________________________________________________________________________");

        for (int i = 0; i < parse.getTipoInstruccion().size(); i++) {
            System.out.println("tipo: " + parse.getTipoInstruccion().get(i) + " instruccion: " + parse.getInstrucciones().get(i));
        }
        System.out.println("_______________________________________________________________________________________________________________");
        
        transpiladorHtml transpilador=new transpiladorHtml();
        
        transpilador.trampilar( parse.getTipoInstruccion(), parse.getInstrucciones());
        
       System.out.println("INSTRUCCIONES_HTML:_____________________________________________________________________________________________");
        System.out.println(transpilador.getCodigoTransiladoHtml());
       
       System.out.println("INSTRUCCIONES_JAVASCRIPT:_______________________________________________________________________________________");
       System.out.println(transpilador.getCodigoTransiladoJavaScript());
       
       
        if (listener.getErrores().size()==0) {
            return true;
        }else{
            return false;
        }
    }

    /**
     * @return the Errores
     */
    public ArrayList<String> getErrores() {
        return Errores;
    }

}
