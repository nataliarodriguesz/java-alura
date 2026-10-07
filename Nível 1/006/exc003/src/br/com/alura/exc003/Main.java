package br.com.alura.exc003;

import br.com.alura.exc003.model.Pessoa;
import br.com.alura.exc003.model.Produto;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1. Dada a lista de números inteiros abaixo, filtre apenas os números pares e imprima-os.

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

        // 2. Dada a lista de strings abaixo, converta todas para letras maiúsculas e imprima-as.

        List<String> palavras = Arrays.asList("java", "stream", "lambda");
        palavras.stream()
                .map(palavra -> palavra.toUpperCase())
                .forEach(System.out::println);

        // 3. Dada a lista de números inteiros abaixo, filtre os números ímpares, multiplique cada
        // um por 2 e colete os resultados em uma nova lista.

        List<Integer> resultado = numeros.stream()
                                        .filter(n -> n % 2 == 1)
                                        .map(n -> n * 2)
                                        .collect(Collectors.toList());
        System.out.println(resultado);

        // 4. Dada a lista de strings abaixo, remova as duplicatas (palavras que aparecem mais de
        // uma vez) e imprima o resultado.

        List<String> palavras2 = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        List<String> unicas = palavras2.stream()
                                       .distinct()
                                       .collect(Collectors.toList());
        System.out.println(unicas);

        // 5. Dada a lista de sublistas de números inteiros abaixo, extraia todos os números primos em
        // uma única lista e os ordene em ordem crescente.

        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );

        List<Integer> numerosPrimos = listaDeNumeros.stream()
                                                    .flatMap(List::stream)
                                                    .filter(Main::verificaPrimo)
                                                    .sorted()
                                                    .collect(Collectors.toList());
        System.out.println(numerosPrimos);

        // 6. Dado um objeto Pessoa com os campos nome e idade, filtre as pessoas com mais de 18 anos,
        // extraia os nomes e imprima-os em ordem alfabética. A classe Pessoa está definida abaixo.

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Alice", 22),
                new Pessoa("Bob", 17),
                new Pessoa("Charlie", 19)
        );

        pessoas.stream()
                .filter(p -> p.getIdade() > 18)
                .map(Pessoa::getNome)
                .sorted()
                .forEach(System.out::println);

        // 7. Você tem uma lista de objetos do tipo Produto, onde cada produto possui os atributos
        // nome (String), preco (double) e categoria (String). Filtre todos os produtos da categoria
        // "Eletrônicos" com preço menor que R$ 1000, ordene-os pelo preço em ordem crescente e
        // colete o resultado em uma nova lista.

        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

        List<Produto> produtosOrdenados = produtos.stream()
                                                  .filter(p -> p.getCategoria().equals("Eletrônicos") && p.getPreco() < 1000)
                                                  .sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                                                  .collect(Collectors.toList());
        System.out.println(produtosOrdenados);

        // 8. Tomando o mesmo código do exercício anterior como base, modifique o código para que a
        // saída mostre apenas os três produtos mais baratos da categoria "Eletrônicos".

        List<Produto> produtosMaisBaratos = produtos.stream()
                                                    .filter(p -> p.getCategoria().equals("Eletrônicos"))
                                                    .sorted((p1, p2) -> Double.compare(p1.getPreco(), p2.getPreco()))
                                                    .limit(3)
                                                    .collect(Collectors.toList());
        System.out.println(produtosMaisBaratos);
    }

    private static boolean verificaPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
