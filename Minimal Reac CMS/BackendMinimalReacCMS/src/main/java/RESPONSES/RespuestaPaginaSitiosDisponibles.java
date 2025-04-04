package RESPONSES;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class RespuestaPaginaSitiosDisponibles {

    private String contenido;
    private String responce;
    private ArrayList<String> lista;

    /**
     * @return the responce
     */
    public String getResponce() {
        return responce;
    }

    /**
     * @param responce the responce to set
     */
    public void setResponce(String responce) {
        this.responce = responce;
    }

    /**
     * @return the lista
     */
    public ArrayList<String> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    /**
     * @return the contenido
     */
    public String getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}
