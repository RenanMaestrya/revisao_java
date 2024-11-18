package com.revisao.questao3;

public class Livro extends Publicacao {
    public Livro(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public String obterResumo() {
        return "Livro: " + getTitulo() + " - Autor: " + getAutor();
    }
}
