package Archivos_sHTTP;

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
%class analizadorLexico_sHTTP
%public
%line
%char
%column
%full
%debug


espacionBlanco = [ \t\f\r]+
POST="POST"
GET="GET"
SITIO="SITIO"
SITIOS="SITIOS"
PAGINA="PAGINA"
PATCH="PATCH"
PAGINAS="PAGINAS"
PAGINASITIOS="PAGINASITIOS"
%%

<YYINITIAL> {espacionBlanco} { }

<YYINITIAL> {POST} {
  return new java_cup.runtime.Symbol(sym.POST, yyline, yycolumn, yytext().trim());
}

<YYINITIAL> {GET} {
  return new java_cup.runtime.Symbol(sym.GET, yyline, yycolumn, yytext().trim());
}

<YYINITIAL> {PATCH} {
  return new java_cup.runtime.Symbol(sym.PATCH, yyline, yycolumn, yytext().trim());
}


<YYINITIAL> {SITIO} {
  return new java_cup.runtime.Symbol(sym.SITIO, yyline, yycolumn, yytext().trim());
}

<YYINITIAL> {SITIOS} {
  return new java_cup.runtime.Symbol(sym.SITIOS, yyline, yycolumn, yytext().trim());
}


<YYINITIAL> {PAGINA} {
  return new java_cup.runtime.Symbol(sym.PAGINA, yyline, yycolumn, yytext().trim());
}
<YYINITIAL> {PAGINAS} {
  return new java_cup.runtime.Symbol(sym.PAGINAS, yyline, yycolumn, yytext().trim());
}
<YYINITIAL> {PAGINASITIOS} {
  return new java_cup.runtime.Symbol(sym.PAGINASITIOS, yyline, yycolumn, yytext().trim());
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