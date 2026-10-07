package br.com.alura.exc004.main;

import br.com.alura.exc004.model.Produto;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1. Dada a lista de números inteiros a seguir, encontre o maior número dela.

        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> max = numeros.stream()
                                       .max(Integer::compare);
        max.ifPresent(System.out::println);

        // 2. Dada a lista de palavras (strings) abaixo, agrupe-as pelo seu tamanho. No código a seguir,
        // há um exemplo prático do resultado esperado.

        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");
        Map<Integer, List<String>> agrupamento = palavras.stream()
                                                          .collect(Collectors.groupingBy(String::length));
        System.out.println(agrupamento);

        // 3. Dada a lista de nomes abaixo, concatene-os separados por vírgula. No código a seguir, há um
        // exemplo prático do resultado esperado.

        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
        String lista = nomes.stream()
                            .collect(Collectors.joining(", "));
        System.out.println(lista);

        // 4. Dada a lista de números inteiros abaixo, calcule a soma dos quadrados dos números pares.

        List<Integer> numeros2 = Arrays.asList(1, 2, 3, 4, 5, 6);
        int somaQuadrados = numeros2.stream()
                                    .filter(n -> n % 2 == 0)
                                    .map(n -> n * n)
                                    .reduce(0, Integer::sum);
        System.out.println(somaQuadrados);

        // 5. Dada uma lista de números inteiros, separe os números pares dos ímpares.
        // lista : numeros2

        Map<Boolean, List<Integer>> numerosSeparados = numeros2.stream()
                                                               .collect(Collectors.partitioningBy(n -> n % 2 == 0));
        System.out.println("Pares: "   + numerosSeparados.get(true));
        System.out.println("Impares: " + numerosSeparados.get(false));

        // ==========================================================================================
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        // 6. Dada a lista de produtos acima, agrupe-os por categoria em um Map<String, List<Produto>

        Map<String, List<Produto>> produtosCategoria = produtos.stream()
                                                               .collect(Collectors.groupingBy(Produto::getCategoria));
        System.out.println(produtosCategoria);

        // 7. Dada a lista de produtos acima, conte quantos produtos há em cada categoria e armazene em um
        // Map<String, Long>

        Map<String, Long> produtosQntde = produtos.stream()
                                                  .collect(Collectors.groupingBy(Produto::getCategoria, Collectors.counting()));
        System.out.println(produtosQntde);

        // 8. Dada a lista de produtos acima, encontre o produto mais caro de cada categoria e armazene o
        // resultado em um Map<String, Optional<Produto>>

        Map<String, Optional<Produto>> maisCaroPorCategoria = produtos.stream()
                                                                      .collect(Collectors.groupingBy(Produto::getCategoria,
                                                                               Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco))));
        System.out.println(maisCaroPorCategoria);

        // 9. Dada a lista de produtos acima, calcule o total dos preços dos produtos em cada categoria e
        // armazene o resultado em um Map<String, Double>

        Map<String, Double> totalPrecoPorCategoria = produtos.stream()
                                                             .collect(Collectors.groupingBy(Produto::getCategoria,
                                                                      Collectors.summingDouble(Produto::getPreco)));
        System.out.println(totalPrecoPorCategoria);
    }
}
