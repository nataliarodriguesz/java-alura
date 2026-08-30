package br.com.alura.exc004.main;

import br.com.alura.exc004.modelos.Veiculo;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class VeiculoToJson {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("Civic", 2011);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(veiculo);
        System.out.println(json);
    }
}
