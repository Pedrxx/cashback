package com.ifpr;

public class Cliente {
    private String nome;
    private String grauFidelidade;

    public Cliente(String nome, String grauFidelidade) {
        this.nome = nome;
        this.grauFidelidade = grauFidelidade;
    }

    public String getNome() {
        return this.nome;
    }

    public String getGrauFidelidade() {
        return grauFidelidade;
    }
}

