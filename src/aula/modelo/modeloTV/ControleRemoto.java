package aula.modelo.modeloTV;

public interface ControleRemoto {
    void mudarCanal(int canal);
    void ligar();
    void desligar();
    void aumentarVolume(int taxa);
    void diminuirVolume(int taxa);
}