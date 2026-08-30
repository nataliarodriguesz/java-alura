package br.com.alura.exc001.modelos;

public class Livro {
    private String titulo;
    private String autor;
    private String editora;

    public Livro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }
}
