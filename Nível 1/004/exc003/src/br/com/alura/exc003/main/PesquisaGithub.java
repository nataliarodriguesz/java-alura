package br.com.alura.exc003.main;

import br.com.alura.exc003.excecao.ErroConsultaGitHubException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PesquisaGithub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um usuário para buscar: ");
        String usuario = scanner.nextLine();

        String endereco = "https://api.github.com/users/" + usuario;

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request =
                    HttpRequest.newBuilder()
                            .uri(URI.create(endereco))
                            .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no Github");
            }

            String json = response.body();
            System.out.println(json);
        } catch (IOException | InterruptedException e){
            System.out.println("Opss... Houve um erro durante a consulta à API do Github");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e){
            System.out.println(e.getMessage());
        }
    }
}
