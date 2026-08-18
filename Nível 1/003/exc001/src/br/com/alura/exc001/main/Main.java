package br.com.alura.exc001.main;

import br.com.alura.exc001.modelos.Pessoa;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

        Pessoa p1 = new Pessoa();
        p1.setNome("Natália");
        p1.setIdade(22);

        Pessoa p2 = new Pessoa();
        p2.setNome("Gisley");
        p2.setIdade(57);

        Pessoa p3 = new Pessoa();
        p3.setNome("Silvio");
        p2.setIdade(66);

        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);

        System.out.println("Tamanho da lista: " + pessoas.size());
        System.out.println("Primeira pessoa da lista: " + pessoas.get(0).getNome());
        System.out.println(pessoas.toString());
    }
}
