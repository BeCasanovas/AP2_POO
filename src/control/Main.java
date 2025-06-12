package control;

import model.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Locals
        Sala sala1 = new Sala("Desing Thinking", 50, "1", true);
        Laboratorio lab1 = new Laboratorio("Lab Info", 50, "2", 50, "Informática");
        Auditorio aud1 = new Auditorio("Auditório", 200, "2", true, false);

        // Pessoas
        Participante p1 = new Participante("Bernardo", "123.456.789-10", "bernardo@ibmecjr.com.br", "Ciência de Dados e Inteligência Artificial");
        Participante p2 = new Participante("Anderson", "987.654.321-01", "anderson@ibmecjr.com.br", "Engenharia de Software");
        Instrutor instr1 = new Instrutor("Thiago", "thiago.silva@professores.ibmec.edu.br", "doutorado", "Java");
        Organizador org1 = new Organizador("Samuel", "samuel.barros@professores.ibmec.edu.br", "Reitor");
        Palestrante pal1 = new Palestrante("Robson", "robson@ufrj.com.br", "UFRJ");

        // Eventos
        Palestra palestra = new Palestra("Carreiras TECH", "2024-06-10", 2, 1000f, aud1, pal1);
        List<Instrutor> instrutores = Arrays.asList(instr1);
        Minicurso minicurso = new Minicurso("Como não virar Uber", "2024-06-11", 4, 800f, lab1, instrutores, 4, Arrays.asList("Notebooks", "Slides"));
        Seminario seminario = new Seminario("Capijava", "2024-06-12", 2, 500f, sala1, "Java", "Martinez", "Prof. Thiago");

        // Inscrições
        p1.getEventosInscritos().add(palestra);
        p1.getEventosInscritos().add(minicurso);
        p2.getEventosInscritos().add(minicurso);
        p2.getEventosInscritos().add(seminario);

        // Exemplos de uso
        System.out.println(p1.getNome() + " está inscrito em " + p1.getEventosInscritos().size() + " eventos.");
        System.out.println(p2.getNome() + " está inscrito em " + p2.getEventosInscritos().size() + " eventos.");
        System.out.println("Palestra: " + palestra.getTitulo() + ", Palestrante: " + palestra.getPalestrante().getNome());
        System.out.println("Minicurso: " + minicurso.getTitulo() + ", Instrutores: " + minicurso.getInstrutores().get(0).getNome());
        System.out.println("Seminário: " + seminario.getTitulo() + ", Tema: " + seminario.getTema());
    }
}