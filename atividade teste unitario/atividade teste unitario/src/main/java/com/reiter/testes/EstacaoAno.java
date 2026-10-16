package com.reiter.testes;
public class EstacaoAno {
    public String descreverEstacao(int numero) {
        return switch (numero) {
            case 1 -> "É verão e o tempo está quente.";
            case 2 -> "É outono.";
            case 3 -> "É inverno e está frio.";
            case 4 -> "É primavera.";
            default -> throw new IllegalArgumentException("O número da estação deve estar entre 1 e 4.");
        };
    }
}
