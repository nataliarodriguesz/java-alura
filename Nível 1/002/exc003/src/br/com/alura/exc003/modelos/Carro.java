package br.com.alura.exc003.modelos;

public class Carro {
    protected String modelo;
    protected double precoAno1;
    protected double precoAno2;
    protected double precoAno3;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }

    public void exibirInfo() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço Ano 1: R$" + precoAno1);
        System.out.println("Preço Ano 2: R$" + precoAno2);
        System.out.println("Preço Ano 3: R$" + precoAno3);
        System.out.println("Menor Preço: R$" + calcularMenorPreco());
        System.out.println("Maior Preço: R$" + calcularMaiorPreco());
    }

    private double calcularMenorPreco() {
        double menorPreco = precoAno1;

        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }

        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }

        return menorPreco;
    }

    private double calcularMaiorPreco() {
        double maiorPreco = precoAno1;

        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }

        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }

        return maiorPreco;
    }
}
