package Atividades.atividade03.DAO;

import aula.modelo.modeloPessoa.Cliente;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Vector;

public class GerenciarClienteVectorDAO {

    private Vector<Cliente> clientes;

    public GerenciarClienteVectorDAO() {
        this.clientes = new Vector<>();
    }

    public void addCliente(Cliente cliente) {
        try {

            this.clientes.add(cliente);
            System.out.printf("Cliente %s adicionado com sucesso!\n", cliente.getNome());
            System.out.println("");

        } catch (Exception err) {
            System.out.println("Ocorreu algum error na inserção do cliente!");
        } finally {

            // Organiza os clientes em ordem alfabética
            Collections.sort(this.clientes, new Comparator<Cliente>() {
                @Override
                public int compare(Cliente c1, Cliente c2) {
                    return c1.getNome().compareTo(c2.getNome());
                }
            });

        }
    }

    public Cliente consultarCliente(int posicao) {
        return this.clientes.get(posicao);
    }

    public void listarClientes() {

        this.clientes.forEach(cliente -> {
            System.out.println(cliente.getNome());
        });

        System.out.println("");
    }

    public void alterarCliente(Cliente cliente, int posicao) {
        try {

            this.clientes.set(posicao, cliente);
            System.out.printf("Cliente %s inserido na posição %d \n", cliente.getNome(), posicao);

        } catch(Exception err) {
            System.out.println("Ocorreu algum error na alteração do cliente!");
        }
    }

    public void removerCliente(int posicao) {
        try {

            Cliente cliente = this.consultarCliente(posicao);

            this.clientes.remove(posicao);
            System.out.printf("Cliente %s removido com sucesso!\n", cliente.getNome());

        } catch(Exception err) {
            System.out.println("Ocorreu algum error na remoção do cliente!");
        }

    }
}
