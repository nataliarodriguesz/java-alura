package br.com.alura.exc004.main;

import br.com.alura.exc004.modelos.Titulo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TituloToJson {
    public static void main(String[] args) {
        Titulo titulo = new Titulo("Curso JAVA", "Jaque");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);
        System.out.println(json);
    }
}
