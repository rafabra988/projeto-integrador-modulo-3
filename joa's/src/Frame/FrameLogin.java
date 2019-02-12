/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import javax.swing.JOptionPane;
import percistencia.TudoDaoFuncionario;

/**
 *
 * @author jbrag
 */
public class FrameLogin extends javax.swing.JFrame {

    /**
     * Creates new form FrameLogin
     */
    public FrameLogin() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LblLogin = new javax.swing.JTextField();
        LblSenha = new javax.swing.JPasswordField();
        BtnAcesso = new javax.swing.JButton();
        BtnSair = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bem-Vindo");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Login");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(165, 73, 56, 38);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Senha");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(165, 137, 56, 25);
        getContentPane().add(LblLogin);
        LblLogin.setBounds(220, 70, 152, 30);

        LblSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LblSenhaActionPerformed(evt);
            }
        });
        getContentPane().add(LblSenha);
        LblSenha.setBounds(220, 130, 152, 30);

        BtnAcesso.setText("Acessar");
        BtnAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAcessoActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAcesso);
        BtnAcesso.setBounds(165, 202, 92, 23);

        BtnSair.setText("Sair");
        BtnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSairActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSair);
        BtnSair.setBounds(285, 202, 92, 23);

        jMenu1.setText("Sobre");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(546, 383));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAcessoActionPerformed
        Index fl = new Index();
        TudoDaoFuncionario tdf = new TudoDaoFuncionario();
        String login = LblLogin.getText();
        String senha = LblSenha.getText();
        try{
            if(tdf.verificar(login, senha)){
                fl.setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Erro");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao conectar");
        }
        
        
    }//GEN-LAST:event_BtnAcessoActionPerformed

    private void BtnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSairActionPerformed
        dispose();
    }//GEN-LAST:event_BtnSairActionPerformed

    private void LblSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LblSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LblSenhaActionPerformed

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
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAcesso;
    private javax.swing.JButton BtnSair;
    private javax.swing.JTextField LblLogin;
    private javax.swing.JPasswordField LblSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
