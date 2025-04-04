package Compilador;


/**
 * Clase principal del compilador que gestiona el análisis de Markdown y código.
 */
public class Compilador {

    private boolean peticionValida;
    private boolean bodyValido;
    Compilador_sHTTP compilador_sHTTP = new Compilador_sHTTP();
    Compilador_sCL compilador_sCL = new Compilador_sCL();
    private CompiladorBody compilador_Body=new CompiladorBody();
    AnalisisSemanticoPrincipal analisisSemanticoPrincipal = new AnalisisSemanticoPrincipal();
    private String Request;
    private String sCl;
    private String body;
    int metodo;
    private int accion;
    private int objetivo_sCL;
    int objetivo_sHTTP;

    /**
     * Método que ejecuta el proceso de compilacian según el tipo de analizador.
     *
     * @param Peticion El código fuente o texto a compilar.
     */
    public void compilar(String Peticion) {

        reiniciarInstrucciones();

        try {
            prearacionPeticion(Peticion);
            analisisLexicoSintacitico();
            analisisSemanticoPrincipal();

        } catch (Exception e) {
            System.err.println("Otro error durante la compilación: " + e.getMessage());
        }
    }

    public void prearacionPeticion(String Peticion) {
        String[] primera_parte = Peticion.split("\n", 2);
        System.out.println(primera_parte[1]);
        String[] segunda_parte = primera_parte[1].split("\\.", 2);

        this.Request = primera_parte[0];
        this.sCl = segunda_parte[0].replace("\n", "");
        segunda_parte[1]="."+segunda_parte[1];
        this.body = segunda_parte[1].replaceAll("^\\.\\.\\.|\\.\\.\\.$", "").trim();
        
        System.out.println(segunda_parte[1]);
        
        
    }

    public void analisisLexicoSintacitico() {
        this.compilador_sHTTP.compilar(this.Request);
        this.compilador_sCL.compilar(this.sCl);
       this.bodyValido = this.getCompilador_Body().compilado(this.body);

    }

    public void analisisSemanticoPrincipal() {

        metodo = compilador_sHTTP.getMetodo();
        objetivo_sHTTP = compilador_sHTTP.getObjetivo();
        accion = compilador_sCL.getAccion();
        objetivo_sCL = compilador_sCL.getObjetivo();
        peticionValida = this.analisisSemanticoPrincipal.analisisSemantico(metodo, objetivo_sHTTP, getAccion(), getObjetivo_sCL());

    }

    public void reiniciarInstrucciones() {

        this.Request = "";
        this.sCl = "";
        this.body = "";

    }

    /**
     * @return the Request
     */
    public String getRequest() {
        return Request;
    }

    /**
     * @return the sCl
     */
    public String getsCl() {
        return sCl;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @return the accion
     */
    public int getAccion() {
        return accion;
    }

    /**
     * @return the objetivo_sCL
     */
    public int getObjetivo_sCL() {
        return objetivo_sCL;
    }

    /**
     * @return the peticionValida
     */
    public boolean isPeticionValida() {
        return peticionValida;
    }

    /**
     * @return the bodyValido
     */
    public boolean isBodyValido() {
        return bodyValido;
    }

    /**
     * @param bodyValido the bodyValido to set
     */
    public void setBodyValido(boolean bodyValido) {
        this.bodyValido = bodyValido;
    }

    /**
     * @return the compilador_Body
     */
    public CompiladorBody getCompilador_Body() {
        return compilador_Body;
    }

}
