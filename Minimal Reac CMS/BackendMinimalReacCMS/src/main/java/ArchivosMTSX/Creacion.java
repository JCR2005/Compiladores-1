package ArchivosMTSX;

import java.io.File;

/**
 *
 * @author carlos
 */
public class Creacion {

    private String path;

    String rutaprincipal = "src/paginaSitios/";

    public void crearPagina(String nombrePagina) {
        String[] partes;

        try {

            if (nombrePagina.contains(".")) {
                partes = nombrePagina.split("\\.");
                nombrePagina = partes[1];
                
                rutaprincipal+=partes[0]+"/";
            }
            
            File archivo = new File(rutaprincipal + nombrePagina + ".mtsx");

            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
                path = archivo.getPath();
            } else {
                System.out.println("el archivo ya exite");
            }
        } catch (Exception e) {
        }
    }

    public void crearSitio(String nombre) {
        File archivFile = new File(rutaprincipal + nombre);

        if (!archivFile.exists()) {
            if (archivFile.mkdirs()) {
                System.out.println("sitio creado");
                path = archivFile.getPath();
            } else {
                System.out.println("Error al crear directorio");
            }
        }

    }

    /**
     * @return the path
     */
    public String getPath() {
        return path;
    }

}
