package com.reiter.testes;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AtletaTest {
    @Test void deveClassificarCategoriaPreMirim() { assertEquals("pré-mirim", new Atleta("Ana", 7, 1.2, 25).classificarCategoria()); }
    @Test void deveClassificarCategoriaAdulto() { assertEquals("adulto", new Atleta("Ana", 22, 1.7, 60).classificarCategoria()); }
    @Test void deveCalcularIMC() { assertEquals(20.0, new Atleta("Ana", 20, 2.0, 80).calcularIMC(), 0.001); }
    @Test void deveClassificarIMCSaudavel() { assertEquals("Saudável", new Atleta("Ana", 20, 2.0, 80).classificarIMC()); }
}
