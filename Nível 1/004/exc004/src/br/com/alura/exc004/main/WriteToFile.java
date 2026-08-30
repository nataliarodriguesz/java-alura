package br.com.alura.exc004.main;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    public static void main(String[] args) {
        String conteudo = "Conteúdo a ser gravado no arquivo.";

        try {
            FileWriter escrita = new FileWriter("arquivo.txt");
            escrita.write("Conteúdo a ser gravado no arquivo.");
            escrita.close();
            System.out.println("Arquivo gravado com sucesso!");
        } catch (IOException e) {
            System.out.println("Erro ao gravar arquivo!");
            e.printStackTrace();
        }
    }
}
