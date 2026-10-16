package com.reiter.testes;
public class Contribuinte {
    private final String nome, cpf, uf;
    private final double rendaAnual;
    
    public Contribuinte(String nome, String cpf, String uf, double rendaAnual) {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("O nome é obrigatório.");
        if (cpf == null || cpf.isBlank()) throw new IllegalArgumentException("O CPF é obrigatório.");
        if (!"RS".equals(uf) && !"PR".equals(uf) && !"SC".equals(uf)) throw new IllegalArgumentException("A UF deve ser RS, PR ou SC.");
        if (rendaAnual < 0) throw new IllegalArgumentException("A renda anual não pode ser negativa.");
        this.nome = nome; this.cpf = cpf; this.uf = uf; this.rendaAnual = rendaAnual;
    }
    public double calcularImposto() {
        double aliquota;
        if (rendaAnual <= 4000) aliquota = 0.0;
        else if (rendaAnual <= 9000) aliquota = 0.058;
        else if (rendaAnual <= 25000) aliquota = 0.15;
        else if (rendaAnual <= 35000) aliquota = 0.275;
        else aliquota = 0.30;
        return rendaAnual * aliquota;
    }
}
