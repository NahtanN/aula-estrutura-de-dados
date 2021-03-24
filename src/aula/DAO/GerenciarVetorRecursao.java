package aula.DAO;

import aula.modelo.modeloTV.TV;

public interface GerenciarVetorRecursao {

    void inserirValorRec(TV tv, int i);
    void consultarValorRec(String key, int i);
    void excluirValorRec(String key, int i);
    void alterarValorRec(TV tv, int i);
}
