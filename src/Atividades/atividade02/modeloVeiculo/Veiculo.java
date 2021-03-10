package Atividades.atividade02.modeloVeiculo;

public class Veiculo {

    private String tipo;
    private String cor;
    private String tipo_combustivel;
    private double valor_locacao;
    private String fabricante;
    private double quilometragem;
    private String chassi;
    private String placa;

    public Veiculo(String tipo, String cor, String tipo_combustivel, double valor_locacao, String fabricante,
                   double quilometragem, String chassi, String placa) {
        this.tipo = tipo;
        this.cor = cor;
        this.tipo_combustivel = tipo_combustivel;
        this.valor_locacao = valor_locacao;
        this.fabricante = fabricante;
        this.quilometragem = quilometragem;
        this.chassi = chassi;
        this.placa = placa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo_combustivel() {
        return tipo_combustivel;
    }

    public void setTipo_combustivel(String tipo_combustivel) {
        this.tipo_combustivel = tipo_combustivel;
    }

    public double getValor_locacao() {
        return valor_locacao;
    }

    public void setValor_locacao(double valor_locacao) {
        this.valor_locacao = valor_locacao;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
