package br.com.alura.exc002;

import br.com.alura.exc002.model.*;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. Crie uma expressão lambda que multiplique dois números inteiros. A expressão deve ser
        // implementada dentro de uma interface funcional com o metodo multiplicacao(int a, int b).

        Multiplicacao m = (a, b) -> a*b;
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                            ---------------------------
                              MULTIPLICADOR DE NÚMERO 
                            ---------------------------
                            """);

        System.out.println("Digite o primeiro valor: ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = scanner.nextInt();

        System.out.println("Resultado: " + m.mutiplicacao(a, b));

        // 2. Implemente uma expressão lambda que verifique se um número é primo.

        Primo primo = n -> {
            if (n <= 1) {
                return false;
            }
            for (int i = 2; i<= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println("""
                            ---------------------------
                            VERIFICADOR DE NÚMERO PRIMO
                            ---------------------------
                            """);
        System.out.println("Digite um número: ");
        int n  = scanner.nextInt();

        System.out.println("Resultado: " + primo.verificadorPrimo(n));

        // 3. Crie uma função lambda que receba uma string e a converta para letras maiúsculas.

        ConvertorMaiuscula convertor = palavra -> palavra.toUpperCase();

        System.out.println("""
                            ---------------------------
                              CONVERTOR P/ MAIÚSCULA
                            ---------------------------
                            """);
        System.out.println("Digite uma palavra: ");
        String palavra = scanner.next();

        System.out.println("Palavra convertida: " + convertor.verificadorMaiuscula(palavra));

        // 4. Crie uma expressão lambda que verifique se uma string é um palíndromo. A expressão
        // deve ser implementada dentro de uma interface funcional com o metodo boolean
        //  verificarPalindromo(String str). Dica: utilize o metodo reverse da classe StringBuilder.

        Palindromo palindromo = palavra2 -> palavra2.equals(new StringBuilder(palavra2).reverse().toString());;

        System.out.println("""
                            ---------------------------
                             VERIFICADOR DE PALÍNDROMO
                            ---------------------------
                            """);
        System.out.println("Digite uma palavra: ");
        String palavra2 = scanner.next();

        System.out.println("Resultado: " + palindromo.verificadorPalindromo(palavra2.toUpperCase()));

        // 5. Implemente uma expressão lambda que recebe uma lista de inteiros e retorna uma nova lista
        // onde cada número foi multiplicado por 3. Dica: a função replaceAll, das Collections, recebe
        // uma interface funcional como parâmetro, assim como vimos na função forEach.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        System.out.println("""
                            ---------------------------
                            MULTIPLICADOR DE LISTA (x3)
                            ---------------------------
                            """);

        System.out.println(numeros);
        numeros.replaceAll(d -> d * 3);
        System.out.println("Resultado: " + numeros);

        // 6. Crie uma expressão lambda que ordene uma lista de strings em ordem alfabética. Dica: a função
        // sort, das Collections, recebe uma interface funcional como parâmetro, assim como vimos na função
        // forEach.

        List<String> palavras = Arrays.asList("d", "y", "a", "c", "b", "f");

        System.out.println("""
                            ---------------------------
                                ORDENADOR DE LISTA
                            ---------------------------
                            """);

        System.out.println(palavras);
        palavras.sort((nome1, nome2) -> nome1.compareTo(nome2));
        System.out.println("Resultado: " + palavras);

        // 7. Crie uma função lambda que recebe dois números e divide o primeiro pelo segundo. A função deve
        // lançar uma exceção de tipo ArithmeticException se o divisor for zero.

        DivisaoInteiro divisao = (g, h) -> g/h;

        System.out.println("""
                            ---------------------------
                                DIVISÃO DE INTEIRO
                            ---------------------------
                            """);
        System.out.println("Digite o 1º número: ");
        int g = scanner.nextInt();
        System.out.println("Digite o 2º número: ");
        int h = scanner.nextInt();

        try {
            if (h == 0){
                throw new ArithmeticException("Não é possível dividir por zero.");
            }
            System.out.println(g + " / " + h + " = " + divisao.dividir(g, h));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
