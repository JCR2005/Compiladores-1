package Fronted;

import Backend.Crear;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author carlos
 */
public class PanelCreacion extends javax.swing.JPanel {

    Crear crear = new Crear();
    String nombre;

    /**
     * Creates new form PanelCreacion
     *
     * @param ancho
     * @param alto
     */
    public PanelCreacion(int ancho, int alto) {
        initComponents();
        try {
            UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
            setBounds(0, 0, ancho, alto);
            Contenedor.setBounds(0, 0, ancho, alto);
            jPanel1.setBounds((int) ((ancho * 0.4)), (int) ((alto * 0.15)), (int) ((ancho * 0.2)), (int) ((alto * 0.5)));
            jButton1.setBounds((int) ((ancho * 0.01)), (int) ((alto * 0.20)), (int) ((ancho * 0.18)), (int) ((alto * 0.1)));
            jButton2.setBounds((int) ((ancho * 0.01)), (int) ((alto * 0.35)), (int) ((ancho * 0.18)), (int) ((alto * 0.1)));
            jButton3.setBounds((int) ((ancho * 0.02)), (int) ((alto * 0.90)), (int) ((ancho * 0.08)), (int) ((alto * 0.05)));
            jLabel1.setBounds(0, 0, (int) ((ancho * 0.2)), (int) ((alto * 0.1)));
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
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(253, 247, 231));
        setLayout(null);

        Contenedor.setBackground(new java.awt.Color(253, 247, 231));
        Contenedor.setLayout(null);

        jButton3.setBackground(new java.awt.Color(44, 73, 91));
        jButton3.setFont(new java.awt.Font("Purisa", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(253, 247, 231));
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
        Contenedor.add(jButton3);
        jButton3.setBounds(0, 10, 250, 35);

        jPanel1.setBackground(new java.awt.Color(44, 73, 91));
        jPanel1.setLayout(null);

        jButton1.setBackground(new java.awt.Color(253, 247, 231));
        jButton1.setFont(new java.awt.Font("Purisa", 1, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(44, 73, 91));
        jButton1.setText("Crear Pagina");
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
        jButton1.setBounds(50, 20, 250, 35);

        jButton2.setBackground(new java.awt.Color(253, 247, 231));
        jButton2.setFont(new java.awt.Font("Purisa", 1, 36)); // NOI18N
        jButton2.setForeground(new java.awt.Color(44, 73, 91));
        jButton2.setText("Crear Sitio");
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
        jLabel1.setText("¿Que desea crear?");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(50, 120, 170, 30);

        Contenedor.add(jPanel1);
        jPanel1.setBounds(210, 80, 350, 290);

        add(Contenedor);
        Contenedor.setBounds(280, 70, 540, 360);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        nombre = "";
        while (nombre == null || nombre.isEmpty()) {
            nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre de su pagina:", "Minimal React", JOptionPane.INFORMATION_MESSAGE);

            if (nombre == null) {
                JOptionPane.showMessageDialog(null, "Se ha cancelado la creación de su pagina", "Minimal React", JOptionPane.CANCEL_OPTION);
                return;
            }

            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El nombre de la pagina es requerido.", "Minimal React", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (crear.crearPagina(nombre)) {
            JOptionPane.showMessageDialog(null, "Su pagina a sido creado", crear.response(), JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        nombre = "";
        while (nombre == null || nombre.isEmpty()) {
            nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del sitio:", "Minimal React", JOptionPane.INFORMATION_MESSAGE);

            if (nombre == null) {
                JOptionPane.showMessageDialog(null, "Se ha cancelado la creación del sitio", "Minimal React", JOptionPane.CANCEL_OPTION);
                return;
            }

            if (nombre.isEmpty()) {
                JOptionPane.showMessageDialog(null, "El nombre del sitio es requerido.", "Minimal React", JOptionPane.WARNING_MESSAGE);
            }
        }
        if (crear.crearSitio(nombre)) {
            JOptionPane.showMessageDialog(null, "Su sitio a sido creado", crear.response(), JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cambiarEstado();
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    public void cambiarEstado(){
        
        panelAnterior.setVisible(true);
    }
    
    JPanel panelAnterior;
    public void panel(JPanel panel){
        panelAnterior=panel;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
