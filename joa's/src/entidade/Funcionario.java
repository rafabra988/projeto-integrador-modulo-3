package entidade;

public class Funcionario {
    private String login;
    private String senha;
    private int codigo;
    private String nome;
    private String cpf;
    private String telefone;
    private String cep;
    private String email;
    private String rg;

    public Funcionario() {
        codigo = 0;
        nome = null;
        cpf = null;
        telefone = null;
        cep = null;
        email = null;
        rg = null;
        login = null;
        senha = null;
    }
    
    

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

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
    

    

    
    
}
