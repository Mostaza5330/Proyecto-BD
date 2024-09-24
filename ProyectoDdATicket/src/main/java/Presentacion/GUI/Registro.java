/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion.GUI;

import DATOS.DAO.UsuarioDAO;
import NEGOCIOS.UsuarioDTO;
import conexion.ConexionDTO;
import java.sql.Date;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author eduar
 */
public class Registro extends javax.swing.JFrame {

    /**
     * Creates new form Registro
     */
    ConexionDTO con;

    public Registro() {
        initComponents();
        con = new ConexionDTO();
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
        NombreCompletoTxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CorreoElectronicoTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        direccionTxt = new javax.swing.JTextField();
        fechaNacimientoTxt = new javax.swing.JTextField();
        ConfirmarRegistroBtn = new javax.swing.JButton();
        SalirBtn = new javax.swing.JButton();
        ConfirmarContraPwd = new javax.swing.JPasswordField();
        contraPwd = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("Registro");
        jLabel1.setIconTextGap(100);

        jLabel2.setText("Nombre Completo");

        NombreCompletoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreCompletoTxtActionPerformed(evt);
            }
        });

        jLabel3.setText("Correo Electronico");

        CorreoElectronicoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CorreoElectronicoTxtActionPerformed(evt);
            }
        });

        jLabel5.setText("Contraseña");

        jLabel6.setText("Confirmar Contraseña");

        jLabel4.setText("Fecha de Nacimiento");

        jLabel7.setText("Direccion");

        direccionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionTxtActionPerformed(evt);
            }
        });

        fechaNacimientoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaNacimientoTxtActionPerformed(evt);
            }
        });

        ConfirmarRegistroBtn.setText("Confirmar");
        ConfirmarRegistroBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarRegistroBtnActionPerformed(evt);
            }
        });

        SalirBtn.setText("Cancelar");
        SalirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirBtnActionPerformed(evt);
            }
        });

        ConfirmarContraPwd.setText("jPasswordField1");
        ConfirmarContraPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmarContraPwdActionPerformed(evt);
            }
        });

        contraPwd.setText("jPasswordField1");
        contraPwd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraPwdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CorreoElectronicoTxt)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(NombreCompletoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(ConfirmarContraPwd)
                            .addComponent(contraPwd))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(direccionTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                            .addComponent(fechaNacimientoTxt)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ConfirmarRegistroBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SalirBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(366, 366, 366))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreCompletoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaNacimientoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CorreoElectronicoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contraPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ConfirmarContraPwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(direccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(ConfirmarRegistroBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SalirBtn)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void direccionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_direccionTxtActionPerformed

    private void ConfirmarRegistroBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarRegistroBtnActionPerformed
        // Obtener los datos de los campos de texto
        String nombre = NombreCompletoTxt.getText();
        String correo = CorreoElectronicoTxt.getText();
        String direccion = direccionTxt.getText();
        String fechaNacimiento = fechaNacimientoTxt.getText();
        String contrasena = new String(contraPwd.getPassword());
        String confirmarContrasena = new String(ConfirmarContraPwd.getPassword());

        // Validar que las contraseñas coincidan
        if (!contrasena.equals(confirmarContrasena)) {
            JOptionPane.showMessageDialog(this, "Las contraseñas no coinciden.");
            return;
        }

        // Crear un objeto UsuarioDTO
        UsuarioDTO usuario = new UsuarioDTO();
        usuario.setNombre(nombre);
        usuario.setCorreo(correo);
        try {
            usuario.setFechaNacimiento(Date.valueOf(fechaNacimiento)); // Convertir String a Date
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El formato de la fecha de nacimiento es yyyy-mm-dd.");
        }
        usuario.setContrasena(contrasena);

        // Llamar al DAO para registrar el usuario
        UsuarioDAO dao = new UsuarioDAO();
        dao.agregarUsuario(usuario);
        JOptionPane.showMessageDialog(this, "Usuario registrado con éxito.");
        new InicioGUI().setVisible(true);
        dispose();
        //  
    }//GEN-LAST:event_ConfirmarRegistroBtnActionPerformed

    private void SalirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirBtnActionPerformed
        new InicioGUI().setVisible(true);
        dispose();

    }//GEN-LAST:event_SalirBtnActionPerformed

    private void ConfirmarContraPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmarContraPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ConfirmarContraPwdActionPerformed

    private void contraPwdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraPwdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contraPwdActionPerformed

    private void CorreoElectronicoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CorreoElectronicoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CorreoElectronicoTxtActionPerformed

    private void fechaNacimientoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaNacimientoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaNacimientoTxtActionPerformed

    private void NombreCompletoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreCompletoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NombreCompletoTxtActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField ConfirmarContraPwd;
    private javax.swing.JButton ConfirmarRegistroBtn;
    private javax.swing.JTextField CorreoElectronicoTxt;
    private javax.swing.JTextField NombreCompletoTxt;
    private javax.swing.JButton SalirBtn;
    private javax.swing.JPasswordField contraPwd;
    private javax.swing.JTextField direccionTxt;
    private javax.swing.JTextField fechaNacimientoTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
