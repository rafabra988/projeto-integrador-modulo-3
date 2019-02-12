/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import entidade.Funcionario;
import entradadados.EntradaDados;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;
import percistencia.TudoDaoFuncionario;
import validacao.ValidaCodigo;

/**
 *
 * @author jbrag
 */
public class FrameFuncionario extends javax.swing.JFrame {

    ValidaCodigo vc = new ValidaCodigo();
    TudoDaoFuncionario tdf = new TudoDaoFuncionario();
    Funcionario f = new Funcionario();
    int flag = 1;

    public FrameFuncionario() {
        
        initComponents();
        cpf.setEnabled(false);
        cep.setEnabled(false);
        email.setEnabled(false);
        rg.setEnabled(false);
        telefone.setEnabled(false);
        int flag = 1;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtNovo = new javax.swing.JButton();
        BtSalvar = new javax.swing.JButton();
        BtExcluir = new javax.swing.JButton();
        BtBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        codigo = new javax.swing.JTextField();
        nome = new javax.swing.JTextField();
        lblTel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        rg = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        BtVoltar = new javax.swing.JButton();
        BtListar = new javax.swing.JToggleButton();
        BtEditar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cpf = new javax.swing.JFormattedTextField();
        telefone = new javax.swing.JFormattedTextField();
        cep = new javax.swing.JFormattedTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        OpSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Funcionários");
        setResizable(false);
        getContentPane().setLayout(null);

        BtNovo.setText("Novo");
        BtNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtNovoActionPerformed(evt);
            }
        });
        getContentPane().add(BtNovo);
        BtNovo.setBounds(30, 290, 57, 23);

        BtSalvar.setText("Salvar");
        BtSalvar.setEnabled(false);
        BtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(BtSalvar);
        BtSalvar.setBounds(210, 290, 80, 23);

        BtExcluir.setText("Excluir");
        BtExcluir.setEnabled(false);
        BtExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(BtExcluir);
        BtExcluir.setBounds(510, 290, 80, 23);

        BtBuscar.setText("Buscar");
        BtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtBuscar);
        BtBuscar.setBounds(310, 290, 90, 23);

        jLabel1.setText("Código");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 70, 50, 14);

        jLabel2.setText("Nome");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 110, 50, 20);

        codigo.setEnabled(false);
        getContentPane().add(codigo);
        codigo.setBounds(150, 60, 60, 30);
        getContentPane().add(nome);
        nome.setBounds(150, 100, 160, 30);

        lblTel.setText("Telefone");
        getContentPane().add(lblTel);
        lblTel.setBounds(320, 150, 60, 14);

        jLabel4.setText("CPF");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 150, 40, 14);

        jLabel5.setText("RG");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 180, 40, 20);

        rg.setEnabled(false);
        getContentPane().add(rg);
        rg.setBounds(150, 180, 160, 30);

        jLabel6.setText("E-mail");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(320, 110, 40, 14);

        jLabel7.setText("CEP");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(320, 190, 30, 14);

        email.setEnabled(false);
        getContentPane().add(email);
        email.setBounds(370, 100, 170, 30);

        BtVoltar.setText("Voltar");
        BtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(BtVoltar);
        BtVoltar.setBounds(520, 20, 61, 23);

        BtListar.setText("Listar");
        getContentPane().add(BtListar);
        BtListar.setBounds(420, 290, 70, 23);

        BtEditar.setText("Editar");
        BtEditar.setEnabled(false);
        BtEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BtEditar);
        BtEditar.setBounds(120, 290, 73, 23);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel8.setText("Registro de Funcionários");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 20, 250, 40);

        try {
            cpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cpf.setEnabled(false);
        getContentPane().add(cpf);
        cpf.setBounds(150, 140, 160, 30);

        try {
            telefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        telefone.setEnabled(false);
        getContentPane().add(telefone);
        telefone.setBounds(370, 140, 170, 30);

        try {
            cep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cep.setEnabled(false);
        getContentPane().add(cep);
        cep.setBounds(370, 180, 140, 30);

        jMenu1.setText("Sobre");

        jMenuItem2.setText("jMenuItem2");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });

        OpSair.setText("Sair do Sistema");
        OpSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpSairActionPerformed(evt);
            }
        });
        jMenu2.add(OpSair);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(637, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtNovoActionPerformed
        nome.setEnabled(true);
        cpf.setEnabled(true);
        cep.setEnabled(true);
        email.setEnabled(true);
        rg.setEnabled(true);
        telefone.setEnabled(true);
        BtSalvar.setEnabled(true);
    }//GEN-LAST:event_BtNovoActionPerformed

    private void BtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtSalvarActionPerformed
        try {
            //pegando os dados dos campos e inserindo no objeto funcionario
            if (vc.verificaNome(nome.getText())) {
                f.setNome(nome.getText());
                if (vc.verificaEmail(email.getText())) {
                    f.setEmail(email.getText());
                    if (vc.verificaCep(cep.getText())) {
                        f.setCep(cep.getText());
                        if (vc.verificaCpf(cpf.getText())) {
                            f.setCpf(cpf.getText());
                            if (true) {
                                f.setRg(rg.getText());
                                if (true) {
                                    f.setTelefone(telefone.getText());
                                    //Chamando a função inserir e inserindo no banco de dados
                                    if(flag == 1){
                                        tdf.inserir(f);
                                    }else if(flag == 2){
                                        tdf.modificar(f);
                                    }
                                    
                                    //Campos de texto
                                    nome.setEnabled(true);
                                    cpf.setEnabled(false);
                                    cep.setEnabled(false);
                                    email.setEnabled(false);
                                    rg.setEnabled(false);
                                    telefone.setEnabled(false);
                                    //Botões
                                    BtSalvar.setEnabled(false);
                                    BtExcluir.setEnabled(false);
                                    BtEditar.setEnabled(false);
                                    //mensagem de sucesso
                                    //Limpando os campos do formulário
                                    nome.setText("");
                                    cpf.setText("");
                                    cep.setText("");
                                    email.setText("");
                                    rg.setText("");
                                    telefone.setText("");
                                    
                                } else {
                                    JOptionPane.showMessageDialog(rootPane, "Digite um Telefone válido");
                                }
                            } else {
                                JOptionPane.showMessageDialog(rootPane, "Digite um RG válido");
                            }
                        } else {
                            JOptionPane.showMessageDialog(rootPane, "Digite um CPF válido");
                        }
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Digite um CEP válido");
                    }

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Digite um E-mail válido");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Digite um nome válido");
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao inserir os dados!!!");

        }
    }//GEN-LAST:event_BtSalvarActionPerformed

    private void BtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtBuscarActionPerformed
        try {
            //Chamando o metodo selecionar e guardando no objeto funcionário
            f = tdf.selecionar(nome.getText());
            //Editando os campos de texto no formulário após buscar no objeto criado acima
            codigo.setText(String.valueOf(f.getCodigo()));
            nome.setText(f.getNome());
            cpf.setText(f.getCpf());
            cep.setText(f.getCep());
            email.setText(f.getEmail());
            rg.setText(f.getRg());
            telefone.setText(f.getTelefone());
            //Botões
            BtEditar.setEnabled(true);
            BtExcluir.setEnabled(true);

            //Campos de texto
            nome.setEnabled(false);
            cpf.setEnabled(false);
            cep.setEnabled(false);
            email.setEnabled(false);
            rg.setEnabled(false);
            telefone.setEnabled(false);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao Buscar os dados!!!");
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_BtBuscarActionPerformed

    private void BtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtVoltarActionPerformed

        dispose();
    }//GEN-LAST:event_BtVoltarActionPerformed

    private void OpSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpSairActionPerformed

        FrameLogin fl = new FrameLogin();
        fl.setVisible(true);
        dispose();
    }//GEN-LAST:event_OpSairActionPerformed

    private void BtExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtExcluirActionPerformed
        try {
            //Criando uma variável para auxiliar na pergunta de confirmação de exclusão
            int resposta;
            resposta = JOptionPane.showConfirmDialog(rootPane, "Deseja apagar os dados de " + nome.getText());
            if (resposta == JOptionPane.YES_OPTION) {
                //chamando o método de exclusão, executando e dando a mensagem de sucesso 
                tdf.apagarFuncionario(Integer.parseInt(codigo.getText()));
                JOptionPane.showMessageDialog(rootPane, "Dados Apagados com sucesso!!!!");
                //Limpando os campos de texto
                nome.setText("");
                cpf.setText("");
                cep.setText("");
                email.setText("");
                rg.setText("");
                telefone.setText("");
                //Abilitando e desabilitando os campos de texto do formulário
                nome.setEnabled(true);
                cpf.setEnabled(false);
                cep.setEnabled(false);
                email.setEnabled(false);
                rg.setEnabled(false);
                telefone.setEnabled(false);
                //Botões
                BtExcluir.setEnabled(false);
                BtEditar.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Erro ao apagar dados!!!");
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_BtExcluirActionPerformed

    private void BtEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtEditarActionPerformed
        //Botões do formulário
        flag = 2;
        BtSalvar.setEnabled(true);
        BtListar.setEnabled(false);
        BtBuscar.setEnabled(false);
        BtEditar.setEnabled(false);
        //Abilitando campos de texto
        nome.setEnabled(true);
        cpf.setEnabled(true);
        cep.setEnabled(true);
        email.setEnabled(true);
        rg.setEnabled(true);
        telefone.setEnabled(true);

    }//GEN-LAST:event_BtEditarActionPerformed

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jMenu2MouseClicked

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
            java.util.logging.Logger.getLogger(FrameFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameFuncionario().setVisible(true);
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
    private javax.swing.JMenuItem OpSair;
    private javax.swing.JFormattedTextField cep;
    private javax.swing.JTextField codigo;
    private javax.swing.JFormattedTextField cpf;
    private javax.swing.JTextField email;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblTel;
    private javax.swing.JTextField nome;
    private javax.swing.JTextField rg;
    private javax.swing.JFormattedTextField telefone;
    // End of variables declaration//GEN-END:variables
}