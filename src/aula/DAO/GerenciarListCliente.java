package aula.DAO;

import aula.modelo.modeloPessoa.Cliente;

public interface GerenciarListCliente {

    /*
    * adicionar, consultar, remover, alterar e percorrer
    */

    void adicionarCliente(Cliente cliente);
    void cunsultarCliente(String id);
    void removerCliente(String id);
    void alterarCliente(String id, Cliente cliente);
    void percorrerListaCliente();

}
