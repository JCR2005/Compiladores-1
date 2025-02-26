package com.compiladores_1.notebookmovil.Backend;

import java_cup.runtime.Symbol;

%%

%{
    String parrafo="";
%}

%init{
    yyline=1;
    yycolumn=1;
%init}

%cup
%class analizadorLexico
%public
%line
%char
%column
%full
%debug


PRINT=\print


INICIOCADENA=\"
SUMA = \+
PAR1=\(
PAR2=\)
MENOS="-"
MUL="*"
DIV="/"
DECIMAL=[0-9]+"."[0-9]+
INDICE = [1-9]*\.[ ]
NUMERO = [0-9]+
ENCABEZADO = \#{1,6}[ ]
TEXTOCONFORMATO = \*{1,3}

LineTerminator = \r|\n|\r\n
WhiteSpace = [ \t\f]+
TEXTO = [a-zA-Z]+(\s)*
TEXTO_PARRAFO = ([^\(\)\#\"\*\n0-9\+\print]+(\n)?)+





%%
<YYINITIAL> {WhiteSpace} { /* Ignorar espacios en blanco */ }
<YYINITIAL> {LineTerminator} { /* Ignorar saltos de línea */ }

<YYINITIAL> {PRINT} { return new Symbol(sym.PRINT, yyline, yycolumn, yytext().trim()); }
<YYINITIAL> {INICIOCADENA} { return new Symbol(sym.INICIOCADENA, yyline, yycolumn, yytext().trim()); }
<YYINITIAL> {PAR1} { return new Symbol(sym.PAR1, yyline, yycolumn, yytext().trim()); }
<YYINITIAL> {PAR2} { return new Symbol(sym.PAR2, yyline, yycolumn, yytext().trim()); }
<YYINITIAL> {SUMA} { return new Symbol(sym.SUMA, yyline, yycolumn, yytext().trim()); }
<YYINITIAL> {MENOS} { return new Symbol(sym.MENOS, yyline, yycolumn, yytext().trim()); }
<YYINITIAL> {MUL} { return new Symbol(sym.MUL, yyline, yycolumn, yytext().trim()); }
<YYINITIAL> {DIV} { return new Symbol(sym.DIV, yyline, yycolumn, yytext().trim()); }
<YYINITIAL> {DECIMAL} { return new Symbol(sym.DECIMAL, yyline, yycolumn, yytext().trim()); }
<YYINITIAL> {INDICE} { return new Symbol(sym.INDICE, yyline, yycolumn, yytext().trim()); }
<YYINITIAL> {INDICE} { return new Symbol(sym.INDICE, yyline, yycolumn, yytext().trim()); }
<YYINITIAL> {NUMERO} { return new Symbol(sym.NUMERO, yyline, yycolumn, yytext()); }
<YYINITIAL> {ENCABEZADO} { return new Symbol(sym.ENCABEZADO, yyline, yycolumn, yytext()); }
<YYINITIAL> {TEXTOCONFORMATO} { return new Symbol(sym.TEXTOCONFORMATO, yyline, yycolumn, yytext()); }
<YYINITIAL> {TEXTO} { return new Symbol(sym.TEXTO, yyline, yycolumn, yytext()); }
<YYINITIAL> \#{1,6} {
    System.out.println("❌ Error de sintaxis: Se esperaba un espacio después del encabezado en línea " + yyline);
    return new Symbol(sym.error, yyline, yycolumn, yytext());
}
<YYINITIAL> . {
    System.out.println("❌ Token no reconocido: " + yytext() + " en la línea " + yyline + ", columna " + yycolumn);
    return new Symbol(sym.error, yyline, yycolumn, yytext());
}
<YYINITIAL> {TEXTO_PARRAFO} { return new Symbol(sym.TEXTO_PARRAFO, yyline, yycolumn, yytext()); }
