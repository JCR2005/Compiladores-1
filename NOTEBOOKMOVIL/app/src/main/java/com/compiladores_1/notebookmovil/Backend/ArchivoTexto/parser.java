
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package com.compiladores_1.notebookmovil.Backend.ArchivoTexto;

import com.compiladores_1.notebookmovil.Backend.ArchivoCodigo.sym;

import java_cup.runtime.Symbol;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\036\000\002\002\004\000\002\002\003\000\002\004" +
    "\004\000\002\004\005\000\002\004\003\000\002\003\004" +
    "\000\002\003\003\000\002\003\003\000\002\003\003\000" +
    "\002\007\004\000\002\007\005\000\002\007\004\000\002" +
    "\007\003\000\002\010\004\000\002\010\005\000\002\010" +
    "\004\000\002\010\003\000\002\005\003\000\002\005\004" +
    "\000\002\006\003\000\002\006\003\000\002\006\003\000" +
    "\002\003\003\000\002\003\005\000\002\003\004\000\002" +
    "\003\004\000\002\003\004\000\002\003\003\000\002\003" +
    "\003\000\002\003\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\041\000\022\003\020\004\006\005\007\006\017\007" +
    "\016\010\015\011\021\012\010\001\002\000\004\002\000" +
    "\001\002\000\004\002\ufffa\001\002\000\014\002\uffe5\004" +
    "\uffee\006\uffee\007\uffee\011\uffee\001\002\000\012\002\ufffb" +
    "\004\025\006\024\011\030\001\002\000\014\002\ufff1\004" +
    "\025\006\024\011\030\012\041\001\002\000\004\007\037" +
    "\001\002\000\004\002\036\001\002\000\004\002\ufff9\001" +
    "\002\000\020\002\ufff0\004\025\006\024\007\ufff0\010\ufff0" +
    "\011\030\012\ufff0\001\002\000\014\002\ufff5\004\025\006" +
    "\024\010\033\011\030\001\002\000\012\003\027\004\025" +
    "\006\024\011\030\001\002\000\014\004\uffed\006\uffed\007" +
    "\uffed\011\uffed\012\022\001\002\000\004\002\uffeb\001\002" +
    "\000\014\002\uffe6\004\uffec\006\uffec\007\uffec\011\uffec\001" +
    "\002\000\004\006\023\001\002\000\004\002\uffe4\001\002" +
    "\000\020\002\uffed\004\uffed\006\uffed\007\uffed\010\uffed\011" +
    "\uffed\012\uffed\001\002\000\020\002\uffee\004\uffee\006\uffee" +
    "\007\uffee\010\uffee\011\uffee\012\uffee\001\002\000\006\002" +
    "\uffe9\007\031\001\002\000\004\002\uffe7\001\002\000\020" +
    "\002\uffec\004\uffec\006\uffec\007\uffec\010\uffec\011\uffec\012" +
    "\uffec\001\002\000\004\002\uffea\001\002\000\006\002\ufff8" +
    "\010\015\001\002\000\004\002\ufff6\001\002\000\004\002" +
    "\ufff7\001\002\000\012\002\uffef\007\uffef\010\uffef\012\uffef" +
    "\001\002\000\004\002\001\001\002\000\004\002\uffe8\001" +
    "\002\000\006\002\ufff4\012\010\001\002\000\004\002\ufff2" +
    "\001\002\000\004\002\ufff3\001\002\000\004\002\ufffc\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\041\000\016\002\011\003\003\005\010\006\013\007" +
    "\004\010\012\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\005\042\006\013\001\001\000" +
    "\006\005\037\006\013\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\006\005\034\006\013\001" +
    "\001\000\006\005\031\006\013\001\001\000\006\005\025" +
    "\006\013\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\007\033" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\010\041" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  public CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
public class CUP$parser$actions {


    public void reestablecerBanderas(){

    }
    public  boolean instruccionValida = false;
    public  boolean encabezado= false;
    public  boolean lista_numerica = false;
    public  boolean parrafo = false;
    public  boolean lista = false;
    public  boolean tipoFormsto = false;
    public  String mensaje="";
    String instruccion="";

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$parser$do_action_part00000000(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= INICIO EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // INICIO ::= INSTRUCCION 
            {
              Object RESULT =null;
		RESULT = instruccion;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INICIO",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // INSTRUCCIONES ::= INSTRUCCIONES INSTRUCCION 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCIONES",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // INSTRUCCIONES ::= INSTRUCCIONES SALTO INSTRUCCION 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCIONES",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INSTRUCCIONES ::= INSTRUCCION 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCIONES",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // INSTRUCCION ::= ENCABEZADO cadena 
            {
              Object RESULT =null;
		int Eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int Eright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String E = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    instruccion= E+e2;
                    mensaje=" COMPILACION EXITOSA: ENCABEZADO EJECUTADO";
                    System.out.println("✔ Instrucción reconocida: "+instruccion+"\n");
                    instruccionValida=true;
                    encabezado = true;

                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // INSTRUCCION ::= ENCABEZADO 
            {
              Object RESULT =null;
		int Eleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int Eright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String E = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		  System.out.println("❌ Error de sintaxis se esperaba un header");
                    mensaje=" ERROR DE SINTAXIS";
                    instruccion=" Header no definido "+E+" ^^^^^^^^^^^ ";
                    instruccionValida=false;
                    encabezado = false;
                    RESULT = null;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // INSTRUCCION ::= elementolista 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // INSTRUCCION ::= elementolista2 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // elementolista ::= INDICE cadena 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    instruccion = i + c+" ";
                   mensaje="COMPILACION EXITOSA: lISTA EJECUTADA";
                    System.out.println("✔ Instrucción reconocida: " + instruccion + "\n");
                    instruccionValida=true;
                    lista_numerica =true;
                    RESULT = instruccion;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elementolista",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // elementolista ::= INDICE cadena elementolista 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int edleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int edright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String ed = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                     instruccion = i + c +" "+ ed;
                     mensaje=" COMPILACION EXITOSA: lISTA EJECUTADA";
                     System.out.println(" Instrucción reconocida: " + instruccion + "\n");
                     instruccionValida=true;
                     lista_numerica =true;
                     RESULT = instruccion;
                 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elementolista",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // elementolista ::= INDICE INDICE 
            {
              String RESULT =null;
		int i1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int i1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String i1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int i2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int i2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                      mensaje=" ERROR DE SINTAXIS";
                      instruccion=" Elemento de lista no definido: "+i1+" ^^^^^^^^^^^ "+i2+"^^^^^^^^^^";
                      instruccionValida=false;
                      lista_numerica =false;
                      RESULT = instruccion;
                  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elementolista",5, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // elementolista ::= INDICE 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                      mensaje=" ERROR DE SINTAXIS";
                      instruccion=" Elemento de lista no definido: "+i+" ^^^^^^^^^^^";
                      instruccionValida=false;
                      lista_numerica =false;
                      RESULT = instruccion;
                  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elementolista",5, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // elementolista2 ::= SUMA cadena 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    instruccion = i + c+" ";
                    mensaje=" COMPILACION EXITOSA: lISTA EJECUTADA";
                    System.out.println("✔ Instrucción reconocida: " + instruccion + "\n");
                    instruccionValida=true;
                    lista =true;
                    RESULT = instruccion;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elementolista2",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // elementolista2 ::= SUMA cadena elementolista2 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int edleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int edright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String ed = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                     instruccion = i + c +" "+ ed;

                     mensaje=" COMPILACION EXITOSA: lISTA EJECUTADA";
                     System.out.println(" Instrucción reconocida: " + instruccion + "\n");
                     instruccionValida=true;
                    lista =true;
                     RESULT = instruccion;
                 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elementolista2",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // elementolista2 ::= SUMA SUMA 
            {
              String RESULT =null;
		int i1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int i1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String i1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int i2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int i2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                      mensaje="ERROR DE SINTAXIS";
                      instruccion=" Elemento de lista no definido: "+i1+" ^^^^^^^^^^^ "+i2+"^^^^^^^^^^";
                      instruccionValida=false;
                      lista =false;
                      RESULT = instruccion;
                  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elementolista2",6, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // elementolista2 ::= SUMA 
            {
              String RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String i = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                      mensaje=" ERROR DE SINTAXIS";
                      instruccion=" Elemento de lista no definido: "+i+" ^^^^^^^^^^^";
                      instruccionValida=false;
                      lista =false;
                      RESULT = instruccion;
                  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elementolista2",6, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // cadena ::= elemento1 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = e1; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cadena",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // cadena ::= elemento1 cadena 
            {
              String RESULT =null;
		int e1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String e1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = e1+" "+c; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cadena",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // elemento1 ::= TEXTO 
            {
              String RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = t; 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elemento1",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // elemento1 ::= NUMERO 
            {
              String RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int nright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT =  n;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elemento1",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // elemento1 ::= TEXTO_PARRAFO 
            {
              String RESULT =null;
		int tpleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tpright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String tp = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		 RESULT = tp;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("elemento1",4, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // INSTRUCCION ::= error 
            {
              Object RESULT =null;
		
                mensaje=" ERROR DE SINTAXIS";
               instruccion="Error de sintaxis es una instrccion imvalida";
                  instruccionValida=false;

               RESULT = null;

           
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // INSTRUCCION ::= TEXTOCONFORMATO cadena TEXTOCONFORMATO 
            {
              Object RESULT =null;
		int tf1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int tf1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String tf1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int tf2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tf2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String tf2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                 if (!tf1.equals(tf2)) {
                     mensaje=" ERROR DE SINTAXIS";
                     instruccion=" Cierre no coicide: "+tf1+" "+t+" →"+ tf2+"←, esperado: "+ tf1;
                     instruccionValida=false;
                     tipoFormsto = false;
                     RESULT = null;
                 }else{
                    instruccion=tf1+t+tf2;
                    mensaje=" COMPILACION EXITOSA: TEXTO CON FORMATO EJECUTADO";
                    System.out.println(" Instrucción reconocida: "+instruccion+"\n");
                    instruccionValida=true;
                    tipoFormsto = true;
                    RESULT = instruccion;
                 }

                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // INSTRUCCION ::= TEXTOCONFORMATO cadena 
            {
              Object RESULT =null;
		int tf1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int tf1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String tf1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                      mensaje=" ERROR DE SINTAXIS";
                      instruccion=" Cierre no presente: "+tf1+" "+t+" →^^^←"+", esperado: →"+ tf1;
                      instruccionValida=false;
                      tipoFormsto = false;
                     RESULT = null;
                 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // INSTRUCCION ::= cadena TEXTOCONFORMATO 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int tf1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tf1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String tf1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                   mensaje="ERROR DE SINTAXIS";
                   instruccion=" Inicio no presente: "+" →^^^←"+" "+t+tf1+", esperado: →"+ tf1;
                  instruccionValida=false;
                  tipoFormsto = false;
                   RESULT = null;
               
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // INSTRUCCION ::= TEXTOCONFORMATO error 
            {
              Object RESULT =null;
		int tf1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int tf1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String tf1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		
                      mensaje=" ERROR DE SINTAXIS";
                      instruccion=" Texto no definido, Cierre no definido: "+tf1+" →^^^^^^^^^^^^^^← →^^^←, cierre esperado: "+tf1;
                      instruccionValida=false;
                      tipoFormsto = false;
                     RESULT = null;
                 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // INSTRUCCION ::= TEXTO_PARRAFO 
            {
              Object RESULT =null;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String p = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                    instruccion = p;
                      mensaje=" COMPILACION EXITOSA: PARRAFO EJECUTADO";
                    System.out.println(" Instrucción reconocida: " + instruccion + "\n");
                     instruccionValida=true;
                      parrafo = true;
                    RESULT = instruccion;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // INSTRUCCION ::= TEXTO 
            {
              Object RESULT =null;
		int tleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int tright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String t = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                      instruccion+= t;
                      mensaje="COMPILACION EXITOSA: PARRAFO EJECUTADO";
                      System.out.println(" Instrucción reconocida: " + instruccion + "\n");
                       instruccionValida=true;
                       parrafo = true;
                      RESULT = instruccion;
                  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // INSTRUCCION ::= NUMERO SUMA NUMERO 
            {
              Object RESULT =null;
		int n1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int n1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String n1 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int n2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int n2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String n2 = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
                  instruccion=n1+n2;
                  mensaje=" COMPILACION EXITOSA: PARRAFO EJECUTADO";
                  System.out.println(" Instrucción reconocida: " + instruccion + "\n");
                   instruccionValida=true;
                   parrafo = true;
                  RESULT = instruccion;
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
              return CUP$parser$do_action_part00000000(
                               CUP$parser$act_num,
                               CUP$parser$parser,
                               CUP$parser$stack,
                               CUP$parser$top);
    }
}

}
