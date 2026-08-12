package br.com.alura.exc003.modelos;

public class Cachorro extends Animal {
    @Override
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando rabo");
    }
}
