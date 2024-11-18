package com.revisao.questao1;


import java.util.ArrayList;
import java.util.List;

public class Aluno {
    private int id;
    private String nome;
    private List<Curso> cursosMatriculados;

    public Aluno(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.cursosMatriculados = new ArrayList<>();
    }

    public void matricularCurso(Curso curso) {
        cursosMatriculados.add(curso);
    }

    public void removerCurso(Curso curso) {
        cursosMatriculados.remove(curso);
    }

    public List<Curso> getCursosMatriculados() {
        return cursosMatriculados;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", cursosMatriculados=" + cursosMatriculados +
                '}';
    }
}
