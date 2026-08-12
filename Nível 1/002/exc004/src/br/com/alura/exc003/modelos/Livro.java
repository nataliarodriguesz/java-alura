package br.com.alura.exc003.modelos;

public class Livro extends Produto implements Calculavel {
    private String autor;

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
