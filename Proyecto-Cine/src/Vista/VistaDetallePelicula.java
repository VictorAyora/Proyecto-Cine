/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class VistaDetallePelicula extends javax.swing.JFrame {

    /**
     * Creates new form VistaDetallePelicula
     */
    FondoPanel fondo = new FondoPanel();

    public VistaDetallePelicula() {
        this.setContentPane(fondo);
        this.setExtendedState(6);
        initComponents();
        this.setResizable(false);//no redimenciona la ventana
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPortada = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabelNombrePelicula = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelAnioPelicula = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelGeneroPelicula = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabelFormatoPelicula = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelProveedorPelicula = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabelIdiomaPelicula = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabelSubtitulosPelicula = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabelDuracionPelicula = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelDirectorPelicula = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButtonRegresar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPaneSinopsis = new javax.swing.JTextPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPaneActores = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout jPanelPortadaLayout = new javax.swing.GroupLayout(jPanelPortada);
        jPanelPortada.setLayout(jPanelPortadaLayout);
        jPanelPortadaLayout.setHorizontalGroup(
            jPanelPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanelPortadaLayout.setVerticalGroup(
            jPanelPortadaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 210, Short.MAX_VALUE)
        );

        getContentPane().add(jPanelPortada, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 340, 210));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Idioma:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 370, -1, -1));

        jLabelNombrePelicula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNombrePelicula.setText("Nombe Película");
        getContentPane().add(jLabelNombrePelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Título:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 210, -1, -1));

        jLabelAnioPelicula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelAnioPelicula.setText("2000");
        getContentPane().add(jLabelAnioPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Año:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, -1, -1));

        jLabelGeneroPelicula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelGeneroPelicula.setText("Género Película");
        getContentPane().add(jLabelGeneroPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 290, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Género:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, -1));

        jLabelFormatoPelicula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelFormatoPelicula.setText("2D");
        getContentPane().add(jLabelFormatoPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 330, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Formato:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 330, -1, -1));

        jLabelProveedorPelicula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelProveedorPelicula.setText("Proveedor Película");
        getContentPane().add(jLabelProveedorPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 330, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Formato:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 330, -1, -1));

        jLabelIdiomaPelicula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelIdiomaPelicula.setText("Español");
        getContentPane().add(jLabelIdiomaPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 370, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Duración:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 410, -1, -1));

        jLabelSubtitulosPelicula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelSubtitulosPelicula.setText("Sí");
        getContentPane().add(jLabelSubtitulosPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 410, 40, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Director:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 560, -1, -1));

        jLabelDuracionPelicula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDuracionPelicula.setText("120");
        getContentPane().add(jLabelDuracionPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 410, 40, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Sinópsis:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Actores:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        jLabelDirectorPelicula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelDirectorPelicula.setText("Nombre Apellido");
        getContentPane().add(jLabelDirectorPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 560, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Subtítulos:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, -1, -1));

        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, -1, -1));

        jScrollPane2.setViewportView(jTextPaneSinopsis);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 460, 300, 100));

        jTextPaneActores.setEditable(false);
        jScrollPane1.setViewportView(jTextPaneActores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 280, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        VistaListaPeliculas lp = new VistaListaPeliculas();
        lp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaDetallePelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaDetallePelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaDetallePelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaDetallePelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaDetallePelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAnioPelicula;
    private javax.swing.JLabel jLabelDirectorPelicula;
    private javax.swing.JLabel jLabelDuracionPelicula;
    private javax.swing.JLabel jLabelFormatoPelicula;
    private javax.swing.JLabel jLabelGeneroPelicula;
    private javax.swing.JLabel jLabelIdiomaPelicula;
    private javax.swing.JLabel jLabelNombrePelicula;
    private javax.swing.JLabel jLabelProveedorPelicula;
    private javax.swing.JLabel jLabelSubtitulosPelicula;
    private javax.swing.JPanel jPanelPortada;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextPane jTextPaneActores;
    private javax.swing.JTextPane jTextPaneSinopsis;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/DETALLE PELICULA.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
