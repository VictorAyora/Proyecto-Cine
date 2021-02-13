/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.*;
import Modelo.Cuenta;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Veronica Estefania
 */
public class AdmUsuarios extends javax.swing.JFrame {

    DefaultTableModel TablaAdmUsuarios; //Codigo que crea el modelo de la tabla
    FondoPanel fondo = new FondoPanel();
    ControladorCuenta cc = new ControladorCuenta();
    ControladorRol cr = new ControladorRol();
    ControladorUsuario cu = new ControladorUsuario();
    List<Cuenta> lc = cc.cargarCuentas();
    static int id_ex;

    public AdmUsuarios() {
        this.setContentPane(fondo);
        this.setResizable(false);//no redimenciona la ventana
        this.setExtendedState(6);
//        placeHolder place1 = new placeHolder("Ejm: Carolina", jTextFieldNombre);
//        placeHolder place2 = new placeHolder("Ejm: Paredes", jTextFieldApellido);
//        placeHolder place3 = new placeHolder("Ejm: nombreapellido@gmail.com", jTextFieldCorreo);
//        placeHolder place4 = new placeHolder("Ejm: 0991704302", jTextFieldTelefono);
//        placeHolder place5 = new placeHolder("Ejm: 1104758920", jTextFieldCedula);
//        placeHolder place6 = new placeHolder("Escriba el numero de cedula  o apellidos de la cuenta a buscar", jTextFieldBuscar);
        initComponents();
        cargarTabla();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldCorreo = new javax.swing.JTextField();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldCedula = new javax.swing.JTextField();
        jTextFieldBuscar = new javax.swing.JTextField();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonBuscar = new javax.swing.JButton();
        jButtonCambiarEstado = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabelAgregarImagen = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAdmUsuarios = new javax.swing.JTable();
        jButtonRegistrar1 = new javax.swing.JButton();
        jButtonModificarDatos1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMINISTRACIÓN DE USUARIOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 740, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Apellido:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Correo:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Teléfono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Cédula:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Tipo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        jTextFieldNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 143, -1));

        jTextFieldApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 250, 143, -1));

        jTextFieldCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 143, -1));

        jTextFieldTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 143, -1));

        jTextFieldCedula.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 143, -1));

        jTextFieldBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 440, 470, -1));

        jComboBoxTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Vendedor", "Taquillero" }));
        getContentPane().add(jComboBoxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, 143, -1));

        jButtonRegistrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRegistrar.setText("Agregar Imagen");
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 360, -1, -1));

        jButtonBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonBuscar.setText("Buscar");
        jButtonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 440, -1, -1));

        jButtonCambiarEstado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonCambiarEstado.setText("Cambiar Estado");
        jButtonCambiarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCambiarEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCambiarEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 500, 130, -1));

        jButtonRegresar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 130, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 220, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 180, 220, 170));

        jLabelAgregarImagen.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jLabelAgregarImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 390, -1, -1));

        jTableAdmUsuarios.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTableAdmUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Usuario", "Apellido", "Nombre", "Tipo_Cuenta", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAdmUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, 690, 140));

        jButtonRegistrar1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonRegistrar1.setText("Registrar");
        jButtonRegistrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrar1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 390, 110, -1));

        jButtonModificarDatos1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButtonModificarDatos1.setText("Modificar Datos");
        jButtonModificarDatos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarDatos1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonModificarDatos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 550, 130, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonCambiarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCambiarEstadoActionPerformed
        int FilaTable = jTableAdmUsuarios.getSelectedRow();
        if (FilaTable >= 0) {
            int id = (int) TablaAdmUsuarios.getValueAt(FilaTable, 0);
            if (id == 1) {
                JOptionPane.showMessageDialog(null, "No puede modificar estado del administrador");
            } else {
                cc.setCuenta(cc.traerCuenta(id));
                if (cc.getCuenta().isEstado_cuenta()) {
                    cc.getCuenta().setEstado_cuenta(false);
                } else {
                    cc.getCuenta().setEstado_cuenta(true);
                }
                cc.actualizarCuenta(cc.getCuenta());
                int var = TablaAdmUsuarios.getRowCount();
                for (int i = 0; i < var; i++) {
                    TablaAdmUsuarios.removeRow(0);
                }
                lc = cc.cargarCuentas();
                cargarTabla();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }

    }//GEN-LAST:event_jButtonCambiarEstadoActionPerformed

    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
        MenuAdministrador ma = new MenuAdministrador();
        ma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed

    private void jButtonRegistrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrar1ActionPerformed
        switch ((String) (jComboBoxTipo.getSelectedItem())) {
            case "Taquillero":
                cr.setRol(cr.traerRol(3));
                break;
            case "Vendedor":
                cr.setRol(cr.traerRol(4));
                break;
        }
        //regitro usuario
        cu.getUsuario();
        cu.getUsuario().setNombre(jTextFieldNombre.getText());
        cu.getUsuario().setApellido(jTextFieldApellido.getText());
        cu.getUsuario().setCorreo(jTextFieldCorreo.getText());
        cu.getUsuario().setCedula(jTextFieldCedula.getText());
        cu.getUsuario().setTelefono(jTextFieldTelefono.getText());
        cu.getUsuario().setFoto("FotoXD");
        cu.getUsuario().setRol(cr.getRol());
        cu.registrarUsuario(cu.getUsuario());
        //registro cuenta
        cc.getCuenta();
        cc.getCuenta().setUsuario(jTextFieldCedula.getText());
        cc.getCuenta().setClave(jTextFieldCedula.getText());
        cc.getCuenta().setEstado_cuenta(true);
        cc.getCuenta().setUsu(cu.getUsuario());
        cc.registrarCuenta(cc.getCuenta());
        cc.actualizarCuenta(cc.getCuenta());
        int var = TablaAdmUsuarios.getRowCount();
        for (int i = 0; i < var; i++) {
            TablaAdmUsuarios.removeRow(0);
        }
        lc = cc.cargarCuentas();
        cargarTabla();
    }//GEN-LAST:event_jButtonRegistrar1ActionPerformed

    private void jButtonModificarDatos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarDatos1ActionPerformed
        int FilaTable = jTableAdmUsuarios.getSelectedRow();
        if (FilaTable >= 0) {
            id_ex = (int) TablaAdmUsuarios.getValueAt(FilaTable, 0);
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione una fila");
        }
        VistaCuenta c = new VistaCuenta(0, id_ex);
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButtonModificarDatos1ActionPerformed

    private void jButtonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(AdmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmUsuarios().setVisible(true);
            }
        });
    }

    private void cargarTabla() {
        TablaAdmUsuarios = (DefaultTableModel) jTableAdmUsuarios.getModel();
        for (int i = 0; i < lc.size(); i++) {                                    //Bucle que recorre la consulta obtenida
            String estado;
            if(lc.get(i).isEstado_cuenta()==true){
                estado = "Disponible";
            }else{
                estado = "No Disponible";
            }
            TablaAdmUsuarios.addRow(new Object[]{lc.get(i).getId_cuenta(), lc.get(i).getUsuario(), lc.get(i).getUsu().getApellido(),
                lc.get(i).getUsu().getNombre(), lc.get(i).getUsu().getRol().getTipo_rol(), estado});
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscar;
    private javax.swing.JButton jButtonCambiarEstado;
    private javax.swing.JButton jButtonModificarDatos1;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonRegistrar1;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelAgregarImagen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAdmUsuarios;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldBuscar;
    private javax.swing.JTextField jTextFieldCedula;
    private javax.swing.JTextField jTextFieldCorreo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/ADM USUARIOS.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
}
