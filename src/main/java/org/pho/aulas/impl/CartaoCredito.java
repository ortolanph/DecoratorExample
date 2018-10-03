package org.pho.aulas.impl;

import org.pho.aulas.Pagamento;
import org.pho.aulas.TipoPagamento;
import org.pho.aulas.impl.features.Bandeira;

import java.time.LocalDate;

public class CartaoCredito extends Pagamento {

    private String numeroCartao;

    private int codigoSeguranca;

    private LocalDate dataExpiracao;

    private String titular;

    private Bandeira bandeira;

    public CartaoCredito(String numeroCartao, int codigoSeguranca, LocalDate dataExpiracao, String titular,
        Bandeira bandeira) {
        super(TipoPagamento.CARTAO_DE_CREDITO);
        this.numeroCartao = numeroCartao;
        this.codigoSeguranca = codigoSeguranca;
        this.dataExpiracao = dataExpiracao;
        this.titular = titular;
        this.bandeira = bandeira;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public int getCodigoSeguranca() {
        return codigoSeguranca;
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public String getTitular() {
        return titular;
    }
}
