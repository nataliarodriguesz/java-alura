package br.com.alura.exc001.main;

import br.com.alura.exc001.modelos.Livro;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaLivroGoogleBooks {
    public static void main(String[] args) throws IOException, InterruptedException {

        // 01. Crie um programa em Java que utilize as classes HttpClient, HttpRequest e HttpResponse para
        // fazer uma consulta à API do Google Books. Solicite ao usuário que insira o título de um livro, e
        // exiba as informações disponíveis sobre o livro retornado pela API.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do livro: ");
        Livro livro = new Livro(scanner.nextLine());

        String chave = "AIzaSyDTvCbCk6mSqchuw7ZVZds4YZ2G3Esj7OI";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=intitle:" + livro.getTitulo() + "&key=" + chave;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
