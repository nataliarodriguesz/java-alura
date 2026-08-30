package br.com.alura.exc001.main;

import br.com.alura.exc001.modelos.Livro;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaCotacaoCripto {
    public static void main(String[] args) throws IOException, InterruptedException {

        // 02. Crie um programa Java que utiliza as classes HttpClient, HttpRequest e HttpResponse para
        // fazer uma consulta à API CoinGecko e exiba a cotação atual de uma criptomoeda escolhida pelo
        // usuário.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a criptomoeda para busca: ");
        String criptomoeda = scanner.nextLine();

        String chave = "AIzaSyDTvCbCk6mSqchuw7ZVZds4YZ2G3Esj7OI";
        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + criptomoeda + "&vs_currencies=usd" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

    }
}
