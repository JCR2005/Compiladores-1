
package com.compiladores_1.notebookmovil.Backend.ArchivoCodigo;

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
%class AnalizadorLexicoCodigo
%public
%line
%char
%column
%full
%debug


SALTO = [\n]+
CADENA = [\"][^\"]*[\"]
PAR1 = "("
PAR2 = ")"
MAS = "+"
MENOS = "-"
MUL = "*"
DIV = "/"
POT = "^"
DECIMAL = [0-9]+"."[0-9]+
ENTERO = [0-9]+

terminadorLinea = \r|\r
espacionBlanco = [ \t\f]*
IMPRIMIR = "print"

%%

<YYINITIAL> {SALTO} {
    yyline=yyline+1;
    yycolumn=0;
  return new java_cup.runtime.Symbol(sym.SALTO, yyline, yycolumn, yytext().trim());
}
<YYINITIAL> {espacionBlanco} { }

<YYINITIAL> {IMPRIMIR} {
  return new java_cup.runtime.Symbol(sym.IMPRIMIR, yyline, yycolumn+1, yytext().trim());
}

<YYINITIAL> {CADENA} {
  return new java_cup.runtime.Symbol(sym.CADENA, yyline, yycolumn+1, yytext().trim());
}

<YYINITIAL> {PAR1} {
  return new java_cup.runtime.Symbol(sym.PAR1, yyline, yycolumn+1, yytext().trim());
}
<YYINITIAL> {PAR2} {
  return new java_cup.runtime.Symbol(sym.PAR2, yyline, yycolumn+1, yytext().trim());
}

<YYINITIAL> {MAS} {
  return new java_cup.runtime.Symbol(sym.MAS, yyline, yycolumn+1, yytext().trim());
}
<YYINITIAL> {MENOS} {
  return new java_cup.runtime.Symbol(sym.MENOS, yyline, yycolumn+1, yytext().trim());
}
<YYINITIAL> {MUL} {
  return new java_cup.runtime.Symbol(sym.MUL, yyline, yycolumn+1, yytext().trim());
}
<YYINITIAL> {DIV} {
  return new java_cup.runtime.Symbol(sym.DIV, yyline, yycolumn+1, yytext().trim());
}
<YYINITIAL> {POT} {
  return new java_cup.runtime.Symbol(sym.POT, yyline, yycolumn+1, yytext().trim());
}
<YYINITIAL> {DECIMAL} {
  return new java_cup.runtime.Symbol(sym.DECIMAL, yyline, yycolumn+1, yytext().trim());
}
<YYINITIAL> {ENTERO} {
  return new java_cup.runtime.Symbol(sym.ENTERO, yyline, yycolumn+1, yytext().trim());
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
