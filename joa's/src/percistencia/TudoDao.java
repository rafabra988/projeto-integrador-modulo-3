package percistencia;

import entidade.Distribuidoras;
import entidade.Exemplares;
import entidade.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class TudoDao extends Dao{
    
    public void inserir(Distribuidoras d) throws Exception{
        abrirConexao();
        stmt = con.prepareStatement("Insert into distribuidor values(?, ?, ?, ?, ?)");
        stmt.setString(1, "cnpj");
        stmt.setString(2, "nomefantasia");
        stmt.setString(3, "razaosocial");
        stmt.setString(4, "telefone");
        stmt.setString(5, "cei");
        
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
        stmt = con.prepareStatement("Select * from funcionario where codigo = ?");
        stmt.setInt(1, codigo);
        rs = stmt.executeQuery();
        if(rs.next()){
            stmt.close();
            rs.close();
            stmt = con.prepareStatement("Delete from funcionario where codigo = ?");
            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();
            System.out.println("Dados apagados com sucesso!!!");
        }else{
            System.out.println("Usuário não encontrado!!!");
        }
        fecharConexao();
    }
    
//    public void apagarExemplares(int codigo) throws Exception{
//        abrirConexao();
//        stmt = con.prepareStatement("Delete from exemplarar where codigo = ?");
//        stmt.setString(1, "nomebanco");
//        stmt.setInt(2, codigo);
//        stmt.execute();
//        stmt.close();
//        System.out.println("Dados apagados com sucesso!!!");
//        fecharConexao();
//    }
//    //Testar if dentro do metodo para se apagar dentro de determinada tabela
//    public void apagarDistribuidoras(int codigo, int opcao) throws Exception{
//        abrirConexao();
//        stmt = con.prepareStatement("Delete from distribuidora where codigo = ?");
//        stmt.setString(1, "nomebanco");
//        stmt.setInt(2, codigo);
//        stmt.execute();
//        stmt.close();
//        System.out.println("Dados apagados com sucesso!!!");
//        fecharConexao();
//    }
    public void listar() throws Exception{
        abrirConexao();
        stmt = con.prepareStatement("Select * from funcionario");
        rs = stmt.executeQuery();
        while(rs.next()){
            System.out.println("=-=-=-=-=-Dados de "+rs.getString("nome")+"=-=-=-=-=-=-=-=-");
            System.out.println("Código: "+rs.getInt("codigo"));
            System.out.println("Nome: "+rs.getString("nome"));
            System.out.println("Telefone: "+rs.getString("telefone"));
            System.out.println("CEP: "+rs.getString("cep"));
            System.out.println("E-mail: "+rs.getString("email"));
            System.out.println("RG: "+rs.getString("rg"));
            System.out.println("Login: "+rs.getString("login"));
            System.out.println("CPF: "+rs.getString("cpf"));
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
        stmt = con.prepareStatement("Select * from funcionario where nome = ?");
        stmt.setString(1, nome);
        rs = stmt.executeQuery();
        if(rs.next()){
            do{
            System.out.println("=-=-=-=-=-Dados de "+rs.getString("nome")+"=-=-=-=-=-=-=-=-");
                System.out.println("Código: "+rs.getInt("codigo"));
                cl.setCodigo(rs.getInt("codigo"));
                System.out.println("Nome: "+rs.getString("nome"));
                cl.setNome(rs.getString("nome"));
                System.out.println("CPF: "+rs.getString("cpf"));
                cl.setNome(rs.getString("cpf"));
                System.out.println("Telefone: "+rs.getString("telefone"));
                cl.setNome(rs.getString("telefone"));
                System.out.println("CEP: "+rs.getString("cep"));
                cl.setNome(rs.getString("cep"));
                System.out.println("E-mail: "+rs.getString("email"));
                cl.setEmail(rs.getString("email"));
                System.out.println("RG: "+rs.getString("rg"));
                cl.setNome(rs.getString("rg"));
                System.out.println("Login: "+rs.getString("login"));
                cl.setRg(rs.getString("login"));
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
    
    public /*List<Funcionario>*/void modificar(Funcionario f) throws Exception{
        
    }
}
