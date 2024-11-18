package com.revisao.questao1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Aluno> alunos = new ArrayList<>();
    private static List<Professor> professores = new ArrayList<>();
    private static List<Curso> cursos = new ArrayList<>();

    public static void matricularAluno(Aluno aluno, Curso curso) {
        aluno.matricularCurso(curso);
    }

    public static void associarProfessor(Professor professor, Curso curso) {
        professor.adicionarCurso(curso);
    }

    public static void exibirAlunosCurso(Curso curso) {
        System.out.println("Alunos matriculados no curso: " + curso.getNome());
        for (Aluno aluno : alunos) {
            if (aluno.getCursosMatriculados().contains(curso)) {
                System.out.println(aluno);
            }
        }
    }

    public static void exibirCursosProfessor(Professor professor) {
        System.out.println("Cursos ministrados por: " + professor);
        for (Curso curso : professor.getCursosMinistrados()) {
            System.out.println(curso);
        }
    }

    public static void main(String[] args) {
        Curso javaBasico = new Curso(1, "Java Básico", 40);
        Curso pythonIntermediario = new Curso(2, "Python Intermediário", 60);

        cursos.add(javaBasico);
        cursos.add(pythonIntermediario);

        Professor professor1 = new Professor(1, "Carlos Silva");
        Professor professor2 = new Professor(2, "Maria Oliveira");

        professores.add(professor1);
        professores.add(professor2);

        Aluno aluno1 = new Aluno(1, "João Santos");
        Aluno aluno2 = new Aluno(2, "Ana Paula");

        alunos.add(aluno1);
        alunos.add(aluno2);

        matricularAluno(aluno1, javaBasico);
        matricularAluno(aluno2, pythonIntermediario);

        associarProfessor(professor1, javaBasico);
        associarProfessor(professor2, pythonIntermediario);

        exibirAlunosCurso(javaBasico);
        exibirCursosProfessor(professor1);
    }
}
