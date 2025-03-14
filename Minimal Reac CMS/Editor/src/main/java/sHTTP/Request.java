package sHTTP;

/**
 *
 * @author carlos
 */
public class Request {

    private final Metodo metodo = new Metodo();
    private final Objetivo objetivo = new Objetivo();
    private final Body body =  new Body();
    private String encabezado = "";

    public void encabezado(int metodo, int objetivo) {
        setEncabezado(this.metodo.metodo(metodo) + " ");
        setEncabezado(this.getEncabezado() + this.objetivo.objetivo(objetivo) + "\n");
    }

    public void instruccion_sCl(String instruccion) {
        setEncabezado(this.getEncabezado() + instruccion + "\n");
    }

    public void body(String body) {
       this.body.setBody(body);
       setEncabezado(this.getEncabezado() + this.body.getBody());
    }

    /**
     * @return the metodo
     */
    public Metodo getMetodo() {
        return metodo;
    }

    /**
     * @return the objetivo
     */
    public Objetivo getObjetivo() {
        return objetivo;
    }

    /**
     * @param encabezado the encabezado to set
     */
    public void setEncabezado(String encabezado) {
        this.encabezado = encabezado;
    }

    /**
     * @return the encabezado
     */
    public String getEncabezado() {
        return encabezado;
    }

}
