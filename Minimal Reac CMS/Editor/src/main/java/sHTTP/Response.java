package sHTTP;

/**
 *
 * @author carlos
 */
public class Response {
    
     public boolean validarResponse(String response) {

        switch (response) {
            case "SUCCESS":
                return true;

            case "NOT_FOUND":
                return false;
            case "INTERNAL_SERVER_ERROR":

                return false;
            default:
                return true;
        }

    }

     
     
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

 

    
    

   

}
