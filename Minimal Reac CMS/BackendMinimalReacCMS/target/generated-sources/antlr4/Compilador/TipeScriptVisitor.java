// Generated from Compilador/TipeScript.g4 by ANTLR 4.13.2
package Compilador;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TipeScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TipeScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(TipeScriptParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#declaracion_pagina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_pagina(TipeScriptParser.Declaracion_paginaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#bloque_declaracion_pagina}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_declaracion_pagina(TipeScriptParser.Bloque_declaracion_paginaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#bloque_declaracion_pagina_prima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_declaracion_pagina_prima(TipeScriptParser.Bloque_declaracion_pagina_primaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#intrucciones_tipe_scrip}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntrucciones_tipe_scrip(TipeScriptParser.Intrucciones_tipe_scripContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#intrucciones_tipe_scrip_prima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntrucciones_tipe_scrip_prima(TipeScriptParser.Intrucciones_tipe_scrip_primaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#instruccion_tipo_script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion_tipo_script(TipeScriptParser.Instruccion_tipo_scriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#regreso_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegreso_funcion(TipeScriptParser.Regreso_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#declaracion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion(TipeScriptParser.Declaracion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#parametros_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_funcion(TipeScriptParser.Parametros_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#bloque_instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_instrucciones(TipeScriptParser.Bloque_instruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#bloque_instrucciones_prima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_instrucciones_prima(TipeScriptParser.Bloque_instrucciones_primaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(TipeScriptParser.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#llamada_parametros_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_parametros_funcion(TipeScriptParser.Llamada_parametros_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicional(TipeScriptParser.CondicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#bloque_instrucciones_condicional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_instrucciones_condicional(TipeScriptParser.Bloque_instrucciones_condicionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#bloque_instrucciones_condicional_prima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_instrucciones_condicional_prima(TipeScriptParser.Bloque_instrucciones_condicional_primaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#regreso_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegreso_if(TipeScriptParser.Regreso_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#impresion_consola}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImpresion_consola(TipeScriptParser.Impresion_consolaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#tipos_impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_impresion(TipeScriptParser.Tipos_impresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#tipo_impresiones_prima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_impresiones_prima(TipeScriptParser.Tipo_impresiones_primaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#tipo_impresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_impresion(TipeScriptParser.Tipo_impresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#creacionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreacionVariable(TipeScriptParser.CreacionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#asignacionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacionVariable(TipeScriptParser.AsignacionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#tipoAsignacionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoAsignacionVariable(TipeScriptParser.TipoAsignacionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#tipoBoleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoBoleano(TipeScriptParser.TipoBoleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(TipeScriptParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(TipeScriptParser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#terminoN2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminoN2(TipeScriptParser.TerminoN2Context ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#terminoN3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminoN3(TipeScriptParser.TerminoN3Context ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#terminoN4}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerminoN4(TipeScriptParser.TerminoN4Context ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#numero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero(TipeScriptParser.NumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#regreso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegreso(TipeScriptParser.RegresoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#bloque_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_main(TipeScriptParser.Bloque_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#bloque_instrucciones_html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_instrucciones_html(TipeScriptParser.Bloque_instrucciones_htmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#bloque_instrucciones_html_prima}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque_instrucciones_html_prima(TipeScriptParser.Bloque_instrucciones_html_primaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#instruccion_html}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion_html(TipeScriptParser.Instruccion_htmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#etiquetaEncabezado}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiquetaEncabezado(TipeScriptParser.EtiquetaEncabezadoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#variableTipeScript}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableTipeScript(TipeScriptParser.VariableTipeScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#etiquetaParrafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiquetaParrafo(TipeScriptParser.EtiquetaParrafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#etiquetaBoton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiquetaBoton(TipeScriptParser.EtiquetaBotonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#onclick}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnclick(TipeScriptParser.OnclickContext ctx);
	/**
	 * Visit a parse tree produced by {@link TipeScriptParser#etiquetaInput}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEtiquetaInput(TipeScriptParser.EtiquetaInputContext ctx);
}