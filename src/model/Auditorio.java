package model;

public class Auditorio extends Local {
    private boolean som;
    private boolean traducaoSimultanea;

    public Auditorio(String nome, int capacidadeMaxima, String bloco, boolean som, boolean traducaoSimultanea) {
        super(nome, capacidadeMaxima, bloco);
        this.som = som;
        this.traducaoSimultanea = traducaoSimultanea;
    }

    // Getters and Setters
    public boolean isSom() {
        return som;
    }

    public void setSom(boolean som) {
        this.som = som;
    }

    public boolean isTraducaoSimultanea() {
        return traducaoSimultanea;
    }

    public void setTraducaoSimultanea(boolean traducaoSimultanea) {
        this.traducaoSimultanea = traducaoSimultanea;
    }
}
}