package model;

public class Auditorio extends Local {
    private boolean temSom;
    private boolean temTraducaoSimultanea;

    public Auditorio(String nome, int capacidadeMaxima, String bloco, boolean temSom, boolean temTraducaoSimultanea) {
        super(nome, capacidadeMaxima, bloco);
        this.temSom = temSom;
        this.temTraducaoSimultanea = temTraducaoSimultanea;
    }

    public boolean isTemSom() { return temSom; }
    public void setTemSom(boolean temSom) { this.temSom = temSom; }
    public boolean isTemTraducaoSimultanea() { return temTraducaoSimultanea; }
    public void setTemTraducaoSimultanea(boolean temTraducaoSimultanea) { this.temTraducaoSimultanea = temTraducaoSimultanea; }
}