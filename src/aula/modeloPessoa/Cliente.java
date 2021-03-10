package aula.modeloPessoa;

public class Cliente extends Pessoa {

    private String id;
    private String endereco;

    public Cliente(String id, String endereco) {
        this.id = id;
        this.endereco = endereco;
    }

    public Cliente(String nome, String sexo, int idade, String id, String edereco) {
        super(nome, sexo, idade);
        this.id = id;
        this.endereco = edereco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
