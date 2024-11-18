package com.revisao.questao2;

public class PagamentoCartao implements Pagamento {
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento via cartão de crédito no valor de R$" + valor + " processado com sucesso.");
        return true;
    }
}
