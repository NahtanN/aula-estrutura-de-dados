package Atividades.atividade02.modeloPessoa;

public class Cliente extends Pessoa {

    private String cnh;
    private String telefone;
    private String eMail;

    public Cliente(String nome, String cpf, String cep, String rua, String numeroDaResidencia, String complemento,
                   String bairro, String cidade, String cnh, String telefone, String eMail) {
        super(nome, cpf, cep, rua, numeroDaResidencia, complemento, bairro, cidade);
        this.cnh = cnh;
        this.telefone = telefone;
        this.eMail = eMail;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }
}
