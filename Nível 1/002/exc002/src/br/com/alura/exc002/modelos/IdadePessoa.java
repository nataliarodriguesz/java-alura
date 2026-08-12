package br.com.alura.exc002.modelos;

public class IdadePessoa {
    private String nome;
    private int idade;

    public void verificarIdade(){
        if(idade >= 18){
            System.out.println("Pessoa maior de idade");
        } else {
            System.out.println("Pessoa menor de idade");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}

