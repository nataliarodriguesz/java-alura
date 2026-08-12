package br.com.alura.exc003.modelos;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Miau! Miau!");
    }

    public void arranharMoveis() {
        System.out.println("Gato arranhando móveis");
    }
}
