package aula;

import Atividades.atividade03.DAO.GerenciarClienteVectorDAO;
import aula.DAO.GerenciarClienteDAO;
import aula.modelo.modeloPessoa.Cliente;

public class teste {
    public static void main(String[] args) {
        Cliente nathan = new Cliente("Nathan", "M", 20, "1", "teste");
        Cliente Aldo = new Cliente("Aldo", "M", 20, "2", "teste");
        Cliente Rebeca = new Cliente("Rebeca", "F", 20, "3", "teste");
        Cliente Maria = new Cliente("Maria", "F", 20, "4", "teste");
        Cliente Ricardo = new Cliente("Ricardo", "M", 20, "5", "teste");

        // GerenciarClienteArraylistDAO e GerenciarClienteVectorDAO funcionarão da mesma forma

        // GerenciarClienteArraylistDAO gerenciar = new GerenciarClienteArraylistDAO();
        //GerenciarClienteVectorDAO gerenciar = new GerenciarClienteVectorDAO();

        // Testes da aula do dia 16/05/2021
        GerenciarClienteDAO gerenciar = new GerenciarClienteDAO();

        gerenciar.adicionarCliente(nathan);
        gerenciar.adicionarCliente(Aldo);
        gerenciar.adicionarCliente(Rebeca);
        gerenciar.adicionarCliente(Maria);
        gerenciar.adicionarCliente(Ricardo);

        gerenciar.percorrerListaCliente();

        gerenciar.removerCliente(Rebeca.getId());

        gerenciar.percorrerListaCliente();

        gerenciar.removerCliente(nathan.getId());

        gerenciar.percorrerListaCliente();


//        gerenciar.percorrerListaCliente();

//        gerenciar.addCliente(nathan);
//        gerenciar.addCliente(Aldo);
//        gerenciar.addCliente(Rebeca);
//
//        gerenciar.listarClientes();
//
//        Cliente cliente = gerenciar.consultarCliente(1);
//        System.out.println(cliente.getNome());
//
//        gerenciar.addCliente(Maria);
//
//        gerenciar.listarClientes();
//
//        gerenciar.alterarCliente(Ricardo, 3);
//
//        gerenciar.listarClientes();
//
//        gerenciar.removerCliente(0);
//
//        gerenciar.listarClientes();

    }
}
