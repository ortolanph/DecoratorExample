package org.pho.ri.ex2.core.decorators;

import org.pho.ri.ex2.core.DecoradorDeFiguras;
import org.pho.ri.ex2.core.decorators.features.Cor;
import org.pho.ri.ex2.figuras.Figura;

public class DecoradorDeFigurasPreenchimento extends DecoradorDeFiguras {

    private Cor preenchimento;

    public DecoradorDeFigurasPreenchimento(Figura figuraDecorada, Cor preenchimento) {
        super(figuraDecorada);
        this.preenchimento = preenchimento;
    }

    @Override public double calcularArea() {
        return 0;
    }

    @Override public double calcularPerimetro() {
        return 0;
    }

    @Override public String descricao() {
        return figuraDecorada.descricao() + ", preenchimento: " + preenchimento.name();
    }
}
