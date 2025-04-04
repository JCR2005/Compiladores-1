// Generated from /home/carlos/NetBeansProjects/BackendMinimalReacCMS/src/main/antlr4/Compilador/TipeScript.g4 by ANTLR 4.13.1


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

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class TipeScriptParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		RULE_bloque_declaracion_pagina_prima = 3, RULE_intrucciones_tipe_scrip = 4, 
		RULE_intrucciones_tipe_scrip_prima = 5, RULE_instruccion_tipo_script = 6, 
		RULE_declaracion_funcion = 7, RULE_parametros_funcion = 8, RULE_bloque_instrucciones = 9, 
		RULE_impresion_consola = 10, RULE_tipos_impresion = 11, RULE_tipo_impresiones_prima = 12, 
		RULE_tipo_impresion = 13, RULE_creacionVariable = 14, RULE_asignacionVariable = 15, 
		RULE_tipoAsignacionVariable = 16, RULE_tipoBoleano = 17, RULE_tipo = 18, 
		RULE_expresion = 19, RULE_terminoN2 = 20, RULE_terminoN3 = 21, RULE_numero = 22, 
		RULE_regreso = 23;
	private static String[] makeRuleNames() {
		return new String[] {
			"inicio", "declaracion_pagina", "bloque_declaracion_pagina", "bloque_declaracion_pagina_prima", 
			"intrucciones_tipe_scrip", "intrucciones_tipe_scrip_prima", "instruccion_tipo_script", 
			"declaracion_funcion", "parametros_funcion", "bloque_instrucciones", 
			"impresion_consola", "tipos_impresion", "tipo_impresiones_prima", "tipo_impresion", 
			"creacionVariable", "asignacionVariable", "tipoAsignacionVariable", "tipoBoleano", 
			"tipo", "expresion", "terminoN2", "terminoN3", "numero", "regreso"
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




	        boolean errorEnFuncion=false;
	    Map <String,Object> tablaSimbolos=new HashMap<String,Object>();
	     Map <String,Object> tablaFunciones=new HashMap<String,Object>();
	    Map <String,Object> tablaSimbolosLocales=null;

	    public Map<String, Object> getTablaSimbolos() {
	    return tablaSimbolos;
	}

	 public Map<String, Object> tablaFunciones() {
	    return tablaFunciones;
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
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
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
		public Bloque_declaracion_paginaContext bloque_declaracion_pagina() {
			return getRuleContext(Bloque_declaracion_paginaContext.class,0);
		}
		public RegresoContext regreso() {
			return getRuleContext(RegresoContext.class,0);
		}
		public TerminalNode CORCH2() { return getToken(TipeScriptParser.CORCH2, 0); }
		public Declaracion_paginaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_pagina; }
	}

	public final Declaracion_paginaContext declaracion_pagina() throws RecognitionException {
		Declaracion_paginaContext _localctx = new Declaracion_paginaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_declaracion_pagina);
		try {
			setState(62);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				match(CONST);
				setState(51);
				match(IDENTIFICADOR);
				setState(52);
				match(ASIGNACIO);
				setState(53);
				match(PAR1);
				setState(54);
				match(PAR2);
				setState(55);
				match(ASIGNACIO_PAGINA);
				setState(56);
				match(CORCH1);
				setState(57);
				bloque_declaracion_pagina();
				setState(58);
				regreso();
				setState(59);
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
	}

	public final Bloque_declaracion_paginaContext bloque_declaracion_pagina() throws RecognitionException {
		Bloque_declaracion_paginaContext _localctx = new Bloque_declaracion_paginaContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloque_declaracion_pagina);
		try {
			setState(70);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case CONSOLE:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				intrucciones_tipe_scrip();
				setState(65);
				bloque_declaracion_pagina_prima();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				declaracion_funcion();
				setState(68);
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
	}

	public final Bloque_declaracion_pagina_primaContext bloque_declaracion_pagina_prima() throws RecognitionException {
		Bloque_declaracion_pagina_primaContext _localctx = new Bloque_declaracion_pagina_primaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bloque_declaracion_pagina_prima);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
			case CONSOLE:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(72);
				intrucciones_tipe_scrip();
				setState(73);
				bloque_declaracion_pagina_prima();
				}
				break;
			case FUNCTION:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				declaracion_funcion();
				setState(76);
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
	}

	public final Intrucciones_tipe_scripContext intrucciones_tipe_scrip() throws RecognitionException {
		Intrucciones_tipe_scripContext _localctx = new Intrucciones_tipe_scripContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_intrucciones_tipe_scrip);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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
			setState(82);
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
	}

	public final Intrucciones_tipe_scrip_primaContext intrucciones_tipe_scrip_prima() throws RecognitionException {
		Intrucciones_tipe_scrip_primaContext _localctx = new Intrucciones_tipe_scrip_primaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_intrucciones_tipe_scrip_prima);
		try {
			setState(91);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(85);
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
				setState(87);
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
		public Instruccion_tipo_scriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion_tipo_script; }
	}

	public final Instruccion_tipo_scriptContext instruccion_tipo_script() throws RecognitionException {
		Instruccion_tipo_scriptContext _localctx = new Instruccion_tipo_scriptContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_instruccion_tipo_script);
		try {
			setState(102);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				((Instruccion_tipo_scriptContext)_localctx).creacionVariable = creacionVariable();
				  
				                        if(((Instruccion_tipo_scriptContext)_localctx).creacionVariable.value==null){
				                                
				                                ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss");
				                                _localctx.value.setBandera0(true);
				                     
				                                
				                                        errorEnFuncion=true;   
				                                
				                                
				                        }else{

				                                if(((Instruccion_tipo_scriptContext)_localctx).creacionVariable.value.isBandera0() )
				                                {      
				                                        ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss");
				                                        _localctx.value.setBandera0(true);  
				                                        
				                                        errorEnFuncion=true;   
				                                        
				                                }
				                        }
				                
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				((Instruccion_tipo_scriptContext)_localctx).asignacionVariable = asignacionVariable();
				  
				                        if(((Instruccion_tipo_scriptContext)_localctx).asignacionVariable.value==null){
				                                
				                                ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss");
				                                     _localctx.value.setBandera0(true);
				                                    
				                                        errorEnFuncion=true;   
				                                        
				                        }
				                        else{

				                                if(((Instruccion_tipo_scriptContext)_localctx).asignacionVariable.value.isBandera0() )
				                                {      
				                                        ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss");
				                                        _localctx.value.setBandera0(true);  
				                                       
				                                        errorEnFuncion=true;   
				                                        
				                                }
				                        }
				                
				                
				}
				break;
			case CONSOLE:
				enterOuterAlt(_localctx, 3);
				{
				setState(99);
				((Instruccion_tipo_scriptContext)_localctx).impresion_consola = impresion_consola();
				  
				                
				                        if(((Instruccion_tipo_scriptContext)_localctx).impresion_consola.value==null){
				                                        
				                                ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss");
				                                    _localctx.value.setBandera0(true);
				                                   
				                                        errorEnFuncion=true;   
				                                        
				                        }else{
				                                if(((Instruccion_tipo_scriptContext)_localctx).impresion_consola.value.isBandera1() ||((Instruccion_tipo_scriptContext)_localctx).impresion_consola.value.isBandera2() )
				                                {      
				                                        ((Instruccion_tipo_scriptContext)_localctx).value =  new Resultado("ss");
				                                             _localctx.value.setBandera0(true);  
				                                           
				                                        errorEnFuncion=true;   
				                                        
				                                }
				                                        
				                        }
				                        
				                
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
	public static class Declaracion_funcionContext extends ParserRuleContext {
		public Token IDENTIFICADOR;
		public Bloque_instruccionesContext bloque_instrucciones;
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
		public Bloque_instruccionesContext bloque_instrucciones() {
			return getRuleContext(Bloque_instruccionesContext.class,0);
		}
		public TerminalNode CORCH2() { return getToken(TipeScriptParser.CORCH2, 0); }
		public Declaracion_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_funcion; }
	}

	public final Declaracion_funcionContext declaracion_funcion() throws RecognitionException {
		Declaracion_funcionContext _localctx = new Declaracion_funcionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion_funcion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			match(FUNCTION);
			setState(105);
			((Declaracion_funcionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(106);
			match(PAR1);
			setState(107);
			parametros_funcion();

			                        tablaSimbolosLocales=new HashMap<String,Object>();
			                        errorEnFuncion=false;

			                
			setState(109);
			match(PAR2);
			setState(110);
			match(DOS_PUNTOS);
			setState(111);
			tipo();
			setState(112);
			match(CORCH1);
			setState(113);
			((Declaracion_funcionContext)_localctx).bloque_instrucciones = bloque_instrucciones();
			setState(114);
			match(CORCH2);

			                        

			                        if(errorEnFuncion){ 
			                                       System.out.println("hay pedo en la funcions"); 

			                        }else{ 
			                                 System.out.println((((Declaracion_funcionContext)_localctx).bloque_instrucciones!=null?_input.getText(((Declaracion_funcionContext)_localctx).bloque_instrucciones.start,((Declaracion_funcionContext)_localctx).bloque_instrucciones.stop):null)+" funcion delclaraciones");
			                                System.out.println(tablaSimbolosLocales);

			                                tablaFunciones.put((((Declaracion_funcionContext)_localctx).IDENTIFICADOR!=null?((Declaracion_funcionContext)_localctx).IDENTIFICADOR.getText():null),(((Declaracion_funcionContext)_localctx).bloque_instrucciones!=null?_input.getText(((Declaracion_funcionContext)_localctx).bloque_instrucciones.start,((Declaracion_funcionContext)_localctx).bloque_instrucciones.stop):null));
			                        }
			                       errorEnFuncion=false;
			                        tablaSimbolosLocales=null;

			                
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
	}

	public final Parametros_funcionContext parametros_funcion() throws RecognitionException {
		Parametros_funcionContext _localctx = new Parametros_funcionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_parametros_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			((Parametros_funcionContext)_localctx).id = match(IDENTIFICADOR);
			setState(118);
			((Parametros_funcionContext)_localctx).t = tipo();

			                        ((Parametros_funcionContext)_localctx).parametros =  new HashMap<String, String>(); 
			                        _localctx.parametros.put(((Parametros_funcionContext)_localctx).id.getText(), ((Parametros_funcionContext)_localctx).t.value.toString());

			                
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(120);
				match(COMA);
				setState(121);
				((Parametros_funcionContext)_localctx).id2 = match(IDENTIFICADOR);
				setState(122);
				((Parametros_funcionContext)_localctx).t2 = tipo();

				                _localctx.parametros.put(((Parametros_funcionContext)_localctx).id2.getText(), ((Parametros_funcionContext)_localctx).t2.value.toString());   
				                
				}
				}
				setState(129);
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
		public Intrucciones_tipe_scripContext intrucciones_tipe_scrip;
		public Intrucciones_tipe_scripContext intrucciones_tipe_scrip() {
			return getRuleContext(Intrucciones_tipe_scripContext.class,0);
		}
		public Bloque_instruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque_instrucciones; }
	}

	public final Bloque_instruccionesContext bloque_instrucciones() throws RecognitionException {
		Bloque_instruccionesContext _localctx = new Bloque_instruccionesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_bloque_instrucciones);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			((Bloque_instruccionesContext)_localctx).intrucciones_tipe_scrip = intrucciones_tipe_scrip();
			  



			                                if(((Bloque_instruccionesContext)_localctx).intrucciones_tipe_scrip.value.isBandera0() )
			                                {      
			                                        
			                                }else{

			                                               

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
	}

	public final Impresion_consolaContext impresion_consola() throws RecognitionException {
		Impresion_consolaContext _localctx = new Impresion_consolaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_impresion_consola);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(CONSOLE);
				setState(134);
				match(T__0);
				setState(135);
				match(LOG);
				setState(136);
				match(PAR1);
				setState(137);
				((Impresion_consolaContext)_localctx).t1 = tipo_impresion();
				setState(138);
				((Impresion_consolaContext)_localctx).t2 = tipos_impresion();
				setState(139);
				match(PAR2);
				setState(140);
				match(FINI_NSTRUCCION);
				 
				        
				        Object valor = ((Impresion_consolaContext)_localctx).t1.value.value+" "+((Impresion_consolaContext)_localctx).t2.value ;
				        ((Impresion_consolaContext)_localctx).value =  new Resultado(valor, "ss");
				        _localctx.value.setBandera2(true);
				 
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(CONSOLE);
				setState(144);
				match(T__0);
				setState(145);
				match(LOG);
				setState(146);
				match(PAR1);
				setState(147);
				((Impresion_consolaContext)_localctx).tipo_impresion = tipo_impresion();
				setState(148);
				match(PAR2);
				setState(149);
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
	}

	public final Tipos_impresionContext tipos_impresion() throws RecognitionException {
		Tipos_impresionContext _localctx = new Tipos_impresionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_tipos_impresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			((Tipos_impresionContext)_localctx).tipo_impresion = tipo_impresion();
			setState(155);
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
	}

	public final Tipo_impresiones_primaContext tipo_impresiones_prima() throws RecognitionException {
		Tipo_impresiones_primaContext _localctx = new Tipo_impresiones_primaContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo_impresiones_prima);
		try {
			setState(163);
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
				setState(158);
				((Tipo_impresiones_primaContext)_localctx).tipo_impresion = tipo_impresion();
				setState(159);
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
	}

	public final Tipo_impresionContext tipo_impresion() throws RecognitionException {
		Tipo_impresionContext _localctx = new Tipo_impresionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo_impresion);
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				((Tipo_impresionContext)_localctx).CADENA = match(CADENA);
				 
				                        Object valor = null;
				                        valor=(((Tipo_impresionContext)_localctx).CADENA!=null?((Tipo_impresionContext)_localctx).CADENA.getText():null) ; 
				                        ((Tipo_impresionContext)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				((Tipo_impresionContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				   Map <String,Object> tablaEnTurno=null;

				                         if(tablaSimbolosLocales!=null)
				                        {   
				                                System.out.println("tabala existe"); 
				                                tablaEnTurno=tablaSimbolosLocales;
				                                 if (!tablaEnTurno.containsKey((((Tipo_impresionContext)_localctx).IDENTIFICADOR!=null?((Tipo_impresionContext)_localctx).IDENTIFICADOR.getText():null))) {
				                                        String mensaje= (((Tipo_impresionContext)_localctx).IDENTIFICADOR!=null?((Tipo_impresionContext)_localctx).IDENTIFICADOR.getText():null);
				                                        ((Tipo_impresionContext)_localctx).value =  new Resultado(mensaje); 
				                                        _localctx.value.setBandera0(true);
				                                        _localctx.value.setBandera2(true);
				                                        tablaEnTurno=tablaSimbolos;
				                                }
				                               
				                        }else
				                        {  
				                                System.out.println("no esta iniciada");
				                                tablaEnTurno=tablaSimbolos;
				                        }
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
				setState(169);
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
				setState(172);
				((Tipo_impresionContext)_localctx).CHAR = match(CHAR);
				       

				                        Object valor = null;
				                        valor=(String)(((Tipo_impresionContext)_localctx).CHAR!=null?((Tipo_impresionContext)_localctx).CHAR.getText():null) ;  
				                        ((Tipo_impresionContext)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(174);
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
	}

	public final CreacionVariableContext creacionVariable() throws RecognitionException {
		CreacionVariableContext _localctx = new CreacionVariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_creacionVariable);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				((CreacionVariableContext)_localctx).VAR = match(VAR);
				setState(180);
				((CreacionVariableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(181);
				((CreacionVariableContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
				setState(182);
				((CreacionVariableContext)_localctx).tipo = tipo();
				setState(183);
				((CreacionVariableContext)_localctx).ASIGNACIO = match(ASIGNACIO);
				setState(184);
				((CreacionVariableContext)_localctx).tipoAsignacionVariable = tipoAsignacionVariable();
				setState(185);
				((CreacionVariableContext)_localctx).FINI_NSTRUCCION = match(FINI_NSTRUCCION);
				    
				                        Map <String,Object> tablaEnTurno=null;

				                        if(tablaSimbolosLocales!=null)
				                        {   
				                                System.out.println("tabala existe"); 
				                                tablaEnTurno=tablaSimbolosLocales;
				                        }else
				                        {  
				                                System.out.println("no esta iniciada");
				                                tablaEnTurno=tablaSimbolos;
				                        }
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
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(188);
				((CreacionVariableContext)_localctx).VAR = match(VAR);
				setState(189);
				((CreacionVariableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(190);
				((CreacionVariableContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
				setState(191);
				((CreacionVariableContext)_localctx).ASIGNACIO = match(ASIGNACIO);
				setState(192);
				((CreacionVariableContext)_localctx).tipoAsignacionVariable = tipoAsignacionVariable();
				setState(193);
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
				setState(196);
				((CreacionVariableContext)_localctx).VAR = match(VAR);
				setState(197);
				((CreacionVariableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
				setState(198);
				((CreacionVariableContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
				setState(199);
				((CreacionVariableContext)_localctx).tipo = tipo();
				setState(200);
				((CreacionVariableContext)_localctx).ASIGNACIO = match(ASIGNACIO);
				setState(201);
				((CreacionVariableContext)_localctx).FINI_NSTRUCCION = match(FINI_NSTRUCCION);
				     
				                        String mensaje = (((CreacionVariableContext)_localctx).VAR!=null?((CreacionVariableContext)_localctx).VAR.getText():null) + " " + (((CreacionVariableContext)_localctx).IDENTIFICADOR!=null?((CreacionVariableContext)_localctx).IDENTIFICADOR.getText():null) + " " + 
				                        (((CreacionVariableContext)_localctx).DOS_PUNTOS!=null?((CreacionVariableContext)_localctx).DOS_PUNTOS.getText():null) + " " + ((CreacionVariableContext)_localctx).tipo.value + " "+
				                        (((CreacionVariableContext)_localctx).ASIGNACIO!=null?((CreacionVariableContext)_localctx).ASIGNACIO.getText():null) +  " " + (((CreacionVariableContext)_localctx).FINI_NSTRUCCION!=null?((CreacionVariableContext)_localctx).FINI_NSTRUCCION.getText():null); 

				                        Object valor="nada asignado no reconocido";
				                        ((CreacionVariableContext)_localctx).value =  new Resultado(valor, mensaje); 
				                        _localctx.value.setBandera3(true);
				                        _localctx.value.setBandera0(true);
				                
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				((CreacionVariableContext)_localctx).VAR = match(VAR);
				setState(205);
				((CreacionVariableContext)_localctx).DOS_PUNTOS = match(DOS_PUNTOS);
				setState(206);
				((CreacionVariableContext)_localctx).tipo = tipo();
				setState(207);
				((CreacionVariableContext)_localctx).ASIGNACIO = match(ASIGNACIO);
				setState(208);
				((CreacionVariableContext)_localctx).tipoAsignacionVariable = tipoAsignacionVariable();
				setState(209);
				((CreacionVariableContext)_localctx).FINI_NSTRUCCION = match(FINI_NSTRUCCION);
				     
				                        
				                        String mensaje = (((CreacionVariableContext)_localctx).VAR!=null?((CreacionVariableContext)_localctx).VAR.getText():null) + " " + (((CreacionVariableContext)_localctx).DOS_PUNTOS!=null?((CreacionVariableContext)_localctx).DOS_PUNTOS.getText():null) + " " + ((CreacionVariableContext)_localctx).tipo.value + " " + 
				                        (((CreacionVariableContext)_localctx).ASIGNACIO!=null?((CreacionVariableContext)_localctx).ASIGNACIO.getText():null) + " " + ((CreacionVariableContext)_localctx).tipoAsignacionVariable.value.value + " " +
				                        (((CreacionVariableContext)_localctx).FINI_NSTRUCCION!=null?((CreacionVariableContext)_localctx).FINI_NSTRUCCION.getText():null); 
				                        Object valor="ID no reconocido";
				                        ((CreacionVariableContext)_localctx).value =  new Resultado(valor, mensaje); 
				                        _localctx.value.setBandera4(true);
				                        _localctx.value.setBandera0(true);
				                
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
	}

	public final AsignacionVariableContext asignacionVariable() throws RecognitionException {
		AsignacionVariableContext _localctx = new AsignacionVariableContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_asignacionVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			((AsignacionVariableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);
			setState(215);
			((AsignacionVariableContext)_localctx).ASIGNACIO = match(ASIGNACIO);
			setState(216);
			((AsignacionVariableContext)_localctx).tipoAsignacionVariable = tipoAsignacionVariable();
			setState(217);
			((AsignacionVariableContext)_localctx).FINI_NSTRUCCION = match(FINI_NSTRUCCION);
			       
			                        boolean funcion=false;
			                        Map <String,Object> tablaEnTurno=null;
			                        
			                        if(tablaSimbolosLocales!=null)
			                        {   
			                                System.out.println("tabala existe"); 
			                                tablaEnTurno=tablaSimbolosLocales;
			                                 if (!tablaEnTurno.containsKey((((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null))) {
			                                        String mensaje= (((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null);
			                                        ((AsignacionVariableContext)_localctx).value =  new Resultado(mensaje); 
			                                        _localctx.value.setBandera0(true);
			                                        _localctx.value.setBandera2(true);
			                                        tablaEnTurno=tablaSimbolos;
			                                }
			                               
			                        }else
			                        {  
			                                System.out.println("no esta iniciada");
			                                tablaEnTurno=tablaSimbolos;
			                        }
			                
			                        if (!tablaEnTurno.containsKey((((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null))) {
			                                String mensaje= (((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null);
			                                 ((AsignacionVariableContext)_localctx).value =  new Resultado(mensaje); 
			                                 _localctx.value.setBandera0(true);
			                                 _localctx.value.setBandera2(true);
			                        } else {
			                               
			                                        String valor = null;
			                        if(((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value!=null)
			                        {
			                                if (!tablaEnTurno.get((((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null)).getClass().getSimpleName().equals(((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value.getClass().getSimpleName()) ){
			                                       
			                                valor=((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value.getClass().getSimpleName()+" no compatible con "+tablaEnTurno.get((((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null)).getClass().getSimpleName();

			                                String mensaje =  (((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null) + " " + 
			                                (((AsignacionVariableContext)_localctx).ASIGNACIO!=null?((AsignacionVariableContext)_localctx).ASIGNACIO.getText():null) + " " + ((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value + " " +
			                                (((AsignacionVariableContext)_localctx).FINI_NSTRUCCION!=null?((AsignacionVariableContext)_localctx).FINI_NSTRUCCION.getText():null); 


			                                ((AsignacionVariableContext)_localctx).value =  new Resultado(mensaje); 
			                                _localctx.value.añadirMensaje(valor);        
			                                _localctx.value.setBandera1(true);
			                                  _localctx.value.setBandera0(true);
			                                }else{
			                                       
			                                        valor="Guardando en tabla: " + (((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null) + " -> " + ((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value;
			                                        tablaEnTurno.put((((AsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((AsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null), ((AsignacionVariableContext)_localctx).tipoAsignacionVariable.value.value);
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

	@SuppressWarnings("CheckReturnValue")
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
	}

	public final TipoAsignacionVariableContext tipoAsignacionVariable() throws RecognitionException {
		TipoAsignacionVariableContext _localctx = new TipoAsignacionVariableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_tipoAsignacionVariable);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(220);
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
				setState(222);
				((TipoAsignacionVariableContext)_localctx).CARACTER = match(CARACTER);
				       Object valor = null;
				                        valor=(((TipoAsignacionVariableContext)_localctx).CARACTER!=null?((TipoAsignacionVariableContext)_localctx).CARACTER.getText():null).charAt(0);  
				                        ((TipoAsignacionVariableContext)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(224);
				((TipoAsignacionVariableContext)_localctx).tipoBoleano = tipoBoleano();
				 
				                        Object valor = null;
				                        valor= Boolean.parseBoolean((((TipoAsignacionVariableContext)_localctx).tipoBoleano!=null?_input.getText(((TipoAsignacionVariableContext)_localctx).tipoBoleano.start,((TipoAsignacionVariableContext)_localctx).tipoBoleano.stop):null)); 
				                        ((TipoAsignacionVariableContext)_localctx).value =  new Resultado(valor, ""); 
				                
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(227);
				((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR = match(IDENTIFICADOR);


				                 Map <String,Object> tablaEnTurno=null;
				                        
				                if(tablaSimbolosLocales!=null)
				                {   
				                        System.out.println("tabala existe"); 
				                        tablaEnTurno=tablaSimbolosLocales;
				                                if (!tablaEnTurno.containsKey((((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null))) {
				                              
				                               
				                                tablaEnTurno=tablaSimbolos;
				                        }
				                        
				                }else
				                {  
				                        System.out.println("no esta iniciada");
				                        tablaEnTurno=tablaSimbolos;
				                }
				                        Object valor = null;
				                        if (tablaEnTurno.containsKey((((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null))) {
				                                valor = tablaEnTurno.get((((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR!=null?((TipoAsignacionVariableContext)_localctx).IDENTIFICADOR.getText():null));
				                                  ((TipoAsignacionVariableContext)_localctx).value =  new Resultado(valor, "");
				                        } 
				                       

				        
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(229);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoBoleanoContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(TipeScriptParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TipeScriptParser.FALSE, 0); }
		public TipoBoleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoBoleano; }
	}

	public final TipoBoleanoContext tipoBoleano() throws RecognitionException {
		TipoBoleanoContext _localctx = new TipoBoleanoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_tipoBoleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
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
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_tipo);
		try {
			setState(245);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				match(NUMBER);
				((TipoContext)_localctx).value = "Double";
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				match(STRING);
				((TipoContext)_localctx).value = "String";
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				match(CHAR);
				((TipoContext)_localctx).value = "Character";
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(242);
				match(BOOLEAN);
				((TipoContext)_localctx).value = "Boolean";
				}
				break;
			case VOID:
				enterOuterAlt(_localctx, 5);
				{
				setState(244);
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
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_expresion);
		int _la;
		try {
			int _alt;
			setState(269);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				((ExpresionContext)_localctx).t1 = terminoN2();

				                         Object valort1 = null;
				                        if(((ExpresionContext)_localctx).t1.value.value!=null){
				                                  valort1  = (Double)((ExpresionContext)_localctx).t1.value.value;
				                                  ((ExpresionContext)_localctx).value =  new Resultado(valort1, ""); 
				                        }      
				                
				                        
				                         ((ExpresionContext)_localctx).value =  new Resultado(valort1, ""); 
				                        
				                        
				                
				setState(255);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MAS) {
					{
					{
					setState(249);
					match(MAS);
					setState(250);
					((ExpresionContext)_localctx).t2 = terminoN2();
					 Object valor = null;
					                        if(((ExpresionContext)_localctx).t2.value.value!=null && _localctx.value.value!=null){
					                                  valor  = (Double)_localctx.value.value+ (Double)((ExpresionContext)_localctx).t2.value.value;
					                                  ((ExpresionContext)_localctx).value =  new Resultado(valor, ""); 
					                        }      
					                
					                     
					                         ((ExpresionContext)_localctx).value =  new Resultado(valor, ""); 
					                        
					                
					}
					}
					setState(257);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(258);
				((ExpresionContext)_localctx).t1 = terminoN2();

				                         Object valort1 = null;
				                        if(((ExpresionContext)_localctx).t1.value.value!=null){
				                                  valort1  = (Double)((ExpresionContext)_localctx).t1.value.value;
				                                  ((ExpresionContext)_localctx).value =  new Resultado(valort1, ""); 
				                        }      
				                
				                        
				                         ((ExpresionContext)_localctx).value =  new Resultado(valort1, ""); 
				                        
				                        
				                
				setState(266);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(260);
						match(MENOS);
						setState(261);
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
					setState(268);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	}

	public final TerminoN2Context terminoN2() throws RecognitionException {
		TerminoN2Context _localctx = new TerminoN2Context(_ctx, getState());
		enterRule(_localctx, 40, RULE_terminoN2);
		int _la;
		try {
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(271);
				((TerminoN2Context)_localctx).t1 = terminoN3();

				                         Object valort1 = null;
				                        if(((TerminoN2Context)_localctx).t1.value.value!=null ){
				                                  valort1  = (Double)((TerminoN2Context)_localctx).t1.value.value;
				                                  ((TerminoN2Context)_localctx).value =  new Resultado(valort1, ""); 
				                        }      
				                
				                        
				                         ((TerminoN2Context)_localctx).value =  new Resultado(valort1, ""); 
				                        
				                        
				                
				setState(279);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MUL) {
					{
					{
					setState(273);
					match(MUL);
					setState(274);
					((TerminoN2Context)_localctx).t2 = terminoN3();
					 Object valor = null;
					                        if(((TerminoN2Context)_localctx).t2.value.value!=null && _localctx.value.value!=null){
					                                  valor  = (Double)_localctx.value.value* (Double)((TerminoN2Context)_localctx).t2.value.value;
					                                  ((TerminoN2Context)_localctx).value =  new Resultado(valor, ""); 
					                        }      
					                
					                     
					                         ((TerminoN2Context)_localctx).value =  new Resultado(valor, ""); 
					                        
					                
					}
					}
					setState(281);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				((TerminoN2Context)_localctx).t1 = terminoN3();
				        Object valort1 = null;
				                        if(((TerminoN2Context)_localctx).t1.value.value!=null ){
				                                   valort1  =  (Double)((TerminoN2Context)_localctx).t1.value.value;
				                        }     
				                
				                         ((TerminoN2Context)_localctx).value =  new Resultado(valort1, ""); 
				                        
				                        
				                
				setState(290);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DIV) {
					{
					{
					setState(284);
					match(DIV);
					setState(285);
					((TerminoN2Context)_localctx).t2 = terminoN3();
					 Object valor = null;
					                        if(((TerminoN2Context)_localctx).t2.value.value!=null && _localctx.value.value!=null){
					                                  valor  = (Double)_localctx.value.value / (Double)((TerminoN2Context)_localctx).t2.value.value;
					                                  ((TerminoN2Context)_localctx).value =  new Resultado(valor, ""); 
					                    
					                        }
					                    
					                         ((TerminoN2Context)_localctx).value =  new Resultado(valor, ""); 
					                       
					                
					}
					}
					setState(292);
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
	}

	public final TerminoN3Context terminoN3() throws RecognitionException {
		TerminoN3Context _localctx = new TerminoN3Context(_ctx, getState());
		enterRule(_localctx, 42, RULE_terminoN3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			((TerminoN3Context)_localctx).n1 = numero();

			                         Object valorn1 = null;
			                        if(((TerminoN3Context)_localctx).n1.value.value!=null){
			                                valorn1 = (Double)((TerminoN3Context)_localctx).n1.value.value;
			                                 ((TerminoN3Context)_localctx).value =  new Resultado(valorn1, ""); 
			                        }      
			                
			                         ((TerminoN3Context)_localctx).value =  new Resultado(valorn1, ""); 
			                        
			                        
			                
			setState(303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==POT) {
				{
				{
				setState(297);
				match(POT);
				setState(298);
				((TerminoN3Context)_localctx).n2 = numero();
				  Object valor = null;
				                        if(((TerminoN3Context)_localctx).n2.value.value!=null && _localctx.value.value!=null ){  
				                               valor= Math.pow((Double)_localctx.value.value, (Double)((TerminoN3Context)_localctx).n2.value.value);
				                                 ((TerminoN3Context)_localctx).value =  new Resultado(valor, ""); 
				                        }      
				                                
				                        
				                         ((TerminoN3Context)_localctx).value =  new Resultado(valor, ""); 
				                        
				                              
				                
				}
				}
				setState(305);
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
	}

	public final NumeroContext numero() throws RecognitionException {
		NumeroContext _localctx = new NumeroContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_numero);
		int _la;
		try {
			setState(323);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ENTERO:
				enterOuterAlt(_localctx, 1);
				{
				setState(306);
				((NumeroContext)_localctx).ENTERO = match(ENTERO);
				 
				                Object valor = Double.parseDouble((((NumeroContext)_localctx).ENTERO!=null?((NumeroContext)_localctx).ENTERO.getText():null));
				             ((NumeroContext)_localctx).value =  new Resultado(valor, ""); 
				        
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(308);
				((NumeroContext)_localctx).DECIMAL = match(DECIMAL);
				 
				                 Object valor =  Double.parseDouble((((NumeroContext)_localctx).DECIMAL!=null?((NumeroContext)_localctx).DECIMAL.getText():null)); 
				             ((NumeroContext)_localctx).value =  new Resultado(valor, "");
				        
				}
				break;
			case PAR1:
				enterOuterAlt(_localctx, 3);
				{
				setState(310);
				match(PAR1);
				setState(311);
				((NumeroContext)_localctx).expresion = expresion();
				setState(312);
				match(PAR2);
				 
				                 Object valor =  ((NumeroContext)_localctx).expresion.value; 
				             ((NumeroContext)_localctx).value =  new Resultado(valor, "");
				        
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 4);
				{
				setState(315);
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
				setState(317);
				match(MENOS);
				setState(318);
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
				setState(321);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4307550208L) != 0)) ) {
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
		public TerminalNode REGRESO() { return getToken(TipeScriptParser.REGRESO, 0); }
		public TerminalNode PAR1() { return getToken(TipeScriptParser.PAR1, 0); }
		public TerminalNode PAR2() { return getToken(TipeScriptParser.PAR2, 0); }
		public TerminalNode FINI_NSTRUCCION() { return getToken(TipeScriptParser.FINI_NSTRUCCION, 0); }
		public RegresoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regreso; }
	}

	public final RegresoContext regreso() throws RecognitionException {
		RegresoContext _localctx = new RegresoContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_regreso);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			match(REGRESO);
			setState(326);
			match(PAR1);
			setState(327);
			match(PAR2);
			setState(328);
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
		"\u0004\u0001$\u014b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0003\u0001?\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002G\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003O\b\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"\\\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006g\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0005\b~\b\b\n\b\f\b\u0081\t\b\u0001\t\u0001\t\u0001\t\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0099\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00a4\b\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u00b2\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d5\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0003\u0010\u00e9\b\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0003\u0012\u00f6\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u00fe\b\u0013\n\u0013"+
		"\f\u0013\u0101\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0005\u0013\u0109\b\u0013\n\u0013\f\u0013\u010c"+
		"\t\u0013\u0003\u0013\u010e\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014\u0116\b\u0014\n\u0014"+
		"\f\u0014\u0119\t\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0005\u0014\u0121\b\u0014\n\u0014\f\u0014\u0124"+
		"\t\u0014\u0003\u0014\u0126\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u012e\b\u0015\n\u0015"+
		"\f\u0015\u0131\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0003\u0016\u0144\b\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0017\u0000\u0000\u0018\u0000\u0002\u0004"+
		"\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \""+
		"$&(*,.\u0000\u0002\u0001\u0000\"#\u0002\u0000\u0016\u0017  \u0156\u0000"+
		"0\u0001\u0000\u0000\u0000\u0002>\u0001\u0000\u0000\u0000\u0004F\u0001"+
		"\u0000\u0000\u0000\u0006N\u0001\u0000\u0000\u0000\bP\u0001\u0000\u0000"+
		"\u0000\n[\u0001\u0000\u0000\u0000\ff\u0001\u0000\u0000\u0000\u000eh\u0001"+
		"\u0000\u0000\u0000\u0010u\u0001\u0000\u0000\u0000\u0012\u0082\u0001\u0000"+
		"\u0000\u0000\u0014\u0098\u0001\u0000\u0000\u0000\u0016\u009a\u0001\u0000"+
		"\u0000\u0000\u0018\u00a3\u0001\u0000\u0000\u0000\u001a\u00b1\u0001\u0000"+
		"\u0000\u0000\u001c\u00d4\u0001\u0000\u0000\u0000\u001e\u00d6\u0001\u0000"+
		"\u0000\u0000 \u00e8\u0001\u0000\u0000\u0000\"\u00ea\u0001\u0000\u0000"+
		"\u0000$\u00f5\u0001\u0000\u0000\u0000&\u010d\u0001\u0000\u0000\u0000("+
		"\u0125\u0001\u0000\u0000\u0000*\u0127\u0001\u0000\u0000\u0000,\u0143\u0001"+
		"\u0000\u0000\u0000.\u0145\u0001\u0000\u0000\u000001\u0003\u0002\u0001"+
		"\u00001\u0001\u0001\u0000\u0000\u000023\u0005\u0007\u0000\u000034\u0005"+
		"$\u0000\u000045\u0005\f\u0000\u000056\u0005\n\u0000\u000067\u0005\u000b"+
		"\u0000\u000078\u0005\r\u0000\u000089\u0005\u000e\u0000\u00009:\u0003\u0004"+
		"\u0002\u0000:;\u0003.\u0017\u0000;<\u0005\u000f\u0000\u0000<?\u0001\u0000"+
		"\u0000\u0000=?\u0001\u0000\u0000\u0000>2\u0001\u0000\u0000\u0000>=\u0001"+
		"\u0000\u0000\u0000?\u0003\u0001\u0000\u0000\u0000@A\u0003\b\u0004\u0000"+
		"AB\u0003\u0006\u0003\u0000BG\u0001\u0000\u0000\u0000CD\u0003\u000e\u0007"+
		"\u0000DE\u0003\u0006\u0003\u0000EG\u0001\u0000\u0000\u0000F@\u0001\u0000"+
		"\u0000\u0000FC\u0001\u0000\u0000\u0000G\u0005\u0001\u0000\u0000\u0000"+
		"HI\u0003\b\u0004\u0000IJ\u0003\u0006\u0003\u0000JO\u0001\u0000\u0000\u0000"+
		"KL\u0003\u000e\u0007\u0000LM\u0003\u0006\u0003\u0000MO\u0001\u0000\u0000"+
		"\u0000NH\u0001\u0000\u0000\u0000NK\u0001\u0000\u0000\u0000O\u0007\u0001"+
		"\u0000\u0000\u0000PQ\u0003\f\u0006\u0000QR\u0006\u0004\uffff\uffff\u0000"+
		"RS\u0003\n\u0005\u0000ST\u0006\u0004\uffff\uffff\u0000T\t\u0001\u0000"+
		"\u0000\u0000UV\u0003\f\u0006\u0000VW\u0006\u0005\uffff\uffff\u0000WX\u0003"+
		"\n\u0005\u0000XY\u0006\u0005\uffff\uffff\u0000Y\\\u0001\u0000\u0000\u0000"+
		"Z\\\u0006\u0005\uffff\uffff\u0000[U\u0001\u0000\u0000\u0000[Z\u0001\u0000"+
		"\u0000\u0000\\\u000b\u0001\u0000\u0000\u0000]^\u0003\u001c\u000e\u0000"+
		"^_\u0006\u0006\uffff\uffff\u0000_g\u0001\u0000\u0000\u0000`a\u0003\u001e"+
		"\u000f\u0000ab\u0006\u0006\uffff\uffff\u0000bg\u0001\u0000\u0000\u0000"+
		"cd\u0003\u0014\n\u0000de\u0006\u0006\uffff\uffff\u0000eg\u0001\u0000\u0000"+
		"\u0000f]\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000fc\u0001\u0000"+
		"\u0000\u0000g\r\u0001\u0000\u0000\u0000hi\u0005\u001c\u0000\u0000ij\u0005"+
		"$\u0000\u0000jk\u0005\n\u0000\u0000kl\u0003\u0010\b\u0000lm\u0006\u0007"+
		"\uffff\uffff\u0000mn\u0005\u000b\u0000\u0000no\u0005\u0015\u0000\u0000"+
		"op\u0003$\u0012\u0000pq\u0005\u000e\u0000\u0000qr\u0003\u0012\t\u0000"+
		"rs\u0005\u000f\u0000\u0000st\u0006\u0007\uffff\uffff\u0000t\u000f\u0001"+
		"\u0000\u0000\u0000uv\u0005$\u0000\u0000vw\u0003$\u0012\u0000w\u007f\u0006"+
		"\b\uffff\uffff\u0000xy\u0005\t\u0000\u0000yz\u0005$\u0000\u0000z{\u0003"+
		"$\u0012\u0000{|\u0006\b\uffff\uffff\u0000|~\u0001\u0000\u0000\u0000}x"+
		"\u0001\u0000\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000"+
		"\u0000\u0000\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0011\u0001\u0000"+
		"\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0082\u0083\u0003\b\u0004"+
		"\u0000\u0083\u0084\u0006\t\uffff\uffff\u0000\u0084\u0013\u0001\u0000\u0000"+
		"\u0000\u0085\u0086\u0005\u001a\u0000\u0000\u0086\u0087\u0005\u0001\u0000"+
		"\u0000\u0087\u0088\u0005\u001b\u0000\u0000\u0088\u0089\u0005\n\u0000\u0000"+
		"\u0089\u008a\u0003\u001a\r\u0000\u008a\u008b\u0003\u0016\u000b\u0000\u008b"+
		"\u008c\u0005\u000b\u0000\u0000\u008c\u008d\u0005\u0012\u0000\u0000\u008d"+
		"\u008e\u0006\n\uffff\uffff\u0000\u008e\u0099\u0001\u0000\u0000\u0000\u008f"+
		"\u0090\u0005\u001a\u0000\u0000\u0090\u0091\u0005\u0001\u0000\u0000\u0091"+
		"\u0092\u0005\u001b\u0000\u0000\u0092\u0093\u0005\n\u0000\u0000\u0093\u0094"+
		"\u0003\u001a\r\u0000\u0094\u0095\u0005\u000b\u0000\u0000\u0095\u0096\u0005"+
		"\u0012\u0000\u0000\u0096\u0097\u0006\n\uffff\uffff\u0000\u0097\u0099\u0001"+
		"\u0000\u0000\u0000\u0098\u0085\u0001\u0000\u0000\u0000\u0098\u008f\u0001"+
		"\u0000\u0000\u0000\u0099\u0015\u0001\u0000\u0000\u0000\u009a\u009b\u0003"+
		"\u001a\r\u0000\u009b\u009c\u0003\u0018\f\u0000\u009c\u009d\u0006\u000b"+
		"\uffff\uffff\u0000\u009d\u0017\u0001\u0000\u0000\u0000\u009e\u009f\u0003"+
		"\u001a\r\u0000\u009f\u00a0\u0003\u0018\f\u0000\u00a0\u00a1\u0006\f\uffff"+
		"\uffff\u0000\u00a1\u00a4\u0001\u0000\u0000\u0000\u00a2\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a3\u009e\u0001\u0000\u0000\u0000\u00a3\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a4\u0019\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0016"+
		"\u0000\u0000\u00a6\u00b2\u0006\r\uffff\uffff\u0000\u00a7\u00a8\u0005$"+
		"\u0000\u0000\u00a8\u00b2\u0006\r\uffff\uffff\u0000\u00a9\u00aa\u0003&"+
		"\u0013\u0000\u00aa\u00ab\u0006\r\uffff\uffff\u0000\u00ab\u00b2\u0001\u0000"+
		"\u0000\u0000\u00ac\u00ad\u0005\u001f\u0000\u0000\u00ad\u00b2\u0006\r\uffff"+
		"\uffff\u0000\u00ae\u00af\u0003\"\u0011\u0000\u00af\u00b0\u0006\r\uffff"+
		"\uffff\u0000\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00a5\u0001\u0000"+
		"\u0000\u0000\u00b1\u00a7\u0001\u0000\u0000\u0000\u00b1\u00a9\u0001\u0000"+
		"\u0000\u0000\u00b1\u00ac\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000"+
		"\u0000\u0000\u00b2\u001b\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0019"+
		"\u0000\u0000\u00b4\u00b5\u0005$\u0000\u0000\u00b5\u00b6\u0005\u0015\u0000"+
		"\u0000\u00b6\u00b7\u0003$\u0012\u0000\u00b7\u00b8\u0005\f\u0000\u0000"+
		"\u00b8\u00b9\u0003 \u0010\u0000\u00b9\u00ba\u0005\u0012\u0000\u0000\u00ba"+
		"\u00bb\u0006\u000e\uffff\uffff\u0000\u00bb\u00d5\u0001\u0000\u0000\u0000"+
		"\u00bc\u00bd\u0005\u0019\u0000\u0000\u00bd\u00be\u0005$\u0000\u0000\u00be"+
		"\u00bf\u0005\u0015\u0000\u0000\u00bf\u00c0\u0005\f\u0000\u0000\u00c0\u00c1"+
		"\u0003 \u0010\u0000\u00c1\u00c2\u0005\u0012\u0000\u0000\u00c2\u00c3\u0006"+
		"\u000e\uffff\uffff\u0000\u00c3\u00d5\u0001\u0000\u0000\u0000\u00c4\u00c5"+
		"\u0005\u0019\u0000\u0000\u00c5\u00c6\u0005$\u0000\u0000\u00c6\u00c7\u0005"+
		"\u0015\u0000\u0000\u00c7\u00c8\u0003$\u0012\u0000\u00c8\u00c9\u0005\f"+
		"\u0000\u0000\u00c9\u00ca\u0005\u0012\u0000\u0000\u00ca\u00cb\u0006\u000e"+
		"\uffff\uffff\u0000\u00cb\u00d5\u0001\u0000\u0000\u0000\u00cc\u00cd\u0005"+
		"\u0019\u0000\u0000\u00cd\u00ce\u0005\u0015\u0000\u0000\u00ce\u00cf\u0003"+
		"$\u0012\u0000\u00cf\u00d0\u0005\f\u0000\u0000\u00d0\u00d1\u0003 \u0010"+
		"\u0000\u00d1\u00d2\u0005\u0012\u0000\u0000\u00d2\u00d3\u0006\u000e\uffff"+
		"\uffff\u0000\u00d3\u00d5\u0001\u0000\u0000\u0000\u00d4\u00b3\u0001\u0000"+
		"\u0000\u0000\u00d4\u00bc\u0001\u0000\u0000\u0000\u00d4\u00c4\u0001\u0000"+
		"\u0000\u0000\u00d4\u00cc\u0001\u0000\u0000\u0000\u00d5\u001d\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d7\u0005$\u0000\u0000\u00d7\u00d8\u0005\f\u0000"+
		"\u0000\u00d8\u00d9\u0003 \u0010\u0000\u00d9\u00da\u0005\u0012\u0000\u0000"+
		"\u00da\u00db\u0006\u000f\uffff\uffff\u0000\u00db\u001f\u0001\u0000\u0000"+
		"\u0000\u00dc\u00dd\u0005\u0016\u0000\u0000\u00dd\u00e9\u0006\u0010\uffff"+
		"\uffff\u0000\u00de\u00df\u0005\u0017\u0000\u0000\u00df\u00e9\u0006\u0010"+
		"\uffff\uffff\u0000\u00e0\u00e1\u0003\"\u0011\u0000\u00e1\u00e2\u0006\u0010"+
		"\uffff\uffff\u0000\u00e2\u00e9\u0001\u0000\u0000\u0000\u00e3\u00e4\u0005"+
		"$\u0000\u0000\u00e4\u00e9\u0006\u0010\uffff\uffff\u0000\u00e5\u00e6\u0003"+
		"&\u0013\u0000\u00e6\u00e7\u0006\u0010\uffff\uffff\u0000\u00e7\u00e9\u0001"+
		"\u0000\u0000\u0000\u00e8\u00dc\u0001\u0000\u0000\u0000\u00e8\u00de\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e0\u0001\u0000\u0000\u0000\u00e8\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e9!\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0007\u0000\u0000\u0000\u00eb#\u0001\u0000\u0000"+
		"\u0000\u00ec\u00ed\u0005\u001d\u0000\u0000\u00ed\u00f6\u0006\u0012\uffff"+
		"\uffff\u0000\u00ee\u00ef\u0005\u001e\u0000\u0000\u00ef\u00f6\u0006\u0012"+
		"\uffff\uffff\u0000\u00f0\u00f1\u0005\u001f\u0000\u0000\u00f1\u00f6\u0006"+
		"\u0012\uffff\uffff\u0000\u00f2\u00f3\u0005 \u0000\u0000\u00f3\u00f6\u0006"+
		"\u0012\uffff\uffff\u0000\u00f4\u00f6\u0005!\u0000\u0000\u00f5\u00ec\u0001"+
		"\u0000\u0000\u0000\u00f5\u00ee\u0001\u0000\u0000\u0000\u00f5\u00f0\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f2\u0001\u0000\u0000\u0000\u00f5\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6%\u0001\u0000\u0000\u0000\u00f7\u00f8\u0003(\u0014"+
		"\u0000\u00f8\u00ff\u0006\u0013\uffff\uffff\u0000\u00f9\u00fa\u0005\u0002"+
		"\u0000\u0000\u00fa\u00fb\u0003(\u0014\u0000\u00fb\u00fc\u0006\u0013\uffff"+
		"\uffff\u0000\u00fc\u00fe\u0001\u0000\u0000\u0000\u00fd\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fe\u0101\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001\u0000"+
		"\u0000\u0000\u00ff\u0100\u0001\u0000\u0000\u0000\u0100\u010e\u0001\u0000"+
		"\u0000\u0000\u0101\u00ff\u0001\u0000\u0000\u0000\u0102\u0103\u0003(\u0014"+
		"\u0000\u0103\u010a\u0006\u0013\uffff\uffff\u0000\u0104\u0105\u0005\u0003"+
		"\u0000\u0000\u0105\u0106\u0003(\u0014\u0000\u0106\u0107\u0006\u0013\uffff"+
		"\uffff\u0000\u0107\u0109\u0001\u0000\u0000\u0000\u0108\u0104\u0001\u0000"+
		"\u0000\u0000\u0109\u010c\u0001\u0000\u0000\u0000\u010a\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\u010b\u0001\u0000\u0000\u0000\u010b\u010e\u0001\u0000"+
		"\u0000\u0000\u010c\u010a\u0001\u0000\u0000\u0000\u010d\u00f7\u0001\u0000"+
		"\u0000\u0000\u010d\u0102\u0001\u0000\u0000\u0000\u010e\'\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0003*\u0015\u0000\u0110\u0117\u0006\u0014\uffff\uffff"+
		"\u0000\u0111\u0112\u0005\u0004\u0000\u0000\u0112\u0113\u0003*\u0015\u0000"+
		"\u0113\u0114\u0006\u0014\uffff\uffff\u0000\u0114\u0116\u0001\u0000\u0000"+
		"\u0000\u0115\u0111\u0001\u0000\u0000\u0000\u0116\u0119\u0001\u0000\u0000"+
		"\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000"+
		"\u0000\u0118\u0126\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000"+
		"\u0000\u011a\u011b\u0003*\u0015\u0000\u011b\u0122\u0006\u0014\uffff\uffff"+
		"\u0000\u011c\u011d\u0005\u0005\u0000\u0000\u011d\u011e\u0003*\u0015\u0000"+
		"\u011e\u011f\u0006\u0014\uffff\uffff\u0000\u011f\u0121\u0001\u0000\u0000"+
		"\u0000\u0120\u011c\u0001\u0000\u0000\u0000\u0121\u0124\u0001\u0000\u0000"+
		"\u0000\u0122\u0120\u0001\u0000\u0000\u0000\u0122\u0123\u0001\u0000\u0000"+
		"\u0000\u0123\u0126\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000"+
		"\u0000\u0125\u010f\u0001\u0000\u0000\u0000\u0125\u011a\u0001\u0000\u0000"+
		"\u0000\u0126)\u0001\u0000\u0000\u0000\u0127\u0128\u0003,\u0016\u0000\u0128"+
		"\u012f\u0006\u0015\uffff\uffff\u0000\u0129\u012a\u0005\u0006\u0000\u0000"+
		"\u012a\u012b\u0003,\u0016\u0000\u012b\u012c\u0006\u0015\uffff\uffff\u0000"+
		"\u012c\u012e\u0001\u0000\u0000\u0000\u012d\u0129\u0001\u0000\u0000\u0000"+
		"\u012e\u0131\u0001\u0000\u0000\u0000\u012f\u012d\u0001\u0000\u0000\u0000"+
		"\u012f\u0130\u0001\u0000\u0000\u0000\u0130+\u0001\u0000\u0000\u0000\u0131"+
		"\u012f\u0001\u0000\u0000\u0000\u0132\u0133\u0005\u0014\u0000\u0000\u0133"+
		"\u0144\u0006\u0016\uffff\uffff\u0000\u0134\u0135\u0005\u0013\u0000\u0000"+
		"\u0135\u0144\u0006\u0016\uffff\uffff\u0000\u0136\u0137\u0005\n\u0000\u0000"+
		"\u0137\u0138\u0003&\u0013\u0000\u0138\u0139\u0005\u000b\u0000\u0000\u0139"+
		"\u013a\u0006\u0016\uffff\uffff\u0000\u013a\u0144\u0001\u0000\u0000\u0000"+
		"\u013b\u013c\u0005$\u0000\u0000\u013c\u0144\u0006\u0016\uffff\uffff\u0000"+
		"\u013d\u013e\u0005\u0003\u0000\u0000\u013e\u013f\u0003,\u0016\u0000\u013f"+
		"\u0140\u0006\u0016\uffff\uffff\u0000\u0140\u0144\u0001\u0000\u0000\u0000"+
		"\u0141\u0142\u0007\u0001\u0000\u0000\u0142\u0144\u0006\u0016\uffff\uffff"+
		"\u0000\u0143\u0132\u0001\u0000\u0000\u0000\u0143\u0134\u0001\u0000\u0000"+
		"\u0000\u0143\u0136\u0001\u0000\u0000\u0000\u0143\u013b\u0001\u0000\u0000"+
		"\u0000\u0143\u013d\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000\u0000"+
		"\u0000\u0144-\u0001\u0000\u0000\u0000\u0145\u0146\u0005\b\u0000\u0000"+
		"\u0146\u0147\u0005\n\u0000\u0000\u0147\u0148\u0005\u000b\u0000\u0000\u0148"+
		"\u0149\u0005\u0012\u0000\u0000\u0149/\u0001\u0000\u0000\u0000\u0014>F"+
		"N[f\u007f\u0098\u00a3\u00b1\u00d4\u00e8\u00f5\u00ff\u010a\u010d\u0117"+
		"\u0122\u0125\u012f\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}