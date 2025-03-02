package com.compiladores_1.notebookmovil.Backend.ArchivoTexto;

import java_cup.runtime.Symbol;

%%

%{
       private String errorToken = "";
        private int errorLinea = 0;
        private int errorColumna = 0;
%}

%init{
    yyline=0;
    yycolumn=0;
%init}

%cup
%class analizadorLexico
%public
%line
%char
%column
%full
%debug

SALTO = [\n]+
SUMA = \+
INDICE = [1-9]*\.[ ]
NUMERO = [0-9]+
ENCABEZADO = \#{1,6}[ ]
TEXTOCONFORMATO = \*{1,3}

terminadorLinea = \r|\r
espacionBlanco = [ \t\f]*+++
TEXTO = [a-zA-Z]+(\s)*
TEXTO_PARRAFO = ([^\#\*\+0-9]+(\n)?)+


%%
<YYINITIAL> {SALTO} {
    yyline=yyline+1;
    yycolumn=0;
  return new java_cup.runtime.Symbol(sym.SALTO, yyline, yycolumn, yytext().trim());
}
<YYINITIAL> {espacionBlanco} { }



<YYINITIAL> {SUMA} { return new Symbol(sym.SUMA, yyline, yycolumn+1, yytext().trim()); }

<YYINITIAL> {INDICE} { return new Symbol(sym.INDICE, yyline, yycolumn+1, yytext().trim()); }

<YYINITIAL> {NUMERO} { return new Symbol(sym.NUMERO, yyline, yycolumn+1, yytext()); }
<YYINITIAL> {ENCABEZADO} { return new Symbol(sym.ENCABEZADO, yyline, yycolumn+1, yytext()); }
<YYINITIAL> {TEXTOCONFORMATO} { return new Symbol(sym.TEXTOCONFORMATO, yyline, yycolumn+1, yytext()); }
<YYINITIAL> {TEXTO} { return new Symbol(sym.TEXTO, yyline, yycolumn+2, yytext()); }

<YYINITIAL> \#{1,6} {
    System.out.println("❌ Error de sintaxis: Se esperaba un espacio después del encabezado en línea " + yyline);
    return new Symbol(sym.error, yyline, yycolumn, yytext());
}

. {
    errorToken = yytext();
    errorLinea = yyline ;
    errorColumna = yycolumn+1;
    if(yyline==0){
        errorLinea=yyline+1;
    }
    System.out.println("Error léxico detectado: '" + errorToken + "' en línea " + errorLinea + ", columna " + errorColumna);
    throw new RuntimeException("Error léxico: '" + errorToken + "' en línea " + errorLinea + ", columna " + errorColumna);
}
<YYINITIAL> {TEXTO_PARRAFO} { return new Symbol(sym.TEXTO_PARRAFO, yyline, yycolumn, yytext()); }

