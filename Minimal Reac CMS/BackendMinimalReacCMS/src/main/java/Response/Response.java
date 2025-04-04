package Response;

/**
 *
 * @author carlos
 */
public class Response {

    
    private String cod;
    private String body;
    
    /**
     * @return the cod
     */
    public String getCod() {
        return cod;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    Codigo codigo = new Codigo();

    

    public void setCodigo(int response) {
        cod = codigo.response(response);
       
    }
    
    public void setBody(String body){
        this.body=body;
    }

}
