package aula.DAO;

import aula.modelo.modeloPessoa.Funcionario;

public class GerenciarFuncionarioDAO implements ListaEnc {

    private No primeiro;
    private No ultimo;
    private int quantNo;

    public GerenciarFuncionarioDAO() {
        this.primeiro = null;
        this.ultimo = null;
        this.quantNo = 0;
    }

    @Override
    public void add(Funcionario funcionario) {
        No novoNo = new No(funcionario);

        if(eVazia()) {
            this.primeiro = novoNo;
        } else {
            this.ultimo.setProximoNo(novoNo);
        }

        this.ultimo = novoNo;
        this.quantNo++;
        System.out.println("Registro de Funcionario efetuado com sucesso!");
    }

    @Override
    public void remover(String nome) {

    }

    @Override
    public void consultar(String nome) {

    }

    @Override
    public void alterar(String nome, Funcionario funcionario) {

    }

    public boolean eVazia() {
        return (this.primeiro == null);
    }
}
