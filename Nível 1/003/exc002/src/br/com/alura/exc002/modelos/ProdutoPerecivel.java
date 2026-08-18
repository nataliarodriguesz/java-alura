package br.com.alura.exc002.modelos;

public class ProdutoPerecivel extends Produto {
    private String dataValidade;


    public ProdutoPerecivel(String nome, double preco, int quantidade,  String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }
}
