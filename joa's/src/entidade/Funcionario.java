package entidade;

public class Funcionario extends Pessoa{
    private String login;
    private String senha;
    private boolean acessoFull;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean getAcessoFull() {
        return acessoFull;
    }

    public void setAcessoFull(boolean acessoFull) {
        this.acessoFull = acessoFull;
    }
    
    public void logar(String login, String senha){
        
    }
        
    public void imprimirRelatoriosExemplares(){
        
    }
    
    public void registrarExemplares(){
        
    }
    
    public void registrarDevolução(){
    
    }
    
    public void imprimirFichaLocacao(){
        
    }

    @Override
    public String toString() {
        return super.toString()+"login=" + login + "\nsenha=" + senha + "\nacessoFull=" + acessoFull;
    }
    
    
}
