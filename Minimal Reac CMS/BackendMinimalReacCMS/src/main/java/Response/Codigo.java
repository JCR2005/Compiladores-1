package Response;

/**
 *
 * @author carlos
 */
public class Codigo {

    private final String SUCCESS = "SUCCESS";

    private final String NOT_FOUND = "NOT_FOUND";

    private final String INTERNAL_SERVER_ERROR = "INTERNAL_SERVER_ERROR";

    public String response(int response) {

        switch (response) {
            case 1 -> {
                return SUCCESS;
            }
            case 2 -> {
                return NOT_FOUND;
            }
            case 3 -> {
                return INTERNAL_SERVER_ERROR;
            }
            default ->
                throw new AssertionError();
        }

    }

    public String SUCCESS() {

        return SUCCESS;

    }

    public String NOT_FOUND() {

        return NOT_FOUND;

    }

    public String INTERNAL_SERVER_ERROR() {

        return INTERNAL_SERVER_ERROR;

    }

}
