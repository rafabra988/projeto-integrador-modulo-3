/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import javax.swing.JOptionPane;
import percistencia.TudoDaoExemplares;
import percistencia.TudoDaoFuncionario;

/**
 *
 * @author jbrag
 */
public class Index extends javax.swing.JFrame {
    
    TudoDaoFuncionario tdf = new TudoDaoFuncionario();
    TudoDaoExemplares tde = new TudoDaoExemplares();
    FrameFuncionario ff = new FrameFuncionario();
    FrameExemplar fe = new FrameExemplar();
    FrameDistribuidor fd = new FrameDistribuidor();
    FrameLocacao fl = new FrameLocacao();
    
   
    public Index() {
        initComponents();
        //LblBemVindo.setText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        MenuFuncionario = new javax.swing.JButton();
        MenuExemplares = new javax.swing.JButton();
        MenuDistribuidores = new javax.swing.JButton();
        MenuEmprestimos = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MnFuncionario = new javax.swing.JMenuItem();
        MnExemplar = new javax.swing.JMenuItem();
        MnDistribuidor = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        sobre = new javax.swing.JMenuItem();
        Menusair = new javax.swing.JMenu();
        MnSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        MenuFuncionario.setText("Funcionários");
        MenuFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuFuncionarioActionPerformed(evt);
            }
        });
        getContentPane().add(MenuFuncionario);
        MenuFuncionario.setBounds(20, 50, 110, 120);

        MenuExemplares.setText("Exemplares");
        MenuExemplares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuExemplaresActionPerformed(evt);
            }
        });
        getContentPane().add(MenuExemplares);
        MenuExemplares.setBounds(150, 50, 110, 120);

        MenuDistribuidores.setText("Distribuidores");
        MenuDistribuidores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuDistribuidoresActionPerformed(evt);
            }
        });
        getContentPane().add(MenuDistribuidores);
        MenuDistribuidores.setBounds(280, 50, 110, 120);

        MenuEmprestimos.setText("Emprestimos");
        MenuEmprestimos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEmprestimosActionPerformed(evt);
            }
        });
        getContentPane().add(MenuEmprestimos);
        MenuEmprestimos.setBounds(150, 210, 110, 120);

        jMenu1.setText("Cadastros");

        MnFuncionario.setText("Funcionários");
        MnFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnFuncionarioActionPerformed(evt);
            }
        });
        jMenu1.add(MnFuncionario);

        MnExemplar.setText("Exemplares");
        MnExemplar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnExemplarActionPerformed(evt);
            }
        });
        jMenu1.add(MnExemplar);

        MnDistribuidor.setText("Distribuidores");
        MnDistribuidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnDistribuidorActionPerformed(evt);
            }
        });
        jMenu1.add(MnDistribuidor);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sobre");

        sobre.setText("Sobre");
        sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sobreActionPerformed(evt);
            }
        });
        jMenu2.add(sobre);

        jMenuBar1.add(jMenu2);

        Menusair.setText("Sair");
        Menusair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenusairActionPerformed(evt);
            }
        });

        MnSair.setText("Sair do Sistema");
        MnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnSairActionPerformed(evt);
            }
        });
        Menusair.add(MnSair);

        jMenuBar1.add(Menusair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(423, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MnExemplarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnExemplarActionPerformed
        fe.setVisible(true);
    }//GEN-LAST:event_MnExemplarActionPerformed

    private void MenusairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenusairActionPerformed
       
    }//GEN-LAST:event_MenusairActionPerformed

    private void MenuExemplaresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuExemplaresActionPerformed
        fe.setVisible(true);
    }//GEN-LAST:event_MenuExemplaresActionPerformed

    private void MnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnSairActionPerformed
        System.exit(0);
        FrameLogin fl = new FrameLogin();
        fl.setVisible(true);
        dispose();
    }//GEN-LAST:event_MnSairActionPerformed

    private void MenuFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuFuncionarioActionPerformed

        ff.setVisible(true);
    }//GEN-LAST:event_MenuFuncionarioActionPerformed

    private void sobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sobreActionPerformed
        JOptionPane.showMessageDialog(rootPane, "Criado por:\nJocimar\nRafael\nJoão Pedro");
    }//GEN-LAST:event_sobreActionPerformed

    private void MenuDistribuidoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuDistribuidoresActionPerformed
        fd.setVisible(true);
    }//GEN-LAST:event_MenuDistribuidoresActionPerformed

    private void MnFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnFuncionarioActionPerformed
        ff.setVisible(true);
    }//GEN-LAST:event_MnFuncionarioActionPerformed

    private void MnDistribuidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnDistribuidorActionPerformed
        fd.setVisible(true);
    }//GEN-LAST:event_MnDistribuidorActionPerformed

    private void MenuEmprestimosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEmprestimosActionPerformed
        fl.setVisible(true);
    }//GEN-LAST:event_MenuEmprestimosActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MenuDistribuidores;
    private javax.swing.JButton MenuEmprestimos;
    private javax.swing.JButton MenuExemplares;
    private javax.swing.JButton MenuFuncionario;
    private javax.swing.JMenu Menusair;
    private javax.swing.JMenuItem MnDistribuidor;
    private javax.swing.JMenuItem MnExemplar;
    private javax.swing.JMenuItem MnFuncionario;
    private javax.swing.JMenuItem MnSair;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JMenuItem sobre;
    // End of variables declaration//GEN-END:variables
}