package percistencia;

import entidade.Locacao;
import javax.swing.JOptionPane;

public class TudoDaoLocacao extends Dao{
    

    public void inserir(Locacao f) throws Exception {
        abrirConexao();
        stmt = con.prepareStatement("INSERT INTO locacao(dataEmprestimo, dataPrevista, dataDevolucao, status, observacao, exemplar) "
                + "VALUES (?, ?, ?, ?, ?, ?)");
        //stmt.setInt(1, f.getCodigo());
        stmt.setString(1, f.getDataEmprestimo());
        stmt.setString(3, f.getDataPrevista());
        stmt.setString(2, f.getDataEmprestimo());
        stmt.setString(4, f.getStatus());
        stmt.setString(5, f.getObservacao());
        stmt.setString(6, f.getExemplrar());
        
        stmt.execute();
        stmt.close();

        fecharConexao();
    }

    public void apagarLocacao(int codigo) throws Exception {
        abrirConexao();
        stmt = con.prepareStatement("Select * from locacao where codigo = ?");
        stmt.setInt(1, codigo);
        rs = stmt.executeQuery();
        if (rs.next()) {
            stmt.close();
            rs.close();
            stmt = con.prepareStatement("Delete from locacao where codigo = ?");
            stmt.setInt(1, codigo);
            stmt.execute();
            stmt.close();
            System.out.println("Dados apagados com sucesso!!!");
        } else {
            System.out.println("Dados não encontrado!!!");
        }
        fecharConexao();
    }

    public void listar() throws Exception {
        abrirConexao();
        stmt = con.prepareStatement("Select * from locacao");
        rs = stmt.executeQuery();
        while (rs.next()) {
            System.out.println("=-=-=-=-=-Dados de " + rs.getInt("codigo") + "=-=-=-=-=-=-=-=-");
            System.out.println("Código da locação: " + rs.getInt("codigo"));
            System.out.println("Data de Empréstimo: " + rs.getString("dataEmprestimo"));
            System.out.println("Data Prevista de devolução: " + rs.getString("dataPrevista"));
            System.out.println("Data de Devolução: " + rs.getString("dataDevolucao"));
            System.out.println("Status: " + rs.getString("status"));
            System.out.println("Observações: " + rs.getString("observacao"));
            
            System.out.println("");
        }
        rs.close();
        stmt.close();
        fecharConexao();
    }

    public Locacao selecionar(String nome) throws Exception {
        abrirConexao();
        Locacao cl = new Locacao();
        String nm = nome;
        stmt = con.prepareStatement("Select * from locacao where exemplar LIKE '%"+nm+"%'");
        //stmt.setString(1, nome);
        rs = stmt.executeQuery();
//        if (rs.next()) {
//            do {
//                System.out.println("=-=-=-=-=-Dados de " + rs.getString("nome") + "=-=-=-=-=-=-=-=-");
//                System.out.println("Código: " + rs.getInt("codigo"));
//                cl.setCodigo(rs.getInt("codigo"));
//                System.out.println("Nome: " + rs.getString("nome"));
//                cl.setDataDevolucao(rs.getString("nome"));
//                System.out.println("CPF: " + rs.getString("cpf"));
//                cl.setDataEmprestimo(rs.getString("cpf"));
//                System.out.println("Telefone: " + rs.getString("telefone"));
//                cl.setDataPrevista(rs.getString("telefone"));
//                System.out.println("CEP: " + rs.getString("cep"));
//                cl.setObservacao(rs.getString("cep"));
//                System.out.println("E-mail: " + rs.getString("email"));
//                cl.setStatus(rs.getString("email"));
//                System.out.println("RG: " + rs.getString("rg"));
//                
//                //lista.add(cl);
//                System.out.println("");
//            } while (rs.next());
//        } else {
//            System.out.println("Dados não encontrados");
//        }
        rs.close();
        stmt.close();
        fecharConexao();

        return cl;
    }

    public void modificar(String nome) throws Exception {
        abrirConexao();
        Locacao cl = new Locacao();

//        stmt = con.prepareStatement("Select * from funcionario where nome = ?");
//        stmt.setString(1, nome);
//        rs = stmt.executeQuery();
        
        int codigo = 0;
        String name = null;
        String cpf = null;
        String telefone = null;
        String cep = null;
        String email = null;
        String rg = null;
        String login = null;
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
//        //System.out.println(nome + codigo);
//        
//        rs.close();
//        stmt.close();
                        
        stmt = con.prepareStatement("UPDATE funcionario SET nome = ?, cpf = ?, telefone = ?, cep = ?, email = ?, rg = ?, login = ? WHERE codigo = ?");
        stmt.setString(1, nome);
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

    }
        
    public String dataDB(String data){
        String[] datain = data.split("/");
        String dataDB = datain[2]+"/"+datain[1]+"/"+datain[0];
        return dataDB;
    }
    
    public String dataOut(String data){
        String[] dataDB = data.split("/");
        String dataOut = dataDB[2]+"/"+dataDB[1]+"/"+dataDB[0];
        return dataOut;
    }
        
    }

