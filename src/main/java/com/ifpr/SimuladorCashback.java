package com.ifpr;

public class SimuladorCashback {
    /**
    * Calcula o valor de cashback baseado no valor da compra e no grau de 
    fidelidade do cliente.
    * @param valorCompra o valor total da compra
    * @param grauFidelidade o grau de fidelidade do cliente (Bronze, Prata, Ouro)
    * @return o valor de cashback calculado
    */

    public double calculaCashBack(double valorCompra, String grauFidelidade) {
        // Implementação do método
        double valorCashback;
        double valorBonusFidelidade;

        double valorFinal;

        if (valorCompra <= 100) {
            valorCashback = 0.05;
        } else if (valorCompra < 500) {
            valorCashback =  0.10;
        } else if (valorCompra >= 500){
            valorCashback =  0.15;
        } else {
            valorCashback = 0;
        }

        if (grauFidelidade == "Prata") {
            valorBonusFidelidade = 0.05;

            valorFinal = valorCompra * (valorCashback + valorBonusFidelidade); 
        } else if (grauFidelidade == "Ouro") {
            valorBonusFidelidade = 0.10;

            valorFinal = valorCompra * (valorCashback + valorBonusFidelidade);         
        } else {
            valorBonusFidelidade = 0;

            valorFinal = valorCompra * (valorCashback + valorBonusFidelidade);    
        }

        return valorFinal;
    } 
}
