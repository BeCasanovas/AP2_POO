package model;

import java.util.HashSet;
import java.util.Set;

public class Participante {
    private String nome;
    private String cpf;
    private String email;
    private String curso;
    private Set<Evento> eventosInscritos = new HashSet<>();

    public Participante(String nome, String cpf, String email, String curso) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.curso = curso;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }
    public Set<Evento> getEventosInscritos() { return eventosInscritos; }
    public void inscreverEvento(Evento evento) { eventosInscritos.add(evento); }
}