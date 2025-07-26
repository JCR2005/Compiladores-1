// src/parser/ParserService.ts
import { parse } from '../../parser/parse';

/** 
 * Servicio estático que llama al parser de Peggy. 
 */
export class analizador {
  /**
   * Parsea el string de entrada y devuelve el AST.
   * @param code Código fuente a analizar
   */
  static parse(code: string): any {
    try {
   
      const resultado = parse(code);
      console.log(resultado.elementos);
      console.log(" Resultado del parser:\n", JSON.stringify(resultado, null, 2));

      console.log("::::::::::::::::::::::"); 
    
      for (const [nombre, value] of resultado.datosMap) {
        console.log("Clave:", nombre, "→ Valor:", value);
      }
      
      console.log("::::::::::::::::::::::"); 
      console.log(resultado.errors); 
      console.log("::::::::::::::::::::::"); 
      return resultado;
    } catch (e) {
      console.error('❌ Error de parseo:', e);
      throw e;
    }
  }
}

