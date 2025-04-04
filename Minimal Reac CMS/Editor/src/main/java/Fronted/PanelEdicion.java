package Fronted;

import Backend.Obtener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author carlos
 */
public class PanelEdicion extends javax.swing.JPanel {

    int ancho;
    int alto;
    private PanelEditorPagina editorPagina;
    private PanelEdicionSitios editorSitios;
    private JScrollPane scrollSitios;
    private JScrollPane scrollPaginas;
    Obtener obtener = new Obtener();

    /**
     * Creates new form PanelEdicion
     */
    public PanelEdicion(int ancho, int alto) {
        initComponents();
        this.alto = alto;
        this.ancho = ancho;

        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            setBounds(0, 0, ancho, alto);
            Contenedor.setBounds(0, 0, ancho, alto);
            jPanel1.setBounds(0, 0, (int) ((ancho * 0.2)), alto);
            panelPaginas.setBounds((int) ((ancho * 0.3)), (int) ((alto * 0.05)), (int) ((ancho * 0.6)), (int) ((alto * 0.9)));

            panelSitios.setBounds((int) ((ancho * 0.3)), (int) ((alto * 0.05)), (int) ((ancho * 0.6)), (int) ((alto * 0.9)));
            jButton1.setBounds(0, (int) ((alto * 0.20)), (int) ((ancho * 0.2)), (int) ((alto * 0.1)));
            jButton2.setBounds(0, (int) ((alto * 0.35)), (int) ((ancho * 0.2)), (int) ((alto * 0.1)));
            jLabel1.setBounds(0, 0, (int) ((ancho * 0.2)), (int) ((alto * 0.1)));
            panelPaginas.setVisible(false);
            panelSitios.setVisible(false);
            editorPagina = new PanelEditorPagina(ancho, alto);
            add(editorPagina);
            editorPagina.setVisible(false);

            editorSitios = new PanelEdicionSitios(ancho, alto);
            add(editorSitios);
            editorSitios.setVisible(false);

            jLabel3.setBounds((int) ((ancho * 0.15)), (int) ((alto * 0.01)), (int) ((ancho * 0.3)), (int) ((alto * 0.06)));
            jLabel4.setBounds((int) ((ancho * 0.15)), (int) ((alto * 0.01)), (int) ((ancho * 0.3)), (int) ((alto * 0.06)));
            jButton3.setBounds((int) ((ancho * 0.05)), (int) ((alto * 0.85)), (int) ((ancho * 0.1)), (int) ((alto * 0.05)));
            scrollPaginas = new JScrollPane(panelBotonesPaginas);
            scrollPaginas.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollPaginas.setBounds(0, (int) (alto * 0.10), (int) (ancho * 0.6), (int) (alto * 0.85));

            scrollSitios = new JScrollPane(panelBotonesSitios);
            scrollSitios.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            scrollSitios.setBounds(0, (int) (alto * 0.10), (int) (ancho * 0.6), (int) (alto * 0.85));
            panelPaginas.add(scrollPaginas);

            panelSitios.add(scrollSitios);
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException e) {
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Contenedor = new javax.swing.JPanel();
        panelPaginas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        panelBotonesPaginas = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        panelSitios = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        panelBotonesSitios = new javax.swing.JPanel();

        setLayout(null);

        Contenedor.setBackground(new java.awt.Color(253, 247, 231));
        Contenedor.setLayout(null);

        panelPaginas.setBackground(new java.awt.Color(253, 247, 231));
        panelPaginas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 73, 91)));
        panelPaginas.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(253, 247, 231));
        jLabel3.setFont(new java.awt.Font("P052", 3, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 76, 86));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Paginas disponibles");
        panelPaginas.add(jLabel3);
        jLabel3.setBounds(0, 0, 330, 50);

        panelBotonesPaginas.setBackground(new java.awt.Color(253, 247, 231));
        panelBotonesPaginas.setLayout(null);
        panelPaginas.add(panelBotonesPaginas);
        panelBotonesPaginas.setBounds(20, 60, 110, 80);
        setVisible(false);

        Contenedor.add(panelPaginas);
        panelPaginas.setBounds(400, 110, 210, 170);
        setVisible(false);

        jPanel1.setBackground(new java.awt.Color(44, 73, 91));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(44, 73, 91));
        jButton1.setFont(new java.awt.Font("Purisa", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(253, 247, 231));
        jButton1.setText("Ver mis paginas");
        jButton1.setToolTipText("");
        jButton1.setBorderPainted(false);
        jButton1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton1.setFocusPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(10, 10, 250, 35);

        jButton2.setBackground(new java.awt.Color(44, 73, 91));
        jButton2.setFont(new java.awt.Font("Purisa", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(253, 247, 231));
        jButton2.setText("ver mis sitios");
        jButton2.setToolTipText("");
        jButton2.setBorderPainted(false);
        jButton2.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(20, 50, 250, 35);

        jLabel1.setBackground(new java.awt.Color(42, 76, 86));
        jLabel1.setFont(new java.awt.Font("P052", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(252, 238, 223));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("¿Que desea editar?");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 120, 170, 30);

        jButton3.setBackground(new java.awt.Color(253, 247, 231));
        jButton3.setFont(new java.awt.Font("Purisa", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(44, 73, 91));
        jButton3.setText("Regresar");
        jButton3.setToolTipText("");
        jButton3.setBorderPainted(false);
        jButton3.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButton3.setFocusPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(20, 230, 250, 35);

        Contenedor.add(jPanel1);
        jPanel1.setBounds(30, 20, 350, 290);

        panelSitios.setBackground(new java.awt.Color(253, 247, 231));
        panelSitios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(44, 73, 91)));
        panelSitios.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(253, 247, 231));
        jLabel4.setFont(new java.awt.Font("P052", 3, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(42, 76, 86));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sitios disponibles");
        panelSitios.add(jLabel4);
        jLabel4.setBounds(0, 0, 330, 50);

        panelBotonesSitios.setBackground(new java.awt.Color(253, 247, 231));
        panelBotonesSitios.setLayout(null);
        panelSitios.add(panelBotonesSitios);
        panelBotonesSitios.setBounds(0, 60, 110, 80);
        setVisible(false);

        Contenedor.add(panelSitios);
        panelSitios.setBounds(570, 80, 340, 520);
        setVisible(false);

        add(Contenedor);
        Contenedor.setBounds(0, 20, 920, 680);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panelBotonesPaginas.removeAll();
        ArrayList<String> paginas = obtener.obtenerPaginas();

        jButton1.setBounds(0, (int) ((alto * 0.20)), (int) ((ancho * 0.2)), (int) ((alto * 0.1)));
        jButton1.setBackground(Color.decode("#FDF7E7"));
        jButton1.setForeground(Color.decode("#2c495b"));
        for (int i = 0; i < paginas.size(); i++) {
            JButton boton = new JButton();
            boton.setText(paginas.get(i));

            boton.setBackground(Color.decode("#2c495b"));
            boton.setForeground(Color.decode("#FDF7E7"));
            boton.setFont(new Font("P052", Font.BOLD | Font.ITALIC, 36));

            boton.setBounds((int) ((ancho * 0.05)), (int) ((alto * 0.12)) * (i), (int) ((ancho * 0.5)), (int) ((alto * 0.1)));
            String nombre = boton.getText();
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panelEdicionPAgina(nombre);

                }
            });
            panelBotonesPaginas.add(boton);
        }

        int alturaTotal = (int) (alto * 0.12) * paginas.size();
        panelBotonesPaginas.setPreferredSize(new Dimension((int) (ancho * 0.6), alturaTotal));

        panelBotonesPaginas.revalidate();
        panelBotonesPaginas.repaint();
        panelBotonesPaginas.updateUI();

        panelPaginas.revalidate();
        panelPaginas.repaint();
        restablecerBotonces(1);
        panelPaginas.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void panelEdicionPAgina(String nombre) {
        Contenedor.setVisible(false);
        editorPagina.panel(Contenedor);
        editorPagina.setVisible(true);
        editorPagina.obtnerPagina(nombre);
        editorPagina.setNombrePagina(nombre);
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        panelBotonesSitios.removeAll();
        ArrayList<String> sitios = obtener.obtenerSitios();
        jButton2.setBounds(0, (int) ((alto * 0.35)), (int) ((ancho * 0.2)), (int) ((alto * 0.1)));
        jButton2.setBackground(Color.decode("#FDF7E7"));
        jButton2.setForeground(Color.decode("#2c495b"));

        for (int i = 0; i < sitios.size(); i++) {
            JButton boton = new JButton();
            boton.setText(sitios.get(i));
            boton.setBackground(Color.decode("#2c495b"));
            boton.setForeground(Color.decode("#FDF7E7"));
            boton.setFont(new Font("P052", Font.BOLD | Font.ITALIC, 36));

            boton.setBounds((int) ((ancho * 0.05)), (int) ((alto * 0.12)) * (i), (int) ((ancho * 0.5)), (int) ((alto * 0.1)));
            String nombre = boton.getText();
            boton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    panelEdicionSitio(nombre);

                }
            });
            panelBotonesSitios.add(boton);
        }
        int alturaTotal = (int) (alto * 0.12) * sitios.size();
        panelBotonesSitios.setPreferredSize(new Dimension((int) (ancho * 0.6), alturaTotal));

        panelBotonesSitios.revalidate();
        panelBotonesSitios.repaint();
        panelBotonesPaginas.updateUI();
        panelSitios.revalidate();
        panelSitios.repaint();
        restablecerBotonces(2);
        panelSitios.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void panelEdicionSitio(String nombre) {
        Contenedor.setVisible(false);
        editorSitios.panel(Contenedor);

        editorSitios.setVisible(true);
        editorSitios.setNombrePagina(nombre);
        editorSitios.mostrarPaginas();

    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cambiarEstado();
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed
    public void cambiarEstado() {

        panelAnterior.setVisible(true);
    }

    JPanel panelAnterior;

    public void panel(JPanel panel) {
        panelAnterior = panel;
    }

    public void restablecerBotonces(int boton) {

        if (boton != 1) {
            jButton1.setBounds(0, (int) ((alto * 0.20)), (int) ((ancho * 0.2)), (int) ((alto * 0.1)));
            jButton1.setBackground(Color.decode("#2c495b"));
            jButton1.setForeground(Color.decode("#FDF7E7"));
            panelPaginas.setVisible(false);
            jButton2.setEnabled(false);
            jButton1.setEnabled(true);
        }

        if (boton != 2) {
            jButton2.setBounds(0, (int) ((alto * 0.35)), (int) ((ancho * 0.2)), (int) ((alto * 0.1)));
            jButton2.setBackground(Color.decode("#2c495b"));
            jButton2.setForeground(Color.decode("#FDF7E7"));
            panelSitios.setVisible(false);
            jButton1.setEnabled(false);
            jButton2.setEnabled(true);
        }

    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel panelBotonesPaginas;
    private javax.swing.JPanel panelBotonesSitios;
    private javax.swing.JPanel panelPaginas;
    private javax.swing.JPanel panelSitios;
    // End of variables declaration//GEN-END:variables
}
