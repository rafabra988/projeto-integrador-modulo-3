package validacao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaCodigo {
    
    Pattern p;
    Matcher m;
    
    public boolean verificaNome(String nome){
        p = Pattern.compile("[a-zA-Zá-ú ]{3,30}");
        m = p.matcher(nome);
        return m.matches();
    }
    
//    public boolean verificaCpf(String cpf){
//        if(cpf.isEmpty()){
//            return false;
//        }
//        if(cpf.length() != 11 || cpf.equals("11111111111") || cpf.equals("22222222222") || cpf.equals("33333333333") ||
//                                 cpf.equals("44444444444") || cpf.equals("55555555555") || cpf.equals("66666666666") ||
//                                 cpf.equals("77777777777") || cpf.equals("88888888888") || cpf.equals("99999999999") ||
//                                 cpf == "00000000000"){
//        return false;
//        }
//        int add = 0;
//        int cpfn = Integer.parseInt(cpf);
//        for (int i = 0; i < 9; i++){
//            add += cpfn[i] * (10 - 1);
//        }                        
//        return true;
//    }
//    
    public boolean verificaTelefone(String telefone){
        p = Pattern.compile("^\\([1-9]{2}\\) (?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$");
        m = p.matcher(telefone);
        return m.matches();
    }
    
    public boolean verificaCep(String cep){
        p = Pattern.compile("[0-9-]{9}");
        m = p.matcher(cep);
        return m.matches();
    }
    
    public boolean verificaEmail(String email){
        p = Pattern.compile("[a-z0-9_.-]+@[a-z0-9_.-]+\\.[a-z]+");
        m = p.matcher(email);
        return m.matches();
    }
    
    public boolean verificaRg(String rg){
        return true;
    }
    
    public boolean verificaLogin(String login){
        p = Pattern.compile("[a-zA-Z0-9#@$]{6,10}");
        m = p.matcher(login);
        return m.matches();
    }
    
    public boolean verificaSenha(String senha){
        p = Pattern.compile("[a-zA-Z0-9$#@]{6,30}");
        m = p.matcher(senha);
        return m.matches();
    }
}
