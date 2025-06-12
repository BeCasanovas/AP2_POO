package model;

import java.util.List;

public class Minicurso extends Evento {
    private List<Instrutor> instrutores;
    private int cargaHoraria;
    private List<String> materiaisApoio;

    public Minicurso(String titulo, String data, int duracaoHoras, double orcamento, Local local, List<Instrutor> instrutores, int cargaHoraria, List<String> materiaisApoio) {
        super(titulo, data, duracaoHoras, orcamento, local);
        this.instrutores = instrutores;
        this.cargaHoraria = cargaHoraria;
        this.materiaisApoio = materiaisApoio;
    }

    //Getters and Setters
    public List<Instrutor> getInstrutores() {
        return instrutores;
    }

    public void setInstrutores(List<Instrutor> instrutores) {
        this.instrutores = instrutores;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public List<String> getMateriaisApoio() {
        return materiaisApoio;
    }

    public void setMateriaisApoio(List<String> materiaisApoio) {
        this.materiaisApoio = materiaisApoio;
    }
}