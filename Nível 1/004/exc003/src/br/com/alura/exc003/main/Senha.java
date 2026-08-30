package br.com.alura.exc003.main;

import br.com.alura.exc003.excecao.SenhaInvalidaException;
import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        String senha = scanner.next();

        try {
            validarSenha(senha);
            System.out.println("Senha válida. Acesso permitido!");
        } catch (SenhaInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new SenhaInvalidaException("A senha deve ter pelo menos 8 caracteres.");
        }
    }
}
