package model;

public class Laboratorio extends Local {
    private int numComputadores;
    private String tipo; // "Informática" ou "Química"

    public Laboratorio(String nome, int capacidadeMaxima, String bloco, int numComputadores, String tipo) {
        super(nome, capacidadeMaxima, bloco);
        this.numComputadores = numComputadores;
        this.tipo = tipo;
    }

    public int getNumComputadores() { return numComputadores; }
    public void setNumComputadores(int numComputadores) { this.numComputadores = numComputadores; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
}