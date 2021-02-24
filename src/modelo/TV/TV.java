package modelo.TV;

public class TV {
    private int tamanho;
    private int canal;
    private int volume;
    private boolean status;
    private String codigo;

    public TV(int tamanho, int canal, int volume, boolean status, String codigo) {
        this.tamanho = tamanho;
        this.canal = canal;
        this.volume = volume;
        this.status = status;
        this.codigo = codigo;
    }

    public TV() {
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
