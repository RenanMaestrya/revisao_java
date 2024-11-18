package com.revisao.questao2;

public class Vestuario extends Produto {
    public Vestuario(int id, String nome, double preco) {
        super(id, nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.80;
    }
}