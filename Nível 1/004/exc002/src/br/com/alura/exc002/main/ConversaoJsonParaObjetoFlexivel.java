package br.com.alura.exc002.main;

import br.com.alura.exc002.modelos.Pessoa;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoJsonParaObjetoFlexivel {
    public static void main(String[] args) {
        String jsonPessoa = """ 
                        {
                            "nome" : "João",
                            "cidade" : "Maringá"
                        }
                            """;

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
