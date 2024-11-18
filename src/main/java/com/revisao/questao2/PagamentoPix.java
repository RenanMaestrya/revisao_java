package com.revisao.questao2;

public class PagamentoPix implements Pagamento {
    @Override
    public boolean processarPagamento(double valor) {
        System.out.println("Pagamento via Pix no valor de R$" + valor + " processado com sucesso.");
        return true;
    }
}