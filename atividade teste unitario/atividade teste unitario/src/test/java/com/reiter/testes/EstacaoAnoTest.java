package com.reiter.testes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class EstacaoAnoTest {
    private final EstacaoAno estacao = new EstacaoAno();
    @Test void numeroUmDeveRetornarVerao() { assertEquals("É verão e o tempo está quente.", estacao.descreverEstacao(1)); }
    @Test void numeroTresDeveRetornarInverno() { assertEquals("É inverno e está frio.", estacao.descreverEstacao(3)); }
    @Test void deveLancarExcecaoParaNumeroForaDoIntervalo() { assertThrows(IllegalArgumentException.class, () -> estacao.descreverEstacao(5)); }
}
