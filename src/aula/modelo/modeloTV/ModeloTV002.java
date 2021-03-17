package aula.modelo.modeloTV;

public class ModeloTV002 extends TV implements ControleRemoto {

    private final String MODELO = "TV002";
    private final int tamanho = 42;
    private String cor;

    public ModeloTV002() {
        super.setTamanho(tamanho);
        super.setCanal(0);
        super.setVolume(0);
        super.setStatus(false);
        this.cor = "padrão";
    }

    public void configurarCor(String configuracao) {
        /*Padrões de cores:
        * - padrão
        * - esporte
        * - cinema
        * - jogos*/

        switch (configuracao) {
            case "esporte":
                this.setCor("esporte");
                System.out.println("Modo de cor esporte: ATIVADO");
                break;
            case "cinema":
                this.setCor("cinema");
                System.out.println("Modo de cor cinema: ATIVADO");
                break;
            case "jogos":
                this.setCor("jogos");
                System.out.println("Modo de cor jogos: ATIVADO");
                break;
            default:
                this.setCor("padrão");
                System.out.println("Modo de cor padrão: ATIVADO");
        }
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public void mudarCanal(int canal) {

    }

    @Override
    public void ligar() {

    }

    @Override
    public void desligar() {

    }

    @Override
    public void aumentarVolume(int taxa) {

    }

    @Override
    public void diminuirVolume(int taxa) {

    }
}
