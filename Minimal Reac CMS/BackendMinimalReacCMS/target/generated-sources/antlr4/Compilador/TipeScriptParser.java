// Generated from Compilador/TipeScript.g4 by ANTLR 4.13.2
package Compilador;

    import java.util.Map;
    import java.util.HashMap;   

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class TipeScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, MAS=5, MENOS=6, MUL=7, DIV=8, POT=9, CONST=10, 
		REGRESO=11, COMA=12, PAR1=13, PAR2=14, ASIGNACIO=15, ASIGNACIO_PAGINA=16, 
		CORCH1=17, CORCH2=18, MAYOR_QUE=19, MENOR_QUE=20, DIFERENTE=21, FINI_NSTRUCCION=22, 
		DECIMAL=23, ENTERO=24, DOS_PUNTOS=25, CADENA=26, CARACTER=27, MAIN=28, 
		HEADERS=29, PARRAFO=30, BOTON=31, ONCLICK=32, INPUT=33, IF=34, ELSE=35, 
		VAR=36, CONSOLE=37, LOG=38, FUNCTION=39, NUMBER=40, STRING=41, CHAR=42, 
		BOOLEAN=43, VOID=44, TRUE=45, FALSE=46, IDENTIFICADOR=47, WS=48;
	public static final int
		RULE_inicio = 0, RULE_declaracion_pagina = 1, RULE_bloque_declaracion_pagina = 2, 
		RULE_bloque_declaracion_pagina_prima = 3, RULE_intrucciones_tipe_scrip = 4, 
		RULE_intrucciones_tipe_scrip_prima = 5, RULE_instruccion_tipo_script = 6, 
		RULE_regreso_funcion = 7, RULE_declaracion_funcion = 8, RULE_parametros_funcion = 9, 
		RULE_bloque_instrucciones = 10, RULE_bloque_instrucciones_prima = 11, 
		RULE_llamada_funcion = 12, RULE_llamada_parametros_funcion = 13, RULE_condicional = 14, 
		RULE_bloque_instrucciones_condicional = 15, RULE_bloque_instrucciones_condicional_prima = 16, 
		RULE_regreso_if = 17, RULE_impresion_consola = 18, RULE_tipos_impresion = 19, 
		RULE_tipo_impresiones_prima = 20, RULE_tipo_impresion = 21, RULE_creacionVariable = 22, 
		RULE_asignacionVariable = 23, RULE_tipoAsignacionVariable = 24, RULE_tipoBoleano = 25, 
		RULE_tipo = 26, RULE_expresion = 27, RULE_terminoN2 = 28, RULE_terminoN3 = 29, 
		RULE_terminoN4 = 30, RULE_numero = 31, RULE_regreso = 32, RULE_bloque_main = 33, 
		RULE_bloque_instrucciones_html = 34, RULE_bloque_instrucciones_html_prima = 35, 
		RULE_instruccion_html = 36, RULE_etiquetaEncabezado = 37, RULE_variableTipeScript = 38, 
		RULE_etiquetaParrafo = 39, RULE_etiquetaBoton = 40, RULE_onclick = 41, 
		RULE_etiquetaInput = 42;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "declaracion_pagina", "bloque_declaracion_pagina", "bloque_declaracion_pagina_prima", 
			"intrucciones_tipe_scrip", "intrucciones_tipe_scrip_prima", "instruccion_tipo_script", 
			"regreso_funcion", "declaracion_funcion", "parametros_funcion", "bloque_instrucciones", 
			"bloque_instrucciones_prima", "llamada_funcion", "llamada_parametros_funcion", 
			"condicional", "bloque_instrucciones_condicional", "bloque_instrucciones_condicional_prima", 
			"regreso_if", "impresion_consola", "tipos_impresion", "tipo_impresiones_prima", 
			"tipo_impresion", "creacionVariable", "asignacionVariable", "tipoAsignacionVariable", 
			"tipoBoleano", "tipo", "expresion", "terminoN2", "terminoN3", "terminoN4", 
			"numero", "regreso", "bloque_main", "bloque_instrucciones_html", "bloque_instrucciones_html_prima", 
			"instruccion_html", "etiquetaEncabezado", "variableTipeScript", "etiquetaParrafo", 
			"etiquetaBoton", "onclick", "etiquetaInput"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'</'", "'value'", "'/>'", "'+'", "'-'", "'*'", "'/'", "'^'", 
			"'const'", "'return'", "','", "'('", "')'", "'='", "'=>'", "'{'", "'}'", 
			"'>'", "'<'", "'!='", "';'", null, null, "':'", null, null, "'main'", 
			null, "'p'", "'button'", "'onClick'", "'input'", "'if'", "'else'", "'var'", 
			"'console'", "'log'", "'function'", "'number'", "'string'", "'char'", 
			"'boolean'", "'void'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "MAS", "MENOS", "MUL", "DIV", "POT", "CONST", 
			"REGRESO", "COMA", "PAR1", "PAR2", "ASIGNACIO", "ASIGNACIO_PAGINA", "CORCH1", 
			"CORCH2", "MAYOR_QUE", "MENOR_QUE", "DIFERENTE", "FINI_NSTRUCCION", "DECIMAL", 
			"ENTERO", "DOS_PUNTOS", "CADENA", "CARACTER", "MAIN", "HEADERS", "PARRAFO", 
			"BOTON", "ONCLICK", "INPUT", "IF", "ELSE", "VAR", "CONSOLE", "LOG", "FUNCTION", 
			"NUMBER", "STRING", "CHAR", "BOOLEAN", "VOID", "TRUE", "FALSE", "IDENTIFICADOR", 
			"WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TipeScript.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }



	        int cont=0;
	        private ArrayList<String> instrucciones = new ArrayList<>();
	        private ArrayList<Integer> tipoInstruccion = new ArrayList<>();

	        private ArrayList<String> instruccionesFuncion = null;
	        private ArrayList<Integer> tipoInstruccionFuncion = null;


	        boolean declaracionFuncionEnCurso=false;
	        boolean declaracioniFEnCurso=false;
	        boolean returnFuncion=false;
	        boolean returnif=false;
	        boolean errorEnFuncion=false;
	        boolean errorif=false;
	        Map <String,Object> tablaSimbolos=new HashMap<String,Object>();
	        Map <String,Object> tablaFunciones=new HashMap<String,Object>();
	         Map <String,Object> tablaSimbolosLocales=null;
	         
	         public void an(ParserRuleContext ctx, int tipo){

	                if(ctx !=null){
	                        
	                        String intruccion="";
		                List<Token> tokens = ((CommonTokenStream) getTokenStream())
		                    .getTokens(ctx.start.getTokenIndex(), ctx.stop.getTokenIndex());

		              
	                        for (Token t : tokens) {

	                        intruccion += t.getText() + " ";

	                        }

	                       
	                                 instrucciones.add(intruccion);
	                                tipoInstruccion.add(tipo);
	                      
	                                
	                        
	                       
	                       
	                        

	                }
	                    
		}

	        MyVisitor visitor= new MyVisitor();
	        public Map<String, Object> getTablaSimbolos() {
	        return tablaSimbolos;
	}

	 public Map<String, Object> tablaFunciones() {
	    return tablaFunciones;
	}

	  public ArrayList<String> getInstrucciones() {
	    return instrucciones;
	}

	  public ArrayList<Integer> getTipoInstruccion() {
	    return tipoInstruccion;
	}



	public TipeScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioContext extends ParserRuleContext {
		public Declaracion_paginaContext declaracion_pagina() {
			return getRuleContext(Declaracion_paginaContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitInicio(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			declaracion_pagina();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracion_paginaContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(TipeScriptParser.CONST, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(TipeScriptParser.IDENTIFICADOR, 0); }
		public TerminalNode ASIGNACIO() { return getToken(TipeScriptParser.ASIGNACIO, 0); }
		public TerminalNode PAR1() { return getToken(TipeScriptParser.PAR1, 0); }
		public TerminalNode PAR2() { return getToken(TipeScriptParser.PAR2, 0); }
		public TerminalNode ASIGNACIO_PAGINA() { return getToken(TipeScriptParser.ASIGNACIO_PAGINA, 0); }
		public TerminalNode CORCH1() { return getToken(TipeScriptParser.CORCH1, 0); }
		public RegresoContext regreso() {
			return getRuleContext(RegresoContext.class,0);
		}
		public TerminalNode CORCH2() { return getToken(TipeScriptParser.CORCH2, 0); }
		public Bloque_declaracion_paginaContext bloque_declaracion_pagina() {
			return getRuleContext(Bloque_declaracion_paginaContext.class,0);
		}
		public Declaracion_paginaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_pagina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterDeclaracion_pagina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitDeclaracion_pagina(this);
		}
	}

	public final Declaracion_paginaContext declaracion_pagina() throws RecognitionException {
		Declaracion_paginaContext _localctx = new Declaracion_paginaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracion_pagina);
		int _la;
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(88);
				match(CONST);
				setState(89);
				match(IDENTIFICADOR);
				setState(90);
				match(ASIGNACIO);
				setState(91);
				match(PAR1);
				setState(92);
				match(PAR2);
				setState(93);
				match(ASIGNACIO_PAGINA);
				setState(94);
				match(CORCH1);
				setState(96);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 141510582468608L) != 0)) {
					{
					setState(95);
					bloque_declaracion_pagina();
					}
				}

				setState(98);
				regreso();
				setState(99);
				match(CORCH2);
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_declaracion_paginaContext extends ParserRuleContext {
		public Intrucciones_tipe_scripContext intrucciones_tipe_scrip() {
			return getRuleContext(Intrucciones_tipe_scripContext.class,0);
		}
		public Bloque_declaracion_pagina_primaContext bloque_declaracion_pagina_prima() {
			return getRuleContext(Bloque_declaracion_pagina_primaContext.class,0);
		}
		public Declaracion_funcionContext declaracion_funcion() {
			return getRuleContext(Declaracion_funcionContext.class,0);
		}
		public Bloque_declaracion_paginaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_declaracion_pagina; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterBloque_declaracion_pagina(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitBloque_declaracion_pagina(this);
		}
	}

	public final Bloque_declaracion_paginaContext bloque_declaracion_pagina() throws RecognitionException {
		Bloque_declaracion_paginaContext _localctx = new Bloque_declaracion_paginaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloque_declaracion_pagina);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case VAR:
			case CONSOLE:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				intrucciones_tipe_scrip();
				setState(105);
				bloque_declaracion_pagina_prima();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				declaracion_funcion();
				setState(108);
				bloque_declaracion_pagina_prima();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_declaracion_pagina_primaContext extends ParserRuleContext {
		public Intrucciones_tipe_scripContext intrucciones_tipe_scrip() {
			return getRuleContext(Intrucciones_tipe_scripContext.class,0);
		}
		public Bloque_declaracion_pagina_primaContext bloque_declaracion_pagina_prima() {
			return getRuleContext(Bloque_declaracion_pagina_primaContext.class,0);
		}
		public Declaracion_funcionContext declaracion_funcion() {
			return getRuleContext(Declaracion_funcionContext.class,0);
		}
		public Bloque_declaracion_pagina_primaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_declaracion_pagina_prima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterBloque_declaracion_pagina_prima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitBloque_declaracion_pagina_prima(this);
		}
	}

	public final Bloque_declaracion_pagina_primaContext bloque_declaracion_pagina_prima() throws RecognitionException {
		Bloque_declaracion_pagina_primaContext _localctx = new Bloque_declaracion_pagina_primaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque_declaracion_pagina_prima);
		try {
			setState(118);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case VAR:
			case CONSOLE:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				intrucciones_tipe_scrip();
				setState(113);
				bloque_declaracion_pagina_prima();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(115);
				declaracion_funcion();
				setState(116);
				bloque_declaracion_pagina_prima();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Intrucciones_tipe_scripContext extends ParserRuleContext {
		public Resultado value;
		public Instruccion_tipo_scriptContext instruccion_tipo_script;
		public Instruccion_tipo_scriptContext instruccion_tipo_script() {
			return getRuleContext(Instruccion_tipo_scriptContext.class,0);
		}
		public Intrucciones_tipe_scrip_primaContext intrucciones_tipe_scrip_prima() {
			return getRuleContext(Intrucciones_tipe_scrip_primaContext.class,0);
		}
		public Intrucciones_tipe_scripContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intrucciones_tipe_scrip; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterIntrucciones_tipe_scrip(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitIntrucciones_tipe_scrip(this);
		}
	}

	public final Intrucciones_tipe_scripContext intrucciones_tipe_scrip() throws RecognitionException {
		Intrucciones_tipe_scripContext _localctx = new Intrucciones_tipe_scripContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intrucciones_tipe_scrip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
			((Intrucciones_tipe_scripContext)_localctx).instruccion_tipo_script = instruccion_tipo_script();
			       
			                        if(((Intrucciones_tipe_scripContext)_localctx).instruccion_tipo_script.value==null)
			                        {       ((Intrucciones_tipe_scripContext)_localctx).value =  new Resultado();
			                                _localctx.value.setBandera0(true);
			                        }else{
			                                if(((Intrucciones_tipe_scripContext)_localctx).instruccion_tipo_script.value.isBandera0() )
			                                {      
			                                        ((Intrucciones_tipe_scripContext)_localctx).value =  new Resultado();
			                                        _localctx.value.setBandera0(true);  
			                                }
			                        }
			                
			{
			setState(122);
			intrucciones_tipe_scrip_prima();
			       
			                               if(((Intrucciones_tipe_scripContext)_localctx).instruccion_tipo_script.value==null)
			                                {       ((Intrucciones_tipe_scripContext)_localctx).value =  new Resultado();
			                                        _localctx.value.setBandera0(true);
			                                }else{
			                                        if(((Intrucciones_tipe_scripContext)_localctx).instruccion_tipo_script.value.isBandera0() )
			                                        {      
			                                                ((Intrucciones_tipe_scripContext)_localctx).value =  new Resultado();
			                                                _localctx.value.setBandera0(true);  
			                                        }
			                                }
			                        
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Intrucciones_tipe_scrip_primaContext extends ParserRuleContext {
		public Resultado value;
		public Instruccion_tipo_scriptContext instruccion_tipo_script;
		public Instruccion_tipo_scriptContext instruccion_tipo_script() {
			return getRuleContext(Instruccion_tipo_scriptContext.class,0);
		}
		public Intrucciones_tipe_scrip_primaContext intrucciones_tipe_scrip_prima() {
			return getRuleContext(Intrucciones_tipe_scrip_primaContext.class,0);
		}
		public Intrucciones_tipe_scrip_primaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intrucciones_tipe_scrip_prima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterIntrucciones_tipe_scrip_prima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitIntrucciones_tipe_scrip_prima(this);
		}
	}

	public final Intrucciones_tipe_scrip_primaContext intrucciones_tipe_scrip_prima() throws RecognitionException {
		Intrucciones_tipe_scrip_primaContext _localctx = new Intrucciones_tipe_scrip_primaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_intrucciones_tipe_scrip_prima);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				((Intrucciones_tipe_scrip_primaContext)_localctx).instruccion_tipo_script = instruccion_tipo_script();
				       
				                        if(((Intrucciones_tipe_scrip_primaContext)_localctx).instruccion_tipo_script.value==null)
				                        {       ((Intrucciones_tipe_scrip_primaContext)_localctx).value =  new Resultado();
				                                _localctx.value.setBandera0(true);
				                        }else{
				                                if(((Intrucciones_tipe_scrip_primaContext)_localctx).instruccion_tipo_script.value.isBandera0() )
				                                {      
				                                        ((Intrucciones_tipe_scrip_primaContext)_localctx).value =  new Resultado();
				                                        _localctx.value.setBandera0(true);  
				                                }
				                        }
				                
				{
				setState(127);
				intrucciones_tipe_scrip_prima();
				       
				                               if(((Intrucciones_tipe_scrip_primaContext)_localctx).instruccion_tipo_script.value==null)
				                                {       ((Intrucciones_tipe_scrip_primaContext)_localctx).value =  new Resultado();
				                                        _localctx.value.setBandera0(true);
				                                }else{
				                                        if(((Intrucciones_tipe_scrip_primaContext)_localctx).instruccion_tipo_script.value.isBandera0() )
				                                        {      
				                                                ((Intrucciones_tipe_scrip_primaContext)_localctx).value =  new Resultado();
				                                                _localctx.value.setBandera0(true);  
				                                        }
				                                }
				                        
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				 ((Intrucciones_tipe_scrip_primaContext)_localctx).value =  new Resultado();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Instruccion_tipo_scriptContext extends ParserRuleContext {
		public Resultado value;
		public boolean error = false;
		public String instruccion;
		public boolean funcion = false;
		public boolean if_ = false;
		public CreacionVariableContext creacionVariable;
		public AsignacionVariableContext asignacionVariable;
		public Impresion_consolaContext impresion_consola;
		public CondicionalContext condicional;
		public Llamada_funcionContext llamada_funcion;
		public CreacionVariableContext creacionVariable() {
			return getRuleContext(CreacionVariableContext.class,0);
		}
		public AsignacionVariableContext asignacionVariable() {
			return getRuleContext(AsignacionVariableContext.class,0);
		}
		public Impresion_consolaContext impresion_consola() {
			return getRuleContext(Impresion_consolaContext.class,0);
		}
		public CondicionalContext condicional() {
			return getRuleContext(CondicionalContext.class,0);
		}
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public Instruccion_tipo_scriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_tipo_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterInstruccion_tipo_script(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitInstruccion_tipo_script(this);
		}
	}

	public final Instruccion_tipo_scriptContext instruccion_tipo_script() throws RecognitionException {
		Instruccion_tipo_scriptContext _localctx = new Instruccion_tipo_scriptContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruccion_tipo_script);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				((Instruccion_tipo_scriptContext)_localctx).creacionVariable = creacionVariable();
				  
				                        if(((Instruccion_tipo_scriptContext)_localctx).creacionVariable.value==null){
				                                
				                                ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss");
				                                _localctx.value.setBandera0(true);

				                                         errorif=true; errorEnFuncion=true;     
				                        }else{
				                               
				                                if(((Instruccion_tipo_scriptContext)_localctx).creacionVariable.value.isBandera0() )
				                                {      
				                                        ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss"); _localctx.value.setBandera0(true);   errorEnFuncion=true;   errorif=true;
				                                 
				                                }else{ ((Instruccion_tipo_scriptContext)_localctx).error = true;  ((Instruccion_tipo_scriptContext)_localctx).funcion = declaracionFuncionEnCurso;  ((Instruccion_tipo_scriptContext)_localctx).if_ = declaracioniFEnCurso;}
				                        }
				                        an(((Instruccion_tipo_scriptContext)_localctx).creacionVariable,5);
				                
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(136);
				((Instruccion_tipo_scriptContext)_localctx).asignacionVariable = asignacionVariable();
				  
				                        if(((Instruccion_tipo_scriptContext)_localctx).asignacionVariable.value==null){
				                                
				                                ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss"); _localctx.value.setBandera0(true);  errorif=true; errorEnFuncion=true;   
				                        }
				                        else{
				                                if(((Instruccion_tipo_scriptContext)_localctx).asignacionVariable.value.isBandera0() )
				                                {      
				                                        ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss"); _localctx.value.setBandera0(true);  errorif=true; errorEnFuncion=true;   
				                                        
				                                }else{ ((Instruccion_tipo_scriptContext)_localctx).error = true;  ((Instruccion_tipo_scriptContext)_localctx).funcion = declaracionFuncionEnCurso; ((Instruccion_tipo_scriptContext)_localctx).if_ = declaracioniFEnCurso;}
				                        }
				                 an(((Instruccion_tipo_scriptContext)_localctx).asignacionVariable,6);
				                
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				((Instruccion_tipo_scriptContext)_localctx).impresion_consola = impresion_consola();
				  
				                        if(((Instruccion_tipo_scriptContext)_localctx).impresion_consola.value==null){
				                                        
				                                ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss"); _localctx.value.setBandera0(true);errorif=true;  errorEnFuncion=true;   
				                        }else{
				                                if(((Instruccion_tipo_scriptContext)_localctx).impresion_consola.value.isBandera1() ||((Instruccion_tipo_scriptContext)_localctx).impresion_consola.value.isBandera2() )
				                                {      
				                                        ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss");_localctx.value.setBandera0(true);   errorif=true; errorEnFuncion=true;   
				                                      
				                                }else{ ((Instruccion_tipo_scriptContext)_localctx).error = true;  ((Instruccion_tipo_scriptContext)_localctx).funcion = declaracionFuncionEnCurso; ((Instruccion_tipo_scriptContext)_localctx).if_ = declaracioniFEnCurso;}                                       
				                        }
				                        an(((Instruccion_tipo_scriptContext)_localctx).impresion_consola,7);
				                
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(142);
				((Instruccion_tipo_scriptContext)_localctx).condicional = condicional();
				  
				                         ((Instruccion_tipo_scriptContext)_localctx).error = false; 
				                        if(((Instruccion_tipo_scriptContext)_localctx).condicional.value==null){
				                                       
				                                ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss");_localctx.value.setBandera0(true);  errorif=true; errorEnFuncion=true;   
				                                       
				                        }else{   System.out.println("3");
				                                
				                                if(errorif )
				                                {      
				                                        ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss"); _localctx.value.setBandera0(true); errorif=true;errorEnFuncion=true;         
				                                }else{ 
				                                       ((Instruccion_tipo_scriptContext)_localctx).error = true;  ((Instruccion_tipo_scriptContext)_localctx).funcion = declaracionFuncionEnCurso; ((Instruccion_tipo_scriptContext)_localctx).if_ = declaracioniFEnCurso;
				                                }
				                        }
				          
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(145);
				((Instruccion_tipo_scriptContext)_localctx).llamada_funcion = llamada_funcion();
				  
				                        if(((Instruccion_tipo_scriptContext)_localctx).llamada_funcion.value==null){
				                                        
				                                ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss"); _localctx.value.setBandera0(true); errorEnFuncion=true;   
				                                       
				                        }else{  if(((Instruccion_tipo_scriptContext)_localctx).llamada_funcion.value.isBandera0() )
				                                {      
				                                        ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss"); _localctx.value.setBandera0(true);   errorEnFuncion=true;   

				                                }else{ ((Instruccion_tipo_scriptContext)_localctx).error = true;  ((Instruccion_tipo_scriptContext)_localctx).funcion = declaracionFuncionEnCurso; ((Instruccion_tipo_scriptContext)_localctx).if_ = declaracioniFEnCurso;
				                                }
				                        }
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Regreso_funcionContext extends ParserRuleContext {
		public boolean error1 = false;
		public boolean error2 = false;
		public Token REGRESO;
		public TipoAsignacionVariableContext tipoAsignacionVariable;
		public Token FINI_NSTRUCCION;
		public TerminalNode REGRESO() { return getToken(TipeScriptParser.REGRESO, 0); }
		public TerminalNode FINI_NSTRUCCION() { return getToken(TipeScriptParser.FINI_NSTRUCCION, 0); }
		public TipoAsignacionVariableContext tipoAsignacionVariable() {
			return getRuleContext(TipoAsignacionVariableContext.class,0);
		}
		public Regreso_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regreso_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterRegreso_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitRegreso_funcion(this);
		}
	}

	public final Regreso_funcionContext regreso_funcion() throws RecognitionException {
		Regreso_funcionContext _localctx = new Regreso_funcionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_regreso_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			((Regreso_funcionContext)_localctx).REGRESO = match(REGRESO);
			setState(152);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 255086924144704L) != 0)) {
				{
				setState(151);
				((Regreso_funcionContext)_localctx).tipoAsignacionVariable = tipoAsignacionVariable();
				}
			}

			setState(154);
			((Regreso_funcionContext)_localctx).FINI_NSTRUCCION = match(FINI_NSTRUCCION);
			 
			                Object valor=null;
			                if(!returnFuncion)
			                        { 
			                                if(tablaSimbolosLocales.get((((Regreso_funcionContext)_localctx).REGRESO!=null?((Regreso_funcionContext)_localctx).REGRESO.getText():null))!=null){
			                                        if(((Regreso_funcionContext)_localctx).tipoAsignacionVariable.value!=null){
			                                                if(((Regreso_funcionContext)_localctx).tipoAsignacionVariable.value.value!=null)
			                                                {
			                                                                if (!tablaSimbolosLocales.get((((Regreso_funcionContext)_localctx).REGRESO!=null?((Regreso_funcionContext)_localctx).REGRESO.getText():null)).getClass().getSimpleName().equals(((Regreso_funcionContext)_localctx).tipoAsignacionVariable.value.value.getClass().getSimpleName()) ){
			                                                                
			                                                                valor=((Regreso_funcionContext)_localctx).tipoAsignacionVariable.value.value.getClass().getSimpleName()+" no compatible con "+tablaSimbolosLocales.get((((Regreso_funcionContext)_localctx).REGRESO!=null?((Regreso_funcionContext)_localctx).REGRESO.getText():null)).getClass().getSimpleName();
			                                                                errorEnFuncion=true;  String mensaje =  (((Regreso_funcionContext)_localctx).REGRESO!=null?((Regreso_funcionContext)_localctx).REGRESO.getText():null) + " "   + ((Regreso_funcionContext)_localctx).tipoAsignacionVariable.value.value + " " + (((Regreso_funcionContext)_localctx).FINI_NSTRUCCION!=null?((Regreso_funcionContext)_localctx).FINI_NSTRUCCION.getText():null); 

			                                                                }else{
			                                                                
			                                                                        valor="Guardando en tabla: " + (((Regreso_funcionContext)_localctx).REGRESO!=null?((Regreso_funcionContext)_localctx).REGRESO.getText():null) + " -> " + ((Regreso_funcionContext)_localctx).tipoAsignacionVariable.value.value;
			                                                                        tablaSimbolosLocales.put((((Regreso_funcionContext)_localctx).REGRESO!=null?((Regreso_funcionContext)_localctx).REGRESO.getText():null), ((Regreso_funcionContext)_localctx).tipoAsignacionVariable.value.value);
			                                                                        String returnn=(((Regreso_funcionContext)_localctx).REGRESO!=null?((Regreso_funcionContext)_localctx).REGRESO.getText():null)+" "+(((Regreso_funcionContext)_localctx).tipoAsignacionVariable!=null?_input.getText(((Regreso_funcionContext)_localctx).tipoAsignacionVariable.start,((Regreso_funcionContext)_localctx).tipoAsignacionVariable.stop):null)+" ;";
			                                                                        instrucciones.add(returnn); tipoInstruccion.add(0); returnFuncion=true;
			                                                                }
			                                                }
			                                        }
			                                }else{
			                                        if (((Regreso_funcionContext)_localctx).tipoAsignacionVariable != null) {
			                                                   errorEnFuncion=true;  ((Regreso_funcionContext)_localctx).error2 = true;
			                                        }else{
			                                                        String returnn=(((Regreso_funcionContext)_localctx).REGRESO!=null?((Regreso_funcionContext)_localctx).REGRESO.getText():null)+" ;"; instrucciones.add(returnn); tipoInstruccion.add(0); returnFuncion=true;
			                                        }
			                                }
			                } else{
			                        errorEnFuncion=true;  ((Regreso_funcionContext)_localctx).error1 = true;
			                }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracion_funcionContext extends ParserRuleContext {
		public boolean error = false;
		public Token f;
		public Token id;
		public Token p1;
		public Parametros_funcionContext parametros_funcion;
		public Token p2;
		public Token dp;
		public TipoContext tipo;
		public Bloque_instruccionesContext bloque_instrucciones;
		public Parametros_funcionContext parametros_funcion() {
			return getRuleContext(Parametros_funcionContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode CORCH1() { return getToken(TipeScriptParser.CORCH1, 0); }
		public Bloque_instruccionesContext bloque_instrucciones() {
			return getRuleContext(Bloque_instruccionesContext.class,0);
		}
		public TerminalNode CORCH2() { return getToken(TipeScriptParser.CORCH2, 0); }
		public TerminalNode FUNCTION() { return getToken(TipeScriptParser.FUNCTION, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(TipeScriptParser.IDENTIFICADOR, 0); }
		public TerminalNode PAR1() { return getToken(TipeScriptParser.PAR1, 0); }
		public TerminalNode PAR2() { return getToken(TipeScriptParser.PAR2, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(TipeScriptParser.DOS_PUNTOS, 0); }
		public Declaracion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterDeclaracion_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitDeclaracion_funcion(this);
		}
	}

	public final Declaracion_funcionContext declaracion_funcion() throws RecognitionException {
		Declaracion_funcionContext _localctx = new Declaracion_funcionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{

			                        tablaSimbolosLocales=new HashMap<String,Object>();
			                        instruccionesFuncion = new ArrayList<>();
			                        tipoInstruccionFuncion= new ArrayList<>();
			                        errorEnFuncion=false; returnFuncion=false;
			                        declaracionFuncionEnCurso=true;

			                
			setState(158);
			((Declaracion_funcionContext)_localctx).f = match(FUNCTION);
			setState(159);
			((Declaracion_funcionContext)_localctx).id = match(IDENTIFICADOR);
			setState(160);
			((Declaracion_funcionContext)_localctx).p1 = match(PAR1);
			setState(161);
			((Declaracion_funcionContext)_localctx).parametros_funcion = parametros_funcion();
			setState(162);
			((Declaracion_funcionContext)_localctx).p2 = match(PAR2);
			setState(163);
			((Declaracion_funcionContext)_localctx).dp = match(DOS_PUNTOS);
			setState(164);
			((Declaracion_funcionContext)_localctx).tipo = tipo();
			                 
			                      
			                         Object valor=null;
			                          
			                        switch (((Declaracion_funcionContext)_localctx).tipo.value.toString()) {
			                                case "String" -> {  valor="a"; }
			                                case "Character" -> {valor='a'; }
			                                case "Boolean" -> {valor=false; }
			                                case "Double" -> {valor=0.0; }
			                                case "void" -> { valor=null; }
			                        }     
			                          tablaSimbolosLocales.put("return", valor );
			                          
			                        
			setState(166);
			match(CORCH1);

			                                
			                                String encabezadoFucion=(((Declaracion_funcionContext)_localctx).f!=null?((Declaracion_funcionContext)_localctx).f.getText():null)+" "+(((Declaracion_funcionContext)_localctx).id!=null?((Declaracion_funcionContext)_localctx).id.getText():null)+" ("+(((Declaracion_funcionContext)_localctx).parametros_funcion!=null?_input.getText(((Declaracion_funcionContext)_localctx).parametros_funcion.start,((Declaracion_funcionContext)_localctx).parametros_funcion.stop):null)+") : "+(((Declaracion_funcionContext)_localctx).tipo!=null?_input.getText(((Declaracion_funcionContext)_localctx).tipo.start,((Declaracion_funcionContext)_localctx).tipo.stop):null)+" {";
			                                instrucciones.add(encabezadoFucion); tipoInstruccion.add(8);
			                                
			setState(168);
			((Declaracion_funcionContext)_localctx).bloque_instrucciones = bloque_instrucciones();
			setState(169);
			match(CORCH2);

			                        
			                                        if(errorEnFuncion){ 
			                                                ((Declaracion_funcionContext)_localctx).error = true;
			                                        }else{ 
			                                                        Object tipoRetorno=null;
			                                                        if(tablaSimbolosLocales.get("return")!=null){
			                                                        tipoRetorno = tablaSimbolosLocales.get("return");

			                                                        }
			                                                        List<Token> tokens = ((CommonTokenStream)_input)
			                                                                .getTokens((((Declaracion_funcionContext)_localctx).bloque_instrucciones!=null?(((Declaracion_funcionContext)_localctx).bloque_instrucciones.start):null).getTokenIndex(), 
			                                                                        (((Declaracion_funcionContext)_localctx).bloque_instrucciones!=null?(((Declaracion_funcionContext)_localctx).bloque_instrucciones.stop):null).getTokenIndex());
			                                                       
			                                                     
			                                                        Funcion miFuncion =new Funcion((((Declaracion_funcionContext)_localctx).id!=null?((Declaracion_funcionContext)_localctx).id.getText():null),((Declaracion_funcionContext)_localctx).parametros_funcion.parametros,tablaSimbolosLocales,((Declaracion_funcionContext)_localctx).bloque_instrucciones,tipoRetorno,tokens);
			                                                        miFuncion.setInstrucciones(instruccionesFuncion);
			                                                        miFuncion.setTipoInstruccion(tipoInstruccionFuncion);
			                                                        tablaFunciones.put((((Declaracion_funcionContext)_localctx).id!=null?((Declaracion_funcionContext)_localctx).id.getText():null),miFuncion );  
			                                        }
			                                        errorEnFuncion=false;
			                                        tablaSimbolosLocales=null;
			                                        instruccionesFuncion = null;
			                                        tipoInstruccionFuncion= null;
			                                        declaracionFuncionEnCurso=false;
			                                        instrucciones.add("}"); tipoInstruccion.add(0);
			                                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Parametros_funcionContext extends ParserRuleContext {
		public Map<String, String> parametros;
		public Token id;
		public TipoContext t;
		public Token id2;
		public TipoContext t2;
		public List<TerminalNode> DOS_PUNTOS() { return getTokens(TipeScriptParser.DOS_PUNTOS); }
		public TerminalNode DOS_PUNTOS(int i) {
			return getToken(TipeScriptParser.DOS_PUNTOS, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(TipeScriptParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(TipeScriptParser.IDENTIFICADOR, i);
		}
		public List<TipoContext> tipo() {
			return getRuleContexts(TipoContext.class);
		}
		public TipoContext tipo(int i) {
			return getRuleContext(TipoContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(TipeScriptParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(TipeScriptParser.COMA, i);
		}
		public Parametros_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterParametros_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitParametros_funcion(this);
		}
	}

	public final Parametros_funcionContext parametros_funcion() throws RecognitionException {
		Parametros_funcionContext _localctx = new Parametros_funcionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_parametros_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			((Parametros_funcionContext)_localctx).id = match(IDENTIFICADOR);
			setState(173);
			match(DOS_PUNTOS);
			setState(174);
			((Parametros_funcionContext)_localctx).t = tipo();

			                        ((Parametros_funcionContext)_localctx).parametros =  new HashMap<String, String>(); 
			                        Object valor=null;

			                        switch (((Parametros_funcionContext)_localctx).t.value.toString()) {
			                                case "String" -> {valor="a"; }
			                                case "Character" -> { valor='a';}
			                                case "Boolean" -> {valor=false; }
			                                case "Double" -> {valor=0.0; }
			                        }      

			                        _localctx.parametros.put(((Parametros_funcionContext)_localctx).id.getText(), ((Parametros_funcionContext)_localctx).t.value.toString());
			                        tablaSimbolosLocales.put(((Parametros_funcionContext)_localctx).id.getText(), valor);
			                
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(176);
				match(COMA);
				setState(177);
				((Parametros_funcionContext)_localctx).id2 = match(IDENTIFICADOR);
				setState(178);
				match(DOS_PUNTOS);
				setState(179);
				((Parametros_funcionContext)_localctx).t2 = tipo();

				                    if(_localctx.parametros!=null){
				                        switch (((Parametros_funcionContext)_localctx).t.value.toString()) {
				                                case "String" -> { valor="a";   }
				                                case "Character" -> { valor='a';  }
				                                case "Boolean" -> {  valor=false;}
				                                case "Double" -> { valor=0.0; }
				                        }      

				                        _localctx.parametros.put(((Parametros_funcionContext)_localctx).id2.getText(), ((Parametros_funcionContext)_localctx).t2.value.toString());   
				                        tablaSimbolosLocales.put(((Parametros_funcionContext)_localctx).id2.getText(), valor);
				                    }
				                
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_instruccionesContext extends ParserRuleContext {
		public Intrucciones_tipe_scripContext instr;
		public Bloque_instrucciones_primaContext intr2;
		public Regreso_funcionContext instr2;
		public Intrucciones_tipe_scripContext intrucciones_tipe_scrip() {
			return getRuleContext(Intrucciones_tipe_scripContext.class,0);
		}
		public Bloque_instrucciones_primaContext bloque_instrucciones_prima() {
			return getRuleContext(Bloque_instrucciones_primaContext.class,0);
		}
		public Regreso_funcionContext regreso_funcion() {
			return getRuleContext(Regreso_funcionContext.class,0);
		}
		public Bloque_instruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_instrucciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterBloque_instrucciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitBloque_instrucciones(this);
		}
	}

	public final Bloque_instruccionesContext bloque_instrucciones() throws RecognitionException {
		Bloque_instruccionesContext _localctx = new Bloque_instruccionesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_bloque_instrucciones);
		try {
			setState(193);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case VAR:
			case CONSOLE:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				((Bloque_instruccionesContext)_localctx).instr = intrucciones_tipe_scrip();
				setState(188);
				((Bloque_instruccionesContext)_localctx).intr2 = bloque_instrucciones_prima();
				}
				break;
			case REGRESO:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				((Bloque_instruccionesContext)_localctx).instr2 = regreso_funcion();
				setState(191);
				bloque_instrucciones_prima();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_instrucciones_primaContext extends ParserRuleContext {
		public Intrucciones_tipe_scripContext intrucciones_tipe_scrip() {
			return getRuleContext(Intrucciones_tipe_scripContext.class,0);
		}
		public Bloque_instrucciones_primaContext bloque_instrucciones_prima() {
			return getRuleContext(Bloque_instrucciones_primaContext.class,0);
		}
		public Regreso_funcionContext regreso_funcion() {
			return getRuleContext(Regreso_funcionContext.class,0);
		}
		public Bloque_instrucciones_primaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_instrucciones_prima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterBloque_instrucciones_prima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitBloque_instrucciones_prima(this);
		}
	}

	public final Bloque_instrucciones_primaContext bloque_instrucciones_prima() throws RecognitionException {
		Bloque_instrucciones_primaContext _localctx = new Bloque_instrucciones_primaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_bloque_instrucciones_prima);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case VAR:
			case CONSOLE:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				intrucciones_tipe_scrip();
				setState(196);
				bloque_instrucciones_prima();
				}
				break;
			case REGRESO:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				regreso_funcion();
				setState(199);
				bloque_instrucciones_prima();
				}
				break;
			case CORCH2:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Llamada_funcionContext extends ParserRuleContext {
		public Resultado value;
		public boolean exito = true;
		public Object retorno;
		public boolean error1 = false;
		public boolean error4 = false;
		public boolean error2 = false;
		public boolean error3 = false;
		public int parametros = 0;
		public String tiposParamalos = "";
		public String tiposParama = "";
		public boolean error = false;
		public Token IDENTIFICADOR;
		public Llamada_parametros_funcionContext llamada_parametros_funcion;
		public TerminalNode IDENTIFICADOR() { return getToken(TipeScriptParser.IDENTIFICADOR, 0); }
		public TerminalNode PAR1() { return getToken(TipeScriptParser.PAR1, 0); }
		public TerminalNode PAR2() { return getToken(TipeScriptParser.PAR2, 0); }
		public TerminalNode FINI_NSTRUCCION() { return getToken(TipeScriptParser.FINI_NSTRUCCION, 0); }
		public Llamada_parametros_funcionContext llamada_parametros_funcion() {
			return getRuleContext(Llamada_parametros_funcionContext.class,0);
		}
		public Llamada_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterLlamada_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitLlamada_funcion(this);
		}
	}

	public final Llamada_funcionContext llamada_funcion() throws RecognitionException {
		Llamada_funcionContext _localctx = new Llamada_funcionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_llamada_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			((Llamada_funcionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(205);
			match(PAR1);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 255086924144704L) != 0)) {
				{
				setState(206);
				((Llamada_funcionContext)_localctx).llamada_parametros_funcion = llamada_parametros_funcion();
				}
			}

			setState(209);
			match(PAR2);
			setState(210);
			match(FINI_NSTRUCCION);

			        
			        Map <String,Object> tablaEnTurno=null;
			        if(tablaSimbolosLocales!=null){tablaEnTurno=tablaSimbolosLocales;}else {tablaEnTurno=tablaSimbolos;}

			        if(tablaFunciones.containsKey((((Llamada_funcionContext)_localctx).IDENTIFICADOR!=null?((Llamada_funcionContext)_localctx).IDENTIFICADOR.getText():null))){

			                Funcion funcion=(Funcion)tablaFunciones.get((((Llamada_funcionContext)_localctx).IDENTIFICADOR!=null?((Llamada_funcionContext)_localctx).IDENTIFICADOR.getText():null));
			               
			                ((Llamada_funcionContext)_localctx).retorno = funcion.getTipoRetorno();
			                if(funcion.getParametros()!=null){
			                          ((Llamada_funcionContext)_localctx).parametros = funcion.getParametros().size();  ((Llamada_funcionContext)_localctx).tiposParama = funcion.getParametros().values().toString();
			                }
			              
			                if(_localctx.llamada_parametros_funcion!=null){
			                        if(funcion.getParametros().size()==((Llamada_funcionContext)_localctx).llamada_parametros_funcion.parametros.size()){
			                                
			                                List<String> listaKeysParametros = new ArrayList<>(funcion.getParametros().keySet());
			                                List<String> listaValoresParametros = new ArrayList<>(funcion.getParametros().values());
			                                List<Object> listaValoresParametrosFuncion = ((Llamada_funcionContext)_localctx).llamada_parametros_funcion.parametros;
			                                        
			                                for (int i = 0; i < listaValoresParametros.size(); i++) {
			                                        
			                                        if(listaValoresParametros.get(i).equals(listaValoresParametrosFuncion.get(i).getClass().getSimpleName())){
			                                                if(tablaEnTurno.containsKey((((Llamada_funcionContext)_localctx).IDENTIFICADOR!=null?((Llamada_funcionContext)_localctx).IDENTIFICADOR.getText():null))){
			                                                         funcion.getVariables().put(listaKeysParametros.get(i),listaValoresParametrosFuncion.get(i));
			                                                }             
			                                        }else{
			              
			                                                ((Llamada_funcionContext)_localctx).value =  new Resultado(null, ""); 
			                                                _localctx.value.setBandera0(true);
			                                                _localctx.tiposParamalos+= listaValoresParametrosFuncion.get(i).toString();
			                                                 ((Llamada_funcionContext)_localctx).error4 = true;
			                                                    ((Llamada_funcionContext)_localctx).exito = false;
			                                        }
			                                }
			                                ((Llamada_funcionContext)_localctx).value =  new Resultado(null, "ss");
			                        }else{
			                                if(funcion.getParametros().size()==0){
			                                        ((Llamada_funcionContext)_localctx).error2 = true;  ((Llamada_funcionContext)_localctx).exito = false;
			                                }else{
			                                        ((Llamada_funcionContext)_localctx).error3 = true;   ((Llamada_funcionContext)_localctx).exito = false;
			                                        
			                                }                  
			                        }
			                }else{ 
			                        if(funcion.getParametros()!=null){

			                                if(funcion.getParametros().size()!=0){
			                                          ((Llamada_funcionContext)_localctx).error3 = true; ((Llamada_funcionContext)_localctx).exito = false;
			                                }   
			                        }   
			                }
			        }else{
			                ((Llamada_funcionContext)_localctx).error1 = true; ((Llamada_funcionContext)_localctx).exito = false;
			        }   
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Llamada_parametros_funcionContext extends ParserRuleContext {
		public ArrayList<Object> parametros;
		public TipoAsignacionVariableContext tv1;
		public TipoAsignacionVariableContext tv2;
		public List<TipoAsignacionVariableContext> tipoAsignacionVariable() {
			return getRuleContexts(TipoAsignacionVariableContext.class);
		}
		public TipoAsignacionVariableContext tipoAsignacionVariable(int i) {
			return getRuleContext(TipoAsignacionVariableContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(TipeScriptParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(TipeScriptParser.COMA, i);
		}
		public Llamada_parametros_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llamada_parametros_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterLlamada_parametros_funcion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitLlamada_parametros_funcion(this);
		}
	}

	public final Llamada_parametros_funcionContext llamada_parametros_funcion() throws RecognitionException {
		Llamada_parametros_funcionContext _localctx = new Llamada_parametros_funcionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_llamada_parametros_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			                ((Llamada_parametros_funcionContext)_localctx).parametros =  new ArrayList<>();  
			        
			setState(214);
			((Llamada_parametros_funcionContext)_localctx).tv1 = tipoAsignacionVariable();

			                if(((Llamada_parametros_funcionContext)_localctx).tv1.value!=null){
			                           if(((Llamada_parametros_funcionContext)_localctx).tv1.value.value!=null){
			                                _localctx.parametros.add(((Llamada_parametros_funcionContext)_localctx).tv1.value.value);
			                         }
			                }   
			        
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(216);
				match(COMA);
				setState(217);
				((Llamada_parametros_funcionContext)_localctx).tv2 = tipoAsignacionVariable();

				                     if(((Llamada_parametros_funcionContext)_localctx).tv2.value!=null){
				                         if(((Llamada_parametros_funcionContext)_localctx).tv2.value.value!=null){
				                                _localctx.parametros.add(((Llamada_parametros_funcionContext)_localctx).tv2.value.value);
				                         }
				                     }
				                
				}
				}
				setState(224);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionalContext extends ParserRuleContext {
		public Resultado value;
		public boolean error1 = false;
		public boolean error2 = false;
		public boolean error3 = false;;
		public String Instvalido = "";
		public String elseIf = "";
		public Token IF;
		public TipoAsignacionVariableContext t2;
		public Token ELSE;
		public TipoAsignacionVariableContext t;
		public List<TerminalNode> IF() { return getTokens(TipeScriptParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(TipeScriptParser.IF, i);
		}
		public List<TerminalNode> PAR1() { return getTokens(TipeScriptParser.PAR1); }
		public TerminalNode PAR1(int i) {
			return getToken(TipeScriptParser.PAR1, i);
		}
		public List<TerminalNode> PAR2() { return getTokens(TipeScriptParser.PAR2); }
		public TerminalNode PAR2(int i) {
			return getToken(TipeScriptParser.PAR2, i);
		}
		public List<TerminalNode> CORCH1() { return getTokens(TipeScriptParser.CORCH1); }
		public TerminalNode CORCH1(int i) {
			return getToken(TipeScriptParser.CORCH1, i);
		}
		public List<TerminalNode> CORCH2() { return getTokens(TipeScriptParser.CORCH2); }
		public TerminalNode CORCH2(int i) {
			return getToken(TipeScriptParser.CORCH2, i);
		}
		public List<TipoAsignacionVariableContext> tipoAsignacionVariable() {
			return getRuleContexts(TipoAsignacionVariableContext.class);
		}
		public TipoAsignacionVariableContext tipoAsignacionVariable(int i) {
			return getRuleContext(TipoAsignacionVariableContext.class,i);
		}
		public List<Bloque_instrucciones_condicionalContext> bloque_instrucciones_condicional() {
			return getRuleContexts(Bloque_instrucciones_condicionalContext.class);
		}
		public Bloque_instrucciones_condicionalContext bloque_instrucciones_condicional(int i) {
			return getRuleContext(Bloque_instrucciones_condicionalContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(TipeScriptParser.ELSE, 0); }
		public CondicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterCondicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitCondicional(this);
		}
	}

	public final CondicionalContext condicional() throws RecognitionException {
		CondicionalContext _localctx = new CondicionalContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condicional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			returnif=false; ((CondicionalContext)_localctx).error1 = false; ((CondicionalContext)_localctx).error2 = false; errorif=false; declaracioniFEnCurso=true;  ((CondicionalContext)_localctx).value =  new Resultado( ""); 
			setState(226);
			((CondicionalContext)_localctx).IF = match(IF);
			setState(227);
			match(PAR1);
			setState(228);
			((CondicionalContext)_localctx).t2 = tipoAsignacionVariable();

			        if(((CondicionalContext)_localctx).t2.value!=null){ 
			                 if(((CondicionalContext)_localctx).t2.value.value!=null)
			                        {
			                                if (!(((CondicionalContext)_localctx).t2.value.value instanceof Boolean)) {
			                                        ((CondicionalContext)_localctx).error3 = true; _localctx.value.setBandera0(true);  ((CondicionalContext)_localctx).Instvalido = (((CondicionalContext)_localctx).t2!=null?_input.getText(((CondicionalContext)_localctx).t2.start,((CondicionalContext)_localctx).t2.stop):null);
			                                }            
			                }
			        }else{
			                ((CondicionalContext)_localctx).error2 = true; _localctx.value.setBandera0(true); ((CondicionalContext)_localctx).Instvalido = (((CondicionalContext)_localctx).t2!=null?_input.getText(((CondicionalContext)_localctx).t2.start,((CondicionalContext)_localctx).t2.stop):null);
			        }
			    
			setState(230);
			match(PAR2);
			setState(231);
			match(CORCH1);
			String encabezado=(((CondicionalContext)_localctx).IF!=null?((CondicionalContext)_localctx).IF.getText():null)+"("+(((CondicionalContext)_localctx).t2!=null?_input.getText(((CondicionalContext)_localctx).t2.start,((CondicionalContext)_localctx).t2.stop):null)+"){";  instrucciones.add(encabezado);  tipoInstruccion.add(9);
			setState(234);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140960826656768L) != 0)) {
				{
				setState(233);
				bloque_instrucciones_condicional();
				}
			}

			setState(236);
			match(CORCH2);
			instrucciones.add("}");  tipoInstruccion.add(0);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(238);
				((CondicionalContext)_localctx).ELSE = match(ELSE);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(239);
					((CondicionalContext)_localctx).IF = match(IF);
					setState(240);
					match(PAR1);
					setState(241);
					((CondicionalContext)_localctx).t = tipoAsignacionVariable();

					        if(((CondicionalContext)_localctx).t.value!=null){ 
					                 if(((CondicionalContext)_localctx).t.value.value!=null)
					                        {
					                                if (!(((CondicionalContext)_localctx).t.value.value instanceof Boolean)) {      
					                                        ((CondicionalContext)_localctx).error3 = true; _localctx.value.setBandera0(true);  ((CondicionalContext)_localctx).Instvalido = (((CondicionalContext)_localctx).t!=null?_input.getText(((CondicionalContext)_localctx).t.start,((CondicionalContext)_localctx).t.stop):null);
					                                }}
					        }else{
					                ((CondicionalContext)_localctx).error2 = true;
					                _localctx.value.setBandera0(true);
					                ((CondicionalContext)_localctx).Instvalido = (((CondicionalContext)_localctx).t!=null?_input.getText(((CondicionalContext)_localctx).t.start,((CondicionalContext)_localctx).t.stop):null);
					        }
					    
					setState(243);
					match(PAR2);
					((CondicionalContext)_localctx).elseIf = (((CondicionalContext)_localctx).IF!=null?((CondicionalContext)_localctx).IF.getText():null)+"("+(((CondicionalContext)_localctx).t!=null?_input.getText(((CondicionalContext)_localctx).t.start,((CondicionalContext)_localctx).t.stop):null)+")";
					}
				}

				setState(248);
				match(CORCH1);
				String encabezadoElse=(((CondicionalContext)_localctx).ELSE!=null?((CondicionalContext)_localctx).ELSE.getText():null)+" "+_localctx.elseIf+"{";  instrucciones.add(encabezadoElse);  tipoInstruccion.add(10);


				    
				setState(252);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 140960826656768L) != 0)) {
					{
					setState(251);
					bloque_instrucciones_condicional();
					}
				}

				setState(254);
				match(CORCH2);
				instrucciones.add("}");  tipoInstruccion.add(0);
				}
			}

			 ((CondicionalContext)_localctx).error1 = errorif; 
			       
			                declaracioniFEnCurso=false; 
			                if(_localctx.value==null)
			                { Object valor=null ;  ((CondicionalContext)_localctx).value =  new Resultado(valor, ""); 
			                 if(errorif){_localctx.value.setBandera0(true);}
			                }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_instrucciones_condicionalContext extends ParserRuleContext {
		public Resultado value;
		public Intrucciones_tipe_scripContext instr;
		public Bloque_instrucciones_condicional_primaContext intr2;
		public Regreso_ifContext instr2;
		public Intrucciones_tipe_scripContext intrucciones_tipe_scrip() {
			return getRuleContext(Intrucciones_tipe_scripContext.class,0);
		}
		public Bloque_instrucciones_condicional_primaContext bloque_instrucciones_condicional_prima() {
			return getRuleContext(Bloque_instrucciones_condicional_primaContext.class,0);
		}
		public Regreso_ifContext regreso_if() {
			return getRuleContext(Regreso_ifContext.class,0);
		}
		public Bloque_instrucciones_condicionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_instrucciones_condicional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterBloque_instrucciones_condicional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitBloque_instrucciones_condicional(this);
		}
	}

	public final Bloque_instrucciones_condicionalContext bloque_instrucciones_condicional() throws RecognitionException {
		Bloque_instrucciones_condicionalContext _localctx = new Bloque_instrucciones_condicionalContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_bloque_instrucciones_condicional);
		try {
			setState(266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case VAR:
			case CONSOLE:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				((Bloque_instrucciones_condicionalContext)_localctx).instr = intrucciones_tipe_scrip();
				setState(261);
				((Bloque_instrucciones_condicionalContext)_localctx).intr2 = bloque_instrucciones_condicional_prima();
				}
				break;
			case REGRESO:
				enterOuterAlt(_localctx, 2);
				{
				setState(263);
				((Bloque_instrucciones_condicionalContext)_localctx).instr2 = regreso_if();
				setState(264);
				bloque_instrucciones_condicional_prima();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_instrucciones_condicional_primaContext extends ParserRuleContext {
		public Intrucciones_tipe_scripContext intrucciones_tipe_scrip() {
			return getRuleContext(Intrucciones_tipe_scripContext.class,0);
		}
		public Bloque_instrucciones_condicional_primaContext bloque_instrucciones_condicional_prima() {
			return getRuleContext(Bloque_instrucciones_condicional_primaContext.class,0);
		}
		public Regreso_ifContext regreso_if() {
			return getRuleContext(Regreso_ifContext.class,0);
		}
		public Bloque_instrucciones_condicional_primaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_instrucciones_condicional_prima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterBloque_instrucciones_condicional_prima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitBloque_instrucciones_condicional_prima(this);
		}
	}

	public final Bloque_instrucciones_condicional_primaContext bloque_instrucciones_condicional_prima() throws RecognitionException {
		Bloque_instrucciones_condicional_primaContext _localctx = new Bloque_instrucciones_condicional_primaContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bloque_instrucciones_condicional_prima);
		try {
			setState(275);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
			case VAR:
			case CONSOLE:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				intrucciones_tipe_scrip();
				setState(269);
				bloque_instrucciones_condicional_prima();
				}
				break;
			case REGRESO:
				enterOuterAlt(_localctx, 2);
				{
				setState(271);
				regreso_if();
				setState(272);
				bloque_instrucciones_condicional_prima();
				}
				break;
			case CORCH2:
				enterOuterAlt(_localctx, 3);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Regreso_ifContext extends ParserRuleContext {
		public boolean error1 = false;
		public boolean error2 = false;
		public boolean error3 = false;
		public Token REGRESO;
		public TipoAsignacionVariableContext tipoAsignacionVariable;
		public Token FINI_NSTRUCCION;
		public TerminalNode REGRESO() { return getToken(TipeScriptParser.REGRESO, 0); }
		public TerminalNode FINI_NSTRUCCION() { return getToken(TipeScriptParser.FINI_NSTRUCCION, 0); }
		public TipoAsignacionVariableContext tipoAsignacionVariable() {
			return getRuleContext(TipoAsignacionVariableContext.class,0);
		}
		public Regreso_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regreso_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterRegreso_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitRegreso_if(this);
		}
	}

	public final Regreso_ifContext regreso_if() throws RecognitionException {
		Regreso_ifContext _localctx = new Regreso_ifContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_regreso_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			((Regreso_ifContext)_localctx).REGRESO = match(REGRESO);
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 255086924144704L) != 0)) {
				{
				setState(278);
				((Regreso_ifContext)_localctx).tipoAsignacionVariable = tipoAsignacionVariable();
				}
			}

			setState(281);
			((Regreso_ifContext)_localctx).FINI_NSTRUCCION = match(FINI_NSTRUCCION);
			 
			                Object valor=null;
			                 if(tablaSimbolosLocales!=null)
			                {  
			                        if(!returnif)
			                        { 
			                                if(tablaSimbolosLocales.get((((Regreso_ifContext)_localctx).REGRESO!=null?((Regreso_ifContext)_localctx).REGRESO.getText():null))!=null){
			                                        if(((Regreso_ifContext)_localctx).tipoAsignacionVariable.value!=null){
			                                                if(((Regreso_ifContext)_localctx).tipoAsignacionVariable.value.value!=null)
			                                                {
			                                                                if (!tablaSimbolosLocales.get((((Regreso_ifContext)_localctx).REGRESO!=null?((Regreso_ifContext)_localctx).REGRESO.getText():null)).getClass().getSimpleName().equals(((Regreso_ifContext)_localctx).tipoAsignacionVariable.value.value.getClass().getSimpleName()) ){
			                                                                valor=((Regreso_ifContext)_localctx).tipoAsignacionVariable.value.value.getClass().getSimpleName()+" no compatible con "+tablaSimbolosLocales.get((((Regreso_ifContext)_localctx).REGRESO!=null?((Regreso_ifContext)_localctx).REGRESO.getText():null)).getClass().getSimpleName();
			                                                                errorif=true;      
			                                                                String mensaje =  (((Regreso_ifContext)_localctx).REGRESO!=null?((Regreso_ifContext)_localctx).REGRESO.getText():null) + " "  + ((Regreso_ifContext)_localctx).tipoAsignacionVariable.value.value + " " +(((Regreso_ifContext)_localctx).FINI_NSTRUCCION!=null?((Regreso_ifContext)_localctx).FINI_NSTRUCCION.getText():null); 
			                                                                }else{
			                                                                        valor="Guardando en tabla: " + (((Regreso_ifContext)_localctx).REGRESO!=null?((Regreso_ifContext)_localctx).REGRESO.getText():null) + " -> " + ((Regreso_ifContext)_localctx).tipoAsignacionVariable.value.value;
			                                                                        tablaSimbolosLocales.put((((Regreso_ifContext)_localctx).REGRESO!=null?((Regreso_ifContext)_localctx).REGRESO.getText():null), ((Regreso_ifContext)_localctx).tipoAsignacionVariable.value.value);
			                                                                        String returnn=(((Regreso_ifContext)_localctx).REGRESO!=null?((Regreso_ifContext)_localctx).REGRESO.getText():null)+" "+(((Regreso_ifContext)_localctx).tipoAsignacionVariable!=null?_input.getText(((Regreso_ifContext)_localctx).tipoAsignacionVariable.start,((Regreso_ifContext)_localctx).tipoAsignacionVariable.stop):null)+" ;";
			                                                                        instrucciones.add(returnn); tipoInstruccion.add(0); returnif=true;
			                                                                }
			                                                }
			                                        }
			                                }else{
			                                        if (((Regreso_ifContext)_localctx).tipoAsignacionVariable != null) {
			                                                errorif=true;((Regreso_ifContext)_localctx).error2 = true;
			                                        }else{
			                                                returnif=true;  String returnn=(((Regreso_ifContext)_localctx).REGRESO!=null?((Regreso_ifContext)_localctx).REGRESO.getText():null)+";"; instrucciones.add(returnn); tipoInstruccion.add(0);
			                                        }    
			                                }
			                        } else{
			                                errorif=true; ((Regreso_ifContext)_localctx).error1 = true;   
			                        }
			                }else{
			                        ((Regreso_ifContext)_localctx).error3 = true;errorif=true;          
			                }    
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Impresion_consolaContext extends ParserRuleContext {
		public Resultado value;
		public Tipo_impresionContext t1;
		public Tipos_impresionContext t2;
		public Tipo_impresionContext tipo_impresion;
		public TerminalNode CONSOLE() { return getToken(TipeScriptParser.CONSOLE, 0); }
		public TerminalNode LOG() { return getToken(TipeScriptParser.LOG, 0); }
		public TerminalNode PAR1() { return getToken(TipeScriptParser.PAR1, 0); }
		public TerminalNode PAR2() { return getToken(TipeScriptParser.PAR2, 0); }
		public TerminalNode FINI_NSTRUCCION() { return getToken(TipeScriptParser.FINI_NSTRUCCION, 0); }
		public Tipo_impresionContext tipo_impresion() {
			return getRuleContext(Tipo_impresionContext.class,0);
		}
		public Tipos_impresionContext tipos_impresion() {
			return getRuleContext(Tipos_impresionContext.class,0);
		}
		public Impresion_consolaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresion_consola; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterImpresion_consola(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitImpresion_consola(this);
		}
	}

	public final Impresion_consolaContext impresion_consola() throws RecognitionException {
		Impresion_consolaContext _localctx = new Impresion_consolaContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_impresion_consola);
		try {
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(284);
				match(CONSOLE);
				setState(285);
				match(T__0);
				setState(286);
				match(LOG);
				setState(287);
				match(PAR1);
				setState(288);
				((Impresion_consolaContext)_localctx).t1 = tipo_impresion();
				setState(289);
				((Impresion_consolaContext)_localctx).t2 = tipos_impresion();
				setState(290);
				match(PAR2);
				setState(291);
				match(FINI_NSTRUCCION);
				   
				        Object valor = (((Impresion_consolaContext)_localctx).t1!=null?_input.getText(((Impresion_consolaContext)_localctx).t1.start,((Impresion_consolaContext)_localctx).t1.stop):null)+" "+((Impresion_consolaContext)_localctx).t2.value ;
				        ((Impresion_consolaContext)_localctx).value =  new Resultado(valor, "ss");
				        _localctx.value.setBandera2(true);
				 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(294);
				match(CONSOLE);
				setState(295);
				match(T__0);
				setState(296);
				match(LOG);
				setState(297);
				match(PAR1);
				setState(298);
				((Impresion_consolaContext)_localctx).tipo_impresion = tipo_impresion();
				setState(299);
				match(PAR2);
				setState(300);
				match(FINI_NSTRUCCION);
				 
				    if(((Impresion_consolaContext)_localctx).tipo_impresion.value != null && ((Impresion_consolaContext)_localctx).tipo_impresion.value.value != null){
				         Object valor = null;
				         ((Impresion_consolaContext)_localctx).value =  new Resultado(valor, "ss");
				        if(((Impresion_consolaContext)_localctx).tipo_impresion.value.isBandera1()){
				                  _localctx.value.setBandera1(true);
				        }
				    } else{
				         Object valor = null;
				         ((Impresion_consolaContext)_localctx).value =  new Resultado(valor, "ss");
				          _localctx.value.setBandera1(true);
				    }

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tipos_impresionContext extends ParserRuleContext {
		public String value;
		public Tipo_impresionContext tipo_impresion;
		public Tipo_impresiones_primaContext tipo_impresiones_prima;
		public Tipo_impresionContext tipo_impresion() {
			return getRuleContext(Tipo_impresionContext.class,0);
		}
		public Tipo_impresiones_primaContext tipo_impresiones_prima() {
			return getRuleContext(Tipo_impresiones_primaContext.class,0);
		}
		public Tipos_impresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterTipos_impresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitTipos_impresion(this);
		}
	}

	public final Tipos_impresionContext tipos_impresion() throws RecognitionException {
		Tipos_impresionContext _localctx = new Tipos_impresionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_tipos_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
			((Tipos_impresionContext)_localctx).tipo_impresion = tipo_impresion();
			setState(306);
			((Tipos_impresionContext)_localctx).tipo_impresiones_prima = tipo_impresiones_prima();
			 ((Tipos_impresionContext)_localctx).value =  (((Tipos_impresionContext)_localctx).tipo_impresion!=null?_input.getText(((Tipos_impresionContext)_localctx).tipo_impresion.start,((Tipos_impresionContext)_localctx).tipo_impresion.stop):null)+" "+(((Tipos_impresionContext)_localctx).tipo_impresiones_prima!=null?_input.getText(((Tipos_impresionContext)_localctx).tipo_impresiones_prima.start,((Tipos_impresionContext)_localctx).tipo_impresiones_prima.stop):null);     
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_impresiones_primaContext extends ParserRuleContext {
		public String value;
		public Tipo_impresionContext tipo_impresion;
		public Tipo_impresionContext tipo_impresion() {
			return getRuleContext(Tipo_impresionContext.class,0);
		}
		public Tipo_impresiones_primaContext tipo_impresiones_prima() {
			return getRuleContext(Tipo_impresiones_primaContext.class,0);
		}
		public Tipo_impresiones_primaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_impresiones_prima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterTipo_impresiones_prima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitTipo_impresiones_prima(this);
		}
	}

	public final Tipo_impresiones_primaContext tipo_impresiones_prima() throws RecognitionException {
		Tipo_impresiones_primaContext _localctx = new Tipo_impresiones_primaContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_tipo_impresiones_prima);
		try {
			setState(314);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOS:
			case PAR1:
			case DECIMAL:
			case ENTERO:
			case CADENA:
			case CARACTER:
			case CHAR:
			case BOOLEAN:
			case TRUE:
			case FALSE:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(309);
				((Tipo_impresiones_primaContext)_localctx).tipo_impresion = tipo_impresion();
				setState(310);
				tipo_impresiones_prima();
				 ((Tipo_impresiones_primaContext)_localctx).value =  String.valueOf((((Tipo_impresiones_primaContext)_localctx).tipo_impresion!=null?_input.getText(((Tipo_impresiones_primaContext)_localctx).tipo_impresion.start,((Tipo_impresiones_primaContext)_localctx).tipo_impresion.stop):null));
				}
				break;
			case PAR2:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_impresionContext extends ParserRuleContext {
		public Resultado value;
		public Token CADENA;
		public Token IDENTIFICADOR;
		public ExpresionContext expresion;
		public Token CHAR;
		public TipoBoleanoContext tipoBoleano;
		public TerminalNode CADENA() { return getToken(TipeScriptParser.CADENA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(TipeScriptParser.IDENTIFICADOR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(TipeScriptParser.CHAR, 0); }
		public TipoBoleanoContext tipoBoleano() {
			return getRuleContext(TipoBoleanoContext.class,0);
		}
		public Tipo_impresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_impresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterTipo_impresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitTipo_impresion(this);
		}
	}

	public final Tipo_impresionContext tipo_impresion() throws RecognitionException {
		Tipo_impresionContext _localctx = new Tipo_impresionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tipo_impresion);
		try {
			setState(328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(316);
				((Tipo_impresionContext)_localctx).CADENA = match(CADENA);
				 
				                        Object valor = null;
				                        valor=(((Tipo_impresionContext)_localctx).CADENA!=null?((Tipo_impresionContext)_localctx).CADENA.getText():null) ; 
				                        ((Tipo_impresionContext)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(318);
				((Tipo_impresionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				   Map <String,Object> tablaEnTurno=null;

				                         if(tablaSimbolosLocales!=null)
				                        {    
				                                tablaEnTurno=tablaSimbolosLocales;
				                                 if (!tablaEnTurno.containsKey((((Tipo_impresionContext)_localctx).IDENTIFICADOR!=null?((Tipo_impresionContext)_localctx).IDENTIFICADOR.getText():null))) {
				                                        tablaEnTurno=tablaSimbolos;
				                                }
				                                
				                              

				                                

				                               
				                        }else
				                        {  
				                               
				                                tablaEnTurno=tablaSimbolos;
				                        }


				                        boolean ban1=false;
				                        Object valor = null;
				                        if (!tablaEnTurno.containsKey((((Tipo_impresionContext)_localctx).IDENTIFICADOR!=null?((Tipo_impresionContext)_localctx).IDENTIFICADOR.getText():null))) {
				                               
				                                ban1=true;
				                        } else {
				                                valor = tablaEnTurno.get((((Tipo_impresionContext)_localctx).IDENTIFICADOR!=null?((Tipo_impresionContext)_localctx).IDENTIFICADOR.getText():null));
				                        }
				                        ((Tipo_impresionContext)_localctx).value =  new Resultado(valor, ""); 
				                        _localctx.value.setBandera1(ban1);

				                
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(320);
				((Tipo_impresionContext)_localctx).expresion = expresion();
				       

				                        Object valor = null;
				                        if(((Tipo_impresionContext)_localctx).expresion.value!=null){
				                               
				                                valor=((Tipo_impresionContext)_localctx).expresion.value.value ;          
				                        }
				                        ((Tipo_impresionContext)_localctx).value =  new Resultado(valor, ""); 
				                       
				                
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(323);
				((Tipo_impresionContext)_localctx).CHAR = match(CHAR);
				       

				                        Object valor = null;
				                        valor=(String)(((Tipo_impresionContext)_localctx).CHAR!=null?((Tipo_impresionContext)_localctx).CHAR.getText():null) ;  
				                        ((Tipo_impresionContext)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(325);
				((Tipo_impresionContext)_localctx).tipoBoleano = tipoBoleano();
				       

				                        Object valor = null;
				                        valor= Boolean.parseBoolean((((Tipo_impresionContext)_localctx).tipoBoleano!=null?_input.getText(((Tipo_impresionContext)_localctx).tipoBoleano.start,((Tipo_impresionContext)_localctx).tipoBoleano.stop):null));  
				                        ((Tipo_impresionContext)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CreacionVariableContext extends ParserRuleContext {
		public Resultado value;
		public Token VAR;
		public Token IDENTIFICADOR;
		public Token DOS_PUNTOS;
		public TipoContext tipo;
		public Token ASIGNACIO;
		public TipoAsignacionVariableContext tipoAsignacionVariable;
		public Token FINI_NSTRUCCION;
		public TerminalNode VAR() { return getToken(TipeScriptParser.VAR, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(TipeScriptParser.IDENTIFICADOR, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(TipeScriptParser.DOS_PUNTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode ASIGNACIO() { return getToken(TipeScriptParser.ASIGNACIO, 0); }
		public TipoAsignacionVariableContext tipoAsignacionVariable() {
			return getRuleContext(TipoAsignacionVariableContext.class,0);
		}
		public TerminalNode FINI_NSTRUCCION() { return getToken(TipeScriptParser.FINI_NSTRUCCION, 0); }
		public CreacionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_creacionVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterCreacionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitCreacionVariable(this);
		}
	}

	public final CreacionVariableContext creacionVariable() throws RecognitionException {
		CreacionVariableContext _localctx = new CreacionVariableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_creacionVariable);
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(330);
				((CreacionVariableContext)_localctx).VAR = match(VAR);
				setState(331);
				((CreacionVariableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(332);
				((CreacionVariableContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
				setState(333);
				((CreacionVariableContext)_localctx).tipo = tipo();
				setState(334);
				((CreacionVariableContext)_localctx).ASIGNACIO = match(ASIGNACIO);
				setState(335);
				((CreacionVariableContext)_localctx).tipoAsignacionVariable = tipoAsignacionVariable();
				setState(336);
				((CreacionVariableContext)_localctx).FINI_NSTRUCCION = match(FINI_NSTRUCCION);
				    
				                        Map <String,Object> tablaEnTurno=null;

				                     if(tablaSimbolosLocales!=null)
				                        {    
				                                tablaEnTurno=tablaSimbolosLocales;
				                                 
				                        }else
				                        {  
				                               
				                                tablaEnTurno=tablaSimbolos;
				                        }

				                        String valor = null;

				                        if(((CreacionVariableContext)_localctx).tipoAsignacionVariable.value!=null){
				                            if(((CreacionVariableContext)_localctx).tipoAsignacionVariable.value.value!=null)
				                                {
				                                        if (!((CreacionVariableContext)_localctx).tipo.value.equals(((CreacionVariableContext)_localctx).tipoAsignacionVariable.value.value.getClass().getSimpleName())) {
				                                        valor=((CreacionVariableContext)_localctx).tipoAsignacionVariable.value.value.getClass().getSimpleName()+" no compatible con "+((CreacionVariableContext)_localctx).tipo.value;

				                                        String mensaje = (((CreacionVariableContext)_localctx).VAR!=null?((CreacionVariableContext)_localctx).VAR.getText():null) + " " + (((CreacionVariableContext)_localctx).IDENTIFICADOR!=null?((CreacionVariableContext)_localctx).IDENTIFICADOR.getText():null) + " " + 
				                                        (((CreacionVariableContext)_localctx).DOS_PUNTOS!=null?((CreacionVariableContext)_localctx).DOS_PUNTOS.getText():null) + " " + ((CreacionVariableContext)_localctx).tipo.value + " " + 
				                                        (((CreacionVariableContext)_localctx).ASIGNACIO!=null?((CreacionVariableContext)_localctx).ASIGNACIO.getText():null) + " " + ((CreacionVariableContext)_localctx).tipoAsignacionVariable.value.value + " " +
				                                        (((CreacionVariableContext)_localctx).FINI_NSTRUCCION!=null?((CreacionVariableContext)_localctx).FINI_NSTRUCCION.getText():null); 


				                                        ((CreacionVariableContext)_localctx).value =  new Resultado(mensaje); 
				                                        _localctx.value.añadirMensaje(valor);        
				                                        _localctx.value.setBandera1(true);
				                                        _localctx.value.setBandera0(true);
				                                        }else{
				                                        
				                                        if(tablaEnTurno.containsKey((((CreacionVariableContext)_localctx).IDENTIFICADOR!=null?((CreacionVariableContext)_localctx).IDENTIFICADOR.getText():null))){

				                                                
				                                                        ((CreacionVariableContext)_localctx).value =  new Resultado(valor, (((CreacionVariableContext)_localctx).IDENTIFICADOR!=null?((CreacionVariableContext)_localctx).IDENTIFICADOR.getText():null)); 
				                                                        _localctx.value.setBandera5(true);
				                                                        _localctx.value.setBandera0(true);
				                                        }else{

				                                                        valor="Guardando en tabla: " + (((CreacionVariableContext)_localctx).IDENTIFICADOR!=null?((CreacionVariableContext)_localctx).IDENTIFICADOR.getText():null) + " -> " + ((CreacionVariableContext)_localctx).tipoAsignacionVariable.value.value;
				                                                        tablaEnTurno.put((((CreacionVariableContext)_localctx).IDENTIFICADOR!=null?((CreacionVariableContext)_localctx).IDENTIFICADOR.getText():null), ((CreacionVariableContext)_localctx).tipoAsignacionVariable.value.value);
				                                                        ((CreacionVariableContext)_localctx).value =  new Resultado(valor, (((CreacionVariableContext)_localctx).IDENTIFICADOR!=null?((CreacionVariableContext)_localctx).IDENTIFICADOR.getText():null)); 
				                                        }
				                                        
				                                                
				                                        }
				                                }
				                        }
				   
				                
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(339);
				((CreacionVariableContext)_localctx).VAR = match(VAR);
				setState(340);
				((CreacionVariableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(341);
				((CreacionVariableContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
				setState(342);
				((CreacionVariableContext)_localctx).ASIGNACIO = match(ASIGNACIO);
				setState(343);
				((CreacionVariableContext)_localctx).tipoAsignacionVariable = tipoAsignacionVariable();
				setState(344);
				((CreacionVariableContext)_localctx).FINI_NSTRUCCION = match(FINI_NSTRUCCION);
				     
				                        String topoAsig="----";
				                        if(((CreacionVariableContext)_localctx).tipoAsignacionVariable.value!=null){
				                                topoAsig=((CreacionVariableContext)_localctx).tipoAsignacionVariable.value.value.toString();
				                        }
				                        String mensaje = (((CreacionVariableContext)_localctx).VAR!=null?((CreacionVariableContext)_localctx).VAR.getText():null) + " " + (((CreacionVariableContext)_localctx).IDENTIFICADOR!=null?((CreacionVariableContext)_localctx).IDENTIFICADOR.getText():null) + " " + 
				                        (((CreacionVariableContext)_localctx).DOS_PUNTOS!=null?((CreacionVariableContext)_localctx).DOS_PUNTOS.getText():null) + " " + 
				                        (((CreacionVariableContext)_localctx).ASIGNACIO!=null?((CreacionVariableContext)_localctx).ASIGNACIO.getText():null) + " " +  topoAsig + " " +
				                        (((CreacionVariableContext)_localctx).FINI_NSTRUCCION!=null?((CreacionVariableContext)_localctx).FINI_NSTRUCCION.getText():null); 
				                        Object valor="tipo no reconocido";
				                        ((CreacionVariableContext)_localctx).value =  new Resultado(valor, mensaje); 
				                        _localctx.value.setBandera2(true);
				                        _localctx.value.setBandera0(true);
				                
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(347);
				((CreacionVariableContext)_localctx).VAR = match(VAR);
				setState(348);
				((CreacionVariableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(349);
				((CreacionVariableContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
				setState(350);
				((CreacionVariableContext)_localctx).tipo = tipo();
				setState(351);
				((CreacionVariableContext)_localctx).ASIGNACIO = match(ASIGNACIO);
				setState(352);
				((CreacionVariableContext)_localctx).FINI_NSTRUCCION = match(FINI_NSTRUCCION);
				       
				                        String mensaje = (((CreacionVariableContext)_localctx).VAR!=null?((CreacionVariableContext)_localctx).VAR.getText():null) + " " + (((CreacionVariableContext)_localctx).IDENTIFICADOR!=null?((CreacionVariableContext)_localctx).IDENTIFICADOR.getText():null) + " " + 
				                        (((CreacionVariableContext)_localctx).DOS_PUNTOS!=null?((CreacionVariableContext)_localctx).DOS_PUNTOS.getText():null) + " " + ((CreacionVariableContext)_localctx).tipo.value + " "+
				                        (((CreacionVariableContext)_localctx).ASIGNACIO!=null?((CreacionVariableContext)_localctx).ASIGNACIO.getText():null) +  " " + (((CreacionVariableContext)_localctx).FINI_NSTRUCCION!=null?((CreacionVariableContext)_localctx).FINI_NSTRUCCION.getText():null); 

				                        Object valor="nada asignado no reconocido";
				                        ((CreacionVariableContext)_localctx).value =  new Resultado(valor, mensaje);  _localctx.value.setBandera3(true); _localctx.value.setBandera0(true);
				                
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(355);
				((CreacionVariableContext)_localctx).VAR = match(VAR);
				setState(356);
				((CreacionVariableContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
				setState(357);
				((CreacionVariableContext)_localctx).tipo = tipo();
				setState(358);
				((CreacionVariableContext)_localctx).ASIGNACIO = match(ASIGNACIO);
				setState(359);
				((CreacionVariableContext)_localctx).tipoAsignacionVariable = tipoAsignacionVariable();
				setState(360);
				((CreacionVariableContext)_localctx).FINI_NSTRUCCION = match(FINI_NSTRUCCION);
				     
				                        
				                        String mensaje = (((CreacionVariableContext)_localctx).VAR!=null?((CreacionVariableContext)_localctx).VAR.getText():null) + " " + (((CreacionVariableContext)_localctx).DOS_PUNTOS!=null?((CreacionVariableContext)_localctx).DOS_PUNTOS.getText():null) + " " + ((CreacionVariableContext)_localctx).tipo.value + " " +  (((CreacionVariableContext)_localctx).ASIGNACIO!=null?((CreacionVariableContext)_localctx).ASIGNACIO.getText():null) + " " + ((CreacionVariableContext)_localctx).tipoAsignacionVariable.value.value + " " +(((CreacionVariableContext)_localctx).FINI_NSTRUCCION!=null?((CreacionVariableContext)_localctx).FINI_NSTRUCCION.getText():null); 
				                        Object valor="ID no reconocido"; ((CreacionVariableContext)_localctx).value =  new Resultado(valor, mensaje);  _localctx.value.setBandera4(true); _localctx.value.setBandera0(true);
				                
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionVariableContext extends ParserRuleContext {
		public Resultado value;
		public Token IDENTIFICADOR;
		public Token ASIGNACIO;
		public TipoAsignacionVariableContext tipoAsignacionVariable;
		public Token FINI_NSTRUCCION;
		public TerminalNode IDENTIFICADOR() { return getToken(TipeScriptParser.IDENTIFICADOR, 0); }
		public TerminalNode ASIGNACIO() { return getToken(TipeScriptParser.ASIGNACIO, 0); }
		public TipoAsignacionVariableContext tipoAsignacionVariable() {
			return getRuleContext(TipoAsignacionVariableContext.class,0);
		}
		public TerminalNode FINI_NSTRUCCION() { return getToken(TipeScriptParser.FINI_NSTRUCCION, 0); }
		public AsignacionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacionVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterAsignacionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitAsignacionVariable(this);
		}
	}

	public final AsignacionVariableContext asignacionVariable() throws RecognitionException {
		AsignacionVariableContext _localctx = new AsignacionVariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_asignacionVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(365);
			((AsignacionVariableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(366);
			((AsignacionVariableContext)_localctx).ASIGNACIO = match(ASIGNACIO);
			setState(367);
			((AsignacionVariableContext)_localctx).tipoAsignacionVariable = tipoAsignacionVariable();
			setState(368);
			((AsignacionVariableContext)_localctx).FINI_NSTRUCCION = match(FINI_NSTRUCCION);
			       
			                        boolean funcion=false;
			                        Map <String,Object> tablaEnTurno=null;
			                        
			                        if(tablaSimbolosLocales!=null)
			                        {     
			                                tablaEnTurno=tablaSimbolosLocales;
			                                 if (!tablaEnTurno.containsKey((((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null))) {
			                                        String mensaje= (((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null); ((AsignacionVariableContext)_localctx).value =  new Resultado(mensaje);   _localctx.value.setBandera0(true); _localctx.value.setBandera2(true);  tablaEnTurno=tablaSimbolos;
			                                }
			                        }else
			                        { 
			                                tablaEnTurno=tablaSimbolos;
			                        }
			                
			                        if (!tablaEnTurno.containsKey((((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null))) {
			                                String mensaje= (((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null);  ((AsignacionVariableContext)_localctx).value =  new Resultado(mensaje);  _localctx.value.setBandera0(true);_localctx.value.setBandera2(true);
			                        } else {
			                                        String valor = null;
			                                if(((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value!=null){

			                                        if(((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value!=null)
			                                        {
			                                                if (!tablaEnTurno.get((((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null)).getClass().getSimpleName().equals(((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value.getClass().getSimpleName()) ){
			                                                
			                                                valor=((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value.getClass().getSimpleName()+" no compatible con "+tablaEnTurno.get((((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null)).getClass().getSimpleName();

			                                                String mensaje =  (((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null) + " " + 
			                                                (((AsignacionVariableContext)_localctx).ASIGNACIO!=null?((AsignacionVariableContext)_localctx).ASIGNACIO.getText():null) + " " + ((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value + " " +
			                                                (((AsignacionVariableContext)_localctx).FINI_NSTRUCCION!=null?((AsignacionVariableContext)_localctx).FINI_NSTRUCCION.getText():null); 


			                                                ((AsignacionVariableContext)_localctx).value =  new Resultado(mensaje);  _localctx.value.añadirMensaje(valor);   _localctx.value.setBandera1(true); _localctx.value.setBandera0(true);
			                                                }else{
			                                                        valor="Guardando en tabla: " + (((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null) + " -> " + ((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value;
			                                                        tablaEnTurno.put((((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null), ((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value);
			                                                        ((AsignacionVariableContext)_localctx).value =  new Resultado(valor, ""); 
			                                                }
			                                        }

			                                }else{
			                                        ((AsignacionVariableContext)_localctx).value =  new Resultado();   
			                                        _localctx.value.setBandera3(true);
			                                        _localctx.value.setBandera0(true);
			                                } 
			                        }
			                
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoAsignacionVariableContext extends ParserRuleContext {
		public Resultado value;
		public boolean errorId = false;
		public Token CADENA;
		public Token CARACTER;
		public TipoBoleanoContext tipoBoleano;
		public Token IDENTIFICADOR;
		public Llamada_funcionContext llamada_funcion;
		public ExpresionContext expresion;
		public TerminalNode CADENA() { return getToken(TipeScriptParser.CADENA, 0); }
		public TerminalNode CARACTER() { return getToken(TipeScriptParser.CARACTER, 0); }
		public TipoBoleanoContext tipoBoleano() {
			return getRuleContext(TipoBoleanoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(TipeScriptParser.IDENTIFICADOR, 0); }
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TipoAsignacionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoAsignacionVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterTipoAsignacionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitTipoAsignacionVariable(this);
		}
	}

	public final TipoAsignacionVariableContext tipoAsignacionVariable() throws RecognitionException {
		TipoAsignacionVariableContext _localctx = new TipoAsignacionVariableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tipoAsignacionVariable);
		try {
			setState(386);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(371);
				((TipoAsignacionVariableContext)_localctx).CADENA = match(CADENA);
				 
				                        Object valor = null;
				                        valor=(String)(((TipoAsignacionVariableContext)_localctx).CADENA!=null?((TipoAsignacionVariableContext)_localctx).CADENA.getText():null) ;  
				                        ((TipoAsignacionVariableContext)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(373);
				((TipoAsignacionVariableContext)_localctx).CARACTER = match(CARACTER);
				       Object valor = null;
				                        valor=(((TipoAsignacionVariableContext)_localctx).CARACTER!=null?((TipoAsignacionVariableContext)_localctx).CARACTER.getText():null).charAt(0);  
				                        ((TipoAsignacionVariableContext)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(375);
				((TipoAsignacionVariableContext)_localctx).tipoBoleano = tipoBoleano();
				 
				                        Object valor = null;
				                        valor= Boolean.parseBoolean((((TipoAsignacionVariableContext)_localctx).tipoBoleano!=null?_input.getText(((TipoAsignacionVariableContext)_localctx).tipoBoleano.start,((TipoAsignacionVariableContext)_localctx).tipoBoleano.stop):null)); 
				                        ((TipoAsignacionVariableContext)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(378);
				((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);


				   System.out.println("ingrse se algo"+(((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null));
				                 Map <String,Object> tablaEnTurno=null;
				                        
				                if(tablaSimbolosLocales!=null)
				                {   
				                        tablaEnTurno=tablaSimbolosLocales;
				                                if (!tablaEnTurno.containsKey((((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null))) {
				                
				                                tablaEnTurno=tablaSimbolos;
				                        }
				                }else
				                {  
				                        tablaEnTurno=tablaSimbolos;
				                        System.out.println("3");
				                }
				                        Object valor = null;
				                        if (tablaEnTurno.containsKey((((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null))) {
				                                valor = tablaEnTurno.get((((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null)); ((TipoAsignacionVariableContext)_localctx).value =  new Resultado(valor, "");   
				                        } else{
				                                ((TipoAsignacionVariableContext)_localctx).errorId = true;    System.out.println("5");
				                        }
				                       
				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(380);
				((TipoAsignacionVariableContext)_localctx).llamada_funcion = llamada_funcion();

				                
				                Object valor = null;
				                if(((TipoAsignacionVariableContext)_localctx).llamada_funcion.exito){
				                        if(((TipoAsignacionVariableContext)_localctx).llamada_funcion.retorno!=null){
				                                valor=((TipoAsignacionVariableContext)_localctx).llamada_funcion.retorno;  ((TipoAsignacionVariableContext)_localctx).value =  new Resultado(valor, "");          
				                        }
				                }
				        
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(383);
				((TipoAsignacionVariableContext)_localctx).expresion = expresion();
				 
				                        Object valor = null;

				                        if(((TipoAsignacionVariableContext)_localctx).expresion.value!=null){
				                                if(((TipoAsignacionVariableContext)_localctx).expresion.value.value!=null){
				                                        valor=((TipoAsignacionVariableContext)_localctx).expresion.value.value ;    ((TipoAsignacionVariableContext)_localctx).value =  new Resultado(valor, "");          
				                                }
				                        }
				                
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoBoleanoContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(TipeScriptParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TipeScriptParser.FALSE, 0); }
		public TipoBoleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoBoleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterTipoBoleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitTipoBoleano(this);
		}
	}

	public final TipoBoleanoContext tipoBoleano() throws RecognitionException {
		TipoBoleanoContext _localctx = new TipoBoleanoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_tipoBoleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(388);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public Object value;
		public TerminalNode NUMBER() { return getToken(TipeScriptParser.NUMBER, 0); }
		public TerminalNode STRING() { return getToken(TipeScriptParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(TipeScriptParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(TipeScriptParser.BOOLEAN, 0); }
		public TerminalNode VOID() { return getToken(TipeScriptParser.VOID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitTipo(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_tipo);
		try {
			setState(400);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(390);
				match(NUMBER);
				((TipoContext)_localctx).value = "Double";
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(STRING);
				((TipoContext)_localctx).value = "String";
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(394);
				match(CHAR);
				((TipoContext)_localctx).value = "Character";
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(396);
				match(BOOLEAN);
				((TipoContext)_localctx).value = "Boolean";
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(398);
				match(VOID);
				((TipoContext)_localctx).value = "void";
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionContext extends ParserRuleContext {
		public Resultado value;
		public TerminoN2Context t1;
		public TerminoN2Context t2;
		public List<TerminoN2Context> terminoN2() {
			return getRuleContexts(TerminoN2Context.class);
		}
		public TerminoN2Context terminoN2(int i) {
			return getRuleContext(TerminoN2Context.class,i);
		}
		public List<TerminalNode> MAS() { return getTokens(TipeScriptParser.MAS); }
		public TerminalNode MAS(int i) {
			return getToken(TipeScriptParser.MAS, i);
		}
		public List<TerminalNode> MENOS() { return getTokens(TipeScriptParser.MENOS); }
		public TerminalNode MENOS(int i) {
			return getToken(TipeScriptParser.MENOS, i);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitExpresion(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expresion);
		int _la;
		try {
			int _alt;
			setState(424);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(402);
				((ExpresionContext)_localctx).t1 = terminoN2();

				                         Object valort1 = null;
				                        if(((ExpresionContext)_localctx).t1.value.value!=null){
				                                  valort1  = ((ExpresionContext)_localctx).t1.value.value;
				                                  ((ExpresionContext)_localctx).value =  new Resultado(valort1, ""); 
				                        }      
				                         ((ExpresionContext)_localctx).value =  new Resultado(valort1, "");   
				                
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MAS) {
					{
					{
					setState(404);
					match(MAS);
					setState(405);
					((ExpresionContext)_localctx).t2 = terminoN2();
					 Object valor = null;
					                        if(((ExpresionContext)_localctx).t2.value.value!=null && _localctx.value.value!=null){
					                                  valor  = (Double)_localctx.value.value+ (Double)((ExpresionContext)_localctx).t2.value.value; ((ExpresionContext)_localctx).value =  new Resultado(valor, ""); 
					                        }      
					                         ((ExpresionContext)_localctx).value =  new Resultado(valor, ""); 
					                
					}
					}
					setState(412);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(413);
				((ExpresionContext)_localctx).t1 = terminoN2();

				                         Object valort1 = null;
				                        if(((ExpresionContext)_localctx).t1.value.value!=null){
				                                  valort1  = ((ExpresionContext)_localctx).t1.value.value;   ((ExpresionContext)_localctx).value =  new Resultado(valort1, ""); 
				                        }      
				                         ((ExpresionContext)_localctx).value =  new Resultado(valort1, ""); 
				                
				setState(421);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(415);
						match(MENOS);
						setState(416);
						((ExpresionContext)_localctx).t2 = terminoN2();
						 Object valor = null;
						                        if(((ExpresionContext)_localctx).t2.value.value!=null && _localctx.value.value!=null){
						                                  valor  = (Double)_localctx.value.value- (Double)((ExpresionContext)_localctx).t2.value.value;   ((ExpresionContext)_localctx).value =  new Resultado(valor, ""); 
						                        }      
						                         ((ExpresionContext)_localctx).value =  new Resultado(valor, "");  
						                
						}
						} 
					}
					setState(423);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoN2Context extends ParserRuleContext {
		public Resultado value;
		public TerminoN3Context t1;
		public TerminoN3Context t2;
		public List<TerminoN3Context> terminoN3() {
			return getRuleContexts(TerminoN3Context.class);
		}
		public TerminoN3Context terminoN3(int i) {
			return getRuleContext(TerminoN3Context.class,i);
		}
		public List<TerminalNode> MUL() { return getTokens(TipeScriptParser.MUL); }
		public TerminalNode MUL(int i) {
			return getToken(TipeScriptParser.MUL, i);
		}
		public List<TerminalNode> DIV() { return getTokens(TipeScriptParser.DIV); }
		public TerminalNode DIV(int i) {
			return getToken(TipeScriptParser.DIV, i);
		}
		public TerminoN2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminoN2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterTerminoN2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitTerminoN2(this);
		}
	}

	public final TerminoN2Context terminoN2() throws RecognitionException {
		TerminoN2Context _localctx = new TerminoN2Context(_ctx, getState());
		enterRule(_localctx, 56, RULE_terminoN2);
		int _la;
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(426);
				((TerminoN2Context)_localctx).t1 = terminoN3();

				                         Object valort1 = null;
				                        if(((TerminoN2Context)_localctx).t1.value.value!=null ){
				                                  valort1  = ((TerminoN2Context)_localctx).t1.value.value;  ((TerminoN2Context)_localctx).value =  new Resultado(valort1, ""); 
				                        }      
				                         ((TerminoN2Context)_localctx).value =  new Resultado(valort1, ""); 
				                
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MUL) {
					{
					{
					setState(428);
					match(MUL);
					setState(429);
					((TerminoN2Context)_localctx).t2 = terminoN3();
					 Object valor = null;
					                        if(((TerminoN2Context)_localctx).t2.value.value!=null && _localctx.value.value!=null){
					                                  valor  = (Double)_localctx.value.value* (Double)((TerminoN2Context)_localctx).t2.value.value;((TerminoN2Context)_localctx).value =  new Resultado(valor, ""); 
					                        }      
					                         ((TerminoN2Context)_localctx).value =  new Resultado(valor, "");   
					                
					}
					}
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(437);
				((TerminoN2Context)_localctx).t1 = terminoN3();
				        Object valort1 = null;
				                        if(((TerminoN2Context)_localctx).t1.value.value!=null ){
				                                   valort1  =  ((TerminoN2Context)_localctx).t1.value.value;
				                        }     
				                         ((TerminoN2Context)_localctx).value =  new Resultado(valort1, "");   
				                
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV) {
					{
					{
					setState(439);
					match(DIV);
					setState(440);
					((TerminoN2Context)_localctx).t2 = terminoN3();
					 Object valor = null;
					                        if(((TerminoN2Context)_localctx).t2.value.value!=null && _localctx.value.value!=null){
					                                  valor  = (Double)_localctx.value.value / (Double)((TerminoN2Context)_localctx).t2.value.value; ((TerminoN2Context)_localctx).value =  new Resultado(valor, ""); 
					                        }
					                         ((TerminoN2Context)_localctx).value =  new Resultado(valor, ""); 
					                
					}
					}
					setState(447);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoN3Context extends ParserRuleContext {
		public Resultado value;
		public TerminoN4Context n1;
		public TerminoN4Context n2;
		public List<TerminoN4Context> terminoN4() {
			return getRuleContexts(TerminoN4Context.class);
		}
		public TerminoN4Context terminoN4(int i) {
			return getRuleContext(TerminoN4Context.class,i);
		}
		public List<TerminalNode> POT() { return getTokens(TipeScriptParser.POT); }
		public TerminalNode POT(int i) {
			return getToken(TipeScriptParser.POT, i);
		}
		public TerminoN3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminoN3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterTerminoN3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitTerminoN3(this);
		}
	}

	public final TerminoN3Context terminoN3() throws RecognitionException {
		TerminoN3Context _localctx = new TerminoN3Context(_ctx, getState());
		enterRule(_localctx, 58, RULE_terminoN3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			((TerminoN3Context)_localctx).n1 = terminoN4();

			                         Object valorn1 = null;
			                        if(((TerminoN3Context)_localctx).n1.value.value!=null){
			                                valorn1 = ((TerminoN3Context)_localctx).n1.value.value; ((TerminoN3Context)_localctx).value =  new Resultado(valorn1, ""); 
			                        }     
			                         ((TerminoN3Context)_localctx).value =  new Resultado(valorn1, ""); 
			                        
			                        
			                
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POT) {
				{
				{
				setState(452);
				match(POT);
				setState(453);
				((TerminoN3Context)_localctx).n2 = terminoN4();
				  Object valor = null;
				                        if(((TerminoN3Context)_localctx).n2.value.value!=null && _localctx.value.value!=null ){  
				                               valor= Math.pow((Double)_localctx.value.value, (Double)((TerminoN3Context)_localctx).n2.value.value);    ((TerminoN3Context)_localctx).value =  new Resultado(valor, ""); 
				                        }      
				                         ((TerminoN3Context)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				}
				setState(460);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TerminoN4Context extends ParserRuleContext {
		public Resultado value;
		public NumeroContext n1;
		public NumeroContext n2;
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
		}
		public List<TerminalNode> MAYOR_QUE() { return getTokens(TipeScriptParser.MAYOR_QUE); }
		public TerminalNode MAYOR_QUE(int i) {
			return getToken(TipeScriptParser.MAYOR_QUE, i);
		}
		public List<TerminalNode> MENOR_QUE() { return getTokens(TipeScriptParser.MENOR_QUE); }
		public TerminalNode MENOR_QUE(int i) {
			return getToken(TipeScriptParser.MENOR_QUE, i);
		}
		public List<TerminalNode> ASIGNACIO() { return getTokens(TipeScriptParser.ASIGNACIO); }
		public TerminalNode ASIGNACIO(int i) {
			return getToken(TipeScriptParser.ASIGNACIO, i);
		}
		public List<TerminalNode> DIFERENTE() { return getTokens(TipeScriptParser.DIFERENTE); }
		public TerminalNode DIFERENTE(int i) {
			return getToken(TipeScriptParser.DIFERENTE, i);
		}
		public TerminoN4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_terminoN4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterTerminoN4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitTerminoN4(this);
		}
	}

	public final TerminoN4Context terminoN4() throws RecognitionException {
		TerminoN4Context _localctx = new TerminoN4Context(_ctx, getState());
		enterRule(_localctx, 60, RULE_terminoN4);
		int _la;
		try {
			setState(529);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				((TerminoN4Context)_localctx).n1 = numero();

				                         Object valorn1 = null;
				                        if(((TerminoN4Context)_localctx).n1.value.value!=null){
				                                valorn1 = (Double)((TerminoN4Context)_localctx).n1.value.value;  ((TerminoN4Context)_localctx).value =  new Resultado(valorn1, ""); 
				                        }      
				                         ((TerminoN4Context)_localctx).value =  new Resultado(valorn1, ""); 
				                        
				                        
				                
				setState(469);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MAYOR_QUE) {
					{
					{
					setState(463);
					match(MAYOR_QUE);
					setState(464);
					((TerminoN4Context)_localctx).n2 = numero();
					  Object valor = null;
					                        if(((TerminoN4Context)_localctx).n2.value.value!=null && _localctx.value.value!=null ){  
					                                valor  = (Double)_localctx.value.value > (Double)((TerminoN4Context)_localctx).n2.value.value; ((TerminoN4Context)_localctx).value =  new Resultado(valor, ""); 
					                        }       ((TerminoN4Context)_localctx).value =  new Resultado(valor, "");             
					                
					}
					}
					setState(471);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				((TerminoN4Context)_localctx).n1 = numero();

				                         Object valorn1 = null;
				                        if(((TerminoN4Context)_localctx).n1.value.value!=null){
				                                valorn1 = (Double)((TerminoN4Context)_localctx).n1.value.value;  ((TerminoN4Context)_localctx).value =  new Resultado(valorn1, ""); 
				                        }      
				                         ((TerminoN4Context)_localctx).value =  new Resultado(valorn1, ""); 
				                
				setState(480);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MENOR_QUE) {
					{
					{
					setState(474);
					match(MENOR_QUE);
					setState(475);
					((TerminoN4Context)_localctx).n2 = numero();
					  Object valor = null;
					                        if(((TerminoN4Context)_localctx).n2.value.value!=null && _localctx.value.value!=null ){  
					                                valor  = (Double)_localctx.value.value <  (Double)((TerminoN4Context)_localctx).n2.value.value;
					                                 ((TerminoN4Context)_localctx).value =  new Resultado(valor, ""); 
					                        }    
					                         ((TerminoN4Context)_localctx).value =  new Resultado(valor, "");            
					                
					}
					}
					setState(482);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(483);
				((TerminoN4Context)_localctx).n1 = numero();

				                         Object valorn1 = null;
				                        if(((TerminoN4Context)_localctx).n1.value.value!=null){
				                                valorn1 = (Double)((TerminoN4Context)_localctx).n1.value.value;
				                                 ((TerminoN4Context)_localctx).value =  new Resultado(valorn1, ""); 
				                        }     
				                         ((TerminoN4Context)_localctx).value =  new Resultado(valorn1, ""); 
				                        
				                        
				                
				setState(492);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MAYOR_QUE) {
					{
					{
					setState(485);
					match(MAYOR_QUE);
					setState(486);
					match(ASIGNACIO);
					setState(487);
					((TerminoN4Context)_localctx).n2 = numero();
					  Object valor = null;
					                        if(((TerminoN4Context)_localctx).n2.value.value!=null && _localctx.value.value!=null ){  
					                                valor  = (Double)_localctx.value.value  >=  (Double)((TerminoN4Context)_localctx).n2.value.value;
					                                 ((TerminoN4Context)_localctx).value =  new Resultado(valor, ""); 
					                        }      
					                         ((TerminoN4Context)_localctx).value =  new Resultado(valor, "");             
					                
					}
					}
					setState(494);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(495);
				((TerminoN4Context)_localctx).n1 = numero();

				                         Object valorn1 = null;
				                        if(((TerminoN4Context)_localctx).n1.value.value!=null){
				                                valorn1 = (Double)((TerminoN4Context)_localctx).n1.value.value;
				                                 ((TerminoN4Context)_localctx).value =  new Resultado(valorn1, ""); 
				                        }      
				                         ((TerminoN4Context)_localctx).value =  new Resultado(valorn1, ""); 
				                           
				                
				setState(503);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MENOR_QUE) {
					{
					{
					setState(497);
					match(MENOR_QUE);
					setState(498);
					((TerminoN4Context)_localctx).n2 = numero();
					  Object valor = null;
					                        if(((TerminoN4Context)_localctx).n2.value.value!=null && _localctx.value.value!=null ){  
					                                valor  = (Double)_localctx.value.value <=  (Double)((TerminoN4Context)_localctx).n2.value.value;
					                                 ((TerminoN4Context)_localctx).value =  new Resultado(valor, ""); 
					                        }      
					                         ((TerminoN4Context)_localctx).value =  new Resultado(valor, "");       
					                
					}
					}
					setState(505);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(506);
				((TerminoN4Context)_localctx).n1 = numero();

				                         Object valorn1 = null;
				                        if(((TerminoN4Context)_localctx).n1.value.value!=null){
				                                valorn1 = (Double)((TerminoN4Context)_localctx).n1.value.value;  ((TerminoN4Context)_localctx).value =  new Resultado(valorn1, ""); 
				                        }      
				                
				                         ((TerminoN4Context)_localctx).value =  new Resultado(valorn1, ""); 
				                
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIFERENTE) {
					{
					{
					setState(508);
					match(DIFERENTE);
					setState(509);
					((TerminoN4Context)_localctx).n2 = numero();
					  Object valor = null;
					                        if(((TerminoN4Context)_localctx).n2.value.value!=null && _localctx.value.value!=null ){  
					                                valor  = _localctx.value.value !=  ((TerminoN4Context)_localctx).n2.value.value; ((TerminoN4Context)_localctx).value =  new Resultado(valor, ""); 
					                        }      
					                         ((TerminoN4Context)_localctx).value =  new Resultado(valor, ""); 
					                
					}
					}
					setState(516);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(517);
				((TerminoN4Context)_localctx).n1 = numero();

				                         Object valorn1 = null;
				                        if(((TerminoN4Context)_localctx).n1.value.value!=null){
				                                valorn1 = (Double)((TerminoN4Context)_localctx).n1.value.value; ((TerminoN4Context)_localctx).value =  new Resultado(valorn1, ""); 
				                        }      
				                         ((TerminoN4Context)_localctx).value =  new Resultado(valorn1, ""); 
				                
				setState(526);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ASIGNACIO) {
					{
					{
					setState(519);
					match(ASIGNACIO);
					setState(520);
					match(ASIGNACIO);
					setState(521);
					((TerminoN4Context)_localctx).n2 = numero();
					  Object valor = null;
					                        if(((TerminoN4Context)_localctx).n2.value.value!=null && _localctx.value.value!=null ){  
					                                valor  = _localctx.value.value ==  ((TerminoN4Context)_localctx).n2.value.value;
					                                 ((TerminoN4Context)_localctx).value =  new Resultado(valor, ""); 
					                        }      
					                        
					                         ((TerminoN4Context)_localctx).value =  new Resultado(valor, "");        
					                
					}
					}
					setState(528);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumeroContext extends ParserRuleContext {
		public Resultado value;
		public Token ENTERO;
		public Token DECIMAL;
		public ExpresionContext expresion;
		public Token IDENTIFICADOR;
		public NumeroContext numero;
		public TerminalNode ENTERO() { return getToken(TipeScriptParser.ENTERO, 0); }
		public TerminalNode DECIMAL() { return getToken(TipeScriptParser.DECIMAL, 0); }
		public TerminalNode PAR1() { return getToken(TipeScriptParser.PAR1, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PAR2() { return getToken(TipeScriptParser.PAR2, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(TipeScriptParser.IDENTIFICADOR, 0); }
		public TerminalNode MENOS() { return getToken(TipeScriptParser.MENOS, 0); }
		public NumeroContext numero() {
			return getRuleContext(NumeroContext.class,0);
		}
		public TerminalNode CADENA() { return getToken(TipeScriptParser.CADENA, 0); }
		public TerminalNode CARACTER() { return getToken(TipeScriptParser.CARACTER, 0); }
		public TerminalNode BOOLEAN() { return getToken(TipeScriptParser.BOOLEAN, 0); }
		public NumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitNumero(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_numero);
		int _la;
		try {
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				((NumeroContext)_localctx).ENTERO = match(ENTERO);
				 
				                Object valor = Double.parseDouble((((NumeroContext)_localctx).ENTERO!=null?((NumeroContext)_localctx).ENTERO.getText():null));
				             ((NumeroContext)_localctx).value =  new Resultado(valor, ""); 
				        
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(533);
				((NumeroContext)_localctx).DECIMAL = match(DECIMAL);
				 
				                 Object valor =  Double.parseDouble((((NumeroContext)_localctx).DECIMAL!=null?((NumeroContext)_localctx).DECIMAL.getText():null)); 
				             ((NumeroContext)_localctx).value =  new Resultado(valor, "");
				        
				}
				break;
			case PAR1:
				enterOuterAlt(_localctx, 3);
				{
				setState(535);
				match(PAR1);
				setState(536);
				((NumeroContext)_localctx).expresion = expresion();
				setState(537);
				match(PAR2);
				 
				                 Object valor =  ((NumeroContext)_localctx).expresion.value; 
				             ((NumeroContext)_localctx).value =  new Resultado(valor, "");
				        
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(540);
				((NumeroContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				 
				                 Map <String,Object> tablaEnTurno=null;

				                if(tablaSimbolosLocales!=null)
				                {     
				                        tablaEnTurno=tablaSimbolosLocales;
				                                if (!tablaEnTurno.containsKey((((NumeroContext)_localctx).IDENTIFICADOR!=null?((NumeroContext)_localctx).IDENTIFICADOR.getText():null))) {
				                                tablaEnTurno=tablaSimbolos;
				                        }
				                }else
				                {    
				                        tablaEnTurno=tablaSimbolos;
				                }
				                boolean ban1 = false;boolean ban2 = false;   Object valor = null;
				                
				                if (!tablaEnTurno.containsKey((((NumeroContext)_localctx).IDENTIFICADOR!=null?((NumeroContext)_localctx).IDENTIFICADOR.getText():null))) {
				                        valor = null;  ban1=true;
				                } else {

				                        if(tablaEnTurno.get((((NumeroContext)_localctx).IDENTIFICADOR!=null?((NumeroContext)_localctx).IDENTIFICADOR.getText():null)) instanceof Double){
				                                valor = tablaEnTurno.get((((NumeroContext)_localctx).IDENTIFICADOR!=null?((NumeroContext)_localctx).IDENTIFICADOR.getText():null));
				                        } else{
				                                ban2=true; valor= null;
				                        }
				                }

				                ((NumeroContext)_localctx).value =  new Resultado(valor, "ss");
				                _localctx.value.setBandera1(ban1);
				                 _localctx.value.setBandera2(ban2);
				            
				        
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 5);
				{
				setState(542);
				match(MENOS);
				setState(543);
				((NumeroContext)_localctx).numero = numero();
				 
				                 Object valor = -((Number) ((NumeroContext)_localctx).numero.value.value).doubleValue(); 
				             ((NumeroContext)_localctx).value =  new Resultado(valor, "");
				        
				}
				break;
			case CADENA:
			case CARACTER:
			case BOOLEAN:
				enterOuterAlt(_localctx, 6);
				{
				setState(546);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8796294348800L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				            
				             Object valor= null; 
				             ((NumeroContext)_localctx).value =  new Resultado(valor, "");
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegresoContext extends ParserRuleContext {
		public boolean exito = false;
		public boolean errorInterno = false;
		public boolean errorBloque = false;
		public Bloque_mainContext bloque_main;
		public TerminalNode REGRESO() { return getToken(TipeScriptParser.REGRESO, 0); }
		public TerminalNode PAR1() { return getToken(TipeScriptParser.PAR1, 0); }
		public Bloque_mainContext bloque_main() {
			return getRuleContext(Bloque_mainContext.class,0);
		}
		public TerminalNode PAR2() { return getToken(TipeScriptParser.PAR2, 0); }
		public TerminalNode FINI_NSTRUCCION() { return getToken(TipeScriptParser.FINI_NSTRUCCION, 0); }
		public RegresoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regreso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterRegreso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitRegreso(this);
		}
	}

	public final RegresoContext regreso() throws RecognitionException {
		RegresoContext _localctx = new RegresoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_regreso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(550);
			match(REGRESO);
			setState(551);
			match(PAR1);
			setState(552);
			((RegresoContext)_localctx).bloque_main = bloque_main();
			 
			                if(!((RegresoContext)_localctx).bloque_main.exito){
			                        ((RegresoContext)_localctx).errorInterno = true;
			                        ((RegresoContext)_localctx).errorBloque = true;
			                }
			        
			        
			setState(554);
			match(PAR2);
			setState(555);
			match(FINI_NSTRUCCION);
			  
			               if(!_localctx.errorInterno){
			                ((RegresoContext)_localctx).exito = true;
			               } 
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_mainContext extends ParserRuleContext {
		public boolean exito = false;
		public TerminalNode MENOR_QUE() { return getToken(TipeScriptParser.MENOR_QUE, 0); }
		public List<TerminalNode> MAIN() { return getTokens(TipeScriptParser.MAIN); }
		public TerminalNode MAIN(int i) {
			return getToken(TipeScriptParser.MAIN, i);
		}
		public List<TerminalNode> MAYOR_QUE() { return getTokens(TipeScriptParser.MAYOR_QUE); }
		public TerminalNode MAYOR_QUE(int i) {
			return getToken(TipeScriptParser.MAYOR_QUE, i);
		}
		public Bloque_instrucciones_htmlContext bloque_instrucciones_html() {
			return getRuleContext(Bloque_instrucciones_htmlContext.class,0);
		}
		public Bloque_mainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterBloque_main(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitBloque_main(this);
		}
	}

	public final Bloque_mainContext bloque_main() throws RecognitionException {
		Bloque_mainContext _localctx = new Bloque_mainContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_bloque_main);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(558);
			match(MENOR_QUE);
			setState(559);
			match(MAIN);
			setState(560);
			match(MAYOR_QUE);
			setState(561);
			bloque_instrucciones_html();
			setState(562);
			match(T__1);
			setState(563);
			match(MAIN);
			setState(564);
			match(MAYOR_QUE);
			 
			                ((Bloque_mainContext)_localctx).exito = true;
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_instrucciones_htmlContext extends ParserRuleContext {
		public Instruccion_htmlContext instruccion_html() {
			return getRuleContext(Instruccion_htmlContext.class,0);
		}
		public Bloque_instrucciones_html_primaContext bloque_instrucciones_html_prima() {
			return getRuleContext(Bloque_instrucciones_html_primaContext.class,0);
		}
		public Bloque_instrucciones_htmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_instrucciones_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterBloque_instrucciones_html(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitBloque_instrucciones_html(this);
		}
	}

	public final Bloque_instrucciones_htmlContext bloque_instrucciones_html() throws RecognitionException {
		Bloque_instrucciones_htmlContext _localctx = new Bloque_instrucciones_htmlContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_bloque_instrucciones_html);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(567);
			instruccion_html();
			setState(568);
			bloque_instrucciones_html_prima();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Bloque_instrucciones_html_primaContext extends ParserRuleContext {
		public Instruccion_htmlContext instruccion_html() {
			return getRuleContext(Instruccion_htmlContext.class,0);
		}
		public Bloque_instrucciones_html_primaContext bloque_instrucciones_html_prima() {
			return getRuleContext(Bloque_instrucciones_html_primaContext.class,0);
		}
		public Bloque_instrucciones_html_primaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_instrucciones_html_prima; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterBloque_instrucciones_html_prima(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitBloque_instrucciones_html_prima(this);
		}
	}

	public final Bloque_instrucciones_html_primaContext bloque_instrucciones_html_prima() throws RecognitionException {
		Bloque_instrucciones_html_primaContext _localctx = new Bloque_instrucciones_html_primaContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_bloque_instrucciones_html_prima);
		try {
			setState(574);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENOR_QUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				instruccion_html();
				setState(571);
				bloque_instrucciones_html_prima();
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Instruccion_htmlContext extends ParserRuleContext {
		public EtiquetaEncabezadoContext etiquetaEncabezado;
		public EtiquetaParrafoContext etiquetaParrafo;
		public EtiquetaBotonContext etiquetaBoton;
		public EtiquetaInputContext etiquetaInput;
		public EtiquetaEncabezadoContext etiquetaEncabezado() {
			return getRuleContext(EtiquetaEncabezadoContext.class,0);
		}
		public EtiquetaParrafoContext etiquetaParrafo() {
			return getRuleContext(EtiquetaParrafoContext.class,0);
		}
		public EtiquetaBotonContext etiquetaBoton() {
			return getRuleContext(EtiquetaBotonContext.class,0);
		}
		public EtiquetaInputContext etiquetaInput() {
			return getRuleContext(EtiquetaInputContext.class,0);
		}
		public Instruccion_htmlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_html; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterInstruccion_html(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitInstruccion_html(this);
		}
	}

	public final Instruccion_htmlContext instruccion_html() throws RecognitionException {
		Instruccion_htmlContext _localctx = new Instruccion_htmlContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_instruccion_html);
		try {
			setState(588);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(576);
				((Instruccion_htmlContext)_localctx).etiquetaEncabezado = etiquetaEncabezado();
				an(((Instruccion_htmlContext)_localctx).etiquetaEncabezado,1);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(579);
				((Instruccion_htmlContext)_localctx).etiquetaParrafo = etiquetaParrafo();
				an(((Instruccion_htmlContext)_localctx).etiquetaParrafo,2);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(582);
				((Instruccion_htmlContext)_localctx).etiquetaBoton = etiquetaBoton();
				an(((Instruccion_htmlContext)_localctx).etiquetaBoton,3);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(585);
				((Instruccion_htmlContext)_localctx).etiquetaInput = etiquetaInput();
				an(((Instruccion_htmlContext)_localctx).etiquetaInput,4);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EtiquetaEncabezadoContext extends ParserRuleContext {
		public boolean exito = false;
		public boolean errorId = false;
		public boolean errorTipo = false;
		public boolean errorInterno = false;
		public String ids = "";
		public Token h1;
		public VariableTipeScriptContext variableTipeScript;
		public Token h2;
		public TerminalNode MENOR_QUE() { return getToken(TipeScriptParser.MENOR_QUE, 0); }
		public List<TerminalNode> MAYOR_QUE() { return getTokens(TipeScriptParser.MAYOR_QUE); }
		public TerminalNode MAYOR_QUE(int i) {
			return getToken(TipeScriptParser.MAYOR_QUE, i);
		}
		public List<TerminalNode> HEADERS() { return getTokens(TipeScriptParser.HEADERS); }
		public TerminalNode HEADERS(int i) {
			return getToken(TipeScriptParser.HEADERS, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(TipeScriptParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(TipeScriptParser.CADENA, i);
		}
		public List<VariableTipeScriptContext> variableTipeScript() {
			return getRuleContexts(VariableTipeScriptContext.class);
		}
		public VariableTipeScriptContext variableTipeScript(int i) {
			return getRuleContext(VariableTipeScriptContext.class,i);
		}
		public EtiquetaEncabezadoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetaEncabezado; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterEtiquetaEncabezado(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitEtiquetaEncabezado(this);
		}
	}

	public final EtiquetaEncabezadoContext etiquetaEncabezado() throws RecognitionException {
		EtiquetaEncabezadoContext _localctx = new EtiquetaEncabezadoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_etiquetaEncabezado);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			match(MENOR_QUE);
			setState(591);
			((EtiquetaEncabezadoContext)_localctx).h1 = match(HEADERS);
			setState(592);
			match(MAYOR_QUE);
			setState(599);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CORCH1 || _la==CADENA) {
				{
				setState(597);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CADENA:
					{
					setState(593);
					match(CADENA);
					}
					break;
				case CORCH1:
					{
					setState(594);
					((EtiquetaEncabezadoContext)_localctx).variableTipeScript = variableTipeScript();
					 
					                                        if(!((EtiquetaEncabezadoContext)_localctx).variableTipeScript.exito){
					                                                ((EtiquetaEncabezadoContext)_localctx).errorId = true; ((EtiquetaEncabezadoContext)_localctx).errorInterno = true; _localctx.ids+=(((EtiquetaEncabezadoContext)_localctx).variableTipeScript!=null?_input.getText(((EtiquetaEncabezadoContext)_localctx).variableTipeScript.start,((EtiquetaEncabezadoContext)_localctx).variableTipeScript.stop):null)+" ";
					                                        } 
					                                
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(601);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(602);
			match(T__1);
			setState(603);
			((EtiquetaEncabezadoContext)_localctx).h2 = match(HEADERS);
			setState(604);
			match(MAYOR_QUE);
			 
			                                                if(!(((EtiquetaEncabezadoContext)_localctx).h1!=null?((EtiquetaEncabezadoContext)_localctx).h1.getText():null).equals((((EtiquetaEncabezadoContext)_localctx).h2!=null?((EtiquetaEncabezadoContext)_localctx).h2.getText():null)))
			                                                {
			                                                        ((EtiquetaEncabezadoContext)_localctx).errorTipo = true;   ((EtiquetaEncabezadoContext)_localctx).errorInterno = true;
			                                                }
			                                                if(!_localctx.errorInterno){
			                                                        ((EtiquetaEncabezadoContext)_localctx).exito = true;
			                                                } 
			                                        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableTipeScriptContext extends ParserRuleContext {
		public boolean exito = false;
		public boolean errorId = false;
		public boolean errorInterno = false;
		public Token IDENTIFICADOR;
		public TerminalNode CORCH1() { return getToken(TipeScriptParser.CORCH1, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(TipeScriptParser.IDENTIFICADOR, 0); }
		public TerminalNode CORCH2() { return getToken(TipeScriptParser.CORCH2, 0); }
		public VariableTipeScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableTipeScript; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterVariableTipeScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitVariableTipeScript(this);
		}
	}

	public final VariableTipeScriptContext variableTipeScript() throws RecognitionException {
		VariableTipeScriptContext _localctx = new VariableTipeScriptContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_variableTipeScript);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			match(CORCH1);
			setState(608);
			((VariableTipeScriptContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);

			                if (!tablaSimbolos.containsKey((((VariableTipeScriptContext)_localctx).IDENTIFICADOR!=null?((VariableTipeScriptContext)_localctx).IDENTIFICADOR.getText():null))) 
			                {
			                        ((VariableTipeScriptContext)_localctx).errorId = true;((VariableTipeScriptContext)_localctx).errorInterno = true;
			                }
			        
			setState(610);
			match(CORCH2);

			                if(!_localctx.errorInterno){
			                        ((VariableTipeScriptContext)_localctx).exito = true;
			                } 
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EtiquetaParrafoContext extends ParserRuleContext {
		public boolean exito = false;
		public boolean errorId = false;
		public boolean errorTipo = true;
		public boolean errorInterno = false;
		public String ids = "";
		public Token p1;
		public VariableTipeScriptContext variableTipeScript;
		public Token p2;
		public TerminalNode MENOR_QUE() { return getToken(TipeScriptParser.MENOR_QUE, 0); }
		public List<TerminalNode> MAYOR_QUE() { return getTokens(TipeScriptParser.MAYOR_QUE); }
		public TerminalNode MAYOR_QUE(int i) {
			return getToken(TipeScriptParser.MAYOR_QUE, i);
		}
		public List<TerminalNode> PARRAFO() { return getTokens(TipeScriptParser.PARRAFO); }
		public TerminalNode PARRAFO(int i) {
			return getToken(TipeScriptParser.PARRAFO, i);
		}
		public List<TerminalNode> CADENA() { return getTokens(TipeScriptParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(TipeScriptParser.CADENA, i);
		}
		public List<VariableTipeScriptContext> variableTipeScript() {
			return getRuleContexts(VariableTipeScriptContext.class);
		}
		public VariableTipeScriptContext variableTipeScript(int i) {
			return getRuleContext(VariableTipeScriptContext.class,i);
		}
		public EtiquetaParrafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetaParrafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterEtiquetaParrafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitEtiquetaParrafo(this);
		}
	}

	public final EtiquetaParrafoContext etiquetaParrafo() throws RecognitionException {
		EtiquetaParrafoContext _localctx = new EtiquetaParrafoContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_etiquetaParrafo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(613);
			match(MENOR_QUE);
			setState(614);
			((EtiquetaParrafoContext)_localctx).p1 = match(PARRAFO);
			setState(615);
			match(MAYOR_QUE);
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CORCH1 || _la==CADENA) {
				{
				setState(620);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CADENA:
					{
					setState(616);
					match(CADENA);
					}
					break;
				case CORCH1:
					{
					setState(617);
					((EtiquetaParrafoContext)_localctx).variableTipeScript = variableTipeScript();
					 
					                                        if(!((EtiquetaParrafoContext)_localctx).variableTipeScript.exito){
					                                                ((EtiquetaParrafoContext)_localctx).errorId = true; ((EtiquetaParrafoContext)_localctx).errorInterno = true;
					                                                _localctx.ids+=(((EtiquetaParrafoContext)_localctx).variableTipeScript!=null?_input.getText(((EtiquetaParrafoContext)_localctx).variableTipeScript.start,((EtiquetaParrafoContext)_localctx).variableTipeScript.stop):null)+" ";
					                                        } 
					                                
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(624);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(625);
			match(T__1);
			setState(626);
			((EtiquetaParrafoContext)_localctx).p2 = match(PARRAFO);
			setState(627);
			match(MAYOR_QUE);
			   
			                                                if(!_localctx.errorInterno){
			                                                        ((EtiquetaParrafoContext)_localctx).errorTipo = false;
			                                                        ((EtiquetaParrafoContext)_localctx).exito = true;
			                                                } 
			                                        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EtiquetaBotonContext extends ParserRuleContext {
		public boolean exito = false;
		public boolean errorId = false;
		public boolean errorTipo = true;
		public boolean errorOnClock = true;
		public boolean errorInterno = false;
		public String ids = "";
		public OnclickContext onclick;
		public VariableTipeScriptContext variableTipeScript;
		public TerminalNode MENOR_QUE() { return getToken(TipeScriptParser.MENOR_QUE, 0); }
		public List<TerminalNode> BOTON() { return getTokens(TipeScriptParser.BOTON); }
		public TerminalNode BOTON(int i) {
			return getToken(TipeScriptParser.BOTON, i);
		}
		public List<TerminalNode> MAYOR_QUE() { return getTokens(TipeScriptParser.MAYOR_QUE); }
		public TerminalNode MAYOR_QUE(int i) {
			return getToken(TipeScriptParser.MAYOR_QUE, i);
		}
		public OnclickContext onclick() {
			return getRuleContext(OnclickContext.class,0);
		}
		public List<TerminalNode> CADENA() { return getTokens(TipeScriptParser.CADENA); }
		public TerminalNode CADENA(int i) {
			return getToken(TipeScriptParser.CADENA, i);
		}
		public List<VariableTipeScriptContext> variableTipeScript() {
			return getRuleContexts(VariableTipeScriptContext.class);
		}
		public VariableTipeScriptContext variableTipeScript(int i) {
			return getRuleContext(VariableTipeScriptContext.class,i);
		}
		public EtiquetaBotonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetaBoton; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterEtiquetaBoton(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitEtiquetaBoton(this);
		}
	}

	public final EtiquetaBotonContext etiquetaBoton() throws RecognitionException {
		EtiquetaBotonContext _localctx = new EtiquetaBotonContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_etiquetaBoton);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(630);
			match(MENOR_QUE);
			setState(631);
			match(BOTON);
			setState(633);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ONCLICK) {
				{
				setState(632);
				((EtiquetaBotonContext)_localctx).onclick = onclick();
				}
			}

			 
			                                if(_localctx.onclick!=null){
			                                        if(!((EtiquetaBotonContext)_localctx).onclick.exito){
			                                                ((EtiquetaBotonContext)_localctx).errorOnClock = true; ((EtiquetaBotonContext)_localctx).errorInterno = true;
			                                               
			                                        } 
			                                }
			                                
			                        
			setState(636);
			match(MAYOR_QUE);
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==CORCH1 || _la==CADENA) {
				{
				setState(641);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CADENA:
					{
					setState(637);
					match(CADENA);
					}
					break;
				case CORCH1:
					{
					setState(638);
					((EtiquetaBotonContext)_localctx).variableTipeScript = variableTipeScript();
					 
					                                        if(!((EtiquetaBotonContext)_localctx).variableTipeScript.exito){
					                                                ((EtiquetaBotonContext)_localctx).errorId = true; ((EtiquetaBotonContext)_localctx).errorInterno = true;
					                                                _localctx.ids+=(((EtiquetaBotonContext)_localctx).variableTipeScript!=null?_input.getText(((EtiquetaBotonContext)_localctx).variableTipeScript.start,((EtiquetaBotonContext)_localctx).variableTipeScript.stop):null)+" ";
					                                        } 
					                                
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(646);
			match(T__1);
			setState(647);
			match(BOTON);
			setState(648);
			match(MAYOR_QUE);
			      
			                                                if(!_localctx.errorInterno){
			                                                        ((EtiquetaBotonContext)_localctx).errorTipo = false;
			                                                        ((EtiquetaBotonContext)_localctx).exito = true;
			                                                } 
			                                        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnclickContext extends ParserRuleContext {
		public boolean exito = false;
		public boolean errorInterno = false;
		public boolean errorLlamadaFuncion = false;
		public Llamada_funcionContext llamada_funcion;
		public TerminalNode ONCLICK() { return getToken(TipeScriptParser.ONCLICK, 0); }
		public TerminalNode ASIGNACIO() { return getToken(TipeScriptParser.ASIGNACIO, 0); }
		public TerminalNode CORCH1() { return getToken(TipeScriptParser.CORCH1, 0); }
		public Llamada_funcionContext llamada_funcion() {
			return getRuleContext(Llamada_funcionContext.class,0);
		}
		public TerminalNode CORCH2() { return getToken(TipeScriptParser.CORCH2, 0); }
		public OnclickContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onclick; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterOnclick(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitOnclick(this);
		}
	}

	public final OnclickContext onclick() throws RecognitionException {
		OnclickContext _localctx = new OnclickContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_onclick);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(651);
			match(ONCLICK);
			setState(652);
			match(ASIGNACIO);
			setState(653);
			match(CORCH1);
			setState(654);
			((OnclickContext)_localctx).llamada_funcion = llamada_funcion();

			         if(!((OnclickContext)_localctx).llamada_funcion.exito){  ((OnclickContext)_localctx).errorInterno = true;  ((OnclickContext)_localctx).errorLlamadaFuncion =  true;}  
			        
			setState(656);
			match(CORCH2);
			 
			                if(!_localctx.errorInterno){      
			                        ((OnclickContext)_localctx).exito = true;
			                } 
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EtiquetaInputContext extends ParserRuleContext {
		public boolean exito = false;
		public boolean errorId = false;
		public boolean errorTipo = true;
		public boolean errorInterno = false;
		public String ids = "";
		public VariableTipeScriptContext variableTipeScript;
		public TerminalNode MENOR_QUE() { return getToken(TipeScriptParser.MENOR_QUE, 0); }
		public TerminalNode INPUT() { return getToken(TipeScriptParser.INPUT, 0); }
		public TerminalNode ASIGNACIO() { return getToken(TipeScriptParser.ASIGNACIO, 0); }
		public TerminalNode CORCH1() { return getToken(TipeScriptParser.CORCH1, 0); }
		public VariableTipeScriptContext variableTipeScript() {
			return getRuleContext(VariableTipeScriptContext.class,0);
		}
		public TerminalNode CORCH2() { return getToken(TipeScriptParser.CORCH2, 0); }
		public EtiquetaInputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_etiquetaInput; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).enterEtiquetaInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TipeScriptListener ) ((TipeScriptListener)listener).exitEtiquetaInput(this);
		}
	}

	public final EtiquetaInputContext etiquetaInput() throws RecognitionException {
		EtiquetaInputContext _localctx = new EtiquetaInputContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_etiquetaInput);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			match(MENOR_QUE);
			setState(660);
			match(INPUT);
			setState(668);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(661);
				match(T__2);
				setState(662);
				match(ASIGNACIO);
				setState(663);
				match(CORCH1);
				setState(664);
				((EtiquetaInputContext)_localctx).variableTipeScript = variableTipeScript();
				setState(665);
				match(CORCH2);
				 
				                                        if(!((EtiquetaInputContext)_localctx).variableTipeScript.exito){
				                                                ((EtiquetaInputContext)_localctx).errorId = true; ((EtiquetaInputContext)_localctx).errorInterno = true; _localctx.ids+=(((EtiquetaInputContext)_localctx).variableTipeScript!=null?_input.getText(((EtiquetaInputContext)_localctx).variableTipeScript.start,((EtiquetaInputContext)_localctx).variableTipeScript.stop):null)+" ";
				                                        } 
				                                
				}
			}

			setState(670);
			match(T__3);
			 
			                                                if(!_localctx.errorInterno){
			                                                        ((EtiquetaInputContext)_localctx).errorTipo = false; ((EtiquetaInputContext)_localctx).exito = true;
			                                                } 
			                                        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u00010\u02a2\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001a\b\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u0001g\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002o\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003"+
		"w\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0084\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"\u0095\b\u0006\u0001\u0007\u0001\u0007\u0003\u0007\u0099\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00b7\b\t\n\t\f\t\u00ba\t\t\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00c2\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u00cb\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00d0\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0005\r\u00dd\b\r\n\r\f\r\u00e0\t\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00eb\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00f7\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0003\u000e\u00fd\b\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0101\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u010b\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003"+
		"\u0010\u0114\b\u0010\u0001\u0011\u0001\u0011\u0003\u0011\u0118\b\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u0130\b\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u013b\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u0149\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u016c\b\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0183\b\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u0191\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0005\u001b\u0199\b\u001b\n\u001b\f\u001b\u019c\t\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005"+
		"\u001b\u01a4\b\u001b\n\u001b\f\u001b\u01a7\t\u001b\u0003\u001b\u01a9\b"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0005\u001c\u01b1\b\u001c\n\u001c\f\u001c\u01b4\t\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u01bc\b\u001c\n\u001c\f\u001c\u01bf\t\u001c\u0003\u001c\u01c1\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0005\u001d\u01c9\b\u001d\n\u001d\f\u001d\u01cc\t\u001d\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01d4"+
		"\b\u001e\n\u001e\f\u001e\u01d7\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01df\b\u001e\n\u001e"+
		"\f\u001e\u01e2\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01eb\b\u001e\n\u001e"+
		"\f\u001e\u01ee\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u01f6\b\u001e\n\u001e\f\u001e\u01f9"+
		"\t\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0005\u001e\u0201\b\u001e\n\u001e\f\u001e\u0204\t\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0005\u001e\u020d\b\u001e\n\u001e\f\u001e\u0210\t\u001e\u0003\u001e\u0212"+
		"\b\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003"+
		"\u001f\u0225\b\u001f\u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 "+
		"\u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0003#\u023f\b#"+
		"\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0003$\u024d\b$\u0001%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001%\u0005%\u0256\b%\n%\f%\u0259\t%\u0001%\u0001%\u0001%\u0001%\u0001"+
		"%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0005\'\u026d\b\'\n\'\f\'\u0270\t\'\u0001\'"+
		"\u0001\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0003(\u027a\b("+
		"\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0005(\u0282\b(\n(\f(\u0285"+
		"\t(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001"+
		"*\u0001*\u0001*\u0003*\u029d\b*\u0001*\u0001*\u0001*\u0001*\u0000\u0000"+
		"+\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a"+
		"\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPRT\u0000\u0002\u0001\u0000-.\u0002"+
		"\u0000\u001a\u001b++\u02c3\u0000V\u0001\u0000\u0000\u0000\u0002f\u0001"+
		"\u0000\u0000\u0000\u0004n\u0001\u0000\u0000\u0000\u0006v\u0001\u0000\u0000"+
		"\u0000\bx\u0001\u0000\u0000\u0000\n\u0083\u0001\u0000\u0000\u0000\f\u0094"+
		"\u0001\u0000\u0000\u0000\u000e\u0096\u0001\u0000\u0000\u0000\u0010\u009d"+
		"\u0001\u0000\u0000\u0000\u0012\u00ac\u0001\u0000\u0000\u0000\u0014\u00c1"+
		"\u0001\u0000\u0000\u0000\u0016\u00ca\u0001\u0000\u0000\u0000\u0018\u00cc"+
		"\u0001\u0000\u0000\u0000\u001a\u00d5\u0001\u0000\u0000\u0000\u001c\u00e1"+
		"\u0001\u0000\u0000\u0000\u001e\u010a\u0001\u0000\u0000\u0000 \u0113\u0001"+
		"\u0000\u0000\u0000\"\u0115\u0001\u0000\u0000\u0000$\u012f\u0001\u0000"+
		"\u0000\u0000&\u0131\u0001\u0000\u0000\u0000(\u013a\u0001\u0000\u0000\u0000"+
		"*\u0148\u0001\u0000\u0000\u0000,\u016b\u0001\u0000\u0000\u0000.\u016d"+
		"\u0001\u0000\u0000\u00000\u0182\u0001\u0000\u0000\u00002\u0184\u0001\u0000"+
		"\u0000\u00004\u0190\u0001\u0000\u0000\u00006\u01a8\u0001\u0000\u0000\u0000"+
		"8\u01c0\u0001\u0000\u0000\u0000:\u01c2\u0001\u0000\u0000\u0000<\u0211"+
		"\u0001\u0000\u0000\u0000>\u0224\u0001\u0000\u0000\u0000@\u0226\u0001\u0000"+
		"\u0000\u0000B\u022e\u0001\u0000\u0000\u0000D\u0237\u0001\u0000\u0000\u0000"+
		"F\u023e\u0001\u0000\u0000\u0000H\u024c\u0001\u0000\u0000\u0000J\u024e"+
		"\u0001\u0000\u0000\u0000L\u025f\u0001\u0000\u0000\u0000N\u0265\u0001\u0000"+
		"\u0000\u0000P\u0276\u0001\u0000\u0000\u0000R\u028b\u0001\u0000\u0000\u0000"+
		"T\u0293\u0001\u0000\u0000\u0000VW\u0003\u0002\u0001\u0000W\u0001\u0001"+
		"\u0000\u0000\u0000XY\u0005\n\u0000\u0000YZ\u0005/\u0000\u0000Z[\u0005"+
		"\u000f\u0000\u0000[\\\u0005\r\u0000\u0000\\]\u0005\u000e\u0000\u0000]"+
		"^\u0005\u0010\u0000\u0000^`\u0005\u0011\u0000\u0000_a\u0003\u0004\u0002"+
		"\u0000`_\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ab\u0001\u0000"+
		"\u0000\u0000bc\u0003@ \u0000cd\u0005\u0012\u0000\u0000dg\u0001\u0000\u0000"+
		"\u0000eg\u0001\u0000\u0000\u0000fX\u0001\u0000\u0000\u0000fe\u0001\u0000"+
		"\u0000\u0000g\u0003\u0001\u0000\u0000\u0000hi\u0003\b\u0004\u0000ij\u0003"+
		"\u0006\u0003\u0000jo\u0001\u0000\u0000\u0000kl\u0003\u0010\b\u0000lm\u0003"+
		"\u0006\u0003\u0000mo\u0001\u0000\u0000\u0000nh\u0001\u0000\u0000\u0000"+
		"nk\u0001\u0000\u0000\u0000o\u0005\u0001\u0000\u0000\u0000pq\u0003\b\u0004"+
		"\u0000qr\u0003\u0006\u0003\u0000rw\u0001\u0000\u0000\u0000st\u0003\u0010"+
		"\b\u0000tu\u0003\u0006\u0003\u0000uw\u0001\u0000\u0000\u0000vp\u0001\u0000"+
		"\u0000\u0000vs\u0001\u0000\u0000\u0000w\u0007\u0001\u0000\u0000\u0000"+
		"xy\u0003\f\u0006\u0000yz\u0006\u0004\uffff\uffff\u0000z{\u0003\n\u0005"+
		"\u0000{|\u0006\u0004\uffff\uffff\u0000|\t\u0001\u0000\u0000\u0000}~\u0003"+
		"\f\u0006\u0000~\u007f\u0006\u0005\uffff\uffff\u0000\u007f\u0080\u0003"+
		"\n\u0005\u0000\u0080\u0081\u0006\u0005\uffff\uffff\u0000\u0081\u0084\u0001"+
		"\u0000\u0000\u0000\u0082\u0084\u0006\u0005\uffff\uffff\u0000\u0083}\u0001"+
		"\u0000\u0000\u0000\u0083\u0082\u0001\u0000\u0000\u0000\u0084\u000b\u0001"+
		"\u0000\u0000\u0000\u0085\u0086\u0003,\u0016\u0000\u0086\u0087\u0006\u0006"+
		"\uffff\uffff\u0000\u0087\u0095\u0001\u0000\u0000\u0000\u0088\u0089\u0003"+
		".\u0017\u0000\u0089\u008a\u0006\u0006\uffff\uffff\u0000\u008a\u0095\u0001"+
		"\u0000\u0000\u0000\u008b\u008c\u0003$\u0012\u0000\u008c\u008d\u0006\u0006"+
		"\uffff\uffff\u0000\u008d\u0095\u0001\u0000\u0000\u0000\u008e\u008f\u0003"+
		"\u001c\u000e\u0000\u008f\u0090\u0006\u0006\uffff\uffff\u0000\u0090\u0095"+
		"\u0001\u0000\u0000\u0000\u0091\u0092\u0003\u0018\f\u0000\u0092\u0093\u0006"+
		"\u0006\uffff\uffff\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0085"+
		"\u0001\u0000\u0000\u0000\u0094\u0088\u0001\u0000\u0000\u0000\u0094\u008b"+
		"\u0001\u0000\u0000\u0000\u0094\u008e\u0001\u0000\u0000\u0000\u0094\u0091"+
		"\u0001\u0000\u0000\u0000\u0095\r\u0001\u0000\u0000\u0000\u0096\u0098\u0005"+
		"\u000b\u0000\u0000\u0097\u0099\u00030\u0018\u0000\u0098\u0097\u0001\u0000"+
		"\u0000\u0000\u0098\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000"+
		"\u0000\u0000\u009a\u009b\u0005\u0016\u0000\u0000\u009b\u009c\u0006\u0007"+
		"\uffff\uffff\u0000\u009c\u000f\u0001\u0000\u0000\u0000\u009d\u009e\u0006"+
		"\b\uffff\uffff\u0000\u009e\u009f\u0005\'\u0000\u0000\u009f\u00a0\u0005"+
		"/\u0000\u0000\u00a0\u00a1\u0005\r\u0000\u0000\u00a1\u00a2\u0003\u0012"+
		"\t\u0000\u00a2\u00a3\u0005\u000e\u0000\u0000\u00a3\u00a4\u0005\u0019\u0000"+
		"\u0000\u00a4\u00a5\u00034\u001a\u0000\u00a5\u00a6\u0006\b\uffff\uffff"+
		"\u0000\u00a6\u00a7\u0005\u0011\u0000\u0000\u00a7\u00a8\u0006\b\uffff\uffff"+
		"\u0000\u00a8\u00a9\u0003\u0014\n\u0000\u00a9\u00aa\u0005\u0012\u0000\u0000"+
		"\u00aa\u00ab\u0006\b\uffff\uffff\u0000\u00ab\u0011\u0001\u0000\u0000\u0000"+
		"\u00ac\u00ad\u0005/\u0000\u0000\u00ad\u00ae\u0005\u0019\u0000\u0000\u00ae"+
		"\u00af\u00034\u001a\u0000\u00af\u00b8\u0006\t\uffff\uffff\u0000\u00b0"+
		"\u00b1\u0005\f\u0000\u0000\u00b1\u00b2\u0005/\u0000\u0000\u00b2\u00b3"+
		"\u0005\u0019\u0000\u0000\u00b3\u00b4\u00034\u001a\u0000\u00b4\u00b5\u0006"+
		"\t\uffff\uffff\u0000\u00b5\u00b7\u0001\u0000\u0000\u0000\u00b6\u00b0\u0001"+
		"\u0000\u0000\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001"+
		"\u0000\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u0013\u0001"+
		"\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003"+
		"\b\u0004\u0000\u00bc\u00bd\u0003\u0016\u000b\u0000\u00bd\u00c2\u0001\u0000"+
		"\u0000\u0000\u00be\u00bf\u0003\u000e\u0007\u0000\u00bf\u00c0\u0003\u0016"+
		"\u000b\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1\u00bb\u0001\u0000"+
		"\u0000\u0000\u00c1\u00be\u0001\u0000\u0000\u0000\u00c2\u0015\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0003\b\u0004\u0000\u00c4\u00c5\u0003\u0016\u000b"+
		"\u0000\u00c5\u00cb\u0001\u0000\u0000\u0000\u00c6\u00c7\u0003\u000e\u0007"+
		"\u0000\u00c7\u00c8\u0003\u0016\u000b\u0000\u00c8\u00cb\u0001\u0000\u0000"+
		"\u0000\u00c9\u00cb\u0001\u0000\u0000\u0000\u00ca\u00c3\u0001\u0000\u0000"+
		"\u0000\u00ca\u00c6\u0001\u0000\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000"+
		"\u0000\u00cb\u0017\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005/\u0000\u0000"+
		"\u00cd\u00cf\u0005\r\u0000\u0000\u00ce\u00d0\u0003\u001a\r\u0000\u00cf"+
		"\u00ce\u0001\u0000\u0000\u0000\u00cf\u00d0\u0001\u0000\u0000\u0000\u00d0"+
		"\u00d1\u0001\u0000\u0000\u0000\u00d1\u00d2\u0005\u000e\u0000\u0000\u00d2"+
		"\u00d3\u0005\u0016\u0000\u0000\u00d3\u00d4\u0006\f\uffff\uffff\u0000\u00d4"+
		"\u0019\u0001\u0000\u0000\u0000\u00d5\u00d6\u0006\r\uffff\uffff\u0000\u00d6"+
		"\u00d7\u00030\u0018\u0000\u00d7\u00de\u0006\r\uffff\uffff\u0000\u00d8"+
		"\u00d9\u0005\f\u0000\u0000\u00d9\u00da\u00030\u0018\u0000\u00da\u00db"+
		"\u0006\r\uffff\uffff\u0000\u00db\u00dd\u0001\u0000\u0000\u0000\u00dc\u00d8"+
		"\u0001\u0000\u0000\u0000\u00dd\u00e0\u0001\u0000\u0000\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u001b"+
		"\u0001\u0000\u0000\u0000\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e2"+
		"\u0006\u000e\uffff\uffff\u0000\u00e2\u00e3\u0005\"\u0000\u0000\u00e3\u00e4"+
		"\u0005\r\u0000\u0000\u00e4\u00e5\u00030\u0018\u0000\u00e5\u00e6\u0006"+
		"\u000e\uffff\uffff\u0000\u00e6\u00e7\u0005\u000e\u0000\u0000\u00e7\u00e8"+
		"\u0005\u0011\u0000\u0000\u00e8\u00ea\u0006\u000e\uffff\uffff\u0000\u00e9"+
		"\u00eb\u0003\u001e\u000f\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00ea"+
		"\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ed\u0005\u0012\u0000\u0000\u00ed\u0100\u0006\u000e\uffff\uffff\u0000"+
		"\u00ee\u00f6\u0005#\u0000\u0000\u00ef\u00f0\u0005\"\u0000\u0000\u00f0"+
		"\u00f1\u0005\r\u0000\u0000\u00f1\u00f2\u00030\u0018\u0000\u00f2\u00f3"+
		"\u0006\u000e\uffff\uffff\u0000\u00f3\u00f4\u0005\u000e\u0000\u0000\u00f4"+
		"\u00f5\u0006\u000e\uffff\uffff\u0000\u00f5\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f6\u00ef\u0001\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000"+
		"\u00f7\u00f8\u0001\u0000\u0000\u0000\u00f8\u00f9\u0005\u0011\u0000\u0000"+
		"\u00f9\u00fa\u0006\u000e\uffff\uffff\u0000\u00fa\u00fc\u0006\u000e\uffff"+
		"\uffff\u0000\u00fb\u00fd\u0003\u001e\u000f\u0000\u00fc\u00fb\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0005\u0012\u0000\u0000\u00ff\u0101\u0006\u000e"+
		"\uffff\uffff\u0000\u0100\u00ee\u0001\u0000\u0000\u0000\u0100\u0101\u0001"+
		"\u0000\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0103\u0006"+
		"\u000e\uffff\uffff\u0000\u0103\u001d\u0001\u0000\u0000\u0000\u0104\u0105"+
		"\u0003\b\u0004\u0000\u0105\u0106\u0003 \u0010\u0000\u0106\u010b\u0001"+
		"\u0000\u0000\u0000\u0107\u0108\u0003\"\u0011\u0000\u0108\u0109\u0003 "+
		"\u0010\u0000\u0109\u010b\u0001\u0000\u0000\u0000\u010a\u0104\u0001\u0000"+
		"\u0000\u0000\u010a\u0107\u0001\u0000\u0000\u0000\u010b\u001f\u0001\u0000"+
		"\u0000\u0000\u010c\u010d\u0003\b\u0004\u0000\u010d\u010e\u0003 \u0010"+
		"\u0000\u010e\u0114\u0001\u0000\u0000\u0000\u010f\u0110\u0003\"\u0011\u0000"+
		"\u0110\u0111\u0003 \u0010\u0000\u0111\u0114\u0001\u0000\u0000\u0000\u0112"+
		"\u0114\u0001\u0000\u0000\u0000\u0113\u010c\u0001\u0000\u0000\u0000\u0113"+
		"\u010f\u0001\u0000\u0000\u0000\u0113\u0112\u0001\u0000\u0000\u0000\u0114"+
		"!\u0001\u0000\u0000\u0000\u0115\u0117\u0005\u000b\u0000\u0000\u0116\u0118"+
		"\u00030\u0018\u0000\u0117\u0116\u0001\u0000\u0000\u0000\u0117\u0118\u0001"+
		"\u0000\u0000\u0000\u0118\u0119\u0001\u0000\u0000\u0000\u0119\u011a\u0005"+
		"\u0016\u0000\u0000\u011a\u011b\u0006\u0011\uffff\uffff\u0000\u011b#\u0001"+
		"\u0000\u0000\u0000\u011c\u011d\u0005%\u0000\u0000\u011d\u011e\u0005\u0001"+
		"\u0000\u0000\u011e\u011f\u0005&\u0000\u0000\u011f\u0120\u0005\r\u0000"+
		"\u0000\u0120\u0121\u0003*\u0015\u0000\u0121\u0122\u0003&\u0013\u0000\u0122"+
		"\u0123\u0005\u000e\u0000\u0000\u0123\u0124\u0005\u0016\u0000\u0000\u0124"+
		"\u0125\u0006\u0012\uffff\uffff\u0000\u0125\u0130\u0001\u0000\u0000\u0000"+
		"\u0126\u0127\u0005%\u0000\u0000\u0127\u0128\u0005\u0001\u0000\u0000\u0128"+
		"\u0129\u0005&\u0000\u0000\u0129\u012a\u0005\r\u0000\u0000\u012a\u012b"+
		"\u0003*\u0015\u0000\u012b\u012c\u0005\u000e\u0000\u0000\u012c\u012d\u0005"+
		"\u0016\u0000\u0000\u012d\u012e\u0006\u0012\uffff\uffff\u0000\u012e\u0130"+
		"\u0001\u0000\u0000\u0000\u012f\u011c\u0001\u0000\u0000\u0000\u012f\u0126"+
		"\u0001\u0000\u0000\u0000\u0130%\u0001\u0000\u0000\u0000\u0131\u0132\u0003"+
		"*\u0015\u0000\u0132\u0133\u0003(\u0014\u0000\u0133\u0134\u0006\u0013\uffff"+
		"\uffff\u0000\u0134\'\u0001\u0000\u0000\u0000\u0135\u0136\u0003*\u0015"+
		"\u0000\u0136\u0137\u0003(\u0014\u0000\u0137\u0138\u0006\u0014\uffff\uffff"+
		"\u0000\u0138\u013b\u0001\u0000\u0000\u0000\u0139\u013b\u0001\u0000\u0000"+
		"\u0000\u013a\u0135\u0001\u0000\u0000\u0000\u013a\u0139\u0001\u0000\u0000"+
		"\u0000\u013b)\u0001\u0000\u0000\u0000\u013c\u013d\u0005\u001a\u0000\u0000"+
		"\u013d\u0149\u0006\u0015\uffff\uffff\u0000\u013e\u013f\u0005/\u0000\u0000"+
		"\u013f\u0149\u0006\u0015\uffff\uffff\u0000\u0140\u0141\u00036\u001b\u0000"+
		"\u0141\u0142\u0006\u0015\uffff\uffff\u0000\u0142\u0149\u0001\u0000\u0000"+
		"\u0000\u0143\u0144\u0005*\u0000\u0000\u0144\u0149\u0006\u0015\uffff\uffff"+
		"\u0000\u0145\u0146\u00032\u0019\u0000\u0146\u0147\u0006\u0015\uffff\uffff"+
		"\u0000\u0147\u0149\u0001\u0000\u0000\u0000\u0148\u013c\u0001\u0000\u0000"+
		"\u0000\u0148\u013e\u0001\u0000\u0000\u0000\u0148\u0140\u0001\u0000\u0000"+
		"\u0000\u0148\u0143\u0001\u0000\u0000\u0000\u0148\u0145\u0001\u0000\u0000"+
		"\u0000\u0149+\u0001\u0000\u0000\u0000\u014a\u014b\u0005$\u0000\u0000\u014b"+
		"\u014c\u0005/\u0000\u0000\u014c\u014d\u0005\u0019\u0000\u0000\u014d\u014e"+
		"\u00034\u001a\u0000\u014e\u014f\u0005\u000f\u0000\u0000\u014f\u0150\u0003"+
		"0\u0018\u0000\u0150\u0151\u0005\u0016\u0000\u0000\u0151\u0152\u0006\u0016"+
		"\uffff\uffff\u0000\u0152\u016c\u0001\u0000\u0000\u0000\u0153\u0154\u0005"+
		"$\u0000\u0000\u0154\u0155\u0005/\u0000\u0000\u0155\u0156\u0005\u0019\u0000"+
		"\u0000\u0156\u0157\u0005\u000f\u0000\u0000\u0157\u0158\u00030\u0018\u0000"+
		"\u0158\u0159\u0005\u0016\u0000\u0000\u0159\u015a\u0006\u0016\uffff\uffff"+
		"\u0000\u015a\u016c\u0001\u0000\u0000\u0000\u015b\u015c\u0005$\u0000\u0000"+
		"\u015c\u015d\u0005/\u0000\u0000\u015d\u015e\u0005\u0019\u0000\u0000\u015e"+
		"\u015f\u00034\u001a\u0000\u015f\u0160\u0005\u000f\u0000\u0000\u0160\u0161"+
		"\u0005\u0016\u0000\u0000\u0161\u0162\u0006\u0016\uffff\uffff\u0000\u0162"+
		"\u016c\u0001\u0000\u0000\u0000\u0163\u0164\u0005$\u0000\u0000\u0164\u0165"+
		"\u0005\u0019\u0000\u0000\u0165\u0166\u00034\u001a\u0000\u0166\u0167\u0005"+
		"\u000f\u0000\u0000\u0167\u0168\u00030\u0018\u0000\u0168\u0169\u0005\u0016"+
		"\u0000\u0000\u0169\u016a\u0006\u0016\uffff\uffff\u0000\u016a\u016c\u0001"+
		"\u0000\u0000\u0000\u016b\u014a\u0001\u0000\u0000\u0000\u016b\u0153\u0001"+
		"\u0000\u0000\u0000\u016b\u015b\u0001\u0000\u0000\u0000\u016b\u0163\u0001"+
		"\u0000\u0000\u0000\u016c-\u0001\u0000\u0000\u0000\u016d\u016e\u0005/\u0000"+
		"\u0000\u016e\u016f\u0005\u000f\u0000\u0000\u016f\u0170\u00030\u0018\u0000"+
		"\u0170\u0171\u0005\u0016\u0000\u0000\u0171\u0172\u0006\u0017\uffff\uffff"+
		"\u0000\u0172/\u0001\u0000\u0000\u0000\u0173\u0174\u0005\u001a\u0000\u0000"+
		"\u0174\u0183\u0006\u0018\uffff\uffff\u0000\u0175\u0176\u0005\u001b\u0000"+
		"\u0000\u0176\u0183\u0006\u0018\uffff\uffff\u0000\u0177\u0178\u00032\u0019"+
		"\u0000\u0178\u0179\u0006\u0018\uffff\uffff\u0000\u0179\u0183\u0001\u0000"+
		"\u0000\u0000\u017a\u017b\u0005/\u0000\u0000\u017b\u0183\u0006\u0018\uffff"+
		"\uffff\u0000\u017c\u017d\u0003\u0018\f\u0000\u017d\u017e\u0006\u0018\uffff"+
		"\uffff\u0000\u017e\u0183\u0001\u0000\u0000\u0000\u017f\u0180\u00036\u001b"+
		"\u0000\u0180\u0181\u0006\u0018\uffff\uffff\u0000\u0181\u0183\u0001\u0000"+
		"\u0000\u0000\u0182\u0173\u0001\u0000\u0000\u0000\u0182\u0175\u0001\u0000"+
		"\u0000\u0000\u0182\u0177\u0001\u0000\u0000\u0000\u0182\u017a\u0001\u0000"+
		"\u0000\u0000\u0182\u017c\u0001\u0000\u0000\u0000\u0182\u017f\u0001\u0000"+
		"\u0000\u0000\u01831\u0001\u0000\u0000\u0000\u0184\u0185\u0007\u0000\u0000"+
		"\u0000\u01853\u0001\u0000\u0000\u0000\u0186\u0187\u0005(\u0000\u0000\u0187"+
		"\u0191\u0006\u001a\uffff\uffff\u0000\u0188\u0189\u0005)\u0000\u0000\u0189"+
		"\u0191\u0006\u001a\uffff\uffff\u0000\u018a\u018b\u0005*\u0000\u0000\u018b"+
		"\u0191\u0006\u001a\uffff\uffff\u0000\u018c\u018d\u0005+\u0000\u0000\u018d"+
		"\u0191\u0006\u001a\uffff\uffff\u0000\u018e\u018f\u0005,\u0000\u0000\u018f"+
		"\u0191\u0006\u001a\uffff\uffff\u0000\u0190\u0186\u0001\u0000\u0000\u0000"+
		"\u0190\u0188\u0001\u0000\u0000\u0000\u0190\u018a\u0001\u0000\u0000\u0000"+
		"\u0190\u018c\u0001\u0000\u0000\u0000\u0190\u018e\u0001\u0000\u0000\u0000"+
		"\u01915\u0001\u0000\u0000\u0000\u0192\u0193\u00038\u001c\u0000\u0193\u019a"+
		"\u0006\u001b\uffff\uffff\u0000\u0194\u0195\u0005\u0005\u0000\u0000\u0195"+
		"\u0196\u00038\u001c\u0000\u0196\u0197\u0006\u001b\uffff\uffff\u0000\u0197"+
		"\u0199\u0001\u0000\u0000\u0000\u0198\u0194\u0001\u0000\u0000\u0000\u0199"+
		"\u019c\u0001\u0000\u0000\u0000\u019a\u0198\u0001\u0000\u0000\u0000\u019a"+
		"\u019b\u0001\u0000\u0000\u0000\u019b\u01a9\u0001\u0000\u0000\u0000\u019c"+
		"\u019a\u0001\u0000\u0000\u0000\u019d\u019e\u00038\u001c\u0000\u019e\u01a5"+
		"\u0006\u001b\uffff\uffff\u0000\u019f\u01a0\u0005\u0006\u0000\u0000\u01a0"+
		"\u01a1\u00038\u001c\u0000\u01a1\u01a2\u0006\u001b\uffff\uffff\u0000\u01a2"+
		"\u01a4\u0001\u0000\u0000\u0000\u01a3\u019f\u0001\u0000\u0000\u0000\u01a4"+
		"\u01a7\u0001\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5"+
		"\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a8\u0192\u0001\u0000\u0000\u0000\u01a8"+
		"\u019d\u0001\u0000\u0000\u0000\u01a97\u0001\u0000\u0000\u0000\u01aa\u01ab"+
		"\u0003:\u001d\u0000\u01ab\u01b2\u0006\u001c\uffff\uffff\u0000\u01ac\u01ad"+
		"\u0005\u0007\u0000\u0000\u01ad\u01ae\u0003:\u001d\u0000\u01ae\u01af\u0006"+
		"\u001c\uffff\uffff\u0000\u01af\u01b1\u0001\u0000\u0000\u0000\u01b0\u01ac"+
		"\u0001\u0000\u0000\u0000\u01b1\u01b4\u0001\u0000\u0000\u0000\u01b2\u01b0"+
		"\u0001\u0000\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3\u01c1"+
		"\u0001\u0000\u0000\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5\u01b6"+
		"\u0003:\u001d\u0000\u01b6\u01bd\u0006\u001c\uffff\uffff\u0000\u01b7\u01b8"+
		"\u0005\b\u0000\u0000\u01b8\u01b9\u0003:\u001d\u0000\u01b9\u01ba\u0006"+
		"\u001c\uffff\uffff\u0000\u01ba\u01bc\u0001\u0000\u0000\u0000\u01bb\u01b7"+
		"\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000\u01bd\u01bb"+
		"\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000\u01be\u01c1"+
		"\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0\u01aa"+
		"\u0001\u0000\u0000\u0000\u01c0\u01b5\u0001\u0000\u0000\u0000\u01c19\u0001"+
		"\u0000\u0000\u0000\u01c2\u01c3\u0003<\u001e\u0000\u01c3\u01ca\u0006\u001d"+
		"\uffff\uffff\u0000\u01c4\u01c5\u0005\t\u0000\u0000\u01c5\u01c6\u0003<"+
		"\u001e\u0000\u01c6\u01c7\u0006\u001d\uffff\uffff\u0000\u01c7\u01c9\u0001"+
		"\u0000\u0000\u0000\u01c8\u01c4\u0001\u0000\u0000\u0000\u01c9\u01cc\u0001"+
		"\u0000\u0000\u0000\u01ca\u01c8\u0001\u0000\u0000\u0000\u01ca\u01cb\u0001"+
		"\u0000\u0000\u0000\u01cb;\u0001\u0000\u0000\u0000\u01cc\u01ca\u0001\u0000"+
		"\u0000\u0000\u01cd\u01ce\u0003>\u001f\u0000\u01ce\u01d5\u0006\u001e\uffff"+
		"\uffff\u0000\u01cf\u01d0\u0005\u0013\u0000\u0000\u01d0\u01d1\u0003>\u001f"+
		"\u0000\u01d1\u01d2\u0006\u001e\uffff\uffff\u0000\u01d2\u01d4\u0001\u0000"+
		"\u0000\u0000\u01d3\u01cf\u0001\u0000\u0000\u0000\u01d4\u01d7\u0001\u0000"+
		"\u0000\u0000\u01d5\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d6\u0001\u0000"+
		"\u0000\u0000\u01d6\u0212\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000"+
		"\u0000\u0000\u01d8\u01d9\u0003>\u001f\u0000\u01d9\u01e0\u0006\u001e\uffff"+
		"\uffff\u0000\u01da\u01db\u0005\u0014\u0000\u0000\u01db\u01dc\u0003>\u001f"+
		"\u0000\u01dc\u01dd\u0006\u001e\uffff\uffff\u0000\u01dd\u01df\u0001\u0000"+
		"\u0000\u0000\u01de\u01da\u0001\u0000\u0000\u0000\u01df\u01e2\u0001\u0000"+
		"\u0000\u0000\u01e0\u01de\u0001\u0000\u0000\u0000\u01e0\u01e1\u0001\u0000"+
		"\u0000\u0000\u01e1\u0212\u0001\u0000\u0000\u0000\u01e2\u01e0\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u0003>\u001f\u0000\u01e4\u01ec\u0006\u001e\uffff"+
		"\uffff\u0000\u01e5\u01e6\u0005\u0013\u0000\u0000\u01e6\u01e7\u0005\u000f"+
		"\u0000\u0000\u01e7\u01e8\u0003>\u001f\u0000\u01e8\u01e9\u0006\u001e\uffff"+
		"\uffff\u0000\u01e9\u01eb\u0001\u0000\u0000\u0000\u01ea\u01e5\u0001\u0000"+
		"\u0000\u0000\u01eb\u01ee\u0001\u0000\u0000\u0000\u01ec\u01ea\u0001\u0000"+
		"\u0000\u0000\u01ec\u01ed\u0001\u0000\u0000\u0000\u01ed\u0212\u0001\u0000"+
		"\u0000\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ef\u01f0\u0003>\u001f"+
		"\u0000\u01f0\u01f7\u0006\u001e\uffff\uffff\u0000\u01f1\u01f2\u0005\u0014"+
		"\u0000\u0000\u01f2\u01f3\u0003>\u001f\u0000\u01f3\u01f4\u0006\u001e\uffff"+
		"\uffff\u0000\u01f4\u01f6\u0001\u0000\u0000\u0000\u01f5\u01f1\u0001\u0000"+
		"\u0000\u0000\u01f6\u01f9\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000"+
		"\u0000\u0000\u01f7\u01f8\u0001\u0000\u0000\u0000\u01f8\u0212\u0001\u0000"+
		"\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u01fb\u0003>\u001f"+
		"\u0000\u01fb\u0202\u0006\u001e\uffff\uffff\u0000\u01fc\u01fd\u0005\u0015"+
		"\u0000\u0000\u01fd\u01fe\u0003>\u001f\u0000\u01fe\u01ff\u0006\u001e\uffff"+
		"\uffff\u0000\u01ff\u0201\u0001\u0000\u0000\u0000\u0200\u01fc\u0001\u0000"+
		"\u0000\u0000\u0201\u0204\u0001\u0000\u0000\u0000\u0202\u0200\u0001\u0000"+
		"\u0000\u0000\u0202\u0203\u0001\u0000\u0000\u0000\u0203\u0212\u0001\u0000"+
		"\u0000\u0000\u0204\u0202\u0001\u0000\u0000\u0000\u0205\u0206\u0003>\u001f"+
		"\u0000\u0206\u020e\u0006\u001e\uffff\uffff\u0000\u0207\u0208\u0005\u000f"+
		"\u0000\u0000\u0208\u0209\u0005\u000f\u0000\u0000\u0209\u020a\u0003>\u001f"+
		"\u0000\u020a\u020b\u0006\u001e\uffff\uffff\u0000\u020b\u020d\u0001\u0000"+
		"\u0000\u0000\u020c\u0207\u0001\u0000\u0000\u0000\u020d\u0210\u0001\u0000"+
		"\u0000\u0000\u020e\u020c\u0001\u0000\u0000\u0000\u020e\u020f\u0001\u0000"+
		"\u0000\u0000\u020f\u0212\u0001\u0000\u0000\u0000\u0210\u020e\u0001\u0000"+
		"\u0000\u0000\u0211\u01cd\u0001\u0000\u0000\u0000\u0211\u01d8\u0001\u0000"+
		"\u0000\u0000\u0211\u01e3\u0001\u0000\u0000\u0000\u0211\u01ef\u0001\u0000"+
		"\u0000\u0000\u0211\u01fa\u0001\u0000\u0000\u0000\u0211\u0205\u0001\u0000"+
		"\u0000\u0000\u0212=\u0001\u0000\u0000\u0000\u0213\u0214\u0005\u0018\u0000"+
		"\u0000\u0214\u0225\u0006\u001f\uffff\uffff\u0000\u0215\u0216\u0005\u0017"+
		"\u0000\u0000\u0216\u0225\u0006\u001f\uffff\uffff\u0000\u0217\u0218\u0005"+
		"\r\u0000\u0000\u0218\u0219\u00036\u001b\u0000\u0219\u021a\u0005\u000e"+
		"\u0000\u0000\u021a\u021b\u0006\u001f\uffff\uffff\u0000\u021b\u0225\u0001"+
		"\u0000\u0000\u0000\u021c\u021d\u0005/\u0000\u0000\u021d\u0225\u0006\u001f"+
		"\uffff\uffff\u0000\u021e\u021f\u0005\u0006\u0000\u0000\u021f\u0220\u0003"+
		">\u001f\u0000\u0220\u0221\u0006\u001f\uffff\uffff\u0000\u0221\u0225\u0001"+
		"\u0000\u0000\u0000\u0222\u0223\u0007\u0001\u0000\u0000\u0223\u0225\u0006"+
		"\u001f\uffff\uffff\u0000\u0224\u0213\u0001\u0000\u0000\u0000\u0224\u0215"+
		"\u0001\u0000\u0000\u0000\u0224\u0217\u0001\u0000\u0000\u0000\u0224\u021c"+
		"\u0001\u0000\u0000\u0000\u0224\u021e\u0001\u0000\u0000\u0000\u0224\u0222"+
		"\u0001\u0000\u0000\u0000\u0225?\u0001\u0000\u0000\u0000\u0226\u0227\u0005"+
		"\u000b\u0000\u0000\u0227\u0228\u0005\r\u0000\u0000\u0228\u0229\u0003B"+
		"!\u0000\u0229\u022a\u0006 \uffff\uffff\u0000\u022a\u022b\u0005\u000e\u0000"+
		"\u0000\u022b\u022c\u0005\u0016\u0000\u0000\u022c\u022d\u0006 \uffff\uffff"+
		"\u0000\u022dA\u0001\u0000\u0000\u0000\u022e\u022f\u0005\u0014\u0000\u0000"+
		"\u022f\u0230\u0005\u001c\u0000\u0000\u0230\u0231\u0005\u0013\u0000\u0000"+
		"\u0231\u0232\u0003D\"\u0000\u0232\u0233\u0005\u0002\u0000\u0000\u0233"+
		"\u0234\u0005\u001c\u0000\u0000\u0234\u0235\u0005\u0013\u0000\u0000\u0235"+
		"\u0236\u0006!\uffff\uffff\u0000\u0236C\u0001\u0000\u0000\u0000\u0237\u0238"+
		"\u0003H$\u0000\u0238\u0239\u0003F#\u0000\u0239E\u0001\u0000\u0000\u0000"+
		"\u023a\u023b\u0003H$\u0000\u023b\u023c\u0003F#\u0000\u023c\u023f\u0001"+
		"\u0000\u0000\u0000\u023d\u023f\u0001\u0000\u0000\u0000\u023e\u023a\u0001"+
		"\u0000\u0000\u0000\u023e\u023d\u0001\u0000\u0000\u0000\u023fG\u0001\u0000"+
		"\u0000\u0000\u0240\u0241\u0003J%\u0000\u0241\u0242\u0006$\uffff\uffff"+
		"\u0000\u0242\u024d\u0001\u0000\u0000\u0000\u0243\u0244\u0003N\'\u0000"+
		"\u0244\u0245\u0006$\uffff\uffff\u0000\u0245\u024d\u0001\u0000\u0000\u0000"+
		"\u0246\u0247\u0003P(\u0000\u0247\u0248\u0006$\uffff\uffff\u0000\u0248"+
		"\u024d\u0001\u0000\u0000\u0000\u0249\u024a\u0003T*\u0000\u024a\u024b\u0006"+
		"$\uffff\uffff\u0000\u024b\u024d\u0001\u0000\u0000\u0000\u024c\u0240\u0001"+
		"\u0000\u0000\u0000\u024c\u0243\u0001\u0000\u0000\u0000\u024c\u0246\u0001"+
		"\u0000\u0000\u0000\u024c\u0249\u0001\u0000\u0000\u0000\u024dI\u0001\u0000"+
		"\u0000\u0000\u024e\u024f\u0005\u0014\u0000\u0000\u024f\u0250\u0005\u001d"+
		"\u0000\u0000\u0250\u0257\u0005\u0013\u0000\u0000\u0251\u0256\u0005\u001a"+
		"\u0000\u0000\u0252\u0253\u0003L&\u0000\u0253\u0254\u0006%\uffff\uffff"+
		"\u0000\u0254\u0256\u0001\u0000\u0000\u0000\u0255\u0251\u0001\u0000\u0000"+
		"\u0000\u0255\u0252\u0001\u0000\u0000\u0000\u0256\u0259\u0001\u0000\u0000"+
		"\u0000\u0257\u0255\u0001\u0000\u0000\u0000\u0257\u0258\u0001\u0000\u0000"+
		"\u0000\u0258\u025a\u0001\u0000\u0000\u0000\u0259\u0257\u0001\u0000\u0000"+
		"\u0000\u025a\u025b\u0005\u0002\u0000\u0000\u025b\u025c\u0005\u001d\u0000"+
		"\u0000\u025c\u025d\u0005\u0013\u0000\u0000\u025d\u025e\u0006%\uffff\uffff"+
		"\u0000\u025eK\u0001\u0000\u0000\u0000\u025f\u0260\u0005\u0011\u0000\u0000"+
		"\u0260\u0261\u0005/\u0000\u0000\u0261\u0262\u0006&\uffff\uffff\u0000\u0262"+
		"\u0263\u0005\u0012\u0000\u0000\u0263\u0264\u0006&\uffff\uffff\u0000\u0264"+
		"M\u0001\u0000\u0000\u0000\u0265\u0266\u0005\u0014\u0000\u0000\u0266\u0267"+
		"\u0005\u001e\u0000\u0000\u0267\u026e\u0005\u0013\u0000\u0000\u0268\u026d"+
		"\u0005\u001a\u0000\u0000\u0269\u026a\u0003L&\u0000\u026a\u026b\u0006\'"+
		"\uffff\uffff\u0000\u026b\u026d\u0001\u0000\u0000\u0000\u026c\u0268\u0001"+
		"\u0000\u0000\u0000\u026c\u0269\u0001\u0000\u0000\u0000\u026d\u0270\u0001"+
		"\u0000\u0000\u0000\u026e\u026c\u0001\u0000\u0000\u0000\u026e\u026f\u0001"+
		"\u0000\u0000\u0000\u026f\u0271\u0001\u0000\u0000\u0000\u0270\u026e\u0001"+
		"\u0000\u0000\u0000\u0271\u0272\u0005\u0002\u0000\u0000\u0272\u0273\u0005"+
		"\u001e\u0000\u0000\u0273\u0274\u0005\u0013\u0000\u0000\u0274\u0275\u0006"+
		"\'\uffff\uffff\u0000\u0275O\u0001\u0000\u0000\u0000\u0276\u0277\u0005"+
		"\u0014\u0000\u0000\u0277\u0279\u0005\u001f\u0000\u0000\u0278\u027a\u0003"+
		"R)\u0000\u0279\u0278\u0001\u0000\u0000\u0000\u0279\u027a\u0001\u0000\u0000"+
		"\u0000\u027a\u027b\u0001\u0000\u0000\u0000\u027b\u027c\u0006(\uffff\uffff"+
		"\u0000\u027c\u0283\u0005\u0013\u0000\u0000\u027d\u0282\u0005\u001a\u0000"+
		"\u0000\u027e\u027f\u0003L&\u0000\u027f\u0280\u0006(\uffff\uffff\u0000"+
		"\u0280\u0282\u0001\u0000\u0000\u0000\u0281\u027d\u0001\u0000\u0000\u0000"+
		"\u0281\u027e\u0001\u0000\u0000\u0000\u0282\u0285\u0001\u0000\u0000\u0000"+
		"\u0283\u0281\u0001\u0000\u0000\u0000\u0283\u0284\u0001\u0000\u0000\u0000"+
		"\u0284\u0286\u0001\u0000\u0000\u0000\u0285\u0283\u0001\u0000\u0000\u0000"+
		"\u0286\u0287\u0005\u0002\u0000\u0000\u0287\u0288\u0005\u001f\u0000\u0000"+
		"\u0288\u0289\u0005\u0013\u0000\u0000\u0289\u028a\u0006(\uffff\uffff\u0000"+
		"\u028aQ\u0001\u0000\u0000\u0000\u028b\u028c\u0005 \u0000\u0000\u028c\u028d"+
		"\u0005\u000f\u0000\u0000\u028d\u028e\u0005\u0011\u0000\u0000\u028e\u028f"+
		"\u0003\u0018\f\u0000\u028f\u0290\u0006)\uffff\uffff\u0000\u0290\u0291"+
		"\u0005\u0012\u0000\u0000\u0291\u0292\u0006)\uffff\uffff\u0000\u0292S\u0001"+
		"\u0000\u0000\u0000\u0293\u0294\u0005\u0014\u0000\u0000\u0294\u029c\u0005"+
		"!\u0000\u0000\u0295\u0296\u0005\u0003\u0000\u0000\u0296\u0297\u0005\u000f"+
		"\u0000\u0000\u0297\u0298\u0005\u0011\u0000\u0000\u0298\u0299\u0003L&\u0000"+
		"\u0299\u029a\u0005\u0012\u0000\u0000\u029a\u029b\u0006*\uffff\uffff\u0000"+
		"\u029b\u029d\u0001\u0000\u0000\u0000\u029c\u0295\u0001\u0000\u0000\u0000"+
		"\u029c\u029d\u0001\u0000\u0000\u0000\u029d\u029e\u0001\u0000\u0000\u0000"+
		"\u029e\u029f\u0005\u0004\u0000\u0000\u029f\u02a0\u0006*\uffff\uffff\u0000"+
		"\u02a0U\u0001\u0000\u0000\u00002`fnv\u0083\u0094\u0098\u00b8\u00c1\u00ca"+
		"\u00cf\u00de\u00ea\u00f6\u00fc\u0100\u010a\u0113\u0117\u012f\u013a\u0148"+
		"\u016b\u0182\u0190\u019a\u01a5\u01a8\u01b2\u01bd\u01c0\u01ca\u01d5\u01e0"+
		"\u01ec\u01f7\u0202\u020e\u0211\u0224\u023e\u024c\u0255\u0257\u026c\u026e"+
		"\u0279\u0281\u0283\u029c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}