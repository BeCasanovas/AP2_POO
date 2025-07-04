package model;

public class Palestra extends Evento {
    private Palestrante palestrante;

    public Palestra(String titulo, String data, int duracaoHoras, float orcamento, Local local, Palestrante palestrante) {
        super(titulo, data, duracaoHoras, orcamento, local);
        this.palestrante = palestrante;
    }

    //Getters and Setters
    public Palestrante getPalestrante() {
        return palestrante;
    }

    public void setPalestrante(Palestrante palestrante) {
        this.palestrante = palestrante;
    }
}