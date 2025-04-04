package Response;

import com.google.gson.Gson;

/**
 *
 * @author carlos
 */
public class Empaquetado {

    private Response response = new Response();

    public String empaqutado(int response,String body) {

        this.response.setCodigo(response);
        this.response.setBody(body);
        
         Gson gson = new Gson();
      
       
        return gson.toJson(this.response);
    }
}
