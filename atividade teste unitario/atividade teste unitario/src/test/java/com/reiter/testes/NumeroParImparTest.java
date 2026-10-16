package com.reiter.testes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class NumeroParImparTest {
    private final NumeroParImpar verificador = new NumeroParImpar();
    @Test void deveRetornarTrueParaNumeroPar() { assertTrue(verificador.verificarPar(10)); }
    @Test void deveRetornarFalseParaNumeroImpar() { assertFalse(verificador.verificarPar(7)); }
    @Test void zeroDeveSerPar() { assertTrue(verificador.verificarPar(0)); }
}
