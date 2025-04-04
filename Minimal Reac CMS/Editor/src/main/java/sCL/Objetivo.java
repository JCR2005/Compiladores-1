package sCL;

/**
 *
 * @author carlos
 */
public class Objetivo {

    private final String SITIO = "sitio";

    private final String PAGINA = "pagina";
    private final String SITIOS = "sitios";
    private final String PAGINAS = "paginas";
    private final String PAGINASITIOS = "paginasitios";

    public String objetivo(int objetivo) {

        switch (objetivo) {
            case 1 -> {
                return SITIO;
            }
            case 2 -> {
                return PAGINA;
            }
            case 3 -> {
                return SITIOS;
            }
            case 4 -> {
                return PAGINAS;
            }
            case 5 -> {
                return PAGINASITIOS;
            }
            default ->
                throw new AssertionError();
        }

    }

    public String sitio() {

        return null;

    }

    public String pagina() {

        return null;

    }
}
