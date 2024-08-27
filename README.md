# Simulador de Cashback - Testes Unitários

Este repositório contém uma suite de testes unitários para o **SimuladorCashBack**, que é responsável por calcular o valor de cashback com base no valor da compra e no grau de fidelidade do cliente.

## Descrição

Os testes unitários aqui apresentados foram implementados utilizando o framework **JUnit** e visam validar o correto funcionamento do método `calculaCashBack` da classe `SimuladorCashBack`. Este método é responsável por calcular o valor de cashback que um cliente recebe ao realizar uma compra, levando em consideração três diferentes níveis de fidelidade: **Bronze**, **Prata** e **Ouro**.

Cada nível de fidelidade possui diferentes regras de cashback, variando conforme o valor da compra.

### Regras de Cashback

- **Bronze:**
  - Até R$ 100,00: 5% de cashback.
  - Entre R$ 100,01 e R$ 500,00: 10% de cashback.
  - Acima de R$ 500,00: 15% de cashback.

- **Prata:**
  - Até R$ 100,00: 5% de cashback + 5% de bônus.
  - Entre R$ 100,01 e R$ 500,00: 10% de cashback + 5% de bônus.
  - Acima de R$ 500,00: 15% de cashback + 5% de bônus.

- **Ouro:**
  - Até R$ 100,00: 5% de cashback + 10% de bônus.
  - Entre R$ 100,01 e R$ 500,00: 10% de cashback + 10% de bônus.
  - Acima de R$ 500,00: 15% de cashback + 10% de bônus.

## Testes Implementados

### Grau de Fidelidade: Bronze

1. **`testCashbackBronzeAte100`**
   - **Descrição:** Verifica o cálculo do cashback para clientes com grau de fidelidade Bronze, em compras de até R$ 100,00.
   - **Expectativa:** 5% do valor da compra.

2. **`testCashbackBronzeEntre100e500`**
   - **Descrição:** Verifica o cálculo do cashback para clientes com grau de fidelidade Bronze, em compras entre R$ 100,01 e R$ 500,00.
   - **Expectativa:** 10% do valor da compra.

3. **`testCashbackBronzeAcimaDe500`**
   - **Descrição:** Verifica o cálculo do cashback para clientes com grau de fidelidade Bronze, em compras acima de R$ 500,00.
   - **Expectativa:** 15% do valor da compra.

### Grau de Fidelidade: Prata

4. **`testCashbackPrataAte100`**
   - **Descrição:** Verifica o cálculo do cashback para clientes com grau de fidelidade Prata, em compras de até R$ 100,00.
   - **Expectativa:** 5% do valor da compra + 5% de bônus.

5. **`testCashbackPrataEntre100e500`**
   - **Descrição:** Verifica o cálculo do cashback para clientes com grau de fidelidade Prata, em compras entre R$ 100,01 e R$ 500,00.
   - **Expectativa:** 10% do valor da compra + 5% de bônus.

6. **`testCashbackPrataAcimaDe500`**
   - **Descrição:** Verifica o cálculo do cashback para clientes com grau de fidelidade Prata, em compras acima de R$ 500,00.
   - **Expectativa:** 15% do valor da compra + 5% de bônus.

### Grau de Fidelidade: Ouro

7. **`testCashbackOuroAte100`**
   - **Descrição:** Verifica o cálculo do cashback para clientes com grau de fidelidade Ouro, em compras de até R$ 100,00.
   - **Expectativa:** 5% do valor da compra + 10% de bônus.

8. **`testCashbackOuroEntre100e500`**
   - **Descrição:** Verifica o cálculo do cashback para clientes com grau de fidelidade Ouro, em compras entre R$ 100,01 e R$ 500,00.
   - **Expectativa:** 10% do valor da compra + 10% de bônus.

9. **`testCashbackOuroAcimaDe500`**
   - **Descrição:** Verifica o cálculo do cashback para clientes com grau de fidelidade Ouro, em compras acima de R$ 500,00.
   - **Expectativa:** 15% do valor da compra + 10% de bônus.

