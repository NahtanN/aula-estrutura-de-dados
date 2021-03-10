package Atividades.atividade02.Locacao;

import java.util.Date;

public class Locacao {

    private String cod_locacao;
    private String data_locacao;
    private String hora_locacao;
    private String data_devolucao;
    private String hora_devolucao;
    private double valor_locacao;
    private boolean status_devolvido;
    private double quilometragem_entrega;

    public Locacao(String cod_locacao, String data_locacao, String hora_locacao, String data_devolucao,
                   String hora_devolucao, double valor_locacao, boolean status_devolvido, double quilometragem_entrega) {
        this.cod_locacao = cod_locacao;
        this.data_locacao = data_locacao;
        this.hora_locacao = hora_locacao;
        this.data_devolucao = data_devolucao;
        this.hora_devolucao = hora_devolucao;
        this.valor_locacao = valor_locacao;
        this.status_devolvido = status_devolvido;
        this.quilometragem_entrega = quilometragem_entrega;
    }

    public String getCod_locacao() {
        return cod_locacao;
    }

    public void setCod_locacao(String cod_locacao) {
        this.cod_locacao = cod_locacao;
    }

    public String getData_locacao() {
        return data_locacao;
    }

    public void setData_locacao(String data_locacao) {
        this.data_locacao = data_locacao;
    }

    public String getHora_locacao() {
        return hora_locacao;
    }

    public void setHora_locacao(String hora_locacao) {
        this.hora_locacao = hora_locacao;
    }

    public String getData_devolucao() {
        return data_devolucao;
    }

    public void setData_devolucao(String data_devolucao) {
        this.data_devolucao = data_devolucao;
    }

    public String getHora_devolucao() {
        return hora_devolucao;
    }

    public void setHora_devolucao(String hora_devolucao) {
        this.hora_devolucao = hora_devolucao;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public boolean isStatus_devolvido() {
        return status_devolvido;
    }

    public void setStatus_devolvido(boolean status_devolvido) {
        this.status_devolvido = status_devolvido;
    }

    public double getQuilometragem_entrega() {
        return quilometragem_entrega;
    }

    public void setQuilometragem_entrega(double quilometragem_entrega) {
        this.quilometragem_entrega = quilometragem_entrega;
    }
}
