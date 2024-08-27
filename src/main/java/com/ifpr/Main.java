package com.ifpr;

public class Main {
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente("Pedro", "Bronze");
        Cliente cliente2 = new Cliente("Wesley", "Prata");
        Cliente cliente3 = new Cliente("Marcelo", "Ouro");

        Compra compra1 = new Compra(600.0);
        Compra compra2 = new Compra(200.0);
        Compra compra3 = new Compra(50.0);

        SimuladorCashback calculo = new SimuladorCashback();

        double resultado1 = calculo.calculaCashBack(compra1.getValorTotal(), cliente1.getGrauFidelidade());
        double resultado2 = calculo.calculaCashBack(compra2.getValorTotal(), cliente2.getGrauFidelidade());
        double resultado3 = calculo.calculaCashBack(compra3.getValorTotal(), cliente3.getGrauFidelidade());

        System.out.println("Valor de cashback do "+cliente1.getNome()+": "+ resultado1);
        System.out.println("Valor de cashback do "+cliente2.getNome()+": "+ resultado2);
        System.out.println("Valor de cashback do "+cliente3.getNome()+": "+ resultado3);

    }
}