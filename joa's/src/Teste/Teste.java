package Teste;

import entidade.Distribuidoras;
import entidade.Exemplares;
import entidade.Funcionario;
import entidade.Locacao;
import entradadados.EntradaDados;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import percistencia.TudoDaoDistribuidores;
import percistencia.TudoDaoExemplares;
import percistencia.TudoDaoFuncionario;
import percistencia.TudoDaoLocacao;
import validacao.ValidaCodigo;

public class Teste {

    public static void main(String[] args) throws Exception {
        TudoDaoDistribuidores tdd = new TudoDaoDistribuidores();
        Distribuidoras d = new Distribuidoras();
        ValidaCodigo vc = new ValidaCodigo();
        Funcionario f = new Funcionario();
        Exemplares e = new Exemplares();
        EntradaDados ed = new EntradaDados();
        TudoDaoFuncionario dao = new TudoDaoFuncionario();
        TudoDaoExemplares tde = new TudoDaoExemplares();
        TudoDaoLocacao tdl = new TudoDaoLocacao();
        Locacao locacao = new Locacao();

//        Date hoje = new Date();
//        String dStr = DateFormat.getDateInstance(DateFormat.MEDIUM).format(hoje);
//        System.out.println(dStr);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
//        String dt = JOptionPane.showInputDialog("Digite uma data");
//        String[] dataSplit = dt.split("/");
//        
//        
//        Date dataformatada = sdf.parse(dataSplit[2]+"/"+dataSplit[1]+"/"+dataSplit[0]);//Converte string para data;
//        //locacao.setDataDevolucao(dataformatada);
//        
//        //String dataString = sdf.format(locacao.getDataDevolucao());
//        //System.out.println(dataSplit[0]+dataSplit[1]+dataSplit[2]);
//        System.out.println("Como eu recebi a data: "+dt);
//        String teste = sdf.format(locacao.getDataDevolucao());//Converte Data para String
//        System.out.println("como eu mudei a data: "+sdf.format(locacao.getDataDevolucao()));
        
        locacao.setDataDevolucao("2019/02/18");
        locacao.setDataEmprestimo("2019/02/11");
        locacao.setDataPrevista("2019/02/18");
        locacao.setObservacao("qualquer coisa");
        locacao.setStatus("OK");
        tdl.inserir(locacao);
        tdl.listar();
        

    }
}
