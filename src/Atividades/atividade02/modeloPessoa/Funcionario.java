package Atividades.atividade02.modeloPessoa;

public class Funcionario extends Pessoa {

    private int matricula;
    private String funcao;
    private String setor;

    public Funcionario(String nome, String cpf, String cep, String rua, String numeroDaResidencia, String complemento,
                       String bairro, String cidade, int matricula, String funcao, String setor) {
        super(nome, cpf, cep, rua, numeroDaResidencia, complemento, bairro, cidade);
        this.matricula = matricula;
        this.funcao = funcao;
        this.setor = setor;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }
}
