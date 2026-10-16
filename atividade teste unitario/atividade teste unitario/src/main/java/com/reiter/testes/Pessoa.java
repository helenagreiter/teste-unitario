package com.reiter.testes;

public class Pessoa {
    private final String nome, sobrenome, sobrenomeSolteiraMae, cidadeNatal;
    public Pessoa(String nome, String sobrenome, String sobrenomeSolteiraMae, String cidadeNatal) {
        this.nome = validar(nome, "nome");
        this.sobrenome = validar(sobrenome, "sobrenome");
        this.sobrenomeSolteiraMae = validar(sobrenomeSolteiraMae, "sobrenome de solteira da mãe");
        this.cidadeNatal = validar(cidadeNatal, "cidade natal");
    }
    public String gerarNomeStarWars() {
        return letras(sobrenome, 3) + letras(nome, 2) + " "
             + letras(sobrenomeSolteiraMae, 2) + letras(cidadeNatal, 3);
    }
    private static String letras(String texto, int quantidade) {
        String limpo = texto.trim().replaceAll("\\s+", "");
        return limpo.substring(0, Math.min(quantidade, limpo.length()));
    }
    private static String validar(String texto, String campo) {
        if (texto == null || texto.isBlank()) throw new IllegalArgumentException("O campo " + campo + " é obrigatório.");
        return texto.trim();
    }
}
