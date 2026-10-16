package com.reiter.testes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class ContribuinteTest {
    @Test void rendaAteQuatroMilNaoPagaImposto() {
        assertEquals(0.0, new Contribuinte("João da Silva", "123.456.789-00", "PR", 4000).calcularImposto(), 0.001);
    }
    @Test void rendaDeQuarentaMilPagaTrintaPorCento() {
        assertEquals(12000.0, new Contribuinte("João da Silva", "123.456.789-00", "PR", 40000).calcularImposto(), 0.001);
    }
    @Test void deveRejeitarUfNaoPermitida() {
        assertThrows(IllegalArgumentException.class, () -> new Contribuinte("João", "123", "SP", 10000));
    }
}
