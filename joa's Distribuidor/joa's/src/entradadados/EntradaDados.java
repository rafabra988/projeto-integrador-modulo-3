package entradadados;

import javax.swing.JOptionPane;
import validacao.ValidaCodigo;

public class EntradaDados {
    private ValidaCodigo vc;

    public EntradaDados() {
        vc = new ValidaCodigo();
    }
    
    public int capturarCodigo() {
        try {
            //System.out.println("Informe o código:");
            String ler = JOptionPane.showInputDialog("Digite o codigo");
            return Integer.parseInt(ler);
        } catch (Exception e) {
            System.out.println("Erro!!! Código Inválido");
            return capturarCodigo();
        }
    }
    
    public String entradaNome(){
        String nome = JOptionPane.showInputDialog("Digite o nome: ");
        if(vc.verificaNome(nome)){
            return nome;
        }else{
            System.out.println("Nome não válido");
            return entradaNome();
        }
    }
    
//    public String entradaCpf(){
//        String cpf = JOptionPane.showInputDialog("Digite um CPF válido: ");
//        if(vc.verificaCpf(cpf)){
//            return cpf;
//        }else{
//            System.out.println("CPF inválido!!!!");
//            return entradaCpf();
//        }
//        
//    }
    
    public String entradaTelefone(){//4 ou 5 digitos - 4 digitos.
        //entrada de dados.
        String telefone = JOptionPane.showInputDialog("Digite o número do telefone: ");
        if(vc.verificaTelefone(telefone)){
            return telefone;
        }else{
            System.out.println("Número não valido");
            return entradaTelefone();
        }
    }
    
    public String entradaCep(){// 5 digitos - 3 digitos
        //entrada de dados
        String cep = JOptionPane.showInputDialog("Digite o cep: ");
        if(vc.verificaCep(cep)){
            return cep;
        }else{
            System.out.println("Cep inválido!!");
            return entradaCep();
        }
    }
    public String entradaEmail(){
        //entrada de dados
        String email = JOptionPane.showInputDialog("Digite o email: ");
        if(vc.verificaEmail(email)){
            return email;
        }else{
            System.out.println("E-mail inválido!!!");
            return entradaEmail();
        }
    }
    public String entradaRg(){
        //entrada de dados
        String rg = JOptionPane.showInputDialog("Dgite o RG: ");
        if(vc.verificaRg(rg)){
            return rg;
        }else{
            System.out.println("RG inválido!!!!");
            return entradaRg();
        }
    }
    public String entradaLogin(){
        //entrada de dados
        String login = JOptionPane.showInputDialog("Digite o login");
        if(vc.verificaLogin(login)){
            return login;
        }else{
            System.out.println("Login inválido!!!!");
            return entradaLogin();
        }
    }
    public String entradaSenha(){
        //entrada de dados
        String senha = JOptionPane.showInputDialog("Digite a senha: ");
        if(vc.verificaSenha(senha)){
            return senha;
        }else{
            System.out.println("Senha inválida!!!!");
            return entradaSenha();
        }
        
    }
  public int capturarIddistribuidor() {
        try {
            //System.out.println("Informe o código:");
            String iddistribuidor = JOptionPane.showInputDialog("Digite o id do distribuidor");
            return Integer.parseInt(iddistribuidor);
        } catch (Exception e) {
            System.out.println("Erro!!! id distribuidor Inválido!!");
            return capturarIddistribuidor();
        }
    }   
    
         public String entradaCnpj(){// 5 digitos - 3 digitos
        //entrada de dados
        String cnpj = JOptionPane.showInputDialog("Digite o cnpj: ");
        if(vc.verificaCnpj(cnpj)){
            return cnpj;
        }else{
            System.out.println("cnpj inválido!!");
            return entradaCnpj();
        }
         }
         
        public String entradaCei(){// 5 digitos - 3 digitos
        //entrada de dados
        String cei = JOptionPane.showInputDialog("Digite o cei: ");
        if(vc.verificaCei(cei)){
            return cei;
        }else{
            System.out.println("cei inválido!!");
            return entradaCei();
        }
        
        
         }
         public String entradanomeFantasia(){
        String nomeFantasia = JOptionPane.showInputDialog("Digite o nomeFantasia da distribuidora: ");
        if(vc.verificaNome(nomeFantasia)){
            return nomeFantasia;
        }else{
            System.out.println("NomeFantasia não válido");
            return entradaNome();
        }
         
        }
         public String entradaRazaoSocial(){
        String razaosocial = JOptionPane.showInputDialog("Digite a Razão Social: ");
        if(vc.verificaNome(razaosocial)){
            return razaosocial;
        }else{
            System.out.println("Razão Social inválida");
            return entradaNome();
        }
    }
        
    }
    
