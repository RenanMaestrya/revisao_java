package com.revisao.questao3;

public class Revista extends Publicacao {
    public Revista(String titulo, String autor, int anoPublicacao) {
        super(titulo, autor, anoPublicacao);
    }

    @Override
    public String obterResumo() {
        return "Revista: " + getTitulo() + " - Ano: " + getAnoPublicacao();
    }
}
