package aula.modelo.modeloTV;

public class ModeloTV00201 extends ModeloTV002 {

    private final String MODELO = "TV00201";
    private final int tamanho = 50;

    public ModeloTV00201() {
        super.setTamanho(tamanho);
        super.setVolume(0);
        super.setCanal(0);
        super.setStatus(false);
        super.setCor("padrão");
    }

    @Override
    public void configurarCor(String configuracao) {
        switch(configuracao) {
            case "esporte":
                super.setCor("esporte");
                System.out.println("Modo de cor esporte: ATIVADO");
                break;
            case "economico":
                super.setCor("economico");
                System.out.println("Modo de cor economico: ATIVADO");
                break;
            case "cinema":
                super.setCor("cinema");
                System.out.println("Modo de cor cinema: ATIVADO");
                break;
            case "jogos":
                super.setCor("jogos");
                System.out.println("Modo de cor jogos: ATIVADO");
                break;
            default:
                super.setCor("padrão");
                System.out.println("Modo de cor padrão: ATIVADO");
        }
    }

    @Override
    public void ligar() {
        super.setStatus(true);
        System.out.println(this.MODELO + " Ligada!");
    }
}
