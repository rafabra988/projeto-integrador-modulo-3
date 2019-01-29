package percistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {
    
    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    
    public void abrirConexao() throws Exception{
        con = DriverManager.getConnection("jdbc:mysql://", "root", "");
        System.out.println("Conexão realizada!!!");//Retirar depois do teste.
    }
    
    public void fecharConexao() throws Exception{
        con.close();
        System.out.println("Conexão fechada com sucesso!!!");//Retirar depois do teste
    }
}
