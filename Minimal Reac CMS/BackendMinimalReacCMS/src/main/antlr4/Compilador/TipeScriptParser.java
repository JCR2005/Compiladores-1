// Generated from TipeScript.g4 by ANTLR 4.7.2


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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TipeScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, MAS=2, MENOS=3, MUL=4, DIV=5, POT=6, CONST=7, REGRESO=8, COMA=9, 
		PAR1=10, PAR2=11, ASIGNACIO=12, ASIGNACIO_PAGINA=13, CORCH1=14, CORCH2=15, 
		MAYOR_QUE=16, MENOR_QUE=17, FINI_NSTRUCCION=18, DECIMAL=19, ENTERO=20, 
		DOS_PUNTOS=21, CADENA=22, CARACTER=23, WS=24, VAR=25, CONSOLE=26, LOG=27, 
		FUNCTION=28, NUMBER=29, STRING=30, CHAR=31, BOOLEAN=32, VOID=33, TRUE=34, 
		FALSE=35, IDENTIFICADOR=36;
	public static final int
		RULE_inicio = 0, RULE_declaracion_pagina = 1, RULE_bloque_declaracion_pagina = 2, 
		RULE_intrucciones_tipe_scrip = 3, RULE_intrucciones_tipe_scrip_prima = 4, 
		RULE_instruccion_tipo_script = 5, RULE_declaracion_funcion = 6, RULE_parametros_funcion = 7, 
		RULE_impresion_consola = 8, RULE_tipos_impresion = 9, RULE_tipo_impresiones_prima = 10, 
		RULE_tipo_impresion = 11, RULE_creacionVariable = 12, RULE_asignacionVariable = 13, 
		RULE_tipoAsignacionVariable = 14, RULE_tipoBoleano = 15, RULE_tipo = 16, 
		RULE_expresion = 17, RULE_terminoN2 = 18, RULE_terminoN3 = 19, RULE_numero = 20, 
		RULE_regreso = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "declaracion_pagina", "bloque_declaracion_pagina", "intrucciones_tipe_scrip", 
			"intrucciones_tipe_scrip_prima", "instruccion_tipo_script", "declaracion_funcion", 
			"parametros_funcion", "impresion_consola", "tipos_impresion", "tipo_impresiones_prima", 
			"tipo_impresion", "creacionVariable", "asignacionVariable", "tipoAsignacionVariable", 
			"tipoBoleano", "tipo", "expresion", "terminoN2", "terminoN3", "numero", 
			"regreso"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.'", "'+'", "'-'", "'*'", "'/'", "'^'", "'const'", "'return'", 
			"','", "'('", "')'", "'='", "'=>'", "'{'", "'}'", "'>'", "'<'", "';'", 
			null, null, "':'", null, null, null, "'var'", "'console'", "'log'", "'function'", 
			"'number'", "'string'", "'char'", "'boolean'", "'void'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "MAS", "MENOS", "MUL", "DIV", "POT", "CONST", "REGRESO", 
			"COMA", "PAR1", "PAR2", "ASIGNACIO", "ASIGNACIO_PAGINA", "CORCH1", "CORCH2", 
			"MAYOR_QUE", "MENOR_QUE", "FINI_NSTRUCCION", "DECIMAL", "ENTERO", "DOS_PUNTOS", 
			"CADENA", "CARACTER", "WS", "VAR", "CONSOLE", "LOG", "FUNCTION", "NUMBER", 
			"STRING", "CHAR", "BOOLEAN", "VOID", "TRUE", "FALSE", "IDENTIFICADOR"
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


	    Map <String,Object> tablaSimbolos=new HashMap<String,Object>();

	    public Map<String, Object> getTablaSimbolos() {
	    return tablaSimbolos;
	}


	public TipeScriptParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
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

	public static class Declaracion_paginaContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(TipeScriptParser.CONST, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(TipeScriptParser.IDENTIFICADOR, 0); }
		public TerminalNode ASIGNACIO() { return getToken(TipeScriptParser.ASIGNACIO, 0); }
		public TerminalNode PAR1() { return getToken(TipeScriptParser.PAR1, 0); }
		public TerminalNode PAR2() { return getToken(TipeScriptParser.PAR2, 0); }
		public TerminalNode ASIGNACIO_PAGINA() { return getToken(TipeScriptParser.ASIGNACIO_PAGINA, 0); }
		public TerminalNode CORCH1() { return getToken(TipeScriptParser.CORCH1, 0); }
		public Bloque_declaracion_paginaContext bloque_declaracion_pagina() {
			return getRuleContext(Bloque_declaracion_paginaContext.class,0);
		}
		public TerminalNode CORCH2() { return getToken(TipeScriptParser.CORCH2, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitDeclaracion_pagina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_paginaContext declaracion_pagina() throws RecognitionException {
		Declaracion_paginaContext _localctx = new Declaracion_paginaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracion_pagina);
		try {
			setState(57);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				match(CONST);
				setState(47);
				match(IDENTIFICADOR);
				setState(48);
				match(ASIGNACIO);
				setState(49);
				match(PAR1);
				setState(50);
				match(PAR2);
				setState(51);
				match(ASIGNACIO_PAGINA);
				setState(52);
				match(CORCH1);
				setState(53);
				bloque_declaracion_pagina();
				setState(54);
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

	public static class Bloque_declaracion_paginaContext extends ParserRuleContext {
		public Intrucciones_tipe_scripContext intrucciones_tipe_scrip() {
			return getRuleContext(Intrucciones_tipe_scripContext.class,0);
		}
		public RegresoContext regreso() {
			return getRuleContext(RegresoContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitBloque_declaracion_pagina(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bloque_declaracion_paginaContext bloque_declaracion_pagina() throws RecognitionException {
		Bloque_declaracion_paginaContext _localctx = new Bloque_declaracion_paginaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloque_declaracion_pagina);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			intrucciones_tipe_scrip();
			setState(60);
			regreso();
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

	public static class Intrucciones_tipe_scripContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitIntrucciones_tipe_scrip(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Intrucciones_tipe_scripContext intrucciones_tipe_scrip() throws RecognitionException {
		Intrucciones_tipe_scripContext _localctx = new Intrucciones_tipe_scripContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_intrucciones_tipe_scrip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			instruccion_tipo_script();
			setState(63);
			intrucciones_tipe_scrip_prima();
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

	public static class Intrucciones_tipe_scrip_primaContext extends ParserRuleContext {
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitIntrucciones_tipe_scrip_prima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Intrucciones_tipe_scrip_primaContext intrucciones_tipe_scrip_prima() throws RecognitionException {
		Intrucciones_tipe_scrip_primaContext _localctx = new Intrucciones_tipe_scrip_primaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intrucciones_tipe_scrip_prima);
		try {
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case CONSOLE:
			case FUNCTION:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				instruccion_tipo_script();
				setState(66);
				intrucciones_tipe_scrip_prima();
				}
				break;
			case REGRESO:
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

	public static class Instruccion_tipo_scriptContext extends ParserRuleContext {
		public Resultado value;
		public CreacionVariableContext creacionVariable;
		public AsignacionVariableContext asignacionVariable;
		public Impresion_consolaContext impresion_consola;
		public CreacionVariableContext creacionVariable() {
			return getRuleContext(CreacionVariableContext.class,0);
		}
		public AsignacionVariableContext asignacionVariable() {
			return getRuleContext(AsignacionVariableContext.class,0);
		}
		public Impresion_consolaContext impresion_consola() {
			return getRuleContext(Impresion_consolaContext.class,0);
		}
		public Declaracion_funcionContext declaracion_funcion() {
			return getRuleContext(Declaracion_funcionContext.class,0);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitInstruccion_tipo_script(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Instruccion_tipo_scriptContext instruccion_tipo_script() throws RecognitionException {
		Instruccion_tipo_scriptContext _localctx = new Instruccion_tipo_scriptContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instruccion_tipo_script);
		try {
			setState(81);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				((Instruccion_tipo_scriptContext)_localctx).creacionVariable = creacionVariable();
				  
				                     if(((Instruccion_tipo_scriptContext)_localctx).creacionVariable.value==null){
				                                 
				                                ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss");
				                                 _localctx.value.setBandera1(true);
				                        
				                     }

				                
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				((Instruccion_tipo_scriptContext)_localctx).asignacionVariable = asignacionVariable();
				  
				                      if(((Instruccion_tipo_scriptContext)_localctx).asignacionVariable.value==null){
				                                 
				                                ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss");
				                                 _localctx.value.setBandera2(true);
				                     }
				                      System.out.println("1");   
				                
				}
				break;
			case CONSOLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				((Instruccion_tipo_scriptContext)_localctx).impresion_consola = impresion_consola();
				  
				                    
				                      if(((Instruccion_tipo_scriptContext)_localctx).impresion_consola.value==null){
				                                 
				                                ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss");
				                                System.out.println("2.7");   
				                     }else{
				                                 if(((Instruccion_tipo_scriptContext)_localctx).impresion_consola.value.isBandera1() ||((Instruccion_tipo_scriptContext)_localctx).impresion_consola.value.isBandera2() )
				                                 {      
				                                        ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss");
				                                        _localctx.value.setBandera3(true);           
				                                 }
				                                
				                     }
				                        
				                
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 4);
				{
				setState(80);
				declaracion_funcion();
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

	public static class Declaracion_funcionContext extends ParserRuleContext {
		public Parametros_funcionContext parametros_funcion;
		public TerminalNode FUNCTION() { return getToken(TipeScriptParser.FUNCTION, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(TipeScriptParser.IDENTIFICADOR, 0); }
		public TerminalNode PAR1() { return getToken(TipeScriptParser.PAR1, 0); }
		public Parametros_funcionContext parametros_funcion() {
			return getRuleContext(Parametros_funcionContext.class,0);
		}
		public TerminalNode PAR2() { return getToken(TipeScriptParser.PAR2, 0); }
		public TerminalNode DOS_PUNTOS() { return getToken(TipeScriptParser.DOS_PUNTOS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode CORCH1() { return getToken(TipeScriptParser.CORCH1, 0); }
		public TerminalNode CORCH2() { return getToken(TipeScriptParser.CORCH2, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitDeclaracion_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_funcionContext declaracion_funcion() throws RecognitionException {
		Declaracion_funcionContext _localctx = new Declaracion_funcionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(FUNCTION);
			setState(84);
			match(IDENTIFICADOR);
			setState(85);
			match(PAR1);
			setState(86);
			((Declaracion_funcionContext)_localctx).parametros_funcion = parametros_funcion();
			setState(87);
			match(PAR2);
			setState(88);
			match(DOS_PUNTOS);
			setState(89);
			tipo();
			setState(90);
			match(CORCH1);
			setState(91);
			match(CORCH2);

			                        System.out.println(((Declaracion_funcionContext)_localctx).parametros_funcion.parametros);

			                
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

	public static class Parametros_funcionContext extends ParserRuleContext {
		public Map<String, String> parametros;
		public Token id;
		public TipoContext t;
		public Token id2;
		public TipoContext t2;
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitParametros_funcion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_funcionContext parametros_funcion() throws RecognitionException {
		Parametros_funcionContext _localctx = new Parametros_funcionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_parametros_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			((Parametros_funcionContext)_localctx).id = match(IDENTIFICADOR);
			setState(95);
			((Parametros_funcionContext)_localctx).t = tipo();

			                        ((Parametros_funcionContext)_localctx).parametros =  new HashMap<String, String>(); 
			                        _localctx.parametros.put(((Parametros_funcionContext)_localctx).id.getText(), ((Parametros_funcionContext)_localctx).t.value.getText());

			                
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(97);
				match(COMA);
				setState(98);
				((Parametros_funcionContext)_localctx).id2 = match(IDENTIFICADOR);
				setState(99);
				((Parametros_funcionContext)_localctx).t2 = tipo();

				                      _localctx.parametros.put(((Parametros_funcionContext)_localctx).id2.getText(), ((Parametros_funcionContext)_localctx).t2.value.getText());   
				                
				}
				}
				setState(106);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitImpresion_consola(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Impresion_consolaContext impresion_consola() throws RecognitionException {
		Impresion_consolaContext _localctx = new Impresion_consolaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_impresion_consola);
		try {
			setState(126);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(107);
				match(CONSOLE);
				setState(108);
				match(T__0);
				setState(109);
				match(LOG);
				setState(110);
				match(PAR1);
				setState(111);
				((Impresion_consolaContext)_localctx).t1 = tipo_impresion();
				setState(112);
				((Impresion_consolaContext)_localctx).t2 = tipos_impresion();
				setState(113);
				match(PAR2);
				setState(114);
				match(FINI_NSTRUCCION);
				 
				        
				        Object valor = ((Impresion_consolaContext)_localctx).t1.value.value+" "+((Impresion_consolaContext)_localctx).t2.value ;
				        ((Impresion_consolaContext)_localctx).value =  new Resultado(valor, "ss");
				        _localctx.value.setBandera2(true);
				 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(117);
				match(CONSOLE);
				setState(118);
				match(T__0);
				setState(119);
				match(LOG);
				setState(120);
				match(PAR1);
				setState(121);
				((Impresion_consolaContext)_localctx).tipo_impresion = tipo_impresion();
				setState(122);
				match(PAR2);
				setState(123);
				match(FINI_NSTRUCCION);
				 
				         
				    if(((Impresion_consolaContext)_localctx).tipo_impresion.value != null && ((Impresion_consolaContext)_localctx).tipo_impresion.value.value != null){
				         Object valor = null;
				         ((Impresion_consolaContext)_localctx).value =  new Resultado(valor, "ss");
				        if(((Impresion_consolaContext)_localctx).tipo_impresion.value.isBandera1()){
				                  _localctx.value.setBandera1(true);
				        }
				        System.out.println("imprimiendo: " + ((Impresion_consolaContext)_localctx).tipo_impresion.value.value);        
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitTipos_impresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_impresionContext tipos_impresion() throws RecognitionException {
		Tipos_impresionContext _localctx = new Tipos_impresionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_tipos_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			((Tipos_impresionContext)_localctx).tipo_impresion = tipo_impresion();
			setState(129);
			((Tipos_impresionContext)_localctx).tipo_impresiones_prima = tipo_impresiones_prima();
			 ((Tipos_impresionContext)_localctx).value =  ((Tipos_impresionContext)_localctx).tipo_impresion.value.value+" "+((Tipos_impresionContext)_localctx).tipo_impresiones_prima.value;     
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitTipo_impresiones_prima(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_impresiones_primaContext tipo_impresiones_prima() throws RecognitionException {
		Tipo_impresiones_primaContext _localctx = new Tipo_impresiones_primaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_tipo_impresiones_prima);
		try {
			setState(137);
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
				setState(132);
				((Tipo_impresiones_primaContext)_localctx).tipo_impresion = tipo_impresion();
				setState(133);
				tipo_impresiones_prima();
				 ((Tipo_impresiones_primaContext)_localctx).value =  String.valueOf(((Tipo_impresiones_primaContext)_localctx).tipo_impresion.value.value);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitTipo_impresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_impresionContext tipo_impresion() throws RecognitionException {
		Tipo_impresionContext _localctx = new Tipo_impresionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipo_impresion);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				((Tipo_impresionContext)_localctx).CADENA = match(CADENA);
				 
				                        Object valor = null;
				                        valor=(((Tipo_impresionContext)_localctx).CADENA!=null?((Tipo_impresionContext)_localctx).CADENA.getText():null) ; 
				                        ((Tipo_impresionContext)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				((Tipo_impresionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				 
				                        boolean ban1=false;
				                        Object valor = null;
				                        if (!tablaSimbolos.containsKey((((Tipo_impresionContext)_localctx).IDENTIFICADOR!=null?((Tipo_impresionContext)_localctx).IDENTIFICADOR.getText():null))) {
				                               
				                                ban1=true;
				                        } else {
				                                valor = tablaSimbolos.get((((Tipo_impresionContext)_localctx).IDENTIFICADOR!=null?((Tipo_impresionContext)_localctx).IDENTIFICADOR.getText():null));
				                        }
				                        ((Tipo_impresionContext)_localctx).value =  new Resultado(valor, ""); 
				                        _localctx.value.setBandera1(ban1);

				                
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(143);
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
				setState(146);
				((Tipo_impresionContext)_localctx).CHAR = match(CHAR);
				       

				                        Object valor = null;
				                        valor=(String)(((Tipo_impresionContext)_localctx).CHAR!=null?((Tipo_impresionContext)_localctx).CHAR.getText():null) ;  
				                        ((Tipo_impresionContext)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(148);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitCreacionVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreacionVariableContext creacionVariable() throws RecognitionException {
		CreacionVariableContext _localctx = new CreacionVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_creacionVariable);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(153);
				((CreacionVariableContext)_localctx).VAR = match(VAR);
				setState(154);
				((CreacionVariableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(155);
				((CreacionVariableContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
				setState(156);
				((CreacionVariableContext)_localctx).tipo = tipo();
				setState(157);
				((CreacionVariableContext)_localctx).ASIGNACIO = match(ASIGNACIO);
				setState(158);
				((CreacionVariableContext)_localctx).tipoAsignacionVariable = tipoAsignacionVariable();
				setState(159);
				((CreacionVariableContext)_localctx).FINI_NSTRUCCION = match(FINI_NSTRUCCION);
				     
				                        String valor = null;

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
				                                }else{
				                                       
				                                        valor="Guardando en tabla: " + (((CreacionVariableContext)_localctx).IDENTIFICADOR!=null?((CreacionVariableContext)_localctx).IDENTIFICADOR.getText():null) + " -> " + ((CreacionVariableContext)_localctx).tipoAsignacionVariable.value.value;
				                                        tablaSimbolos.put((((CreacionVariableContext)_localctx).IDENTIFICADOR!=null?((CreacionVariableContext)_localctx).IDENTIFICADOR.getText():null), ((CreacionVariableContext)_localctx).tipoAsignacionVariable.value.value);
				                                        ((CreacionVariableContext)_localctx).value =  new Resultado(valor, ""); 
				                                        
				                                }
				                        }
				                               
				                
				                       
				                
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				((CreacionVariableContext)_localctx).VAR = match(VAR);
				setState(163);
				((CreacionVariableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(164);
				((CreacionVariableContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
				setState(165);
				((CreacionVariableContext)_localctx).ASIGNACIO = match(ASIGNACIO);
				setState(166);
				((CreacionVariableContext)_localctx).tipoAsignacionVariable = tipoAsignacionVariable();
				setState(167);
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
				                
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				((CreacionVariableContext)_localctx).VAR = match(VAR);
				setState(171);
				((CreacionVariableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(172);
				((CreacionVariableContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
				setState(173);
				((CreacionVariableContext)_localctx).tipo = tipo();
				setState(174);
				((CreacionVariableContext)_localctx).ASIGNACIO = match(ASIGNACIO);
				setState(175);
				((CreacionVariableContext)_localctx).FINI_NSTRUCCION = match(FINI_NSTRUCCION);
				     
				                        String mensaje = (((CreacionVariableContext)_localctx).VAR!=null?((CreacionVariableContext)_localctx).VAR.getText():null) + " " + (((CreacionVariableContext)_localctx).IDENTIFICADOR!=null?((CreacionVariableContext)_localctx).IDENTIFICADOR.getText():null) + " " + 
				                        (((CreacionVariableContext)_localctx).DOS_PUNTOS!=null?((CreacionVariableContext)_localctx).DOS_PUNTOS.getText():null) + " " + ((CreacionVariableContext)_localctx).tipo.value + " "+
				                        (((CreacionVariableContext)_localctx).ASIGNACIO!=null?((CreacionVariableContext)_localctx).ASIGNACIO.getText():null) +  " " + (((CreacionVariableContext)_localctx).FINI_NSTRUCCION!=null?((CreacionVariableContext)_localctx).FINI_NSTRUCCION.getText():null); 

				                        Object valor="nada asignado no reconocido";
				                        ((CreacionVariableContext)_localctx).value =  new Resultado(valor, mensaje); 
				                        _localctx.value.setBandera3(true);
				                
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(178);
				((CreacionVariableContext)_localctx).VAR = match(VAR);
				setState(179);
				((CreacionVariableContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
				setState(180);
				((CreacionVariableContext)_localctx).tipo = tipo();
				setState(181);
				((CreacionVariableContext)_localctx).ASIGNACIO = match(ASIGNACIO);
				setState(182);
				((CreacionVariableContext)_localctx).tipoAsignacionVariable = tipoAsignacionVariable();
				setState(183);
				((CreacionVariableContext)_localctx).FINI_NSTRUCCION = match(FINI_NSTRUCCION);
				     
				                        
				                        String mensaje = (((CreacionVariableContext)_localctx).VAR!=null?((CreacionVariableContext)_localctx).VAR.getText():null) + " " + (((CreacionVariableContext)_localctx).DOS_PUNTOS!=null?((CreacionVariableContext)_localctx).DOS_PUNTOS.getText():null) + " " + ((CreacionVariableContext)_localctx).tipo.value + " " + 
				                        (((CreacionVariableContext)_localctx).ASIGNACIO!=null?((CreacionVariableContext)_localctx).ASIGNACIO.getText():null) + " " + ((CreacionVariableContext)_localctx).tipoAsignacionVariable.value.value + " " +
				                        (((CreacionVariableContext)_localctx).FINI_NSTRUCCION!=null?((CreacionVariableContext)_localctx).FINI_NSTRUCCION.getText():null); 
				                        Object valor="ID no reconocido";
				                        ((CreacionVariableContext)_localctx).value =  new Resultado(valor, mensaje); 
				                        _localctx.value.setBandera4(true);
				                
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitAsignacionVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionVariableContext asignacionVariable() throws RecognitionException {
		AsignacionVariableContext _localctx = new AsignacionVariableContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_asignacionVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			((AsignacionVariableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(189);
			((AsignacionVariableContext)_localctx).ASIGNACIO = match(ASIGNACIO);
			setState(190);
			((AsignacionVariableContext)_localctx).tipoAsignacionVariable = tipoAsignacionVariable();
			setState(191);
			((AsignacionVariableContext)_localctx).FINI_NSTRUCCION = match(FINI_NSTRUCCION);
			       if (!tablaSimbolos.containsKey((((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null))) {
			                                System.out.println("No está declarada: " + (((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null));
			                        } else {
			                               
			                                        String valor = null;
			                        if(((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value!=null)
			                        {
			                                if (!tablaSimbolos.get((((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null)).getClass().getSimpleName().equals(((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value.getClass().getSimpleName()) ){
			                                       
			                                valor=((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value.getClass().getSimpleName()+" no compatible con "+tablaSimbolos.get((((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null)).getClass().getSimpleName();

			                                String mensaje =  (((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null) + " " + 
			                                (((AsignacionVariableContext)_localctx).ASIGNACIO!=null?((AsignacionVariableContext)_localctx).ASIGNACIO.getText():null) + " " + ((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value + " " +
			                                (((AsignacionVariableContext)_localctx).FINI_NSTRUCCION!=null?((AsignacionVariableContext)_localctx).FINI_NSTRUCCION.getText():null); 


			                                ((AsignacionVariableContext)_localctx).value =  new Resultado(mensaje); 
			                                _localctx.value.añadirMensaje(valor);        
			                                _localctx.value.setBandera1(true);
			                                }else{
			                                       
			                                        valor="Guardando en tabla: " + (((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null) + " -> " + ((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value;
			                                        tablaSimbolos.put((((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null), ((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value);
			                                        ((AsignacionVariableContext)_localctx).value =  new Resultado(valor, ""); 
			                                        
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

	public static class TipoAsignacionVariableContext extends ParserRuleContext {
		public Resultado value;
		public Token CADENA;
		public Token CARACTER;
		public TipoBoleanoContext tipoBoleano;
		public Token IDENTIFICADOR;
		public ExpresionContext expresion;
		public TerminalNode CADENA() { return getToken(TipeScriptParser.CADENA, 0); }
		public TerminalNode CARACTER() { return getToken(TipeScriptParser.CARACTER, 0); }
		public TipoBoleanoContext tipoBoleano() {
			return getRuleContext(TipoBoleanoContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(TipeScriptParser.IDENTIFICADOR, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitTipoAsignacionVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoAsignacionVariableContext tipoAsignacionVariable() throws RecognitionException {
		TipoAsignacionVariableContext _localctx = new TipoAsignacionVariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipoAsignacionVariable);
		try {
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(194);
				((TipoAsignacionVariableContext)_localctx).CADENA = match(CADENA);
				 
				                        Object valor = null;
				                        valor=(String)(((TipoAsignacionVariableContext)_localctx).CADENA!=null?((TipoAsignacionVariableContext)_localctx).CADENA.getText():null) ;  
				                        System.out.println("cadenananan");
				                        ((TipoAsignacionVariableContext)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(196);
				((TipoAsignacionVariableContext)_localctx).CARACTER = match(CARACTER);
				       Object valor = null;
				                        valor=(((TipoAsignacionVariableContext)_localctx).CARACTER!=null?((TipoAsignacionVariableContext)_localctx).CARACTER.getText():null).charAt(0);  
				                        ((TipoAsignacionVariableContext)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(198);
				((TipoAsignacionVariableContext)_localctx).tipoBoleano = tipoBoleano();
				 
				                        Object valor = null;
				                        valor= Boolean.parseBoolean((((TipoAsignacionVariableContext)_localctx).tipoBoleano!=null?_input.getText(((TipoAsignacionVariableContext)_localctx).tipoBoleano.start,((TipoAsignacionVariableContext)_localctx).tipoBoleano.stop):null)); 
				                        ((TipoAsignacionVariableContext)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(201);
				((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);

				                        Object valor = null;
				                        if (tablaSimbolos.containsKey((((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null))) {
				                                valor = tablaSimbolos.get((((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null));
				                                  ((TipoAsignacionVariableContext)_localctx).value =  new Resultado(valor, "");
				                        } 
				                       

				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(203);
				((TipoAsignacionVariableContext)_localctx).expresion = expresion();
				 
				                        Object valor = null;
				                        valor=((TipoAsignacionVariableContext)_localctx).expresion.value.value ;  
				                        ((TipoAsignacionVariableContext)_localctx).value =  new Resultado(valor, ""); 
				                
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitTipoBoleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoBoleanoContext tipoBoleano() throws RecognitionException {
		TipoBoleanoContext _localctx = new TipoBoleanoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipoBoleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipo);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				match(NUMBER);
				((TipoContext)_localctx).value = "Double";
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(212);
				match(STRING);
				((TipoContext)_localctx).value = "String";
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(214);
				match(CHAR);
				((TipoContext)_localctx).value = "Character";
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(216);
				match(BOOLEAN);
				((TipoContext)_localctx).value = "Boolean";
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				match(VOID);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expresion);
		int _la;
		try {
			int _alt;
			setState(243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221);
				((ExpresionContext)_localctx).t1 = terminoN2();

				                         Object valort1 = null;
				                        if(((ExpresionContext)_localctx).t1.value.value!=null){
				                                  valort1  = (Double)((ExpresionContext)_localctx).t1.value.value;
				                                  ((ExpresionContext)_localctx).value =  new Resultado(valort1, ""); 
				                        }      
				                
				                        
				                         ((ExpresionContext)_localctx).value =  new Resultado(valort1, ""); 
				                        
				                        
				                
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MAS) {
					{
					{
					setState(223);
					match(MAS);
					setState(224);
					((ExpresionContext)_localctx).t2 = terminoN2();
					 Object valor = null;
					                        if(((ExpresionContext)_localctx).t2.value.value!=null && _localctx.value.value!=null){
					                                  valor  = (Double)_localctx.value.value+ (Double)((ExpresionContext)_localctx).t2.value.value;
					                                  ((ExpresionContext)_localctx).value =  new Resultado(valor, ""); 
					                        }      
					                
					                     
					                         ((ExpresionContext)_localctx).value =  new Resultado(valor, ""); 
					                        
					                
					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				((ExpresionContext)_localctx).t1 = terminoN2();

				                         Object valort1 = null;
				                        if(((ExpresionContext)_localctx).t1.value.value!=null){
				                                  valort1  = (Double)((ExpresionContext)_localctx).t1.value.value;
				                                  ((ExpresionContext)_localctx).value =  new Resultado(valort1, ""); 
				                        }      
				                
				                        
				                         ((ExpresionContext)_localctx).value =  new Resultado(valort1, ""); 
				                        
				                        
				                
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(234);
						match(MENOS);
						setState(235);
						((ExpresionContext)_localctx).t2 = terminoN2();
						 Object valor = null;
						                        if(((ExpresionContext)_localctx).t2.value.value!=null && _localctx.value.value!=null){
						                                  valor  = (Double)_localctx.value.value- (Double)((ExpresionContext)_localctx).t2.value.value;
						                                  ((ExpresionContext)_localctx).value =  new Resultado(valor, ""); 
						                        }      
						                
						                     
						                         ((ExpresionContext)_localctx).value =  new Resultado(valor, ""); 
						                        
						                
						}
						} 
					}
					setState(242);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitTerminoN2(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoN2Context terminoN2() throws RecognitionException {
		TerminoN2Context _localctx = new TerminoN2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_terminoN2);
		int _la;
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(245);
				((TerminoN2Context)_localctx).t1 = terminoN3();

				                         Object valort1 = null;
				                        if(((TerminoN2Context)_localctx).t1.value.value!=null ){
				                                  valort1  = (Double)((TerminoN2Context)_localctx).t1.value.value;
				                                  ((TerminoN2Context)_localctx).value =  new Resultado(valort1, ""); 
				                        }      
				                
				                        
				                         ((TerminoN2Context)_localctx).value =  new Resultado(valort1, ""); 
				                        
				                        
				                
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MUL) {
					{
					{
					setState(247);
					match(MUL);
					setState(248);
					((TerminoN2Context)_localctx).t2 = terminoN3();
					 Object valor = null;
					                        if(((TerminoN2Context)_localctx).t2.value.value!=null && _localctx.value.value!=null){
					                                  valor  = (Double)_localctx.value.value* (Double)((TerminoN2Context)_localctx).t2.value.value;
					                                  ((TerminoN2Context)_localctx).value =  new Resultado(valor, ""); 
					                        }      
					                
					                     
					                         ((TerminoN2Context)_localctx).value =  new Resultado(valor, ""); 
					                        
					                
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				((TerminoN2Context)_localctx).t1 = terminoN3();
				        Object valort1 = null;
				                        if(((TerminoN2Context)_localctx).t1.value.value!=null ){
				                                   valort1  =  (Double)((TerminoN2Context)_localctx).t1.value.value;
				                        }     
				                
				                         ((TerminoN2Context)_localctx).value =  new Resultado(valort1, ""); 
				                        
				                        
				                
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV) {
					{
					{
					setState(258);
					match(DIV);
					setState(259);
					((TerminoN2Context)_localctx).t2 = terminoN3();
					 Object valor = null;
					                        if(((TerminoN2Context)_localctx).t2.value.value!=null && _localctx.value.value!=null){
					                                  valor  = (Double)_localctx.value.value / (Double)((TerminoN2Context)_localctx).t2.value.value;
					                                  ((TerminoN2Context)_localctx).value =  new Resultado(valor, ""); 
					                    
					                        }
					                    
					                         ((TerminoN2Context)_localctx).value =  new Resultado(valor, ""); 
					                       
					                
					}
					}
					setState(266);
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

	public static class TerminoN3Context extends ParserRuleContext {
		public Resultado value;
		public NumeroContext n1;
		public NumeroContext n2;
		public List<NumeroContext> numero() {
			return getRuleContexts(NumeroContext.class);
		}
		public NumeroContext numero(int i) {
			return getRuleContext(NumeroContext.class,i);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitTerminoN3(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TerminoN3Context terminoN3() throws RecognitionException {
		TerminoN3Context _localctx = new TerminoN3Context(_ctx, getState());
		enterRule(_localctx, 38, RULE_terminoN3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(269);
			((TerminoN3Context)_localctx).n1 = numero();

			                         Object valorn1 = null;
			                        if(((TerminoN3Context)_localctx).n1.value.value!=null){
			                                valorn1 = (Double)((TerminoN3Context)_localctx).n1.value.value;
			                                 ((TerminoN3Context)_localctx).value =  new Resultado(valorn1, ""); 
			                        }      
			                
			                         ((TerminoN3Context)_localctx).value =  new Resultado(valorn1, ""); 
			                        
			                        
			                
			setState(277);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POT) {
				{
				{
				setState(271);
				match(POT);
				setState(272);
				((TerminoN3Context)_localctx).n2 = numero();
				  Object valor = null;
				                        if(((TerminoN3Context)_localctx).n2.value.value!=null && _localctx.value.value!=null ){  
				                               valor= Math.pow((Double)_localctx.value.value, (Double)((TerminoN3Context)_localctx).n2.value.value);
				                                 ((TerminoN3Context)_localctx).value =  new Resultado(valor, ""); 
				                        }      
				                                
				                        
				                         ((TerminoN3Context)_localctx).value =  new Resultado(valor, ""); 
				                        
				                              
				                
				}
				}
				setState(279);
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_numero);
		int _la;
		try {
			setState(297);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				((NumeroContext)_localctx).ENTERO = match(ENTERO);
				 
				                Object valor = Double.parseDouble((((NumeroContext)_localctx).ENTERO!=null?((NumeroContext)_localctx).ENTERO.getText():null));
				             ((NumeroContext)_localctx).value =  new Resultado(valor, ""); 
				        
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				((NumeroContext)_localctx).DECIMAL = match(DECIMAL);
				 
				                 Object valor =  Double.parseDouble((((NumeroContext)_localctx).DECIMAL!=null?((NumeroContext)_localctx).DECIMAL.getText():null)); 
				             ((NumeroContext)_localctx).value =  new Resultado(valor, "");
				        
				}
				break;
			case PAR1:
				enterOuterAlt(_localctx, 3);
				{
				setState(284);
				match(PAR1);
				setState(285);
				((NumeroContext)_localctx).expresion = expresion();
				setState(286);
				match(PAR2);
				 
				                 Object valor =  ((NumeroContext)_localctx).expresion.value; 
				             ((NumeroContext)_localctx).value =  new Resultado(valor, "");
				        
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(289);
				((NumeroContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				 
				                 System.out.println("Estra a expresione");
				                boolean ban1 = false;
				                boolean ban2 = false;
				                Object valor = null;
				                
				                if (!tablaSimbolos.containsKey((((NumeroContext)_localctx).IDENTIFICADOR!=null?((NumeroContext)_localctx).IDENTIFICADOR.getText():null))) {
				                        valor = null; 
				                        ban1=true;
				                } else {

				                        if(tablaSimbolos.get((((NumeroContext)_localctx).IDENTIFICADOR!=null?((NumeroContext)_localctx).IDENTIFICADOR.getText():null)) instanceof Double){
				                                valor = tablaSimbolos.get((((NumeroContext)_localctx).IDENTIFICADOR!=null?((NumeroContext)_localctx).IDENTIFICADOR.getText():null));

				                        } else{
				                                ban2=true;
				                                 valor= null;
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
				setState(291);
				match(MENOS);
				setState(292);
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
				setState(295);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CADENA) | (1L << CARACTER) | (1L << BOOLEAN))) != 0)) ) {
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

	public static class RegresoContext extends ParserRuleContext {
		public TerminalNode REGRESO() { return getToken(TipeScriptParser.REGRESO, 0); }
		public TerminalNode PAR1() { return getToken(TipeScriptParser.PAR1, 0); }
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
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TipeScriptVisitor ) return ((TipeScriptVisitor<? extends T>)visitor).visitRegreso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegresoContext regreso() throws RecognitionException {
		RegresoContext _localctx = new RegresoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_regreso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(REGRESO);
			setState(300);
			match(PAR1);
			setState(301);
			match(PAR2);
			setState(302);
			match(FINI_NSTRUCCION);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3&\u0133\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6"+
		"\3\6\3\6\3\6\5\6H\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7T\n\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\7\ti\n\t\f\t\16\tl\13\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u0081\n\n\3\13\3\13\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\5\f\u008c\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\5\r\u009a\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u00bd\n\16\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\5\20\u00d1\n\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\5\22\u00de\n\22\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00e6"+
		"\n\23\f\23\16\23\u00e9\13\23\3\23\3\23\3\23\3\23\3\23\3\23\7\23\u00f1"+
		"\n\23\f\23\16\23\u00f4\13\23\5\23\u00f6\n\23\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u00fe\n\24\f\24\16\24\u0101\13\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\7\24\u0109\n\24\f\24\16\24\u010c\13\24\5\24\u010e\n\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u0116\n\25\f\25\16\25\u0119\13\25\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\5\26\u012c\n\26\3\27\3\27\3\27\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$&(*,\2\4\3\2$%\4\2\30\31\"\"\2\u013f\2"+
		".\3\2\2\2\4;\3\2\2\2\6=\3\2\2\2\b@\3\2\2\2\nG\3\2\2\2\fS\3\2\2\2\16U\3"+
		"\2\2\2\20`\3\2\2\2\22\u0080\3\2\2\2\24\u0082\3\2\2\2\26\u008b\3\2\2\2"+
		"\30\u0099\3\2\2\2\32\u00bc\3\2\2\2\34\u00be\3\2\2\2\36\u00d0\3\2\2\2 "+
		"\u00d2\3\2\2\2\"\u00dd\3\2\2\2$\u00f5\3\2\2\2&\u010d\3\2\2\2(\u010f\3"+
		"\2\2\2*\u012b\3\2\2\2,\u012d\3\2\2\2./\5\4\3\2/\3\3\2\2\2\60\61\7\t\2"+
		"\2\61\62\7&\2\2\62\63\7\16\2\2\63\64\7\f\2\2\64\65\7\r\2\2\65\66\7\17"+
		"\2\2\66\67\7\20\2\2\678\5\6\4\289\7\21\2\29<\3\2\2\2:<\3\2\2\2;\60\3\2"+
		"\2\2;:\3\2\2\2<\5\3\2\2\2=>\5\b\5\2>?\5,\27\2?\7\3\2\2\2@A\5\f\7\2AB\5"+
		"\n\6\2B\t\3\2\2\2CD\5\f\7\2DE\5\n\6\2EH\3\2\2\2FH\3\2\2\2GC\3\2\2\2GF"+
		"\3\2\2\2H\13\3\2\2\2IJ\5\32\16\2JK\b\7\1\2KT\3\2\2\2LM\5\34\17\2MN\b\7"+
		"\1\2NT\3\2\2\2OP\5\22\n\2PQ\b\7\1\2QT\3\2\2\2RT\5\16\b\2SI\3\2\2\2SL\3"+
		"\2\2\2SO\3\2\2\2SR\3\2\2\2T\r\3\2\2\2UV\7\36\2\2VW\7&\2\2WX\7\f\2\2XY"+
		"\5\20\t\2YZ\7\r\2\2Z[\7\27\2\2[\\\5\"\22\2\\]\7\20\2\2]^\7\21\2\2^_\b"+
		"\b\1\2_\17\3\2\2\2`a\7&\2\2ab\5\"\22\2bj\b\t\1\2cd\7\13\2\2de\7&\2\2e"+
		"f\5\"\22\2fg\b\t\1\2gi\3\2\2\2hc\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2"+
		"k\21\3\2\2\2lj\3\2\2\2mn\7\34\2\2no\7\3\2\2op\7\35\2\2pq\7\f\2\2qr\5\30"+
		"\r\2rs\5\24\13\2st\7\r\2\2tu\7\24\2\2uv\b\n\1\2v\u0081\3\2\2\2wx\7\34"+
		"\2\2xy\7\3\2\2yz\7\35\2\2z{\7\f\2\2{|\5\30\r\2|}\7\r\2\2}~\7\24\2\2~\177"+
		"\b\n\1\2\177\u0081\3\2\2\2\u0080m\3\2\2\2\u0080w\3\2\2\2\u0081\23\3\2"+
		"\2\2\u0082\u0083\5\30\r\2\u0083\u0084\5\26\f\2\u0084\u0085\b\13\1\2\u0085"+
		"\25\3\2\2\2\u0086\u0087\5\30\r\2\u0087\u0088\5\26\f\2\u0088\u0089\b\f"+
		"\1\2\u0089\u008c\3\2\2\2\u008a\u008c\3\2\2\2\u008b\u0086\3\2\2\2\u008b"+
		"\u008a\3\2\2\2\u008c\27\3\2\2\2\u008d\u008e\7\30\2\2\u008e\u009a\b\r\1"+
		"\2\u008f\u0090\7&\2\2\u0090\u009a\b\r\1\2\u0091\u0092\5$\23\2\u0092\u0093"+
		"\b\r\1\2\u0093\u009a\3\2\2\2\u0094\u0095\7!\2\2\u0095\u009a\b\r\1\2\u0096"+
		"\u0097\5 \21\2\u0097\u0098\b\r\1\2\u0098\u009a\3\2\2\2\u0099\u008d\3\2"+
		"\2\2\u0099\u008f\3\2\2\2\u0099\u0091\3\2\2\2\u0099\u0094\3\2\2\2\u0099"+
		"\u0096\3\2\2\2\u009a\31\3\2\2\2\u009b\u009c\7\33\2\2\u009c\u009d\7&\2"+
		"\2\u009d\u009e\7\27\2\2\u009e\u009f\5\"\22\2\u009f\u00a0\7\16\2\2\u00a0"+
		"\u00a1\5\36\20\2\u00a1\u00a2\7\24\2\2\u00a2\u00a3\b\16\1\2\u00a3\u00bd"+
		"\3\2\2\2\u00a4\u00a5\7\33\2\2\u00a5\u00a6\7&\2\2\u00a6\u00a7\7\27\2\2"+
		"\u00a7\u00a8\7\16\2\2\u00a8\u00a9\5\36\20\2\u00a9\u00aa\7\24\2\2\u00aa"+
		"\u00ab\b\16\1\2\u00ab\u00bd\3\2\2\2\u00ac\u00ad\7\33\2\2\u00ad\u00ae\7"+
		"&\2\2\u00ae\u00af\7\27\2\2\u00af\u00b0\5\"\22\2\u00b0\u00b1\7\16\2\2\u00b1"+
		"\u00b2\7\24\2\2\u00b2\u00b3\b\16\1\2\u00b3\u00bd\3\2\2\2\u00b4\u00b5\7"+
		"\33\2\2\u00b5\u00b6\7\27\2\2\u00b6\u00b7\5\"\22\2\u00b7\u00b8\7\16\2\2"+
		"\u00b8\u00b9\5\36\20\2\u00b9\u00ba\7\24\2\2\u00ba\u00bb\b\16\1\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u009b\3\2\2\2\u00bc\u00a4\3\2\2\2\u00bc\u00ac\3\2"+
		"\2\2\u00bc\u00b4\3\2\2\2\u00bd\33\3\2\2\2\u00be\u00bf\7&\2\2\u00bf\u00c0"+
		"\7\16\2\2\u00c0\u00c1\5\36\20\2\u00c1\u00c2\7\24\2\2\u00c2\u00c3\b\17"+
		"\1\2\u00c3\35\3\2\2\2\u00c4\u00c5\7\30\2\2\u00c5\u00d1\b\20\1\2\u00c6"+
		"\u00c7\7\31\2\2\u00c7\u00d1\b\20\1\2\u00c8\u00c9\5 \21\2\u00c9\u00ca\b"+
		"\20\1\2\u00ca\u00d1\3\2\2\2\u00cb\u00cc\7&\2\2\u00cc\u00d1\b\20\1\2\u00cd"+
		"\u00ce\5$\23\2\u00ce\u00cf\b\20\1\2\u00cf\u00d1\3\2\2\2\u00d0\u00c4\3"+
		"\2\2\2\u00d0\u00c6\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00cb\3\2\2\2\u00d0"+
		"\u00cd\3\2\2\2\u00d1\37\3\2\2\2\u00d2\u00d3\t\2\2\2\u00d3!\3\2\2\2\u00d4"+
		"\u00d5\7\37\2\2\u00d5\u00de\b\22\1\2\u00d6\u00d7\7 \2\2\u00d7\u00de\b"+
		"\22\1\2\u00d8\u00d9\7!\2\2\u00d9\u00de\b\22\1\2\u00da\u00db\7\"\2\2\u00db"+
		"\u00de\b\22\1\2\u00dc\u00de\7#\2\2\u00dd\u00d4\3\2\2\2\u00dd\u00d6\3\2"+
		"\2\2\u00dd\u00d8\3\2\2\2\u00dd\u00da\3\2\2\2\u00dd\u00dc\3\2\2\2\u00de"+
		"#\3\2\2\2\u00df\u00e0\5&\24\2\u00e0\u00e7\b\23\1\2\u00e1\u00e2\7\4\2\2"+
		"\u00e2\u00e3\5&\24\2\u00e3\u00e4\b\23\1\2\u00e4\u00e6\3\2\2\2\u00e5\u00e1"+
		"\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8"+
		"\u00f6\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\5&\24\2\u00eb\u00f2\b\23"+
		"\1\2\u00ec\u00ed\7\5\2\2\u00ed\u00ee\5&\24\2\u00ee\u00ef\b\23\1\2\u00ef"+
		"\u00f1\3\2\2\2\u00f0\u00ec\3\2\2\2\u00f1\u00f4\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f5"+
		"\u00df\3\2\2\2\u00f5\u00ea\3\2\2\2\u00f6%\3\2\2\2\u00f7\u00f8\5(\25\2"+
		"\u00f8\u00ff\b\24\1\2\u00f9\u00fa\7\6\2\2\u00fa\u00fb\5(\25\2\u00fb\u00fc"+
		"\b\24\1\2\u00fc\u00fe\3\2\2\2\u00fd\u00f9\3\2\2\2\u00fe\u0101\3\2\2\2"+
		"\u00ff\u00fd\3\2\2\2\u00ff\u0100\3\2\2\2\u0100\u010e\3\2\2\2\u0101\u00ff"+
		"\3\2\2\2\u0102\u0103\5(\25\2\u0103\u010a\b\24\1\2\u0104\u0105\7\7\2\2"+
		"\u0105\u0106\5(\25\2\u0106\u0107\b\24\1\2\u0107\u0109\3\2\2\2\u0108\u0104"+
		"\3\2\2\2\u0109\u010c\3\2\2\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2\u010b"+
		"\u010e\3\2\2\2\u010c\u010a\3\2\2\2\u010d\u00f7\3\2\2\2\u010d\u0102\3\2"+
		"\2\2\u010e\'\3\2\2\2\u010f\u0110\5*\26\2\u0110\u0117\b\25\1\2\u0111\u0112"+
		"\7\b\2\2\u0112\u0113\5*\26\2\u0113\u0114\b\25\1\2\u0114\u0116\3\2\2\2"+
		"\u0115\u0111\3\2\2\2\u0116\u0119\3\2\2\2\u0117\u0115\3\2\2\2\u0117\u0118"+
		"\3\2\2\2\u0118)\3\2\2\2\u0119\u0117\3\2\2\2\u011a\u011b\7\26\2\2\u011b"+
		"\u012c\b\26\1\2\u011c\u011d\7\25\2\2\u011d\u012c\b\26\1\2\u011e\u011f"+
		"\7\f\2\2\u011f\u0120\5$\23\2\u0120\u0121\7\r\2\2\u0121\u0122\b\26\1\2"+
		"\u0122\u012c\3\2\2\2\u0123\u0124\7&\2\2\u0124\u012c\b\26\1\2\u0125\u0126"+
		"\7\5\2\2\u0126\u0127\5*\26\2\u0127\u0128\b\26\1\2\u0128\u012c\3\2\2\2"+
		"\u0129\u012a\t\3\2\2\u012a\u012c\b\26\1\2\u012b\u011a\3\2\2\2\u012b\u011c"+
		"\3\2\2\2\u012b\u011e\3\2\2\2\u012b\u0123\3\2\2\2\u012b\u0125\3\2\2\2\u012b"+
		"\u0129\3\2\2\2\u012c+\3\2\2\2\u012d\u012e\7\n\2\2\u012e\u012f\7\f\2\2"+
		"\u012f\u0130\7\r\2\2\u0130\u0131\7\24\2\2\u0131-\3\2\2\2\24;GSj\u0080"+
		"\u008b\u0099\u00bc\u00d0\u00dd\u00e7\u00f2\u00f5\u00ff\u010a\u010d\u0117"+
		"\u012b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}