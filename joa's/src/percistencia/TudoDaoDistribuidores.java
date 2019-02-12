package percistencia;

import entidade.Distribuidoras;
import java.util.ArrayList;
import java.util.List;

public class TudoDaoDistribuidores extends Dao{
    
    public void inserir(Distribuidoras d) throws Exception{
        abrirConexao();
        stmt = con.prepareStatement("Insert into distribuidor(cnpj, nomefantasia,razaosocial,telefone,cei) VALUES(?, ?, ?, ?, ?)");
        //stmt.setInt(1, d.getIdDistribuidor());
        stmt.setString(1, d.getCnpj());
        stmt.setString(2, d.getNomeFantasia());
        stmt.setString(3, d.getRazaoSocial());
        stmt.setString(4, d.getTelefone());
        stmt.setInt(5, d.getCei());
        
        stmt.execute();
        stmt.close();    

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
    
    public Distribuidoras selecionar(String nome) throws Exception{
        abrirConexao();
        Distribuidoras cl = new Distribuidoras();
        //List<Distribuidoras> lista = new ArrayList<Distribuidoras>();
        String nm = nome;
        stmt = con.prepareStatement("Select * from distribuidor where nomefantasia LIKE '%"+ nm +"%'");
        //stmt.setString(1, nome);
        rs = stmt.executeQuery();
        if(rs.next()){
            do{
            System.out.println("=-=-=-=-=-Dados de "+rs.getString("nomefantasia")+"=-=-=-=-=-=-=-=-");
                System.out.println("Código: "+rs.getInt("iddistribuidor"));
                cl.setCodigo(rs.getInt("iddistribuidor"));
                System.out.println("Nome Fantasia: "+rs.getString("nomefantasia"));
                cl.setNomeFantasia(rs.getString("nomefantasia"));
                System.out.println("Razão Social: "+rs.getString("razaosocial"));
                cl.setRazaoSocial(rs.getString("razaosocial"));
                System.out.println("Telefone: "+rs.getString("telefone"));
                cl.setTelefone(rs.getString("telefone"));
                System.out.println("CNPJ: "+rs.getString("cnpj"));
                cl.setCnpj(rs.getString("cnpj"));
                System.out.println("CEI: "+rs.getString("cei"));
                cl.setCei(rs.getInt("cei"));
                //lista.add(cl);
                System.out.println("");
        }while(rs.next());
        }else{
            System.out.println("Dados não encontrados");
        }
        rs.close();
        stmt.close();
        fecharConexao();
        
        return cl;
    }

}
