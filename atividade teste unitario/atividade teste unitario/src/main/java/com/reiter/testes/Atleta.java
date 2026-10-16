package com.reiter.testes;
public class Atleta {
    private final String nome;
    private final int idade;
    private final double altura, peso;
    
    public Atleta(String nome, int idade, double altura, double peso) {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("O nome é obrigatório.");
        if (idade < 5) throw new IllegalArgumentException("A idade deve ser de pelo menos 5 anos.");
        if (altura <= 0 || peso <= 0) throw new IllegalArgumentException("Altura e peso devem ser maiores que zero.");
        this.nome = nome; this.idade = idade; this.altura = altura; this.peso = peso;
    }
    public String classificarCategoria() {
        if (idade <= 7) return "pré-mirim";
        if (idade <= 10) return "mirim";
        if (idade <= 13) return "infantil";
        if (idade <= 17) return "infanto-juvenil";
        if (idade <= 20) return "juvenil";
        return "adulto";
    }
    public double calcularIMC() { return peso / (altura * altura); }
    public String classificarIMC() {
        double imc = calcularIMC();
        if (imc < 18.5) return "Magreza";
        if (imc < 25.0) return "Saudável";
        if (imc < 30.0) return "Sobrepeso";
        if (imc < 35.0) return "Obesidade Grau I";
        if (imc <= 40.0) return "Obesidade Grau II (severa)";
        return "Obesidade Grau III (mórbida)";
    }
}
