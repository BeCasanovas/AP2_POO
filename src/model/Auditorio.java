package model;

public class Auditorio extends Local {
    private boolean Som;
    private boolean TraducaoSimultanea;

    public Auditorio(String nome, int capacidadeMaxima, String bloco, boolean Som, boolean TraducaoSimultanea) {
        super(nome, capacidadeMaxima, bloco);
        this.Som = Som;
        this.TraducaoSimultanea = TraducaoSimultanea;
    }

    public boolean isSom() {
        return Som;
    }

    public void setSom(boolean som) {
        Som = som;
    }
}