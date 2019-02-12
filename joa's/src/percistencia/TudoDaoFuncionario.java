package percistencia;

import entidade.Distribuidoras;
import entidade.Exemplares;
import entidade.Funcionario;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TudoDaoFuncionario extends Dao {

    public void inserir(Funcionario f) throws Exception {
        abrirConexao();
        stmt = con.prepareStatement("Select * from funcionario where nome = ?");
        stmt.setString(1, f.getNome());
        rs = stmt.executeQuery();
        if (!rs.next()) {
            stmt = con.prepareStatement("INSERT INTO funcionario(nome, telefone, cep, email, rg, login, senha, cpf) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)");
            //stmt.setInt(1, f.getCodigo());
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getTelefone());
            stmt.setString(3, f.getCep());
            stmt.setString(4, f.getEmail());
            stmt.setString(5, f.getRg());
            stmt.setString(6, f.getLogin());
            stmt.setString(7, f.getSenha());
            stmt.setString(8, f.getCpf());

            stmt.execute();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Dados Inseridos com sucesso!!!");
        }else{
            JOptionPane.showMessageDialog(null, "Esse usuario já existe seu retardado!!!!");
        }

        fecharConexao();
    }

    public void apagarFuncionario(int codigo) throws Exception {
        abrirConexao();
        stmt = con.prepareStatement("Select * from funcionario where codigo = ?");
        stmt.setInt(1, codigo);
        rs = stmt.executeQuery();
        if (rs.next()) {
            stmt.close();
            rs.close();
            stmt = con.prepareStatement("Delete from funcionario where codigo = ?");
            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();
            System.out.println("Dados apagados com sucesso!!!");
        } else {
            System.out.println("Usuário não encontrado!!!");
        }
        fecharConexao();
    }

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
    public void listar() throws Exception {
        abrirConexao();
        stmt = con.prepareStatement("Select * from funcionario");
        rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.println("=-=-=-=-=-Dados de " + rs.getString("nome") + "=-=-=-=-=-=-=-=-");
            System.out.println("Código: " + rs.getInt("codigo"));
            System.out.println("Nome: " + rs.getString("nome"));
            System.out.println("Telefone: " + rs.getString("telefone"));
            System.out.println("CEP: " + rs.getString("cep"));
            System.out.println("E-mail: " + rs.getString("email"));
            System.out.println("RG: " + rs.getString("rg"));
            System.out.println("Login: " + rs.getString("login"));
            System.out.println("CPF: " + rs.getString("cpf"));
            System.out.println("");
        }
        rs.close();
        stmt.close();
        fecharConexao();
    }

    public Funcionario selecionar(String nome) throws Exception {
        abrirConexao();
        Funcionario cl = new Funcionario();
        String nm = nome;
        stmt = con.prepareStatement("Select * from funcionario where nome LIKE '%" + nm + "%'");
        //stmt.setString(1, nome);
        rs = stmt.executeQuery();
        if (rs.next()) {
            do {
                System.out.println("=-=-=-=-=-Dados de " + rs.getString("nome") + "=-=-=-=-=-=-=-=-");
                System.out.println("Código: " + rs.getInt("codigo"));
                cl.setCodigo(rs.getInt("codigo"));
                System.out.println("Nome: " + rs.getString("nome"));
                cl.setNome(rs.getString("nome"));
                System.out.println("CPF: " + rs.getString("cpf"));
                cl.setCpf(rs.getString("cpf"));
                System.out.println("Telefone: " + rs.getString("telefone"));
                cl.setTelefone(rs.getString("telefone"));
                System.out.println("CEP: " + rs.getString("cep"));
                cl.setCep(rs.getString("cep"));
                System.out.println("E-mail: " + rs.getString("email"));
                cl.setEmail(rs.getString("email"));
                System.out.println("RG: " + rs.getString("rg"));
                cl.setRg(rs.getString("rg"));
                System.out.println("Login: " + rs.getString("login"));
                cl.setLogin(rs.getString("login"));
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

    public void modificar(Funcionario f) throws Exception {
        abrirConexao();
        

//        stmt = con.prepareStatement("Select * from funcionario where nome = ?");
//        stmt.setString(1, f.getNome());
//        rs = stmt.executeQuery();

        int codigo = f.getCodigo();
        String name = f.getNome();
        String cpf = f.getCpf();
        String telefone = f.getTelefone();
        String cep = f.getCep();
        String email = f.getEmail();
        String rg = f.getRg();
        String login = f.getLogin();
//        if (rs.next()) {
//            codigo = rs.getInt("codigo");
//            name = rs.getString("nome");
//            cpf = rs.getString("cpf");
//            telefone = rs.getString("telefone");
//            cep = rs.getString("cep");
//            email = rs.getString("email");
//            rg = rs.getString("rg");
//            login = rs.getString("login");
//            selecionar(nome);
//            abrirConexao();
//            String mud = JOptionPane.showInputDialog(null, "Qual dado deseja mudar?");
//            switch (mud) {
//                case "nome":
//                    nome = JOptionPane.showInputDialog(null, "Digite o nome");
//                    break;
//                case "cpf":
//                    cpf = JOptionPane.showInputDialog(null, "Digite o CPF seu animal!!!");
//                    break;
//                case "telefoe":
//                    telefone = JOptionPane.showInputDialog(null, "Digite o telefone, besta");
//                    break;
//                case "cep":
//                    cep = JOptionPane.showInputDialog(null, "Digite o cep, mula");
//                    break;
//                case "email":
//                    email = JOptionPane.showInputDialog(null, "Digite o E-mail");
//                    break;
//                case "rg":
//                    rg = JOptionPane.showInputDialog(null, "Digite o RG, apagado");
//                    break;
//                case "login":
//                    login = JOptionPane.showInputDialog(null, "Digite o Login, João");
//                    break;
//                default:
//                    System.out.println("Não ta sabendo o que quer");
//            }
//
//        } else {
//            System.out.println("Tem gente não");
//        }
        //System.out.println(nome + codigo);

//        rs.close();
//        stmt.close();

        stmt = con.prepareStatement("UPDATE funcionario SET nome = ?, cpf = ?, telefone = ?, cep = ?, email = ?, rg = ?, login = ? WHERE codigo = ?");
        stmt.setString(1, name);
        stmt.setString(2, cpf);
        stmt.setString(3, telefone);
        stmt.setString(4, cep);
        stmt.setString(5, email);
        stmt.setString(6, rg);
        stmt.setString(7, login);
        stmt.setInt(8, codigo);
        stmt.execute();

        rs.close();
        stmt.close();

        fecharConexao();
        JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!!!");
    }

    public boolean verificar(String login, String senha) throws Exception {
        //System.out.println("Cheguei aqui!!!");
        abrirConexao();
        stmt = con.prepareStatement("Select * from funcionario Where login = ?");
        stmt.setString(1, login);
        rs = stmt.executeQuery();
        if (rs.next()) {
            stmt.close();
            rs.close();
            stmt = con.prepareStatement("Select * from funcionario Where login = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            if (rs.next()) {
                fecharConexao();
                return true;
            } else {
                fecharConexao();
                return false;
            }
        } else {
            fecharConexao();
            return false;
        }

    }

}
