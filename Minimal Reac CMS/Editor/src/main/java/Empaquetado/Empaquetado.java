package Empaquetado;

import Servidor.ChatClient;
import sHTTP.Request;
import sCL.Instruccion;
import Servidor.Enviocosas;
import com.google.gson.Gson;
import sHTTP.Response;

/**
 *
 * @author carlos
 */
public class Empaquetado {

    private String bodyResponse;

    Request request = new Request();
    Instruccion instruccion_sCL = new Instruccion();
    Enviocosas enviocosas = new Enviocosas();
    private boolean exito;
    private String respuesta;

    private String response;
    ChatClient chatClient;

    public void empaquetado() throws InterruptedException {
        Gson gson = new Gson();
        String encabezado = request.getEncabezado();
        respuesta = enviocosas.enviarPeticion(encabezado);

        Response response = gson.fromJson(respuesta, Response.class);

        bodyResponse = response.getBody();
        this.response = response.getCod();
        exito = response.validarResponse(response.getCod());
    }

    public void encabezado(int metodo, int objetivo) {
        request.encabezado(metodo, objetivo);
    }

    public void instruccion(int accion, int objetivo, String parametro) {
        String instruccion = "";

        instruccion_sCL.getParametro().setParametro(parametro.replace(" ", "_"));
        instruccion = instruccion_sCL.instruccion_sCl(accion, objetivo);
        request.instruccion_sCl(instruccion);
    }

    public void body(String body) {
        request.body(body);
    }

    /**
     * @return the exito
     */
    public boolean isExito() {
        return exito;
    }

    /**
     * @return the respuesta
     */
    public String getRespuesta() {
        return respuesta;
    }

    /**
     * @return the bodyResponse
     */
    public String getBodyResponse() {
        return bodyResponse;
    }

    /**
     * @return the response
     */
    public String getResponse() {
        return response;
    }

}
