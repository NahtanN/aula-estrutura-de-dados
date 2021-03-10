package Atividades.atividade02.modeloVeiculo;

public class Moto extends Veiculo {

    private String descricao;

    public Moto(String tipo, String cor, String tipo_combustivel, double valor_locacao, String fabricante,
                double quilometragem, String chassi, String placa, String descricao) {
        super(tipo, cor, tipo_combustivel, valor_locacao, fabricante, quilometragem, chassi, placa);
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
