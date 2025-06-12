// src/model/Participante.java
package model;

import java.util.HashSet;
import java.util.Set;

public class Participante extends Pessoa {
    private String cpf;
    private String curso;
    private Set<Evento> eventosInscritos;

    public Participante(String nome, String cpf, String email, String curso) {
        super(nome, email);
        this.cpf = cpf;
        this.curso = curso;
        this.eventosInscritos = new HashSet<>();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public Set<Evento> getEventosInscritos() {
        return eventosInscritos;
    }

    public void setEventosInscritos(Set<Evento> eventosInscritos) {
        this.eventosInscritos = eventosInscritos;
    }
}