package entidade;

public class Distribuidoras {

    private int IdDistribuidor;
    private String cnpj;
    private String nomeFantasia;
    private String razaoSocial;
    private String telefone;
    private String cei;
    private int codigo;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getIdDistribuidor() {
        return IdDistribuidor;
    }

    public void setIdDistribuidor(int IdDistribuidor) {
        this.IdDistribuidor = IdDistribuidor;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCei() {
        return cei;
    }

    public void setCei(String cei) {
        this.cei = cei;
    }

}
