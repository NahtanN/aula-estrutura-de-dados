package aula;

import Atividades.atividade03.DAO.GerenciarClienteVectorDAO;
import aula.modelo.modeloPessoa.Cliente;

public class teste {
    public static void main(String[] args) {
        Cliente nathan = new Cliente("Nathan", "M", 20, "123456", "teste");
        Cliente Aldo = new Cliente("Aldo", "M", 20, "123456", "teste");
        Cliente Rebeca = new Cliente("Rebeca", "F", 20, "123456", "teste");
        Cliente Maria = new Cliente("Maria", "F", 20, "123456", "teste");
        Cliente Ricardo = new Cliente("Ricardo", "M", 20, "123456", "teste");

        // GerenciarClienteArraylistDAO e GerenciarClienteVectorDAO funcionarão da mesma forma

        // GerenciarClienteArraylistDAO gerenciar = new GerenciarClienteArraylistDAO();
        GerenciarClienteVectorDAO gerenciar = new GerenciarClienteVectorDAO();

        gerenciar.addCliente(nathan);
        gerenciar.addCliente(Aldo);
        gerenciar.addCliente(Rebeca);

        gerenciar.listarClientes();

        Cliente cliente = gerenciar.consultarCliente(1);
        System.out.println(cliente.getNome());

        gerenciar.addCliente(Maria);

        gerenciar.listarClientes();

        gerenciar.alterarCliente(Ricardo, 3);

        gerenciar.listarClientes();

        gerenciar.removerCliente(0);

        gerenciar.listarClientes();

    }
}
