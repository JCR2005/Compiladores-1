package sHTTP;

/**
 *
 * @author carlos
 */
public class Body {

    private String body;

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
        this.body = "..." + "\n";
        if (body != null) {
            this.body += (body + "\n");
        }else{
             this.body += ("\n");
        }
        this.body += "...";
    }

}
