package br.com.alura.exc003.main;

import br.com.alura.exc003.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 01. Crie uma lista de números inteiros e utilize o metodo Collections.sort
        // para ordená-la em ordem crescente. Em seguida, imprima a lista ordenada.

        List<Integer> lista = new ArrayList<>();
        lista.add(1);
        lista.add(7);
        lista.add(4);

        System.out.println("Lista 01: ");
        System.out.println(lista);

        Collections.sort(lista);
        System.out.println("Lista 01 ordenada: ");
        System.out.println(lista);

        // 02. Crie uma classe Titulo com um atributo nome do tipo String. Implemente a
        // interface Comparable na classe para que seja possível ordenar uma lista de objetos Titulo.

        // 03. No Exercício 2, crie alguns objetos da classe Titulo e adicione-os a uma lista. Utilize
        // o metodo Collections.sort para ordenar a lista e, em seguida, imprima os títulos ordenados.

        Titulo titulo1 = new Titulo("Engenharia de Software");
        Titulo titulo2 = new Titulo("Algoritmos");
        Titulo titulo3 = new Titulo("Linguagem Java");

        List<Titulo> lista2 = new ArrayList();
        lista2.add(titulo1);
        lista2.add(titulo2);
        lista2.add(titulo3);

        System.out.println("Lista 02:");
        for(Titulo titulo : lista2) {
            System.out.println(titulo.getNome());
        }

        Collections.sort(lista2);

        System.out.println("Lista 02 ordenada: ");
        for(Titulo titulo : lista2) {
            System.out.println(titulo.getNome());
        }

        // 04. Crie uma lista utilizando a interface List e instancie-a tanto como ArrayList quanto como
        // LinkedList. Adicione elementos e imprima a lista, mostrando que é possível trocar facilmente
        // a implementação.

        List<Integer> lista03 = new ArrayList<Integer>();
        lista03.add(1);
        lista03.add(2);
        lista03.add(3);

        System.out.println("ArrayList:");
        System.out.println(lista03);

        List<Integer> lista04 = new ArrayList<Integer>();
        lista04.add(1);
        lista04.add(2);
        lista04.add(3);

        System.out.println("LinkedList:");
        System.out.println(lista04);

        // 05. Modifique o Exercício 4 para declarar a variável de lista como a interface List, demons-
        // trando o uso de polimorfismo.

        List<String> lista05;

        lista05 = new ArrayList<>();
        lista05.add("Elemento 1");
        lista05.add("Elemento 2");
        System.out.println("ArrayList: " + lista05);

        lista05 = new LinkedList<>();
        lista05.add("Elemento A");
        lista05.add("Elemento B");
        System.out.println("LinkedList: " + lista05);
    }
}
