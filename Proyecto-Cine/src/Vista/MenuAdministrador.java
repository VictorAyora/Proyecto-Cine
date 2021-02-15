/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.placeHolder;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author COMPUCELL
 */
public class MenuAdministrador extends javax.swing.JFrame {
    FondoPanel fondo = new FondoPanel();
    /**
     * Creates new form MenuAdministrador
     */
    public MenuAdministrador() {
        this.setContentPane(fondo);
        this.setExtendedState(6);
        this.setResizable(false);//no redimenciona la ventana
        //placeHolder place1 = new placeHolder("Ejm: Carolina", jTextFieldBuscar);
        initComponents();
        jPanelUsuario.setVisible(false);
        jPanelCartelera.setVisible(false);
        jPanelPelicula.setVisible(false);
        jPanelSala.setVisible(false);
        jPanelSnacks.setVisible(false);
        jPanelSalir.setVisible(false);
        jPanelCuenta.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelUsuario = new javax.swing.JPanel();
        jPanelUsuarioI = new javax.swing.JPanel();
        jLabelImagenUsuario = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jPanelCartelera = new javax.swing.JPanel();
        jPanelCarteleraI = new javax.swing.JPanel();
        jLabelImagenCartelera = new javax.swing.JLabel();
        jLabelCartelera = new javax.swing.JLabel();
        jPanelPelicula = new javax.swing.JPanel();
        jPanelPeliculaI = new javax.swing.JPanel();
        jLabelPelicula = new javax.swing.JLabel();
        jLabelImagenPelicula = new javax.swing.JLabel();
        jPanelSala = new javax.swing.JPanel();
        jPanelSalaI = new javax.swing.JPanel();
        jLabelImagenSala = new javax.swing.JLabel();
        jLabelSala = new javax.swing.JLabel();
        jPanelSnacks = new javax.swing.JPanel();
        jPanelSnacksI = new javax.swing.JPanel();
        jLabelSnacks = new javax.swing.JLabel();
        jLabelImagenSnacks = new javax.swing.JLabel();
        jPanelSalir = new javax.swing.JPanel();
        jPanelSalirI = new javax.swing.JPanel();
        jLabelImagenSalir = new javax.swing.JLabel();
        jLabelSalir = new javax.swing.JLabel();
        jPanelCuenta = new javax.swing.JPanel();
        jPanelCuentaI = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jTextFieldBuscar = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelUsuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelUsuario.setOpaque(false);
        jPanelUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelUsuarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelUsuarioMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelUsuarioMouseExited(evt);
            }
        });
        getContentPane().add(jPanelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 190, 180));

        jPanelUsuarioI.setOpaque(false);
        jPanelUsuarioI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelUsuarioIMouseEntered(evt);
            }
        });
        getContentPane().add(jPanelUsuarioI, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, 190, 180));

        jLabelImagenUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario.png"))); // NOI18N
        jLabelImagenUsuario.setText("    ");
        jLabelImagenUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelImagenUsuarioMouseEntered(evt);
            }
        });
        getContentPane().add(jLabelImagenUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, 180, 140));

        jLabelUsuario.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabelUsuario.setText("USUARIO");
        jLabelUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelUsuarioMouseEntered(evt);
            }
        });
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 410, -1, -1));

        jPanelCartelera.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCartelera.setOpaque(false);
        jPanelCartelera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCarteleraMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCarteleraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCarteleraMouseExited(evt);
            }
        });
        getContentPane().add(jPanelCartelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 190, 200));

        jPanelCarteleraI.setOpaque(false);
        jPanelCarteleraI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCarteleraIMouseEntered(evt);
            }
        });
        getContentPane().add(jPanelCarteleraI, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 190, 200));

        jLabelImagenCartelera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cartelera.png"))); // NOI18N
        jLabelImagenCartelera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelImagenCarteleraMouseEntered(evt);
            }
        });
        getContentPane().add(jLabelImagenCartelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 190, 170));

        jLabelCartelera.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabelCartelera.setText("CARTELERA");
        jLabelCartelera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelCarteleraMouseEntered(evt);
            }
        });
        getContentPane().add(jLabelCartelera, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 620, -1, -1));

        jPanelPelicula.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPelicula.setOpaque(false);
        jPanelPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelPeliculaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelPeliculaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelPeliculaMouseExited(evt);
            }
        });
        jPanelPelicula.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanelPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 190, 180));

        jPanelPeliculaI.setOpaque(false);
        jPanelPeliculaI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelPeliculaIMouseEntered(evt);
            }
        });
        getContentPane().add(jPanelPeliculaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 260, 190, 180));

        jLabelPelicula.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabelPelicula.setText("PELICULA");
        jLabelPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelPeliculaMouseEntered(evt);
            }
        });
        getContentPane().add(jLabelPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, -1, -1));

        jLabelImagenPelicula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pelicula.png"))); // NOI18N
        jLabelImagenPelicula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelImagenPeliculaMouseEntered(evt);
            }
        });
        getContentPane().add(jLabelImagenPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 250, 160, 160));

        jPanelSala.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelSala.setOpaque(false);
        jPanelSala.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSalaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelSalaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelSalaMouseExited(evt);
            }
        });
        getContentPane().add(jPanelSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 190, 200));

        jPanelSalaI.setOpaque(false);
        jPanelSalaI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelSalaIMouseEntered(evt);
            }
        });
        getContentPane().add(jPanelSalaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 450, 190, 200));

        jLabelImagenSala.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sala.png"))); // NOI18N
        getContentPane().add(jLabelImagenSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 460, 170, 150));

        jLabelSala.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabelSala.setText("SALA");
        getContentPane().add(jLabelSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 620, -1, -1));

        jPanelSnacks.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelSnacks.setOpaque(false);
        jPanelSnacks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSnacksMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelSnacksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelSnacksMouseExited(evt);
            }
        });
        jPanelSnacks.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanelSnacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 190, 180));

        jPanelSnacksI.setOpaque(false);
        jPanelSnacksI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelSnacksIMouseEntered(evt);
            }
        });
        getContentPane().add(jPanelSnacksI, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 260, 190, 180));

        jLabelSnacks.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabelSnacks.setText("SNACK");
        getContentPane().add(jLabelSnacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, -1, -1));

        jLabelImagenSnacks.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/snacks.png"))); // NOI18N
        getContentPane().add(jLabelImagenSnacks, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 260, 150, 150));

        jPanelSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelSalir.setOpaque(false);
        jPanelSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelSalirMouseExited(evt);
            }
        });
        jPanelSalir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 450, 190, 200));

        jPanelSalirI.setOpaque(false);
        jPanelSalirI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelSalirIMouseEntered(evt);
            }
        });
        getContentPane().add(jPanelSalirI, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 450, 190, 200));

        jLabelImagenSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salir.png"))); // NOI18N
        getContentPane().add(jLabelImagenSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 450, 180, 190));

        jLabelSalir.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabelSalir.setText("SALIR");
        getContentPane().add(jLabelSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 620, -1, -1));

        jPanelCuenta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelCuenta.setOpaque(false);
        jPanelCuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelCuentaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCuentaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelCuentaMouseExited(evt);
            }
        });
        jPanelCuenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanelCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 180, 60));

        jPanelCuentaI.setOpaque(false);
        jPanelCuentaI.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelCuentaIMouseEntered(evt);
            }
        });
        getContentPane().add(jPanelCuentaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 30, 180, 60));

        jLabel1.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 24)); // NOI18N
        jLabel1.setText("MI CUENTA ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 30, 120, 70));

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel12.setText("SNACK");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 410, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usario circulo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 20, 60, 80));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/lupaNegra.png"))); // NOI18N
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 40, -1, 50));

        jTextFieldBuscar.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jTextFieldBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 530, 70));

        jTextField2.setEditable(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 30, 130, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUsuarioMouseEntered

    }//GEN-LAST:event_jPanelUsuarioMouseEntered

    private void jPanelUsuarioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUsuarioMouseExited
        jPanelUsuario.setVisible(false);
    }//GEN-LAST:event_jPanelUsuarioMouseExited

    private void jPanelUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUsuarioMouseClicked
        AdmUsuarios adm = new AdmUsuarios();
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelUsuarioMouseClicked

    private void jPanelSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSalirMouseClicked
        InicioSesion is = new InicioSesion();
        is.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelSalirMouseClicked

    private void jPanelSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSalirMouseEntered

    }//GEN-LAST:event_jPanelSalirMouseEntered

    private void jPanelSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSalirMouseExited
        jPanelSalir.setVisible(false);
    }//GEN-LAST:event_jPanelSalirMouseExited

    private void jPanelCarteleraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCarteleraMouseEntered

    }//GEN-LAST:event_jPanelCarteleraMouseEntered

    private void jPanelCarteleraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCarteleraMouseExited
        jPanelCartelera.setVisible(false);
    }//GEN-LAST:event_jPanelCarteleraMouseExited

    private void jPanelCarteleraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCarteleraMouseClicked
        MenuCartelera mc = new MenuCartelera();
        mc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelCarteleraMouseClicked

    private void jPanelSalaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSalaMouseClicked
        VistaAdministracionSalas as = new VistaAdministracionSalas();
        as.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelSalaMouseClicked

    private void jPanelSalaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSalaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelSalaMouseEntered

    private void jPanelSalaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSalaMouseExited
        jPanelSala.setVisible(false);
    }//GEN-LAST:event_jPanelSalaMouseExited

    private void jLabelImagenUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagenUsuarioMouseEntered

    }//GEN-LAST:event_jLabelImagenUsuarioMouseEntered

    private void jLabelUsuarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelUsuarioMouseEntered
  
    }//GEN-LAST:event_jLabelUsuarioMouseEntered

    private void jLabelImagenCarteleraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagenCarteleraMouseEntered
        
    }//GEN-LAST:event_jLabelImagenCarteleraMouseEntered

    private void jLabelCarteleraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCarteleraMouseEntered
   
    }//GEN-LAST:event_jLabelCarteleraMouseEntered

    private void jLabelPeliculaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelPeliculaMouseEntered

    }//GEN-LAST:event_jLabelPeliculaMouseEntered

    private void jLabelImagenPeliculaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelImagenPeliculaMouseEntered

    }//GEN-LAST:event_jLabelImagenPeliculaMouseEntered

    private void jPanelPeliculaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPeliculaMouseClicked
        VistaAdministracionPeliculas ap = new VistaAdministracionPeliculas();
        ap.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelPeliculaMouseClicked

    private void jPanelPeliculaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPeliculaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanelPeliculaMouseEntered

    private void jPanelPeliculaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPeliculaMouseExited
        jPanelPelicula.setVisible(false);
    }//GEN-LAST:event_jPanelPeliculaMouseExited

    private void jPanelSnacksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSnacksMouseClicked
        VistaAdministracionSnacks va = new VistaAdministracionSnacks();
        va.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelSnacksMouseClicked

    private void jPanelSnacksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSnacksMouseEntered
        // TODO  your handling code here:
    }//GEN-LAST:event_jPanelSnacksMouseEntered

    private void jPanelSnacksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSnacksMouseExited
        jPanelSnacks.setVisible(false);
    }//GEN-LAST:event_jPanelSnacksMouseExited

    private void jPanelUsuarioIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelUsuarioIMouseEntered
        jPanelUsuario.setVisible(true);
    }//GEN-LAST:event_jPanelUsuarioIMouseEntered

    private void jPanelCarteleraIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCarteleraIMouseEntered
        jPanelCartelera.setVisible(true);
    }//GEN-LAST:event_jPanelCarteleraIMouseEntered

    private void jPanelPeliculaIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelPeliculaIMouseEntered
        jPanelPelicula.setVisible(true);
    }//GEN-LAST:event_jPanelPeliculaIMouseEntered

    private void jPanelSalaIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSalaIMouseEntered
        jPanelSala.setVisible(true);
    }//GEN-LAST:event_jPanelSalaIMouseEntered

    private void jPanelSnacksIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSnacksIMouseEntered
        jPanelSnacks.setVisible(true);
    }//GEN-LAST:event_jPanelSnacksIMouseEntered

    private void jPanelSalirIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelSalirIMouseEntered
        jPanelSalir.setVisible(true);
    }//GEN-LAST:event_jPanelSalirIMouseEntered

    private void jTextFieldBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldBuscarActionPerformed

    private void jPanelCuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCuentaMouseClicked
        InicioSesion is = new InicioSesion();
        int id_usr = is.cc.getCuenta().getId_cuenta();
        System.out.println(id_usr);
        VistaCuenta vc = new VistaCuenta(-1, id_usr);
        vc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jPanelCuentaMouseClicked

    private void jPanelCuentaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCuentaMouseEntered
        
    }//GEN-LAST:event_jPanelCuentaMouseEntered

    private void jPanelCuentaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCuentaMouseExited
        jPanelCuenta.setVisible(false);
    }//GEN-LAST:event_jPanelCuentaMouseExited

    private void jPanelCuentaIMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelCuentaIMouseEntered
        jPanelCuenta.setVisible(true);
    }//GEN-LAST:event_jPanelCuentaIMouseEntered

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
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdministrador().setVisible(true);
            }
        });
    }

    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Imagenes/MENU ADM.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelCartelera;
    private javax.swing.JLabel jLabelImagenCartelera;
    private javax.swing.JLabel jLabelImagenPelicula;
    private javax.swing.JLabel jLabelImagenSala;
    private javax.swing.JLabel jLabelImagenSalir;
    private javax.swing.JLabel jLabelImagenSnacks;
    private javax.swing.JLabel jLabelImagenUsuario;
    private javax.swing.JLabel jLabelPelicula;
    private javax.swing.JLabel jLabelSala;
    private javax.swing.JLabel jLabelSalir;
    private javax.swing.JLabel jLabelSnacks;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JPanel jPanelCartelera;
    private javax.swing.JPanel jPanelCarteleraI;
    private javax.swing.JPanel jPanelCuenta;
    private javax.swing.JPanel jPanelCuentaI;
    private javax.swing.JPanel jPanelPelicula;
    private javax.swing.JPanel jPanelPeliculaI;
    private javax.swing.JPanel jPanelSala;
    private javax.swing.JPanel jPanelSalaI;
    private javax.swing.JPanel jPanelSalir;
    private javax.swing.JPanel jPanelSalirI;
    private javax.swing.JPanel jPanelSnacks;
    private javax.swing.JPanel jPanelSnacksI;
    private javax.swing.JPanel jPanelUsuario;
    private javax.swing.JPanel jPanelUsuarioI;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextFieldBuscar;
    // End of variables declaration//GEN-END:variables
}
