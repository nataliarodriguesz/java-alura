package br.com.alura.exc004.modelos;

public class Titulo {
    private String titulo;
    private String autor;

    public Titulo(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}
