package percistencia;

import entidade.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class TudoDao extends Dao{
    
    public void inserir(Funcionario f) throws Exception{
        abrirConexao();
        stmt = con.prepareStatement("Insert into nomebanco values()");
        
        
        
        
        fecharConexao();
    }
    
    public void apagar(int codigo) throws Exception{
        abrirConexao();
        stmt = con.prepareStatement("Delete from nomebanco where codigo = ?");
        stmt.setInt(1, codigo);
        stmt.execute();
        stmt.close();
        System.out.println("Dados apagados com sucesso!!!");
        fecharConexao();
    }
    
    public void listar() throws Exception{
        abrirConexao();
        stmt = con.prepareStatement("Select * from nomebanco");
        rs = stmt.executeQuery();
        while(rs.next()){
            System.out.println("=-=-=-=-=-Dados de "+rs.getString("nome")+"=-=-=-=-=-=-=-=-");
            System.out.println("Código: "+rs.getInt("codigo"));
            System.out.println("Nome: "+rs.getString("nome"));
            System.out.println("E-mail: "+rs.getString("email"));
            System.out.println("Sexo: "+rs.getString("sexo"));
            System.out.println("");
        }
        rs.close();
        stmt.close();
        fecharConexao();
    }
    
    public List<Funcionario> selecionar(String nome) throws Exception{
        abrirConexao();
        Funcionario cl = new Funcionario();
        List<Funcionario> lista = new ArrayList<Funcionario>();
        stmt = con.prepareStatement("Select * from nomebanco where nome = ?");
        stmt.setString(1, nome);
        rs = stmt.executeQuery();
        if(rs.next()){
            do{
            System.out.println("=-=-=-=-=-Dados de "+rs.getString("nome")+"=-=-=-=-=-=-=-=-");
                System.out.println("Código: "+rs.getInt("codigo"));
                cl.setCodigo(rs.getInt("codigo"));
                System.out.println("Nome: "+rs.getString("nome"));
                cl.setNome(rs.getString("nome"));
                System.out.println("E-mail: "+rs.getString("email"));
                cl.setEmail(rs.getString("email"));
                System.out.println("Sexo: "+rs.getString("sexo"));
                cl.setRg(rs.getString("sexo"));
                lista.add(cl);
                System.out.println("");
        }while(rs.next());
        }else{
            System.out.println("Dados não encontrados");
        }
        rs.close();
        stmt.close();
        fecharConexao();
        
        return lista;
    }
}
