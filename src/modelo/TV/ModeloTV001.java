package modelo.TV;

public class ModeloTV001 extends TV implements ControleRemoto {

    private String modelo;

    public ModeloTV001(int tamanho) {
        super.setTamanho(tamanho);
        super.setCanal(7);
        super.setVolume(20);
        super.setCodigo("001");
        super.setStatus(false);
    }

    @Override
    public void mudarCanal(int canal) {
        super.setCanal(canal);
        System.out.println("Canal: " + canal);
    }

    @Override
    public void ligar() {
        super.setStatus(true);
    }

    @Override
    public void desligar() {
        super.setStatus(false);
    }

    @Override
    public void aumentarVolume(int taxa) {
        int vol = 0;

        while(vol != taxa) {
            int aux = super.getVolume();

            if(aux < 100) {
                vol += 1;
                super.setVolume(aux + vol);
            } else {
                break;
            }
        }
    }

    @Override
    public void diminuirVolume(int taxa) {

    }
}
