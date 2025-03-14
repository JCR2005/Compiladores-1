
package Fronted;

/**
 *
 * @author carlos
 */

import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

/**
 * Clase que proporciona métodos estáticos para establecer fondos de imágenes en etiquetas y botones.
 * Autor: carlosrodriguez
 */
public class FondosDeEtiquetas {
    
    // Rutas de las imágenes
    private static final String portada = "images/Margo.png";
    private static final String pausa = "Imagenes/pausa.png";
    private static final String play = "Imagenes/play.png";
    private static final String fondo1 = "images/logo1.png";
    private static final String fondo2 = "images/fondo4.png";

    /**
     * Establece la imagen de portada en una etiqueta.
     * @param label Etiqueta donde se establecerá la imagen de portada.
     */
    public static void portada(JLabel label) {
        try {
            URL imageUrl = FondosDeEtiquetas.class.getClassLoader().getResource(portada);
            ImageIcon imagen = new ImageIcon(imageUrl);
            Image imagenEscalada = imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
            label.setIcon(iconoEscalado);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Establece la imagen de portada en una etiqueta, escalándola para ajustarse al tamaño especificado.
     * @param label Etiqueta donde se establecerá la imagen de portada.
     */
    public static void portadaa(JLabel label) {
        try {
            URL imageUrl = FondosDeEtiquetas.class.getClassLoader().getResource(portada);
            ImageIcon imagen = new ImageIcon(imageUrl);
            Image imagenEscalada = imagen.getImage().getScaledInstance(1366, 768, Image.SCALE_SMOOTH);
            ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
            label.setIcon(iconoEscalado);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Establece el fondo de una etiqueta con la imagen fondo1.
     * @param label Etiqueta donde se establecerá el fondo.
     */
    public static void fondo1(JLabel label) {
        try {
            URL imageUrl = FondosDeEtiquetas.class.getClassLoader().getResource(fondo1);
            ImageIcon imagen = new ImageIcon(imageUrl);
            Image imagenEscalada = imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
            label.setIcon(iconoEscalado);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Establece el fondo de una etiqueta con la imagen fondo2.
     * @param label Etiqueta donde se establecerá el fondo.
     */
    public static void fondo2(JLabel label) {
        try {
            URL imageUrl = FondosDeEtiquetas.class.getClassLoader().getResource(fondo2);
            ImageIcon imagen = new ImageIcon(imageUrl);
            Image imagenEscalada = imagen.getImage().getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
            label.setIcon(iconoEscalado);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
            e.printStackTrace();
        }
    }
    
    /**
     * Establece la imagen de pausa en un botón.
     * @param b Botón donde se establecerá la imagen de pausa.
     */
    public static void pausa(JButton b) {
        try {
            URL imageUrl = FondosDeEtiquetas.class.getClassLoader().getResource(pausa);
            ImageIcon imagen = new ImageIcon(imageUrl);
            Image imagenEscalada = imagen.getImage().getScaledInstance(b.getWidth(), b.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
            b.setIcon(iconoEscalado);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
            e.printStackTrace();
        }
    }

    /**
     * Establece la imagen de reproducción en un botón.
     * @param b Botón donde se establecerá la imagen de reproducción.
     */
    public static void play(JButton b) {
        try {
            URL imageUrl = FondosDeEtiquetas.class.getClassLoader().getResource(play);
            ImageIcon imagen = new ImageIcon(imageUrl);
            Image imagenEscalada = imagen.getImage().getScaledInstance(b.getWidth(), b.getHeight(), Image.SCALE_SMOOTH);
            ImageIcon iconoEscalado = new ImageIcon(imagenEscalada);
            b.setIcon(iconoEscalado);
        } catch (Exception e) {
            System.out.println("Error al cargar la imagen: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
