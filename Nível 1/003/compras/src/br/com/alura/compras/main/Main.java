package br.com.alura.compras.main;

import br.com.alura.compras.modelos.CartaoDeCredito;
import br.com.alura.compras.modelos.Compra;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op = 1;

        System.out.println("Digite o limite do cartão:");
        CartaoDeCredito cartao = new CartaoDeCredito(scanner.nextDouble());

        while (op == 1){
            System.out.println("Digite a descrição da compra:");
            String descricaoCompra = scanner.next();

            System.out.println("Digite o valor da compra: ");
            double valorCompra = scanner.nextDouble();

            Compra compra = new Compra(descricaoCompra, valorCompra);

            boolean compraRealizada = cartao.realizarCompra(compra);

            if (compraRealizada){
                System.out.println("Digite 0 para sair ou 1 para continuar");
                op = scanner.nextInt();
            } else {
                op = 0;
            }
        }
    }
}
