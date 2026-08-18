package br.com.alura.compras.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoDeCredito {
    private double limite;
    private double saldo;
    private List<Compra> listaCompras;

    public CartaoDeCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.listaCompras = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaCompras() {
        return listaCompras;
    }

    public void setListaCompras(List<Compra> listaCompras) {
        this.listaCompras = listaCompras;
    }

    public boolean realizarCompra(Compra compra) {
        if (this.saldo >= compra.getValor()) {
            this.saldo -= compra.getValor();
            this.listaCompras.add(compra);
            System.out.println("Compra realizada com sucesso!");
            return true;
        } else {
            System.out.println("Saldo insuficiente!");
            mostrarSaldo();
            return false;
        }
    }

    public void mostrarSaldo() {
        if (listaCompras.isEmpty()) {
            System.out.println("Nenhuma compra foi encontrada!");
            System.out.println("************************");
            System.out.println("Saldo do cartão: R$" + this.saldo);
        } else {
            System.out.println("************************");
            Collections.sort(listaCompras);
            for (Compra compra : listaCompras) {
                System.out.println(compra);
            }
            System.out.println("************************");
            System.out.println("Saldo do cartão: R$" + this.saldo);
        }
    }
}
