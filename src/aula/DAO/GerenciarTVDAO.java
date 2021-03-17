package aula.DAO;

import aula.modelo.modeloTV.TV;

public class GerenciarTVDAO implements GerenciarVetor {

    private TV[] registroTV;
    private boolean status;

    public GerenciarTVDAO() {
        this.registroTV = new TV[12];
        this.status = false;
    }

    public TV[] getRegistroTV() {
        return this.registroTV;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void inserirValor(TV tv) {
        for(int i = 0; i < this.getRegistroTV().length; i++) {
            if(this.getRegistroTV()[i] == null) {
                this.registroTV[i] = tv;
                System.out.println("Registro inserido na posição: " + i);
                break;
            } else this.status = true;
        }

        if(this.status) System.out.println("Limite do vetor!");
    }

    @Override
    public void consultarValor(String key) {

        try {
            for(int i = 0; i < this.getRegistroTV().length; i++) {
                if(this.getRegistroTV()[i].getCodigo().equals(key)) {
                    System.out.println("Tv encontrada na posição: " + i);
                    break;
                }
            }
        } catch(Exception err) {
            System.out.println("Registro não encontrado!");
        }
    }

    @Override
    public void excluirValor(String key) {
        for(int i = 0; i < this.getRegistroTV().length; i++) {
            if(this.getRegistroTV()[i].getCodigo().equals(key)) {
                this.registroTV[i] = null;
                System.out.println("Registro excluido com sucesso!");
                break;
            }
        }
    }

    @Override
    public void alterarValor(TV tv) {
        for(int i = 0; i < this.getRegistroTV().length; i++) {
            if(this.getRegistroTV()[i].getCodigo().equals(tv.getCodigo())) {
                this.registroTV[i] = tv;
                System.out.println("Registro alterado com sucesso!");
                break;
            }
        }
    }

    public void aumentarAlocacao() {
        TV[] novoRegistro = new TV[this.getRegistroTV().length * 2];

        System.arraycopy(this.registroTV, 0, novoRegistro, 0, this.getRegistroTV().length);

        this.registroTV = null;
        this.registroTV = novoRegistro;
    }

    public void exibirTodoResgistro() {

    }
}
