package entidade;

import java.math.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class Exemplares {

    private int codigo;
    private String nome;
    private String genero;
    private String diretor;
    private String sinopse;
    private String numLocalizacao;
    private String status;//O que é isso???
    private int quantidade;
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getNumLocalizacao() {
        return numLocalizacao;
    }

    public void setNumLocalizacao(String numLocalizacao) {
        this.numLocalizacao = numLocalizacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}




//    public static void main(String[] args) throws Exception{
//        /*BigDecimal n1 = new BigDecimal("0.1");
//        BigDecimal n2 = new BigDecimal("0.2");
//        
//        System.out.println(n1.add(n2));*/
//        /**
//         * Permitir a inserção de dados pelo usuário e após a converção para data no formato do banco de dados.
//         * 
//         * String data [] = JOptionPane.showInputDialog("Qual a data de nascimento:").split("/");
//        SimpleDateFormat df = new SimpleDateFormat("yyyy/mm/dd");
//        Calendar calendario = Calendar.getInstance();
//        Date dat = df.parse(data[2]+"/"+data[1]+"/"+data[0]);
//        calendario.setTime(dat);
//        
//        System.out.println(df.format(calendario.getTime()));
//         */
//        /*String novo = "Alura";
//        System.out.println(novo.replace("A", "a"));
//        novo.replace("A", "a");
//        /*System.out.println(novo.toLowerCase());
//        System.out.println(novo.toUpperCase());*/
//        /*System.out.println(novo);
//        System.out.println(novo.concat(novo));/*
//        
//        //System.out.println(data[0]+"/"+data[1]+"/"+data[2]);*/
//        
//        String nome = "ALURA";
//        CharSequence cs = new StringBuilder("al");
//
//        nome = nome.replace("AL", cs);
//
//System.out.println(nome);
//    }