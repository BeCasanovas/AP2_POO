package model;

public class Seminario extends Evento {
    private String tema;
    private String aluno;
    private String orientador;

    public Seminario(String titulo, String data, int duracaoHoras, float orcamento, Local local, String tema, String aluno, String orientador) {
        super(titulo, data, duracaoHoras, orcamento, local);
        this.tema = tema;
        this.aluno = aluno;
        this.orientador = orientador;
    }

    // Getters and Setters
    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getAluno() {
        return aluno;
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }

    public String getOrientador() {
        return orientador;
    }

    public void setOrientador(String orientador) {
        this.orientador = orientador;
    }
}
}