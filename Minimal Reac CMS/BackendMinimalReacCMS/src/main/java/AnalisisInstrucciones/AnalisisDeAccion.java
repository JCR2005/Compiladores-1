package AnalisisInstrucciones;

import ArchivosMTSX.Creacion;
import TOML.TOML;

/**
 *
 * @author carlos
 */
public class AnalisisDeAccion {

   Crear crear=new Crear();
   Obtener obtener=new Obtener();
   Agregar agregar=new Agregar();
    private int accion;
    private int objetivo;
    private String body;
    private String sCL;
    private  String datos;
    public void verficarAccion() {
         System.out.println("etssssssor!!"+objetivo);
        switch (accion) {
            case 1 -> {
                
              crear.crear(sCL, objetivo);
              
            }

            case 2 -> {
                
                agregar.crear(obtenerParametro());
            }
            case 3 -> {
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                
                System.out.println(body);
                System.out.println(":::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::");
                
                
            }
            
            
            case 5 -> {
                 System.out.println("obdtenr!!"+objetivo);
                  obtener.setParametro(obtenerParametro());
                obtener.obtener(objetivo);
               
                datos=obtener.json;
               
            }
            default ->
                throw new AssertionError();
        }

    }

    
    
    
   
    public void analisis() {
        verficarAccion();

    }

    public String obtenerParametro() {
        String[] partes = sCL.split(" ", 3);
        
        partes[2]=partes[2].replace(",", ".");
        System.out.println(partes[2]);
        return partes[2];
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @return the accion
     */
    public int getAccion() {
        return accion;
    }

    /**
     * @param accion the accion to set
     */
    public void setAccion(int accion) {
        this.accion = accion;
    }

    /**
     * @return the objetivo
     */
    public int getObjetivo() {
        return objetivo;
    }

    /**
     * @param objetivo the objetivo to set
     */
    public void setObjetivo(int objetivo) {
        this.objetivo = objetivo;
    }

    /**
     * @return the sCL
     */
    public String getsCL() {
        return sCL;
    }

    /**
     * @param sCL the sCL to set
     */
    public void setsCL(String sCL) {
        this.sCL = sCL;
    }

    /**
     * @return the Datos
     */
    public String getDatos() {
        return datos;
    }
}
