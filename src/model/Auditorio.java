package model;

public class Auditorio extends Local {
    private boolean Som;
    private boolean TraducaoSimultanea;

    public Auditorio(String nome, int capacidadeMaxima, String bloco, boolean Som, boolean TraducaoSimultanea) {
        super(nome, capacidadeMaxima, bloco);
        this.Som = Som;
        this.TraducaoSimultanea = TraducaoSimultanea;
    }

    // Getters and Setters

    public boolean isSom() {
        return Som;
    }

    public void setSom(boolean som) {
        Som = som;
    }

    public boolean isTraducaoSimultanea() {
        return TraducaoSimultanea;
    }

    public void setTraducaoSimultanea(boolean traducaoSimultanea) {
        TraducaoSimultanea = traducaoSimultanea;
    }
}