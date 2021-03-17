package aula.DAO;

import aula.modelo.modeloTV.TV;

public interface GerenciarVetor {

    void inserirValor(TV tv);
    void consultarValor(String key);
    void excluirValor(String key);
    void alterarValor(TV tv);
}
