package org.pho.aulas.impl;

import org.pho.aulas.Pagamento;
import org.pho.aulas.TipoPagamento;

public class Dinheiro extends Pagamento {

    public Dinheiro() {
        super(TipoPagamento.DINHEIRO);
    }
}
