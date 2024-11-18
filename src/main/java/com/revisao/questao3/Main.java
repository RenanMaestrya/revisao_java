package com.revisao.questao3;

public class Main {
    public static void main(String[] args) {
        Biblioteca<Publicacao> biblioteca = new Biblioteca<>();

        Livro livro1 = new Livro("O Hobbit", "J.R.R. Tolkien", 1937);
        Livro livro2 = new Livro("1984", "George Orwell", 1949);
        Revista revista1 = new Revista("National Geographic", "Vários", 2023);

        biblioteca.adicionarPublicacao(livro1);
        biblioteca.adicionarPublicacao(livro2);
        biblioteca.adicionarPublicacao(revista1);

        biblioteca.listarPublicacoes();

        biblioteca.removerPublicacao(livro2);
        System.out.println("\nApós remover '1984':");
        biblioteca.listarPublicacoes();
    }
}
