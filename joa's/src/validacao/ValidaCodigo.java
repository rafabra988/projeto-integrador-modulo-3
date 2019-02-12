package validacao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidaCodigo {

    Pattern p;
    Matcher m;

    public boolean verificaNome(String nome) {
        p = Pattern.compile("[a-zA-Zá-ú ]{3,30}");
        m = p.matcher(nome);
        return m.matches();
    }

    public String retiraPontos(String cpf) {
        if (cpf.contains(".")) {
            cpf = cpf.replace(".", "");
        }
        if (cpf.contains("-")) {
            cpf = cpf.replace("-", "");
        }
        return cpf;
    }

    public boolean verificaCpf(String cpf) {
        if (cpf.isEmpty()) {
            return false;
        } else {
            String cpfSe = retiraPontos(cpf);
            if (cpfSe.length() != 11 || cpfSe.equals("11111111111") || cpfSe.equals("22222222222") || cpfSe.equals("33333333333")
                    || cpfSe.equals("44444444444") || cpfSe.equals("55555555555") || cpfSe.equals("66666666666")
                    || cpfSe.equals("77777777777") || cpfSe.equals("88888888888") || cpfSe.equals("99999999999")
                    || cpfSe == "00000000000") {
                return false;
            }
        
        int resto = 0 , soma = 0, soma1 = 0, dig10 = 0, dig11 = 0;
        
        int peso = 10;
        //Verificação do primeiro digito
        for (int i = 0; i < 9; i++){
            int num = cpfSe.charAt(i)- 48;
            soma = soma + (num * peso);
            peso--;
        }
        resto = soma % 11;
        
        if(resto == 0 || resto == 1){
            dig10 = 0;
        }else{
            dig10 = 11 - resto;
        }
        //Verificação do segundo digito
        int peso1 = 11;
        for(int i = 0; i < 10; i++){
            int num = cpfSe.charAt(i)-48;
            soma1 = soma1 + (num * peso1);
            peso1--;
        }
        resto = soma1 % 11;
        
        if(resto == 0 || resto == 1){
            dig11 = 0;
        }else{
            dig11 = 11 - resto;
        }
        
        char cpf10 = (char)(dig11 + 48);
        char cpf9 = (char)(dig10 + 48);
    
        if((cpfSe.charAt(10) == cpf10) && (cpfSe.charAt(9) == cpf9)){
            System.out.println("A porra desse cpf é valido, CARALHOOOOO!!!!");
            return true;
        }else{
            System.out.println("Está merda não está certa, seu contrabandista!!!!!");
            return false;
        }  
        }
    }

    public boolean verificaTelefone(String telefone) {
        p = Pattern.compile("^\\([1-9]{2}\\) (?:[2-8]|9[1-9])[0-9]{3}\\-[0-9]{4}$");
        m = p.matcher(telefone);
        return m.matches();
    }

    public boolean verificaCep(String cep) {
        p = Pattern.compile("[0-9-]{9}");
        m = p.matcher(cep);
        return m.matches();
    }

    public boolean verificaEmail(String email) {
        p = Pattern.compile("[a-z0-9_.-]+@[a-z0-9_.-]+\\.[a-z]+");
        m = p.matcher(email);
        return m.matches();
    }

    public boolean verificaRg(String rg) {
        return true;
    }

    public boolean verificaLogin(String login) {
        p = Pattern.compile("[a-zA-Z0-9#@$]{6,10}");
        m = p.matcher(login);
        return m.matches();
    }

    public boolean verificaSenha(String senha) {
        p = Pattern.compile("[a-zA-Z0-9$#@]{6,30}");
        m = p.matcher(senha);
        return m.matches();
    }
}
