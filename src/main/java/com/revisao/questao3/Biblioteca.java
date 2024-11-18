package com.revisao.questao3;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca<T extends Publicacao> {
    private List<T> publicacoes;

    public Biblioteca() {
        this.publicacoes = new ArrayList<>();
    }

    public void adicionarPublicacao(T publicacao) {
        publicacoes.add(publicacao);
    }

    public void removerPublicacao(T publicacao) {
        publicacoes.remove(publicacao);
    }

    public void listarPublicacoes() {
        System.out.println("Publicações na Biblioteca:");
        for (T publicacao : publicacoes) {
            System.out.println(publicacao.obterResumo());
        }
    }
}
