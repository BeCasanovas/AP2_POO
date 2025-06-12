package model;

public class Sala extends Local {
    private int numeroSala;
    private boolean multimidia;

    public Sala(String nome, int capacidadeMaxima, String bloco, int numeroSala, boolean multimidia) {
        super(nome, capacidadeMaxima, bloco);
        this.numeroSala = numeroSala;
        this.multimidia = multimidia;
    }

    //Getters and Setters
    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public boolean isMultimidia() {
        return multimidia;
    }

    public void setMultimidia(boolean multimidia) {
        this.multimidia = multimidia;
    }
}
}