package br.com.alura.exc003.modelos;

public class ProdutoFisico extends Produto implements Calculavel {
    @Override
    public double calcularPrecoFinal() {
        return preco * 1.05;
    }
}
