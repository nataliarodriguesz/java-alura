package br.com.alura.exc002.main;

import br.com.alura.exc002.modelos.Pessoa;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConversaoJsonParaObjeto {
    public static void main(String[] args) {
        String jsonPessoa = """ 
                        {
                            "nome" : "João",
                            "idade" : 30, 
                            "cidade" : "Maringá"
                        }
                            """;

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();

        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);
        System.out.println(pessoa);
    }
}
