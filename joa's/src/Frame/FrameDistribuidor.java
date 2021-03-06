/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import entidade.Distribuidoras;
import javax.swing.JOptionPane;
import percistencia.TudoDaoDistribuidores;

/**
 *
 * @author jbrag
 */
public class FrameDistribuidor extends javax.swing.JFrame {

    /**
     * Creates new form FrameDistribuidor
     */
    Distribuidoras f = new Distribuidoras();
    TudoDaoDistribuidores tdd = new TudoDaoDistribuidores();

    public FrameDistribuidor() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nomefantasia = new javax.swing.JTextField();
        razaosocial = new javax.swing.JTextField();
        telefone = new javax.swing.JTextField();
        cnpj = new javax.swing.JTextField();
        cei = new javax.swing.JTextField();
        BtVoltar = new javax.swing.JButton();
        BtNovo = new javax.swing.JButton();
        BtSalvar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        BtBuscar = new javax.swing.JButton();
        BtListar = new javax.swing.JToggleButton();
        BtEditar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setText("Registro Distribuidores");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 20, 238, 55);

        jLabel2.setText("Código");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 100, 50, 14);

        jLabel3.setText("Nome Fantasia");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(31, 150, 90, 14);

        jLabel4.setText("Razão Social");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 190, 80, 14);

        jLabel5.setText("Telefone");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 230, 70, 14);

        jLabel6.setText("CNPJ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 270, 60, 14);

        jLabel7.setText("CEI");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(67, 320, 50, 14);

        codigo.setEnabled(false);
        getContentPane().add(codigo);
        codigo.setBounds(136, 96, 54, 30);
        getContentPane().add(nomefantasia);
        nomefantasia.setBounds(140, 140, 182, 30);

        razaosocial.setEnabled(false);
        getContentPane().add(razaosocial);
        razaosocial.setBounds(140, 180, 182, 30);

        telefone.setEnabled(false);
        getContentPane().add(telefone);
        telefone.setBounds(140, 220, 182, 30);

        cnpj.setEnabled(false);
        getContentPane().add(cnpj);
        cnpj.setBounds(140, 260, 182, 30);

        cei.setEnabled(false);
        getContentPane().add(cei);
        cei.setBounds(140, 310, 182, 30);

        BtVoltar.setText("Voltar");
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BtVoltar);
        BtVoltar.setBounds(290, 40, 61, 23);

        BtNovo.setText("Novo");
        BtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtNovoActionPerformed(evt);
            }
        });
        getContentPane().add(BtNovo);
        BtNovo.setBounds(60, 380, 70, 23);

        BtSalvar.setText("Salvar");
        BtSalvar.setEnabled(false);
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(BtSalvar);
        BtSalvar.setBounds(240, 380, 80, 23);

        BtExcluir.setText("Excluir");
        BtExcluir.setEnabled(false);
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(BtExcluir);
        BtExcluir.setBounds(240, 420, 80, 23);

        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtBuscar);
        BtBuscar.setBounds(60, 420, 70, 23);

        BtListar.setText("Listar");
        getContentPane().add(BtListar);
        BtListar.setBounds(150, 420, 70, 23);

        BtEditar.setText("Editar");
        BtEditar.setEnabled(false);
        BtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BtEditar);
        BtEditar.setBounds(150, 380, 73, 23);

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(cancelar);
        cancelar.setBounds(263, 90, 90, 23);

        setSize(new java.awt.Dimension(405, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtNovoActionPerformed
        //Campos de texto
        nomefantasia.setEnabled(true);
        razaosocial.setEnabled(true);
        telefone.setEnabled(true);
        cnpj.setEnabled(true);
        cei.setEnabled(true);
        //Limpando todos os campos
        codigo.setText("");
        nomefantasia.setText("");
        razaosocial.setText("");
        telefone.setText("");
        cnpj.setText("");
        cei.setText("");
        //Botões
        BtEditar.setEnabled(false);
        BtSalvar.setEnabled(true);
        BtExcluir.setEnabled(false);
        BtBuscar.setEnabled(false);

    }//GEN-LAST:event_BtNovoActionPerformed

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        try {
            //inserindo os valores no objeto Exemplares
            f.setNomeFantasia(nomefantasia.getText());
            f.setRazaoSocial(razaosocial.getText());
            f.setTelefone(telefone.getText());
            f.setCnpj(cnpj.getText());
            f.setCei(Integer.parseInt(cei.getText()));
            //Inserindo os dados no banco de dados
            tdd.inserir(f);
            //Limpando os campos do formulário
            nomefantasia.setText("");
            razaosocial.setText("");
            telefone.setText("");
            cnpj.setText("");
            cei.setText("");
            //Desabilitando os campos do formulário
            razaosocial.setEnabled(false);
            telefone.setEnabled(false);
            cnpj.setEnabled(false);
            cei.setEnabled(false);
            //Botões do formulário
            BtSalvar.setEnabled(false);
            BtBuscar.setEnabled(true);
            BtExcluir.setEnabled(false);

            JOptionPane.showMessageDialog(rootPane, "Dados Inseridos com sucesso!!!");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao inserir os dados!!!");
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());

        }
    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
        try {
            //Criando uma variável para auxiliar na confirmação de exclusão
            int resposta;
            resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja apagar os dados de " + nomefantasia.getText());
            if (resposta == JOptionPane.YES_OPTION) {
                //Chamando o método de exclusão e enviando a mensagem de sucesso
                tdd.apagarDistribuidoras(Integer.parseInt(codigo.getText()));
                JOptionPane.showMessageDialog(rootPane, "Dados Apagados com sucesso!!!!");
                //Limpando os campos de texto do formulário
                nomefantasia.setText("");
                razaosocial.setText("");
                telefone.setText("");
                cnpj.setText("");
                cei.setText("");
                //Habilitando e desabilitando os campos de texto
                nomefantasia.setEnabled(true);
                razaosocial.setEditable(false);
                telefone.setEditable(false);
                cnpj.setEditable(false);
                cei.setEditable(false);
                //Habilitando e desabilitando os botões
                BtEditar.setEnabled(false);
                BtExcluir.setEnabled(false);
                BtListar.setEnabled(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao apagar dados!!!");
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        try {
            if (razaosocial.getText().isEmpty()) {
                f = tdd.selecionar(nomefantasia.getText());
                codigo.setText(String.valueOf(f.getCodigo()));
                nomefantasia.setText(f.getNomeFantasia());
                razaosocial.setText(f.getRazaoSocial());
                telefone.setText(f.getTelefone());
                cnpj.setText(f.getCnpj());
                cei.setText(String.valueOf(f.getCei()));
                //Campos de texto
                nomefantasia.setEnabled(false);
                razaosocial.setEnabled(false);
                telefone.setEnabled(false);
                cnpj.setEnabled(false);
                cei.setEnabled(false);
                //Botões
                BtBuscar.setEnabled(false);
                BtEditar.setEnabled(true);
                BtExcluir.setEnabled(true);
            } else {
                JOptionPane.showMessageDialog(rootPane, "Preencha o campo Nome Fantasia pra realizar a busca!!!");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Buscar os dados!!!");
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_BtBuscarActionPerformed

    private void BtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditarActionPerformed
        //Botões do formulário
        BtSalvar.setEnabled(true);
        BtListar.setEnabled(false);
        BtBuscar.setEnabled(false);
        //Campo do formulário
        nomefantasia.setEnabled(true);
        razaosocial.setEnabled(true);
        telefone.setEnabled(true);
        cnpj.setEnabled(true);
        cei.setEnabled(true);

    }//GEN-LAST:event_BtEditarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        //Campos de texto
        nomefantasia.setText("");
        razaosocial.setText("");
        telefone.setText("");
        cnpj.setText("");
        cei.setText("");
        //Botões
        BtNovo.setEnabled(true);
        BtBuscar.setEnabled(true);
        BtListar.setEnabled(true);
        BtEditar.setEnabled(false);
        BtExcluir.setEnabled(false);
        BtSalvar.setEnabled(false);
        //Campos habilitados
        nomefantasia.setEnabled(true);
        razaosocial.setEnabled(false);
        telefone.setEnabled(false);
        cnpj.setEnabled(false);
        cei.setEnabled(false);

    }//GEN-LAST:event_cancelarActionPerformed

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed
        
        dispose();
    }//GEN-LAST:event_BtVoltarActionPerformed

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
            java.util.logging.Logger.getLogger(FrameDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameDistribuidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameDistribuidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtBuscar;
    private javax.swing.JButton BtEditar;
    private javax.swing.JButton BtExcluir;
    private javax.swing.JToggleButton BtListar;
    private javax.swing.JButton BtNovo;
    private javax.swing.JButton BtSalvar;
    private javax.swing.JButton BtVoltar;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField cei;
    private javax.swing.JTextField cnpj;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nomefantasia;
    private javax.swing.JTextField razaosocial;
    private javax.swing.JTextField telefone;
    // End of variables declaration//GEN-END:variables
}
