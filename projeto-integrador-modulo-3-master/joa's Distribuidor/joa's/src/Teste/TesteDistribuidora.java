/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Teste;

import entidade.Distribuidoras;
import entidade.Funcionario;
import entradadados.EntradaDados;
import javax.swing.JOptionPane;
import percistencia.DaoDistribuidor;
import percistencia.TudoDao;
import validacao.ValidaCodigo;

/**
 *
 * @author 42121742018.1
 */
public class TesteDistribuidora {

    public static void main(String[] args) throws Exception {
        
        ValidaCodigo vc = new ValidaCodigo();
        Distribuidoras d = new Distribuidoras();
        EntradaDados ed = new EntradaDados();
        DaoDistribuidor dao = new DaoDistribuidor();
        
        String opcao = JOptionPane.showInputDialog(null,"Informe 1 - para inserir/ 2 - Excluir/ 3 - Listar / 4 - Modificar");
        
        
           
        //d.setCodigo(ed.capturarCodigo());
        switch (opcao) {

            case "1":
                d.setNomeFantasia(ed.entradanomeFantasia());
                d.setCnpj(ed.entradaCnpj());
                d.setRazaoSocial(ed.entradaRazaoSocial());
                //d.setIdDistribuidor(ed.capturarIddistribuidor());
                d.setTelefone(ed.entradaTelefone());
                d.setCei(ed.entradaCei());   
//f.setSenha(ed.entradaSenha()); 
                dao.inserir(d);

                break;
            case "2":
                dao.listarDistribuidoras();
                String apag = JOptionPane.showInputDialog(null,"Coloque o id da distribuidora aqui: ");               
                dao.apagarDistribuidoras(Integer.parseInt(apag));
                System.out.println("Apagado com sucesso!!");
                break;
            case "3":
                dao.listarDistribuidoras();
                break;
         case "4":
        
        
        String mud  = JOptionPane.showInputDialog(null,"Coloque o ID da distribuidora aqui");
        dao.modificar(Integer.parseInt(mud));
        
        break;
        }

        //System.out.println(f.toString());
//    List<String> cpfn = new ArrayList<String>();
//    String cpf = "12345678910";
//    int soma = 0;
//     for (int i = 0; i < 9; i++){
//         System.out.println(cpf.));
//         soma += cpf.indexOf(i);
//     }
//        System.out.println(soma);
//    }
        }
    }
