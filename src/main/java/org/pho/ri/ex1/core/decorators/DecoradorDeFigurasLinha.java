package org.pho.ri.ex1.core.decorators;

import org.pho.ri.ex1.core.DecoradorDeFiguras;
import org.pho.ri.ex1.core.decorators.features.Linha;
import org.pho.ri.ex1.figuras.Figura;

public class DecoradorDeFigurasLinha extends DecoradorDeFiguras {

    private Linha linha;

    public DecoradorDeFigurasLinha(Figura figuraDecorada, Linha linha) {
        super(figuraDecorada);
        this.linha = linha;
    }

    @Override public String descricao() {
        return figuraDecorada.descricao() + " com linha " + linha.name();
    }
}
