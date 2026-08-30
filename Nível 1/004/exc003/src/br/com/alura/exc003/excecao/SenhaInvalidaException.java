package br.com.alura.exc003.excecao;

public class SenhaInvalidaException extends RuntimeException{
    public SenhaInvalidaException(String mensagem) {
        super(mensagem);
    }
}
