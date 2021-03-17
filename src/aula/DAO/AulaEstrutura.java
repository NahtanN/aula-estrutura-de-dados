package aula.DAO;

import aula.modelo.modeloPessoa.Pessoa;

public class AulaEstrutura {
    public static void main(String[] args) {
        Pessoa exemplo = new Pessoa("exemplo", "Masculino", 50);
        System.out.printf("%s  %d%n", exemplo.getNome(), exemplo.getIdade());
    }
}
