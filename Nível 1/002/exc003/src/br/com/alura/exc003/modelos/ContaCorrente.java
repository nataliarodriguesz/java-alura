package br.com.alura.exc003.modelos;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de R$" + tarifaMensal + " cobrada. Saldo atual: R$" + saldo);
    }
}
