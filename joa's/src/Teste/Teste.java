package Teste;

import entidade.Funcionario;
import entradadados.EntradaDados;
import java.util.ArrayList;
import java.util.List;
import validacao.ValidaCodigo;


public class Teste {
    public static void main(String[] args){
    ValidaCodigo vc = new ValidaCodigo();
    Funcionario f = new Funcionario();
    EntradaDados ed = new EntradaDados();
    
    //f.setNome(ed.entradaNome());
    //f.setCep(ed.entradaCep());
    //f.setEmail(ed.entradaEmail());
    //f.setTelefone(ed.entradaTelefone());
    //f.setLogin(ed.entradaLogin());
    //f.setSenha(ed.entradaSenha());
        //System.out.println(f.toString());
    List<String> cpfn = new ArrayList<String>();
    String cpf = "12345678910";
    int soma = 0;
     for (int i = 0; i < 9; i++){
         System.out.println(cpf.));
         soma += cpf.indexOf(i);
     }
        System.out.println(soma);
    }
    
}
