/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pantalla;

import javax.swing.JOptionPane;
import maxselectdds.Metodos_sql;
/**
 *
 * @author erick
 */
public class login extends javax.swing.JFrame {
    

    /**
     * Creates new form principal
     */
    public login() {
        initComponents();
        setSize(364,500);
        setResizable(false);
        setLocationRelativeTo(null);
    }
    Metodos_sql metodos = new Metodos_sql();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        txt_usuarioLogin = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_contraseniaLogin = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        btn_signIn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MaxSelect System");
        setMaximumSize(new java.awt.Dimension(364, 500));
        setMinimumSize(new java.awt.Dimension(364, 500));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Nimbus Mono L", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sistema de gestion");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 360, 70);

        btn_exit.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btn_exit.setText("SALIR");
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_exitMouseClicked(evt);
            }
        });
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit);
        btn_exit.setBounds(50, 370, 270, 42);
        getContentPane().add(txt_usuarioLogin);
        txt_usuarioLogin.setBounds(50, 190, 270, 30);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Usuario");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 170, 78, 22);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Contraseña");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(130, 230, 116, 20);

        txt_contraseniaLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_contraseniaLoginActionPerformed(evt);
            }
        });
        getContentPane().add(txt_contraseniaLogin);
        txt_contraseniaLogin.setBounds(50, 250, 270, 30);

        jLabel5.setFont(new java.awt.Font("Nimbus Mono L", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Post-Venta");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 40, 370, 60);

        btn_signIn.setFont(new java.awt.Font("DejaVu Sans", 1, 18)); // NOI18N
        btn_signIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/entrar.png"))); // NOI18N
        btn_signIn.setText(" INGRESAR");
        btn_signIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_signInMouseClicked(evt);
            }
        });
        btn_signIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_signInActionPerformed(evt);
            }
        });
        getContentPane().add(btn_signIn);
        btn_signIn.setBounds(50, 320, 270, 42);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 370, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        
    }//GEN-LAST:event_btn_exitActionPerformed

    private void txt_contraseniaLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_contraseniaLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_contraseniaLoginActionPerformed

    private void btn_exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseClicked
        dispose();
    }//GEN-LAST:event_btn_exitMouseClicked

    private void btn_signInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signInMouseClicked

        String user = "admin";
        String pass = "123";
        
        if ((txt_usuarioLogin.getText().equals(user)) && (txt_contraseniaLogin.getText().equals(pass))){
            menuPrincipal mp = new menuPrincipal();
            mp.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Usuario / Contraseña incorrecto. Por favor verifique"
                    + "","Error!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_signInMouseClicked

    private void btn_signInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_signInActionPerformed
        
    }//GEN-LAST:event_btn_signInActionPerformed

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
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_signIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txt_contraseniaLogin;
    private javax.swing.JTextField txt_usuarioLogin;
    // End of variables declaration//GEN-END:variables
}
