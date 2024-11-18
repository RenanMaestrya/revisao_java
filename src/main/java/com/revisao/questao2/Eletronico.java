package com.revisao.questao2;

public class Eletronico extends Produto {
    public Eletronico(int id, String nome, double preco) {
        super(id, nome, preco);
    }

    @Override
    public double calcularDesconto() {
        return getPreco() * 0.90; // o msm que 10% de desconto
    }
}