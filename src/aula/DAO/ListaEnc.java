package aula.DAO;

import aula.modelo.modeloPessoa.Funcionario;

public interface ListaEnc {
    void add(Funcionario funcionario);
    void remover(String nome);
    void consultar(String nome);
    void alterar(String nome, Funcionario funcionario);
}
