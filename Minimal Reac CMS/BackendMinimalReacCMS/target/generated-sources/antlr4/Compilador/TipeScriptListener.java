// Generated from Compilador/TipeScript.g4 by ANTLR 4.13.2
package Compilador;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TipeScriptParser}.
 */
public interface TipeScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(TipeScriptParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(TipeScriptParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#declaracion_pagina}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_pagina(TipeScriptParser.Declaracion_paginaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#declaracion_pagina}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_pagina(TipeScriptParser.Declaracion_paginaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#bloque_declaracion_pagina}.
	 * @param ctx the parse tree
	 */
	void enterBloque_declaracion_pagina(TipeScriptParser.Bloque_declaracion_paginaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#bloque_declaracion_pagina}.
	 * @param ctx the parse tree
	 */
	void exitBloque_declaracion_pagina(TipeScriptParser.Bloque_declaracion_paginaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#bloque_declaracion_pagina_prima}.
	 * @param ctx the parse tree
	 */
	void enterBloque_declaracion_pagina_prima(TipeScriptParser.Bloque_declaracion_pagina_primaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#bloque_declaracion_pagina_prima}.
	 * @param ctx the parse tree
	 */
	void exitBloque_declaracion_pagina_prima(TipeScriptParser.Bloque_declaracion_pagina_primaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#intrucciones_tipe_scrip}.
	 * @param ctx the parse tree
	 */
	void enterIntrucciones_tipe_scrip(TipeScriptParser.Intrucciones_tipe_scripContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#intrucciones_tipe_scrip}.
	 * @param ctx the parse tree
	 */
	void exitIntrucciones_tipe_scrip(TipeScriptParser.Intrucciones_tipe_scripContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#intrucciones_tipe_scrip_prima}.
	 * @param ctx the parse tree
	 */
	void enterIntrucciones_tipe_scrip_prima(TipeScriptParser.Intrucciones_tipe_scrip_primaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#intrucciones_tipe_scrip_prima}.
	 * @param ctx the parse tree
	 */
	void exitIntrucciones_tipe_scrip_prima(TipeScriptParser.Intrucciones_tipe_scrip_primaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#instruccion_tipo_script}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion_tipo_script(TipeScriptParser.Instruccion_tipo_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#instruccion_tipo_script}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion_tipo_script(TipeScriptParser.Instruccion_tipo_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#regreso_funcion}.
	 * @param ctx the parse tree
	 */
	void enterRegreso_funcion(TipeScriptParser.Regreso_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#regreso_funcion}.
	 * @param ctx the parse tree
	 */
	void exitRegreso_funcion(TipeScriptParser.Regreso_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_funcion(TipeScriptParser.Declaracion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_funcion(TipeScriptParser.Declaracion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#parametros_funcion}.
	 * @param ctx the parse tree
	 */
	void enterParametros_funcion(TipeScriptParser.Parametros_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#parametros_funcion}.
	 * @param ctx the parse tree
	 */
	void exitParametros_funcion(TipeScriptParser.Parametros_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#bloque_instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterBloque_instrucciones(TipeScriptParser.Bloque_instruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#bloque_instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitBloque_instrucciones(TipeScriptParser.Bloque_instruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#bloque_instrucciones_prima}.
	 * @param ctx the parse tree
	 */
	void enterBloque_instrucciones_prima(TipeScriptParser.Bloque_instrucciones_primaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#bloque_instrucciones_prima}.
	 * @param ctx the parse tree
	 */
	void exitBloque_instrucciones_prima(TipeScriptParser.Bloque_instrucciones_primaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(TipeScriptParser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(TipeScriptParser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#llamada_parametros_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_parametros_funcion(TipeScriptParser.Llamada_parametros_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#llamada_parametros_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_parametros_funcion(TipeScriptParser.Llamada_parametros_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(TipeScriptParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(TipeScriptParser.CondicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#bloque_instrucciones_condicional}.
	 * @param ctx the parse tree
	 */
	void enterBloque_instrucciones_condicional(TipeScriptParser.Bloque_instrucciones_condicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#bloque_instrucciones_condicional}.
	 * @param ctx the parse tree
	 */
	void exitBloque_instrucciones_condicional(TipeScriptParser.Bloque_instrucciones_condicionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#bloque_instrucciones_condicional_prima}.
	 * @param ctx the parse tree
	 */
	void enterBloque_instrucciones_condicional_prima(TipeScriptParser.Bloque_instrucciones_condicional_primaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#bloque_instrucciones_condicional_prima}.
	 * @param ctx the parse tree
	 */
	void exitBloque_instrucciones_condicional_prima(TipeScriptParser.Bloque_instrucciones_condicional_primaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#regreso_if}.
	 * @param ctx the parse tree
	 */
	void enterRegreso_if(TipeScriptParser.Regreso_ifContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#regreso_if}.
	 * @param ctx the parse tree
	 */
	void exitRegreso_if(TipeScriptParser.Regreso_ifContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#impresion_consola}.
	 * @param ctx the parse tree
	 */
	void enterImpresion_consola(TipeScriptParser.Impresion_consolaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#impresion_consola}.
	 * @param ctx the parse tree
	 */
	void exitImpresion_consola(TipeScriptParser.Impresion_consolaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#tipos_impresion}.
	 * @param ctx the parse tree
	 */
	void enterTipos_impresion(TipeScriptParser.Tipos_impresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#tipos_impresion}.
	 * @param ctx the parse tree
	 */
	void exitTipos_impresion(TipeScriptParser.Tipos_impresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#tipo_impresiones_prima}.
	 * @param ctx the parse tree
	 */
	void enterTipo_impresiones_prima(TipeScriptParser.Tipo_impresiones_primaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#tipo_impresiones_prima}.
	 * @param ctx the parse tree
	 */
	void exitTipo_impresiones_prima(TipeScriptParser.Tipo_impresiones_primaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#tipo_impresion}.
	 * @param ctx the parse tree
	 */
	void enterTipo_impresion(TipeScriptParser.Tipo_impresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#tipo_impresion}.
	 * @param ctx the parse tree
	 */
	void exitTipo_impresion(TipeScriptParser.Tipo_impresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#creacionVariable}.
	 * @param ctx the parse tree
	 */
	void enterCreacionVariable(TipeScriptParser.CreacionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#creacionVariable}.
	 * @param ctx the parse tree
	 */
	void exitCreacionVariable(TipeScriptParser.CreacionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#asignacionVariable}.
	 * @param ctx the parse tree
	 */
	void enterAsignacionVariable(TipeScriptParser.AsignacionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#asignacionVariable}.
	 * @param ctx the parse tree
	 */
	void exitAsignacionVariable(TipeScriptParser.AsignacionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#tipoAsignacionVariable}.
	 * @param ctx the parse tree
	 */
	void enterTipoAsignacionVariable(TipeScriptParser.TipoAsignacionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#tipoAsignacionVariable}.
	 * @param ctx the parse tree
	 */
	void exitTipoAsignacionVariable(TipeScriptParser.TipoAsignacionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#tipoBoleano}.
	 * @param ctx the parse tree
	 */
	void enterTipoBoleano(TipeScriptParser.TipoBoleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#tipoBoleano}.
	 * @param ctx the parse tree
	 */
	void exitTipoBoleano(TipeScriptParser.TipoBoleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(TipeScriptParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(TipeScriptParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(TipeScriptParser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(TipeScriptParser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#terminoN2}.
	 * @param ctx the parse tree
	 */
	void enterTerminoN2(TipeScriptParser.TerminoN2Context ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#terminoN2}.
	 * @param ctx the parse tree
	 */
	void exitTerminoN2(TipeScriptParser.TerminoN2Context ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#terminoN3}.
	 * @param ctx the parse tree
	 */
	void enterTerminoN3(TipeScriptParser.TerminoN3Context ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#terminoN3}.
	 * @param ctx the parse tree
	 */
	void exitTerminoN3(TipeScriptParser.TerminoN3Context ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#terminoN4}.
	 * @param ctx the parse tree
	 */
	void enterTerminoN4(TipeScriptParser.TerminoN4Context ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#terminoN4}.
	 * @param ctx the parse tree
	 */
	void exitTerminoN4(TipeScriptParser.TerminoN4Context ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#numero}.
	 * @param ctx the parse tree
	 */
	void enterNumero(TipeScriptParser.NumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#numero}.
	 * @param ctx the parse tree
	 */
	void exitNumero(TipeScriptParser.NumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#regreso}.
	 * @param ctx the parse tree
	 */
	void enterRegreso(TipeScriptParser.RegresoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#regreso}.
	 * @param ctx the parse tree
	 */
	void exitRegreso(TipeScriptParser.RegresoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#bloque_main}.
	 * @param ctx the parse tree
	 */
	void enterBloque_main(TipeScriptParser.Bloque_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#bloque_main}.
	 * @param ctx the parse tree
	 */
	void exitBloque_main(TipeScriptParser.Bloque_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#bloque_instrucciones_html}.
	 * @param ctx the parse tree
	 */
	void enterBloque_instrucciones_html(TipeScriptParser.Bloque_instrucciones_htmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#bloque_instrucciones_html}.
	 * @param ctx the parse tree
	 */
	void exitBloque_instrucciones_html(TipeScriptParser.Bloque_instrucciones_htmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#bloque_instrucciones_html_prima}.
	 * @param ctx the parse tree
	 */
	void enterBloque_instrucciones_html_prima(TipeScriptParser.Bloque_instrucciones_html_primaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#bloque_instrucciones_html_prima}.
	 * @param ctx the parse tree
	 */
	void exitBloque_instrucciones_html_prima(TipeScriptParser.Bloque_instrucciones_html_primaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#instruccion_html}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion_html(TipeScriptParser.Instruccion_htmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#instruccion_html}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion_html(TipeScriptParser.Instruccion_htmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#etiquetaEncabezado}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetaEncabezado(TipeScriptParser.EtiquetaEncabezadoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#etiquetaEncabezado}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetaEncabezado(TipeScriptParser.EtiquetaEncabezadoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#variableTipeScript}.
	 * @param ctx the parse tree
	 */
	void enterVariableTipeScript(TipeScriptParser.VariableTipeScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#variableTipeScript}.
	 * @param ctx the parse tree
	 */
	void exitVariableTipeScript(TipeScriptParser.VariableTipeScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#etiquetaParrafo}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetaParrafo(TipeScriptParser.EtiquetaParrafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#etiquetaParrafo}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetaParrafo(TipeScriptParser.EtiquetaParrafoContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#etiquetaBoton}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetaBoton(TipeScriptParser.EtiquetaBotonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#etiquetaBoton}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetaBoton(TipeScriptParser.EtiquetaBotonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#onclick}.
	 * @param ctx the parse tree
	 */
	void enterOnclick(TipeScriptParser.OnclickContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#onclick}.
	 * @param ctx the parse tree
	 */
	void exitOnclick(TipeScriptParser.OnclickContext ctx);
	/**
	 * Enter a parse tree produced by {@link TipeScriptParser#etiquetaInput}.
	 * @param ctx the parse tree
	 */
	void enterEtiquetaInput(TipeScriptParser.EtiquetaInputContext ctx);
	/**
	 * Exit a parse tree produced by {@link TipeScriptParser#etiquetaInput}.
	 * @param ctx the parse tree
	 */
	void exitEtiquetaInput(TipeScriptParser.EtiquetaInputContext ctx);
}