package br.com.alura.exc002.main;

import br.com.alura.exc002.modelos.Livro;
import com.google.gson.Gson;

public class ConversaoJsonAninhadoParaObjeto {
    public static void main(String[] args) {
        String jsonLivro = """
                            {
                                "titulo" : "Aventuras do JAVA",
                                "autor" : "Akemi",
                                "editora" : {"nome" : "TechBooks", "cidade" : "São Paulo"}
                            }
                           """;

        Gson gson = new Gson();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println("Objeto Livro: " + livro);
    }
}
