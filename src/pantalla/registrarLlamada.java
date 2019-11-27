/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantalla;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import maxselectdds.Metodos_sql;

/**
 *
 * @author erick
 */
public class registrarLlamada extends javax.swing.JFrame {

    Metodos_sql metodos = new Metodos_sql();
    static String dniEncontrado;
    /**
     * Creates new form cargarReclamo
     */
    public registrarLlamada() {
        initComponents();
        setSize(575,580);
        setResizable(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        label_UsuarioActual = new javax.swing.JLabel();
        btn_mainMenu = new javax.swing.JButton();
        txtDNI = new javax.swing.JTextField();
        label_ingreseDNI = new javax.swing.JLabel();
        Buscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        label_UsuarioActual.setFont(new java.awt.Font("Nimbus Mono L", 1, 24)); // NOI18N
        label_UsuarioActual.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_UsuarioActual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/usuario.png"))); // NOI18N
        label_UsuarioActual.setText("Admin");
        label_UsuarioActual.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(label_UsuarioActual);
        label_UsuarioActual.setBounds(400, 10, 160, 56);

        btn_mainMenu.setFont(new java.awt.Font("Nimbus Mono L", 1, 18)); // NOI18N
        btn_mainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono-de-inicio-silueta.png"))); // NOI18N
        btn_mainMenu.setText("Menu Principal");
        btn_mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mainMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btn_mainMenu);
        btn_mainMenu.setBounds(12, 12, 224, 56);

        txtDNI.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });
        getContentPane().add(txtDNI);
        txtDNI.setBounds(220, 260, 150, 35);

        label_ingreseDNI.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_ingreseDNI.setText("Ingrese el DNI del cliente");
        getContentPane().add(label_ingreseDNI);
        label_ingreseDNI.setBounds(200, 210, 190, 34);

        Buscar.setText("Buscar");
        Buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarMouseClicked(evt);
            }
        });
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Buscar);
        Buscar.setBounds(220, 310, 150, 41);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(12, 73, 551, 10);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 580, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainMenuActionPerformed
        menuPrincipal mp;
        mp = new menuPrincipal();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_mainMenuActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        
        dniEncontrado = txtDNI.getText();
        String busqueda_dni = null;
        try {
            busqueda_dni = metodos.buscarDNI(txtDNI.getText());
        } catch (SQLException ex) {
            Logger.getLogger(registrarLlamada.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (busqueda_dni.equals("usuario no encontrado")){
            JOptionPane.showMessageDialog(this, "El usuario no se encuentra registrado");
            cargarCliente cc = new cargarCliente();
            cc.setVisible(true);
            dispose();
        }else{
            JOptionPane.showMessageDialog(this, "El usuario ya se encuentra registrado!");
            /*antes de esto de abajo (cambio de pantallas) hay que guardar ya el 
            dni encontrado para registrar la llamada de este cliente*/
            seleccionarMotivo selecMotivo = new seleccionarMotivo();         
            selecMotivo.setVisible(true);
            dispose();
            dniEncontrado = txtDNI.getText();
                       
        }
    }//GEN-LAST:event_BuscarActionPerformed

    private void BuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarMouseClicked
        
    }//GEN-LAST:event_BuscarMouseClicked

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        char c = evt.getKeyChar(); if (c<'0'||c>'9') evt.consume(); 
    }//GEN-LAST:event_txtDNIKeyTyped

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
            java.util.logging.Logger.getLogger(registrarLlamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registrarLlamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registrarLlamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registrarLlamada.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrarLlamada().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Buscar;
    private javax.swing.JButton btn_mainMenu;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel label_UsuarioActual;
    private javax.swing.JLabel label_ingreseDNI;
    private javax.swing.JTextField txtDNI;
    // End of variables declaration//GEN-END:variables
}
