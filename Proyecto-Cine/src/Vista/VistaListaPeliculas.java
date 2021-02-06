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
 * @author David
 */
public class VistaListaPeliculas extends javax.swing.JFrame {

    /**
     * Creates new form VistaListaPeliculas
     */
    FondoPanel fondo = new FondoPanel();

    public VistaListaPeliculas() {
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

        jTextFieldBuscarPelicula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButtonBuscarPelicula = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableListaPeliculas = new javax.swing.JTable();
        jButtonVerDetalles = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldBuscarPelicula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextFieldBuscarPelicula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarPeliculaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBuscarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 200, 240, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 44)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("LISTA DE PELÍCULAS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 610, 70));

        jButtonBuscarPelicula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBuscarPelicula.setText("Buscar");
        getContentPane().add(jButtonBuscarPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 200, -1, -1));

        jTableListaPeliculas.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableListaPeliculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Película", "Año", "Subtítulos", "Duración", "Género", "Proveedor", "Formato", "Idioma"
            }
        ));
        jScrollPane1.setViewportView(jTableListaPeliculas);
        if (jTableListaPeliculas.getColumnModel().getColumnCount() > 0) {
            jTableListaPeliculas.getColumnModel().getColumn(3).setResizable(false);
            jTableListaPeliculas.getColumnModel().getColumn(5).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 980, 340));

        jButtonVerDetalles.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonVerDetalles.setText("Ver Detalles");
        jButtonVerDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerDetallesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonVerDetalles, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 200, -1, -1));

        jButtonRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 650, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Película:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonVerDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerDetallesActionPerformed
        VistaDetallePelicula dp = new VistaDetallePelicula();
        dp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonVerDetallesActionPerformed

    private void jTextFieldBuscarPeliculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarPeliculaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarPeliculaActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        VistaAdministracionPeliculas ap = new VistaAdministracionPeliculas();
        ap.setVisible(true);
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
            java.util.logging.Logger.getLogger(VistaListaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaListaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaListaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaListaPeliculas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaListaPeliculas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarPelicula;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JButton jButtonVerDetalles;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableListaPeliculas;
    private javax.swing.JTextField jTextFieldBuscarPelicula;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/LISTA PELICULA.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
