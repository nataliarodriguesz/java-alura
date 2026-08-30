package br.com.alura.desafio.main;

import br.com.alura.desafio.modelos.ConsultaCep;
import br.com.alura.desafio.modelos.Endereco;
import br.com.alura.desafio.modelos.GeradorDeArquivo;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsultaCep consultaCep = new ConsultaCep();
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um número de CEP: ");
        String cep = leitura.nextLine();

        try {
            Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorDeArquivo gerador =  new GeradorDeArquivo();
            gerador.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação");
        }
    }
}