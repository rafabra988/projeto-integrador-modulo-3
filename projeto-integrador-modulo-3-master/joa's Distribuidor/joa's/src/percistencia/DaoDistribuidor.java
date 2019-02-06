/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percistencia;

import entidade.Distribuidoras;
import entidade.Exemplares;
import entidade.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author jpbar
 */

public class DaoDistribuidor extends Dao{
public void inserir(Distribuidoras d) throws Exception{
        abrirConexao();
        stmt = con.prepareStatement("Insert into distribuidor(cnpj, nomefantasia,razaosocial,telefone,cei) VALUES(?, ?, ?, ?, ?)");
        //stmt.setInt(1, d.getIdDistribuidor());
        stmt.setString(1, d.getCnpj());
        stmt.setString(2, d.getNomeFantasia());
        stmt.setString(3, d.getRazaoSocial());
        stmt.setString(4, d.getTelefone());
        stmt.setString(5, d.getCei());
        
        stmt.execute();
        stmt.close();    
//         private String cnpj;
//    private String nomeFantasia;
//    private String razaoSocial;
//    private String telefone;
//    private int cei;
        fecharConexao();
    }

public void apagarDistribuidoras(int iddistribuidor) throws Exception{
        abrirConexao();
        stmt = con.prepareStatement("Delete from distribuidor where iddistribuidor = ?");
        
        stmt.setInt(1, iddistribuidor);
        stmt.execute();
        stmt.close();
        System.out.println("Dados apagados com sucesso!!!");
        fecharConexao();
    }
public void listarDistribuidoras() throws Exception{
        abrirConexao();
        stmt = con.prepareStatement("Select * from distribuidor");
        rs = stmt.executeQuery();
        while(rs.next()){
            System.out.println("=-=-=-=-=-Dados de "+rs.getString("nomefantasia")+"=-=-=-=-=-=-=-=-");
            System.out.println("Id do Distribuidor: "+rs.getInt("iddistribuidor"));
            System.out.println("CNPJ: "+rs.getString("cnpj"));
            System.out.println("Nome da Empresa: "+rs.getString("nomefantasia"));
            System.out.println("Razão Social: "+rs.getString("razaosocial"));
            System.out.println("Telefone: "+rs.getString("telefone"));
            System.out.println("CEI: "+rs.getString("cei"));
            System.out.println("");
        }
        rs.close();
        stmt.close();
        fecharConexao();
    }
public List<Distribuidoras> selecionar(String nomefantasia) throws Exception {
        abrirConexao();
        Distribuidoras cl = new Distribuidoras();
        List<Distribuidoras> lista = new ArrayList<Distribuidoras>();
        stmt = con.prepareStatement("Select * from distribuidor where nomefantasia = ?");
        stmt.setString(1, nomefantasia);
        rs = stmt.executeQuery();
        if (rs.next()) {
            do {
                System.out.println("=-=-=-=-=-Dados de " + rs.getString("nomefantasia") + "=-=-=-=-=-=-=-=-");
                System.out.println("Id da Distribuidora: " + rs.getInt("iddistribuidor"));
                cl.setCodigo(rs.getInt("iddistribuidor"));
                System.out.println("Nome da Empresa: " + rs.getString("nomeFantasia"));
                cl.setNomeFantasia(rs.getString("nomeFantasia"));
                System.out.println("CNPJ: " + rs.getString("cnpj"));
                cl.setCnpj(rs.getString("cnpj"));
                System.out.println("Telefone: " + rs.getString("telefone"));
                cl.setTelefone(rs.getString("telefone"));
                System.out.println("CEI: " + rs.getString("cei"));
                cl.setCei(rs.getString("cei"));
                System.out.println("Razão Social: " + rs.getString("razaosocial"));
                cl.setRazaoSocial(rs.getString("razaosocial"));
                lista.add(cl);
                System.out.println("");
            } while (rs.next());
        } else {
            System.out.println("Dados não encontrados");
        }
        rs.close();
        stmt.close();
        fecharConexao();

        return lista;
    }



public void modificar(int iddistribuidor) throws Exception {
        abrirConexao();
        Distribuidoras cl = new Distribuidoras();

        stmt = con.prepareStatement("Select * from distribuidor where iddistribuidor = ?");
        stmt.setInt(1, iddistribuidor);
        rs = stmt.executeQuery();
        
        int iddistri = 0;
        String namefantasy = null;
        String cnpj = null;
        String telefone = null;
        String cei = null;
        String razaosocial = null;
        
        if (rs.next()) {
            iddistri = rs.getInt("iddistribuidor");
            namefantasy = rs.getString("nomefantasia");
            cnpj = rs.getString("cnpj");
            telefone = rs.getString("telefone");
            cei = rs.getString("cei");
            razaosocial = rs.getString("razaosocial");
            
            selecionar(namefantasy);
            abrirConexao();
            String mud = JOptionPane.showInputDialog(null, "Qual dado deseja mudar?");
            switch (mud) {
                case "nome":
                    namefantasy = JOptionPane.showInputDialog(null, "Digite o nome da Empresa");
                    break;
                case "cnpj":
                    cnpj = JOptionPane.showInputDialog(null, "Digite o CNPJ seu menino da peste!!!");
                    break;
                case "telefone":
                    telefone = JOptionPane.showInputDialog(null, "Digite o telefone, burrão");
                    break;
                case "cei":
                    cei = JOptionPane.showInputDialog(null, "Digite o cei, mula");
                    break;
                case "razaosocial":
                    razaosocial = JOptionPane.showInputDialog(null, "Digite o razaosocial");
                    break;
               
                default:
                    System.out.println("Não ta sabendo o que quer");
            }
            
        } else {
            System.out.println("Tem gente não");
        }
        //System.out.println(nome + codigo);
        
        rs.close();
        stmt.close();
                        
        stmt = con.prepareStatement("UPDATE distribuidor SET cnpj = ?, nomefantasia = ?, razaosocial = ?, telefone = ?, cei = ? WHERE iddistribuidor = ?");
        stmt.setString(1, cnpj);
        stmt.setString(2, namefantasy);
        stmt.setString(3, razaosocial);
        stmt.setString(4, telefone);
        stmt.setString(5, cei);
        stmt.setInt(6, iddistribuidor);
        stmt.execute();
        
        rs.close();
        stmt.close();
        
        fecharConexao();

    }

    

}