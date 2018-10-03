package org.pho.aulas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaEspecialTest extends ContaCorrenteTest {

    @BeforeEach
    public void setUp() {
        cc = new ContaEspecial(100);
        cc.depositar(200);
    }

    @Test
    public void saqueMaiorQueSaldo() {
        int valorSacado = cc.sacar(300);
        int actual = cc.saldo();
        assertAll(
            () -> assertEquals(200, actual),
            () -> assertEquals(0, valorSacado));
    }
}
