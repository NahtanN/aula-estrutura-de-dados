package Atividades.atividade02.modeloPessoa;

public class Pessoa {

    private String nome;
    private String cpf;
    private String cep;
    private String rua;
    private String numeroDaResidencia;
    private String complemento;
    private String bairro;
    private String cidade;

    public Pessoa(String nome, String cpf, String cep, String rua, String numeroDaResidencia, String complemento,
                  String bairro, String cidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.rua = rua;
        this.numeroDaResidencia = numeroDaResidencia;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cidade = cidade;
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

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumeroDaResidencia() {
        return numeroDaResidencia;
    }

    public void setNumeroDaResidencia(String numeroDaResidencia) {
        this.numeroDaResidencia = numeroDaResidencia;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
