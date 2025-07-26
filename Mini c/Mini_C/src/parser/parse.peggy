{
  /** @type {Map<string, any>} */
    const tablaSimboloGeneral = new Map();
    const llamadasPendientes = [];
    let errorSintactico=false; 
    const errores = [];
}


start
  = elementos:(bloqueInstrucciones1) {

      return {
        elementos,
         datosMap:tablaSimboloGeneral,
         errors: errores
      };
  }


bloqueInstrucciones1 = _ fm:funcionMain? _ b2:bloqueInstrucciones2* _ el:errorLexico* {
  return {
    fm: fm || null,
    b2: b2,
    el: el  
  };
}


bloqueInstrucciones2=(_(intruccionbloque2 / errorLexico)_)+

intruccionbloque2 =
    _ cv:creacionVariable _ { return { tipo: "creacion", valor: cv }; }
  / _ pr:print _             { return { tipo: "printe", valor: pr }; }
  / _ exb:expresionesBooleanas _ { return {tipo:"operacion boolena", valor:exb}}
  / _ exbn:expresionBooleanaNumerica _ { return { tipo: "boolean", valor: exbn}}
  / _ ex:expresionNumerica _ { return { tipo: "expresione", valor: ex }; }



bloqueInstrucciones3=""

funcionMain
  = _ void _ main _ par1 _ par2 _ corch1 _ contenido:bloqueInstrucciones2? _ corch2 {
     
  }

bloqueInstrucciones
  = contenido:(_(instruccion / errorLexico)_)* {
      return contenido;
  }

instruccion
  = _ print _ { return { tipo: "instruccion", valor: "print" }; }
  / _ creacionVariable _ { return { tipo: "instruccion", valor: "creacion" }; }

_ "whitespace"
  = [ \t\n\r]*

errorLexico
  = token:$(_(!tokens !"\n". ) +) {
    const pos = location();
    let er = "| Error LEXICO |"+"linea: "+pos.start.line+" columna: "+pos.start.column+" |token no reconocido: "+token+"|" ;
    errores.push(er);
      return {
        tipo: "errorLexico",
        valor: token,
        linea: pos.start.line,
        columna: pos.start.column
      };
  }

tokens=void/main/par1/par2/corch1/corch2/print/finInstruccion/asignacion/tipoVariable/identificador/par1/par2/mas/menos/mul/div/pot

void="void"
main="main"
par1="("
par2=")"
corch1="{"
corch2="}"
print="print"
finInstruccion=";"
asignacion="="
mas = "+" { return "+"; }
menos = "-" { return "-"; }
mul = "*" { return "*"; }
div = "/" { return "/"; }
pot = "^" { return "^"; }


//_________________________TOKENS BOOLEANOS_________________________
mayorQue = ">" { return ">"}
menorQue = "<" { return "<"}
igual = "==" { return "=="}
mayorIGualQue = ">=" { return ">=" }
menorIGualQue = "<=" { return "<=" }
negacion = "!=" { return "!="}
booleano = "true"  { return true; } 
         / "false" { return false; }

operacionesRelacionales=mayorIGualQue
                       /menorIGualQue
                       /igual
                       /negacion
                       /mayorQue
                       /menorQue
//___________________________________________________________________

cadena = _ '"'chars:([^"\n\r])*'"' _ {

    return chars.join("");
}  

identificador = _ letras:[a-zA-Z0-9]+[\\_a-zA-Z0-9]* _  {
      return letras.join("");
    }


tipoVariable="int"/"float"/"string"/"char"/"bool"/"void"


tipoAsignacion=bo:expresionesBooleanas{ 
 return {valor:bo, tipo:"bool"} 
}
/ex:expresionNumerica{
    const esEntero = Number.isInteger(ex);
    const tipoLiteral = esEntero ? "int" : "float";
   return {valor:ex, tipo:tipoLiteral} 
}/ca:cadena{
  return {valor:ca, tipo:"string"} 
}
creacionVariable=_ tv:tipoVariable _ id:identificador _  asignacion _  ex:tipoAsignacion _ finInstruccion _ {
      const pos = location();
     
      console.log("ex:", ex.valor, " id: ", id);
    
      console.log("tipoLiteral:", ex.tipo);


      if(tablaSimboloGeneral.has(id)){

          console.log("id exite en la tabla"+id);
        let er = "| Error SEMANTICO |"+"linea: "+pos.start.line+" columna: "+pos.start.column+" |declaracion de variable duplicada: "+id+" ya esta declarada|" ;
        errores.push(er);
      }else{
        if(tv!==ex.tipo){
        
          console.log("no es compatible");
          console.log(pos.start.line);
          console.log(pos.start.column);
          console.log("▸ LLEGUÉ al punto donde voy a imprimir er");
          let er = "| Error SEMANTICO |"+"linea: "+pos.start.line+" columna: "+pos.start.column+" |asignacion incompatible a "+id+" : "+tv+"→"+ex.tipo+"|" ;
          errores.push(er);
        }else{   
          if(!errorSintactico){
            console.log("guadando en la tabla a "+id);
            tablaSimboloGeneral.set(id, ex.valor); 
          }
          errorSintactico=false;
         
        }
      }
    
}


expresionNumerica
  = head:termino1 tail:(_ (mas / menos) _ termino1)* {
      return tail.reduce((res, [ , op, , val]) =>
        op === "+" ? res + val : res - val
      , head);
    }

termino1
  = head:termino2 tail:(_ (mul / div) _ termino2)* {
      return tail.reduce((res, [ , op, , val]) =>
        op === "*" ? res * val : res / val
      , head);
    }

termino2
  = head:termino3 tail:(_ pot _ termino3)* {
      return tail.reduce((res, [ , , , val]) =>
        Math.pow(res, val)
      , head);
    }

termino3
  = par1 _ expr:expresionNumerica _ par2 { return expr; }
  / numero

numero
  = float
  / entero

entero
  = s:[+-]? d:[0-9]+ {
      return parseInt((s !== null ? s : "") + d.join(""), 10);
    }

float
  = s:[+-]? i:[0-9]+ "." f:[0-9]+ {
      return parseFloat((s !== null ? s : "") + i.join("") + "." + f.join(""));
    }


expresionesBooleanas
  = orExpresion


orExpresion
  = left:andExpresion tail:(_ "||" _ andExpresion)* {
      return tail.reduce((acc, [ , , , right]) => acc || right, left);
    }

andExpresion
  = left:notExpresion tail:(_ "&&" _ notExpresion)* {
      return tail.reduce((acc, [ , , , right]) => acc && right, left);
    }

notExpresion
 = "!" _ expr:notExpresion           { return !expr; }
  / "(" _ expr:expresionesBooleanas _ ")" { return expr; } 
  / expr:expresionBoleana { return expr; }
  / bo:booleano { return bo; }
 
expresionBoleana=expr:expresionBooleanaNumerica { return expr; }
/expr:expresionBooleanaCadena { return expr; }

expresionBooleanaNumerica = left:expresionNumerica _ op:(operacionesRelacionales) _ right:expresionNumerica {
      switch (op) {
        case ">": return left > right;
        case "<": return left < right;
        case ">=": return left >= right;
        case "<=": return left <= right;
        case "==": return left == right;
        case "!=": return left != right;
      }
  }


expresionBooleanaCadena = left:cadena _ op:(operacionesRelacionales) _ right:cadena {
      switch (op) {
        case "==": return left == right;
        case "!=": return left != right;
        default:
           const pos = location();
            errorSintactico=true;
            let er = "| Error SEMANTICO |"+"linea: "+pos.start.line+" columna: "+pos.start.column+" |Operador relacional no válido para cadenas: "+op+" |" ;
            errores.push(er);
            
      }
  }
