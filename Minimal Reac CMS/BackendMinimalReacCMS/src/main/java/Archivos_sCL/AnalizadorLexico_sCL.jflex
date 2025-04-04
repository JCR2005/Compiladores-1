package Archivos_sCL;

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
%class analizadorLexico_sCL
%public
%line
%char
%column
%full
%debug


espacionBlanco = [\s\t\f\r]+

CREAR="crear"
PAGINA="pagina"
MODIFICAR="modificar"
SITIO="sitio"
OBTENER="obtener"
DELETE="eliminar"
AGREGAR="agregar"
SITIOS="sitios"
PAGINAS="paginas"
PAGINASITIOS="paginasitios"
COMA=","

PARAMETRO=[a-zA-Z0-9]+[\_a-zA-Z0-9]*

%%


<YYINITIAL> {espacionBlanco} { }

<YYINITIAL> {CREAR} {
  return new java_cup.runtime.Symbol(sym.CREAR, yyline, yycolumn, yytext().trim());
}

<YYINITIAL> {PAGINA} {
  return new java_cup.runtime.Symbol(sym.PAGINA, yyline, yycolumn, yytext().trim());
}

<YYINITIAL> {MODIFICAR} {
  return new java_cup.runtime.Symbol(sym.MODIFICAR, yyline, yycolumn, yytext().trim());
}
<YYINITIAL> {DELETE} {
  return new java_cup.runtime.Symbol(sym.DELETE, yyline, yycolumn, yytext().trim());
}
<YYINITIAL> {PAGINAS} {
  return new java_cup.runtime.Symbol(sym.PAGINAS, yyline, yycolumn, yytext().trim());
}
<YYINITIAL> {PAGINASITIOS} {
  return new java_cup.runtime.Symbol(sym.PAGINASITIOS, yyline, yycolumn, yytext().trim());
}


<YYINITIAL> {SITIO} {
  return new java_cup.runtime.Symbol(sym.SITIO, yyline, yycolumn, yytext().trim());
}

<YYINITIAL> {SITIOS} {
  return new java_cup.runtime.Symbol(sym.SITIOS, yyline, yycolumn, yytext().trim());
}
<YYINITIAL> {OBTENER} {
  return new java_cup.runtime.Symbol(sym.OBTENER, yyline, yycolumn, yytext().trim());
}

<YYINITIAL> {AGREGAR} {
  return new java_cup.runtime.Symbol(sym.AGREGAR, yyline, yycolumn, yytext().trim());
}
<YYINITIAL> {COMA} {
  return new java_cup.runtime.Symbol(sym.COMA, yyline, yycolumn, yytext().trim());
}

<YYINITIAL> {PARAMETRO} {
  return new java_cup.runtime.Symbol(sym.PARAMETRO, yyline, yycolumn, yytext().trim());
}




. {
    errorToken = yytext();
    errorLinea = yyline;
    errorColumna = yycolumn;
    char problematicChar = errorToken.charAt(0);
    System.out.println("Error léxico detectado: '" + errorToken + "' (código: " + (int)problematicChar + ") en línea " + errorLinea + ", columna " + errorColumna);
    throw new RuntimeException("Error léxico: '" + errorToken + "' en línea " + errorLinea + ", columna " + errorColumna);
}

