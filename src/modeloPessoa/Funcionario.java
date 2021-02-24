package modeloPessoa;

public class Funcionario extends Pessoa {
    private String codFunc;
    private String funcao;
    private String setor;

    public Funcionario(String codFunc, String funcao, String setor) {
        this.codFunc = codFunc;
        this.funcao = funcao;
        this.setor = setor;
    }

    public Funcionario(String nome, String sexo, int idade, String codFunc, String funcao, String setor) {
        super(nome, sexo, idade);
        this.codFunc = codFunc;
        this.funcao = funcao;
        this.setor = setor;
    }

    public String getCodFunc() {
        return codFunc;
    }

    public void setCodFunc(String codFunc) {
        this.codFunc = codFunc;
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
