import static org.junit.Assert.assertEquals;

import org.junit.Test;

import paranavai.ifpr.edu.br.SimuladorCashBack;;

public class TestCashbackTest {

    @Test
    public void testCashbackBronzeAte100() {
        double valorCompra = 100.00;
        String grauFidelidade = "Bronze";
        double valorEsperado = 5.00; // 5% de 100
        double valorCalculado = SimuladorCashBack.calculaCashBack(valorCompra, grauFidelidade);
        assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void testCashbackBronzeEntre100e500() {
        double valorCompra = 300.00;
        String grauFidelidade = "Bronze";
        double valorEsperado = 30.00; // 10% de 300
        double valorCalculado = SimuladorCashBack.calculaCashBack(valorCompra, grauFidelidade);
        assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void testCashbackBronzeAcimaDe500() {
        double valorCompra = 600.00;
        String grauFidelidade = "Bronze";
        double valorEsperado = 90.00; // 15% de 600
        double valorCalculado = SimuladorCashBack.calculaCashBack(valorCompra, grauFidelidade);
        assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void testCashbackPrataAte100() {
        double valorCompra = 100.00;
        String grauFidelidade = "Prata";
        double valorEsperado = 10.00; // 5% de 100 + 5% (bônus Prata)
        double valorCalculado = SimuladorCashBack.calculaCashBack(valorCompra, grauFidelidade);
        assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void testCashbackPrataEntre100e500() {
        double valorCompra = 300.00;
        String grauFidelidade = "Prata";
        double valorEsperado = 45.00; // 10% de 300 + 5% (bônus Prata)
        double valorCalculado = SimuladorCashBack.calculaCashBack(valorCompra, grauFidelidade);
        assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void testCashbackPrataAcimaDe500() {
        double valorCompra = 600.00;
        String grauFidelidade = "Prata";
        double valorEsperado = 120.00; // 15% de 600 + 5% (bônus Prata)
        double valorCalculado = SimuladorCashBack.calculaCashBack(valorCompra, grauFidelidade);
        assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void testCashbackOuroAte100() {
        double valorCompra = 100.00;
        String grauFidelidade = "Ouro";
        double valorEsperado = 15.00; // 5% de 100 + 10% (bônus Ouro)
        double valorCalculado = SimuladorCashBack.calculaCashBack(valorCompra, grauFidelidade);
        assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void testCashbackOuroEntre100e500() {
        double valorCompra = 300.00;
        String grauFidelidade = "Ouro";
        double valorEsperado = 60.00; // 10% de 300 + 10% (bônus Ouro)
        double valorCalculado = SimuladorCashBack.calculaCashBack(valorCompra, grauFidelidade);
        assertEquals(valorEsperado, valorCalculado, 0.01);
    }

    @Test
    public void testCashbackOuroAcimaDe500() {
        double valorCompra = 600.00;
        String grauFidelidade = "Ouro";
        double valorEsperado = 150.00; // 15% de 600 + 10% (bônus Ouro)
        double valorCalculado = SimuladorCashBack.calculaCashBack(valorCompra, grauFidelidade);
        assertEquals(valorEsperado, valorCalculado, 0.01);
    }
}
