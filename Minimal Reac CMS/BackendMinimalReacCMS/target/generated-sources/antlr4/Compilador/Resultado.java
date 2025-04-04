package Compilador;

import java.util.ArrayList;

/**
 *
 * @author carlos
 */
public class Resultado {

    public Resultado(String intruccion) {

        this.intruccion = intruccion;
    }
    
    public Resultado(Object value,String intruccion) {
        this.value=value;
        this.intruccion = intruccion;
    }
    
     public Resultado() {
    }
     
     
     public void añadirMensaje(String mensaje){
         this.mensajes.add(mensaje);
     }
    public String intruccion;
    public Object value;

    public ArrayList<String> mensajes = new ArrayList<>();
    private boolean bandera0 = isBandera1();
    private boolean bandera1 = false;
    private boolean bandera2 = false;
    private boolean bandera3 = false;
    private boolean bandera4 = false;
    private boolean bandera5 = false;

    /**
     * @return the bandera0
     */
    public boolean isBandera0() {
        return bandera0;
    }

    /**
     * @param bandera0 the bandera0 to set
     */
    public void setBandera0(boolean bandera0) {
        this.bandera0 = bandera0;
    }

    /**
     * @return the bandera1
     */
    public boolean isBandera1() {
        return bandera1;
    }

    /**
     * @param bandera1 the bandera1 to set
     */
    public void setBandera1(boolean bandera1) {
        this.bandera1 = bandera1;
    }

    /**
     * @return the bandera2
     */
    public boolean isBandera2() {
        return bandera2;
    }

    /**
     * @param bandera2 the bandera2 to set
     */
    public void setBandera2(boolean bandera2) {
        this.bandera2 = bandera2;
    }

    /**
     * @return the bandera3
     */
    public boolean isBandera3() {
        return bandera3;
    }

    /**
     * @param bandera3 the bandera3 to set
     */
    public void setBandera3(boolean bandera3) {
        this.bandera3 = bandera3;
    }

    /**
     * @return the bandera4
     */
    public boolean isBandera4() {
        return bandera4;
    }

    /**
     * @param bandera4 the bandera4 to set
     */
    public void setBandera4(boolean bandera4) {
        this.bandera4 = bandera4;
    }

    /**
     * @return the bandera5
     */
    public boolean isBandera5() {
        return bandera5;
    }

    /**
     * @param bandera5 the bandera5 to set
     */
    public void setBandera5(boolean bandera5) {
        this.bandera5 = bandera5;
    }

}