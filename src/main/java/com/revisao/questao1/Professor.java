package com.revisao.questao1;


import java.util.ArrayList;
import java.util.List;

public class Professor {
    private int id;
    private String nome;
    private List<Curso> cursosMinistrados;

    public Professor(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.cursosMinistrados = new ArrayList<>();
    }

    public void adicionarCurso(Curso curso) {
        cursosMinistrados.add(curso);
    }

    public void removerCurso(Curso curso) {
        cursosMinistrados.remove(curso);
    }

    public List<Curso> getCursosMinistrados() {
        return cursosMinistrados;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cursosMinistrados=" + cursosMinistrados +
                '}';
    }
}

