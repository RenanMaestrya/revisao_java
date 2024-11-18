package com.revisao.questao2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Produto laptop = new Eletronico(1, "Laptop", 3000.00);
        Produto camiseta = new Vestuario(2, "Camiseta", 50.00);

        System.out.println(laptop.getNome() + " com desconto: R$" + laptop.calcularDesconto());
        System.out.println(camiseta.getNome() + " com desconto: R$" + camiseta.calcularDesconto());

        List<Pagamento> formasPagamento = new ArrayList<>();
        formasPagamento.add(new PagamentoCartao());
        formasPagamento.add(new PagamentoPix());

        for (Pagamento pagamento : formasPagamento) {
            pagamento.processarPagamento(laptop.calcularDesconto());
        }
    }
}
