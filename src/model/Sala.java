package model;

public class Sala extends Local {
    private int numeroSala;
    private boolean Multimidia;

    public Sala(String nome, int capacidadeMaxima, String bloco, int numeroSala, boolean temMultimidia) {
        super(nome, capacidadeMaxima, bloco);
        this.numeroSala = numeroSala;
        this.Multimidia = temMultimidia;
    }

    //Getters and Setters
    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public boolean isMultimidia() {
        return Multimidia;
    }

    public void setMultimidia(boolean multimidia) {
        Multimidia = multimidia;
    }
}