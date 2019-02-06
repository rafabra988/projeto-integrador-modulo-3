package percistencia;

import entidade.Distribuidoras;
import entidade.Exemplares;
import entidade.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class TudoDao extends Dao{
    
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
    
    public void inserir(Funcionario f) throws Exception{
        abrirConexao();
        stmt = con.prepareStatement("Insert into funcionario values( ?, ?, ?, ?, ?, ?, ?, ?, ?)");
        stmt.setInt(1, f.getCodigo());
        stmt.setString(2, f.getNome());
        stmt.setString(3, f.getTelefone());
        stmt.setString(4, f.getCep());
        stmt.setString(5, f.getEmail());
        stmt.setString(6, f.getRg());
        stmt.setString(7, f.getLogin());
        stmt.setString(8, f.getSenha());
        stmt.setString(9, f.getCpf());
        
        stmt.execute();
        stmt.close();
              
        fecharConexao();
    }
    
    public void inserir(Exemplares u) throws Exception{
        abrirConexao();
        stmt = con.prepareStatement("Insert into exemplar values(?, ?, ?, ?, ?, ?, ?)");
        stmt.setString(1, "nome");
        stmt.setString(2, "genero");
        stmt.setString(3, "diretor");
        stmt.setString(4, "sinpose");
        stmt.setString(5, "numlocalizacao");
        stmt.setString(6, "status");
        stmt.setString(7, "quantidade");
        
        stmt.execute();
        stmt.close();    
//            private int codigo;
//    private String nome;
//    private String genero;
//    private String diretor;
//    private String sinopse;
//    private String numLocalizacao;
//    private String status;//O que é isso???
//    private int quantidade;
        fecharConexao();
    }
    
    public void apagarFuncionario(int codigo) throws Exception{
        abrirConexao();
        stmt = con.prepareStatement("Delete from funcionario where codigo = ?");
        stmt.setString(1, "nomebanco");
        stmt.setInt(2, codigo);
        stmt.execute();
        stmt.close();
        System.out.println("Dados apagados com sucesso!!!");
        fecharConexao();
    }
    
    public void apagarExemplares(int codigo) throws Exception{
        abrirConexao();
        stmt = con.prepareStatement("Delete from exemplar where codigo = ?");
        
        stmt.setInt(1, codigo);
        stmt.execute();
        stmt.close();
        System.out.println("Dados apagados com sucesso!!!");
        fecharConexao();
    }
    //Testar if dentro do metodo para se apagar dentro de determinada tabela
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


/* stmt = con.prepareStatement("Insert into exemplar values(?, ?, ?, ?, ?, ?, ?, ?)");
        stmt.setInt(1, d.getId());
        stmt.setString(2, d.getNome());
        stmt.setString(3, d.getGenero());
        stmt.setString(4, d.getSinopse());
        stmt.setInt(5, d.getNumLocalizacao());
        stmt.setInt(6, d.getStatus());
        stmt.setInt(7, d.getQuantidade());
        stmt.setI
        stmt.execute();
        stmt.close();*/