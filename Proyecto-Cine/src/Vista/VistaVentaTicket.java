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
public class VistaVentaTicket extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    public VistaVentaTicket() {
        this.setContentPane(fondo);
        this.setResizable(false);
        this.setExtendedState(6);
        initComponents();
    }
 
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBoxPeliculasTicket = new javax.swing.JComboBox<>();
        jComboBoxHorarioTicket = new javax.swing.JComboBox<>();
        jComboBoxFormatoTicket = new javax.swing.JComboBox<>();
        jComboBoxTipoTicket = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTicket = new javax.swing.JTable();
        jTextFieldCantidadTicket = new javax.swing.JTextField();
        jToggleButtonAceptarTicket = new javax.swing.JToggleButton();
        jToggleButtonRegresarTicket = new javax.swing.JToggleButton();
        jToggleButtonPagarTicket = new javax.swing.JToggleButton();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldPrecioTotalTicket = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxPeliculasTicket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pelicula 1", "Pelicula 2", "Pelicula 3", "Pelicula 4", " " }));
        getContentPane().add(jComboBoxPeliculasTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, 150, -1));

        jComboBoxHorarioTicket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "14:30", "16:30", "18:30", "20:30" }));
        getContentPane().add(jComboBoxHorarioTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 150, -1));

        jComboBoxFormatoTicket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2D", "3D", "3D 4k" }));
        getContentPane().add(jComboBoxFormatoTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 150, -1));

        jComboBoxTipoTicket.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Niño", "Adulto", "Adulto Mayor" }));
        getContentPane().add(jComboBoxTipoTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 300, 150, -1));

        jLabel1.setText("PELICULA:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 220, -1, -1));

        jLabel2.setText("HORARIO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, -1, -1));

        jLabel3.setText("TIPO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 40, 10));

        jLabel4.setText("CANTIDAD:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 340, -1, -1));

        jLabel5.setText("FORMATO:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        jTableTicket.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Pelicula", "Horario", "Tipo", "Formato", "Cantidad", "Formato", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTableTicket);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 1100, 240));
        getContentPane().add(jTextFieldCantidadTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 150, -1));

        jToggleButtonAceptarTicket.setText("ACEPTAR");
        getContentPane().add(jToggleButtonAceptarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 370, 180, 40));

        jToggleButtonRegresarTicket.setText("REGRESAR");
        getContentPane().add(jToggleButtonRegresarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 720, 180, 40));

        jToggleButtonPagarTicket.setText("PAGAR");
        getContentPane().add(jToggleButtonPagarTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 730, 170, 40));

        jLabel6.setText("PRECIO TOTAL:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 690, -1, -1));
        getContentPane().add(jTextFieldPrecioTotalTicket, new org.netbeans.lib.awtextra.AbsoluteConstraints(1260, 690, 70, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Century Schoolbook", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("VENTA DE TICKETS");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, 630, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VistaVentaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaVentaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaVentaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaVentaTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaVentaTicket().setVisible(true);
            }
        });
    }
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/VENTA TICKETS.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxFormatoTicket;
    private javax.swing.JComboBox<String> jComboBoxHorarioTicket;
    private javax.swing.JComboBox<String> jComboBoxPeliculasTicket;
    private javax.swing.JComboBox<String> jComboBoxTipoTicket;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTicket;
    private javax.swing.JTextField jTextFieldCantidadTicket;
    private javax.swing.JTextField jTextFieldPrecioTotalTicket;
    private javax.swing.JToggleButton jToggleButtonAceptarTicket;
    private javax.swing.JToggleButton jToggleButtonPagarTicket;
    private javax.swing.JToggleButton jToggleButtonRegresarTicket;
    // End of variables declaration//GEN-END:variables
}
