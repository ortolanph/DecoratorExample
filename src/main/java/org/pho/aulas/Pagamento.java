package org.pho.aulas;

public abstract class Pagamento {

    private int quantidade;

    private TipoPagamento tipoPagamento;

    public Pagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getTipoPagamento() {
        return tipoPagamento.getDescricao();
    }

}
