package br.com.alura.exc003.main;

import br.com.alura.exc003.modelos.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 01. Crie um ArrayList de strings e utilize um loop foreach para percorrer e imprimir cada
        // elemento da lista.

        ArrayList<String> nomes =  new ArrayList<>();
        nomes.add("Natália");
        nomes.add("Gustavo");
        nomes.add("Gisley");
        nomes.add("Silvio");

        for (String nome : nomes) {
            System.out.println(nome);
        }

        // 02. Crie uma classe Animal e uma classe Cachorro que herda de Animal. Em seguida, crie um objeto
        // da classe Cachorro e faça o casting para a classe Animal.

        Cachorro cachorro = new Cachorro();
        Animal animal = (Animal) cachorro;

        // 03. Modifique o Exercício 2 para incluir uma verificação usando instanceof para garantir que o
        // objeto seja do tipo correto antes de fazer o casting.

        if (cachorro instanceof Animal) {
            Animal animal2 = (Animal) cachorro;
        } else {
            System.out.println("O objeto não é um animal");
        }

        // 04. Crie uma classe Produto com propriedades como nome e preço. Em seguida, crie uma lista de
        // produtos e utilize um loop para calcular e imprimir o preço médio dos produtos.

        Produto produto1 = new Produto("Caderno", 12.00);
        Produto produto2 = new Produto("Caneta", 4.00);
        Produto produto3 = new Produto("Camiseta", 79.99);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);

        for(Produto produto : produtos) {
            System.out.println("Preço: R$" + produto.getPreco());
        }

        // 05. Crie uma interface Forma com um metodo calcularArea(). Implemente a interface em duas classes,
        // por exemplo, Circulo e Quadrado. Em seguida, crie uma lista de formas (objetos da interface Forma)
        // e utilize um loop para calcular e imprimir a área de cada forma.

        Quadrado quadrado = new Quadrado(4);
        Quadrado quadrado2 = new Quadrado(5);

        Circulo circulo = new Circulo(4);
        Circulo circulo2 = new Circulo(5);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(quadrado);
        formas.add(quadrado2);
        formas.add(circulo);
        formas.add(circulo2);

        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea() + " m²");
        }

        // 06. Crie uma classe ContaBancaria com propriedades como número da conta e saldo. Em seguida, crie
        // uma lista de contas bancárias com diferentes saldos. Utilize um loop para encontrar e imprimir a
        // conta com o maior saldo.

        ContaBancaria conta1 = new ContaBancaria(001, 1000);
        ContaBancaria conta2 = new ContaBancaria(002, 2000);
        ContaBancaria conta3 = new ContaBancaria(003, 3000);

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);

        ContaBancaria contaMaiorSaldo = contas.get(0);
        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumeroConta() + ", Saldo: R$" + contaMaiorSaldo.getSaldo());
    }
}
