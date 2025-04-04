
package sCL;

/**
 *
 * @author carlos
 */
public class Instruccion {

    private final Accion accion = new Accion();
    private final Objetivo objetivo = new Objetivo();
    private final Parametro parametro = new Parametro();
    private String instruccion="";
    
    public String instruccion_sCl(int accion, int objetivo){
        
        this.setInstruccion("");
        
        setInstruccion(this.accion.accion(accion)+" ");
        setInstruccion(getInstruccion() + this.objetivo.objetivo(objetivo)+" ");
        setInstruccion(getInstruccion() + parametro.getParametro());
        return  getInstruccion();
    
    }

    /**
     * @return the objetivo
     */
    public Objetivo getObjetivo() {
        return objetivo;
    }

    /**
     * @return the parametro
     */
    public Parametro getParametro() {
        return parametro;
    }

    /**
     * @return the accion
     */
    public Accion getAccion() {
        return accion;
    }

    /**
     * @return the instruccion
     */
    public String getInstruccion() {
        return instruccion;
    }

    /**
     * @param instruccion the instruccion to set
     */
    public void setInstruccion(String instruccion) {
        this.instruccion = instruccion;
    }

}
