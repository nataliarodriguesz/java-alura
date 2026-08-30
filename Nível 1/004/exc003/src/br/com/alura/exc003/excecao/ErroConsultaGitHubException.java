package br.com.alura.exc003.excecao;

public class ErroConsultaGitHubException extends RuntimeException{
    public ErroConsultaGitHubException(String mensagem){
        super(mensagem);
    }
}
