/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import javax.swing.JOptionPane;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 *
 * @author Victor Ayora, Geovanny Poma, Veronica Placencia, Azucena Toledo
 */
public class InicioSesion extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    public static ControladorCuenta cc = new ControladorCuenta();
    
    /**
     * Creates new form InicioSesion
     */
    public InicioSesion() {
        this.setContentPane(fondo);
        this.setResizable(false);//no redimenciona la ventana
        this.setExtendedState(6);
        //placeHolder place1 = new placeHolder("Ejm: 1104795232", jTextFieldUsuario);
        //placeHolder place2 = new placeHolder("Escriba aqui su clave", jPasswordFieldClave);
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

        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonIngresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPasswordFieldClave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldUsuario.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 370, 50));

        jButtonIngresar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonIngresar.setText("INGRESAR");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 600, -1, -1));

        jLabel1.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENCUENTRA LAS MEJORES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, 830, 60));

        jLabel2.setFont(new java.awt.Font("Snap ITC", 0, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PELICULAS EN CINEMA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Stencil", 0, 36)); // NOI18N
        jLabel3.setText("INICIO DE SESION");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 310, 30));

        jLabel6.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel6.setText("Usuario:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 360, 160, 30));

        jLabel7.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 36)); // NOI18N
        jLabel7.setText("Clave:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 470, 100, 30));

        jPasswordFieldClave.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        getContentPane().add(jPasswordFieldClave, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 500, 370, 50));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        try {
            if (VerficarAdministrador(jTextFieldUsuario.getText(), cc.getMD5(jPasswordFieldClave.getText()))) {
                MenuAdministrador ma = new MenuAdministrador();
                ma.setVisible(true);
                this.dispose();
            } else if (VerificarTaquillero(jTextFieldUsuario.getText(), cc.getMD5(jPasswordFieldClave.getText()))) {
                VistaMenuTaquillero mt = new VistaMenuTaquillero();
                mt.setVisible(true);
                this.dispose();
            } else if (VerificarVendedor(jTextFieldUsuario.getText(), cc.getMD5(jPasswordFieldClave.getText()))) {
                VistaMenuVendedor mv = new VistaMenuVendedor();
                mv.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Datos incorrectos");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error intente de nuevo" + e);
        }
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private boolean VerficarAdministrador(String Usuario, String Clave) {
        cc.setCuenta(cc.traerCuenta(1));
        if (cc.getCuenta().isEstado_cuenta()) {
            if (cc.getCuenta().getUsu().getRol().getTipo_rol().equalsIgnoreCase("Administrador")) {
                if (cc.getCuenta().getUsuario().equals(Usuario)) {
                    if (cc.getCuenta().getClave().equals(Clave)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean VerificarTaquillero(String Usuario, String Clave) {
        cc=new ControladorCuenta();
        cc.setCuenta(cc.traeCuenta(Usuario));
        if (cc.getCuenta().isEstado_cuenta()==true) {
            if (cc.getCuenta().getUsu().getRol().getTipo_rol().equalsIgnoreCase("Taquillero")) {
                if (cc.getCuenta().getUsuario().equals(Usuario)) {
                    if (cc.getCuenta().getClave().equals(Clave)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean VerificarVendedor(String Usuario, String Clave) {
        cc=new ControladorCuenta();
        cc.setCuenta(cc.traeCuenta(Usuario));
        if (cc.getCuenta().isEstado_cuenta()==true) {
            if (cc.getCuenta().getUsu().getRol().getTipo_rol().equalsIgnoreCase("Vendedor")) {
                if (cc.getCuenta().getUsuario().equals(Usuario)) {
                    if (cc.getCuenta().getClave().equals(Clave)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed

    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/INICIOSESION.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPasswordFieldClave;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
