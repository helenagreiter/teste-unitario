package com.reiter.testes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class PessoaTest {
    @Test void deveGerarNomeStarWarsConformeFormula() {
        Pessoa pessoa = new Pessoa("Helena", "Reiter", "Silva", "Blumenau");
        assertEquals("ReiHe SiBlu", pessoa.gerarNomeStarWars());
    }
    @Test void deveRejeitarNomeVazio() {
        assertThrows(IllegalArgumentException.class, () -> new Pessoa("", "Reiter", "Silva", "Blumenau"));
    }
}
