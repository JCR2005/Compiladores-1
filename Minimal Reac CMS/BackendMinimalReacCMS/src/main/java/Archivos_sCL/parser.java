
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Archivos_sCL;

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
    "\000\023\000\002\002\004\000\002\002\003\000\002\004" +
    "\004\000\002\004\003\000\002\004\003\000\002\003\005" +
    "\000\002\003\005\000\002\005\005\000\002\005\003\000" +
    "\002\003\005\000\002\003\005\000\002\003\005\000\002" +
    "\003\005\000\002\003\005\000\002\003\005\000\002\003" +
    "\005\000\002\003\005\000\002\003\004\000\002\003\004" +
    "" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\020\003\015\004\011\005\007\007\004\016" +
    "\013\017\012\020\005\001\002\000\004\010\047\001\002" +
    "\000\004\010\045\001\002\000\020\002\ufffe\004\ufffe\005" +
    "\ufffe\007\ufffe\016\ufffe\017\ufffe\020\ufffe\001\002\000\014" +
    "\006\041\010\037\011\036\012\035\013\040\001\002\000" +
    "\004\002\034\001\002\000\006\006\031\010\030\001\002" +
    "\000\004\010\026\001\002\000\006\006\020\010\017\001" +
    "\002\000\020\002\000\004\011\005\007\007\004\016\013" +
    "\017\012\020\005\001\002\000\020\002\ufffd\004\ufffd\005" +
    "\ufffd\007\ufffd\016\ufffd\017\ufffd\020\ufffd\001\002\000\020" +
    "\002\uffff\004\uffff\005\uffff\007\uffff\016\uffff\017\uffff\020" +
    "\uffff\001\002\000\004\014\021\001\002\000\004\014\021" +
    "\001\002\000\022\002\ufff9\004\ufff9\005\ufff9\007\ufff9\015" +
    "\023\016\ufff9\017\ufff9\020\ufff9\001\002\000\020\002\ufff4" +
    "\004\ufff4\005\ufff4\007\ufff4\016\ufff4\017\ufff4\020\ufff4\001" +
    "\002\000\004\014\024\001\002\000\020\002\ufffa\004\ufffa" +
    "\005\ufffa\007\ufffa\016\ufffa\017\ufffa\020\ufffa\001\002\000" +
    "\020\002\ufff5\004\ufff5\005\ufff5\007\ufff5\016\ufff5\017\ufff5" +
    "\020\ufff5\001\002\000\004\014\021\001\002\000\020\002" +
    "\ufff7\004\ufff7\005\ufff7\007\ufff7\016\ufff7\017\ufff7\020\ufff7" +
    "\001\002\000\004\014\033\001\002\000\004\014\032\001" +
    "\002\000\020\002\ufffc\004\ufffc\005\ufffc\007\ufffc\016\ufffc" +
    "\017\ufffc\020\ufffc\001\002\000\020\002\ufffb\004\ufffb\005" +
    "\ufffb\007\ufffb\016\ufffb\017\ufffb\020\ufffb\001\002\000\004" +
    "\002\001\001\002\000\004\014\044\001\002\000\020\002" +
    "\uffef\004\uffef\005\uffef\007\uffef\016\uffef\017\uffef\020\uffef" +
    "\001\002\000\004\014\021\001\002\000\020\002\ufff0\004" +
    "\ufff0\005\ufff0\007\ufff0\016\ufff0\017\ufff0\020\ufff0\001\002" +
    "\000\004\014\042\001\002\000\020\002\ufff3\004\ufff3\005" +
    "\ufff3\007\ufff3\016\ufff3\017\ufff3\020\ufff3\001\002\000\020" +
    "\002\ufff2\004\ufff2\005\ufff2\007\ufff2\016\ufff2\017\ufff2\020" +
    "\ufff2\001\002\000\020\002\ufff1\004\ufff1\005\ufff1\007\ufff1" +
    "\016\ufff1\017\ufff1\020\ufff1\001\002\000\004\014\021\001" +
    "\002\000\020\002\ufff6\004\ufff6\005\ufff6\007\ufff6\016\ufff6" +
    "\017\ufff6\020\ufff6\001\002\000\004\014\021\001\002\000" +
    "\020\002\ufff8\004\ufff8\005\ufff8\007\ufff8\016\ufff8\017\ufff8" +
    "\020\ufff8\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\046\000\010\002\007\003\005\004\013\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\004\003\015\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\005\024\001\001\000" +
    "\004\005\021\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\005\026\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\042\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\004" +
    "\005\045\001\001\000\002\001\001\000\004\005\047\001" +
    "\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

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




    public int accion=0;
    public int objetivo=0; 
    public boolean instruccionValida = false;
    public String mensaje = "";
    public String orde = "";
    public String instrccion = "";


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$parser$actions {



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
          case 1: // INICIO ::= INSTRUCCIONES 
            {
              Object RESULT =null;
		RESULT = instrccion;
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
          case 3: // INSTRUCCIONES ::= INSTRUCCION 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCIONES",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // INSTRUCCIONES ::= error 
            {
              Object RESULT =null;
		
                 mensaje="❌ ERROR DE SINTAXIS";
                    instrccion = "Error de sintaxis: instrucción inválida";
                    instruccionValida = false;
                    RESULT = null;
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCIONES",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // INSTRUCCION ::= CREAR SITIO PARAMETRO 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int paleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int paright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String pa = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    orde = c + s + pa + "\n";
    instruccionValida = true;
    instrccion = orde;
    accion=1;
    objetivo=2;
    mensaje="✔ COMPILACION EXITOSA: crear sitio"; 
  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // INSTRUCCION ::= CREAR PAGINA PARAMETRO 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String p = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int paleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int paright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String pa = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    orde = c + p + pa + "\n";
    instruccionValida = true;
    instrccion = orde;
    accion=1;
    objetivo=1;
    mensaje="✔ COMPILACION EXITOSA: crear pagina"; 
  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // PARAMETROS ::= PARAMETRO COMA PARAMETRO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PARAMETROS",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // PARAMETROS ::= PARAMETRO 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("PARAMETROS",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // INSTRUCCION ::= AGREGAR PAGINA PARAMETROS 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int paleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int paright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object pa = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    orde = a + s + pa + "\n";
    instruccionValida = true;
    instrccion = orde;
    accion=2;
    objetivo=1;
    mensaje="✔ COMPILACION EXITOSA: AGREGAR PAGINA"; 
  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // INSTRUCCION ::= MODIFICAR PAGINA PARAMETROS 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int paleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int paright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object pa = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    orde = a + s + pa + "\n";
    instruccionValida = true;
    instrccion = orde;
    accion=3;
    objetivo=1;
    mensaje="✔ COMPILACION EXITOSA: MODIFICAR PAGINA"; 
  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // INSTRUCCION ::= TRANPILAR PAGINA PARAMETROS 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int paleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int paright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object pa = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    orde = a + s + pa + "\n";
    instruccionValida = true;
    instrccion = orde;
    accion=6;
    objetivo=1;
    mensaje="✔ COMPILACION EXITOSA: TRAMPILAR PAGINA"; 
  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // INSTRUCCION ::= DELETE PAGINA PARAMETROS 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int paleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int paright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object pa = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    orde = a + s + pa + "\n";
    instruccionValida = true;
    instrccion = orde;
    accion=4;
    objetivo=1;
    mensaje="✔ COMPILACION EXITOSA: DELETE PAGINA"; 
  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // INSTRUCCION ::= DELETE SITIO PARAMETROS 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int paleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int paright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object pa = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    orde = a + s + pa + "\n";
    instruccionValida = true;
    instrccion = orde;
    accion=4;
    objetivo=2;
    mensaje="✔ COMPILACION EXITOSA: DELETE PAGINA"; 
  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // INSTRUCCION ::= OBTENER SITIO PARAMETRO 
            {
              Object RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int paleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int paright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String pa = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    orde= o+s+pa+"\n";
    instruccionValida = true;
    instrccion = orde;
    accion=5;
    objetivo=2;
     mensaje="✔ COMPILACION EXITOSA: OBTENER SITIO"; 
  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // INSTRUCCION ::= OBTENER PAGINA PARAMETROS 
            {
              Object RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String p = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int paleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int paright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object pa = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    orde= o+p+pa+"\n";
    instruccionValida = true;
    instrccion = orde;
    accion=5;
    objetivo=1;
     mensaje="✔ COMPILACION EXITOSA: OBTENER PAGINA"; 
  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // INSTRUCCION ::= OBTENER PAGINASITIOS PARAMETRO 
            {
              Object RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String p = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int paleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int paright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String pa = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    orde= o+p+"\n";
    instruccionValida = true;
    instrccion = orde;
    accion=5;
    objetivo=5;
     mensaje="✔ COMPILACION EXITOSA: OBTENER PAGINAS"; 
  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // INSTRUCCION ::= OBTENER SITIOS 
            {
              Object RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int sleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int sright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String s = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    orde= o+s+"\n";
    instruccionValida = true;
    instrccion = orde;
    accion=5;
    objetivo=3;
     mensaje="✔ COMPILACION EXITOSA: OBTENER SITIOS"; 
  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // INSTRUCCION ::= OBTENER PAGINAS 
            {
              Object RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		int pleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int pright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		String p = (String)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		
    orde= o+p+"\n";
    instruccionValida = true;
    instrccion = orde;
    accion=5;
    objetivo=4;
     mensaje="✔ COMPILACION EXITOSA: OBTENER PAGINAS"; 
  
              CUP$parser$result = parser.getSymbolFactory().newSymbol("INSTRUCCION",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
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
