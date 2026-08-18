package br.com.alura.exc002.main;

import br.com.alura.exc002.modelos.Produto;
import br.com.alura.exc002.modelos.ProdutoPerecivel;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // 01. Crie uma classe Produto com atributos como nome, preco, e quantidade. Em seguida,
        // crie uma lista de objetos Produto utilizando a classe ArrayList. Adicione alguns produtos,
        // imprima o tamanho da lista e recupere um produto pelo índice.

        ArrayList<Produto> produtos = new ArrayList<>();

        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);

        produtos.add(produto1);
        produtos.add(produto2);

        System.out.println("Tamanho da lista: " + produtos.size());
        System.out.println("Produto na posição 0: " + produtos.get(0).getNome());


        // 02. Implemente o metodo toString() na classe Produto para retornar uma representação em texto
        // do objeto. Em seguida, imprima a lista de produtos utilizando o metodo System.out.println().

        for (Produto produto : produtos) {
            System.out.println(produto);
        }

        // 04. Crie uma classe ProdutoPerecivel que herde de Produto. Adicione um atributo dataValidade e
        // um construtor que utilize o construtor da classe mãe (super) para inicializar os atributos herdados.
        // Crie um objeto ProdutoPerecivel e imprima seus valores.

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2026-08-17");
        System.out.println("produtoPerecivel: " + produtoPerecivel);
    }
}
