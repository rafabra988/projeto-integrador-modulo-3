/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percistencia;

import entidade.Exemplares;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jbrag
 */
public class TudoDaoExemplares extends Dao{
            
      public void inserir(Exemplares u) throws Exception {
        abrirConexao();
        //String distribuidor = null;
        stmt = con.prepareStatement("Insert into exemplar(nome, genero, sinopse, numlocalizacao, quantidade) values(?, ?, ?, ?, ?)");
        stmt.setString(1, u.getNome());
        stmt.setString(2, u.getGenero());
        stmt.setString(3, u.getSinopse());
        stmt.setString(4, u.getNumLocalizacao());
        stmt.setInt(5, u.getQuantidade());

        stmt.execute();
        stmt.close();
        
        fecharConexao();
    }
      
     public void apagarExemplares(int codigo) throws Exception{
        abrirConexao();
        stmt = con.prepareStatement("Delete from exemplar where id = ?");
        //stmt.setString(1, "nomebanco");
        stmt.setInt(1, codigo);
        stmt.execute();
        stmt.close();
        System.out.println("Dados apagados com sucesso!!!");
        fecharConexao();
    }
     
    public void listar() throws Exception {
        abrirConexao();
        stmt = con.prepareStatement("Select * from exemplar");
        rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.println("=-=-=-=-=-Dados de " + rs.getString("nome") + "=-=-=-=-=-=-=-=-");
            System.out.println("Código: " + rs.getInt("id"));
            System.out.println("Nome: " + rs.getString("nome"));
            System.out.println("Genero: " + rs.getString("genero"));
            System.out.println("Sinopse: " + rs.getString("sinopse"));
            System.out.println("Numero de localização: " + rs.getString("numlocalizacao"));
            System.out.println("Quantidade: " + rs.getString("quantidade"));
            System.out.println("");
        }
        rs.close();
        stmt.close();
        fecharConexao();
    }
    
    public Exemplares selecionar(String nome) throws Exception {
        abrirConexao();
        Exemplares cl = new Exemplares();
        //List<Exemplares> lista = new ArrayList<Exemplares>();
        String nm = nome;
        stmt = con.prepareStatement("Select * from exemplar where nome LIKE '%"+nm+"%'");
        //stmt.setString(1, nome);
        rs = stmt.executeQuery();
        if (rs.next()) {
            do {//nome, genero, sinospe, numlocalização, quantidade
                System.out.println("=-=-=-=-=-Dados de " + rs.getString("nome") + "=-=-=-=-=-=-=-=-");
                System.out.println("Código: " + rs.getInt("id"));
                cl.setCodigo(rs.getInt("id"));
                System.out.println("Nome: " + rs.getString("nome"));
                cl.setNome(rs.getString("nome"));
                System.out.println("Genero: " + rs.getString("genero"));
                cl.setGenero(rs.getString("genero"));
                System.out.println("Sinopse: " + rs.getString("sinopse"));
                cl.setSinopse(rs.getString("sinopse"));
                System.out.println("Numero de Localização: " + rs.getString("numlocalizacao"));
                cl.setNumLocalizacao(rs.getString("numlocalizacao"));
                System.out.println("Quantidade em Estoque: " + rs.getInt("quantidade"));
                cl.setQuantidade(rs.getInt("quantidade"));
                
                //lista.add(cl);
                System.out.println("");
            } while (rs.next());
        } else {
            System.out.println("Dados não encontrados");
        }
        rs.close();
        stmt.close();
        fecharConexao();

        return cl;
    }
    
    public void modificar(String nome) throws Exception {
        abrirConexao();
        Exemplares cl = new Exemplares();

        stmt = con.prepareStatement("Select * from exemplar where nome = ?");
        stmt.setString(1, nome);
        rs = stmt.executeQuery();
        
        int codigo = 0;
        String name = null;
        String genero = null;
        String sinopse = null;
        String numlocalizacao = null;
        int quantidade = 0;
        String rg = null;
        String login = null;
        
               //nome, genero, sinospe, numlocalização, quantidade         
        stmt = con.prepareStatement("UPDATE exemplar SET nome = ?, genero = ?, sinopse = ?, numlocalizacao = ?, quantidade = ? WHERE id = ?");
        stmt.setString(1, nome);
        stmt.setString(2, genero);
        stmt.setString(3, sinopse);
        stmt.setString(4, numlocalizacao);
        stmt.setInt(5, quantidade);
//        stmt.setString(6, rg);
//        stmt.setString(7, login);
        stmt.setInt(6, codigo);
        stmt.execute();
        
        rs.close();
        stmt.close();
        
        fecharConexao();

    }
    
    public void modificar(String nome, int qt) throws Exception {
        abrirConexao();
        Exemplares cl = new Exemplares();

        stmt = con.prepareStatement("Select * from exemplar where nome = ?");
        stmt.setString(1, nome);
        rs = stmt.executeQuery();
        
        int codigo = cl.getCodigo();
        int quantidade = cl.getQuantidade() - qt;
              
        stmt = con.prepareStatement("UPDATE exemplar SET quantidade = ? WHERE id = ?");
        
        stmt.setInt(1, quantidade);
        stmt.setInt(2, codigo);
        stmt.execute();
        
        rs.close();
        stmt.close();
        
        fecharConexao();

    }
}
