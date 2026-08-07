public class Main {
    public static void main(String[] args) {

        // MEDIA
        double nota1 = 4.5;
        double nota2 = 7.5;
        double media = (nota1 + nota2) / 2;

        String mensagem = """
                          Nota 1: %.2f
                          Nota 2: %.2f
                          Média:  %.2f
                          """.formatted(nota1, nota2, media);
        System.out.println(mensagem);

        // CASTING
        double x = 10.7;
        int y = (int) x;

        System.out.println("A parte inteira de " + x + " é " + y + "\n");

        // PALAVRAS
        char letra = 'P';
        String palavra = "alavra";

        String frase = letra + palavra;
        System.out.println(frase + "\n");

        // PRODUTO
        double precoProduto = 25;
        int quantidade = 7;
        System.out.println("Valor total: R$" + quantidade * precoProduto + "\n");

        // CONVERSÃO DE DÓLARES PARA REAIS
        double cotacao = 4.94;
        double valorEmDolares = 76;
        double valorEmReais = valorEmDolares * cotacao;

        System.out.println(String.format("O valor de %.2f dólares é igual a R$%.2f\n", valorEmDolares, valorEmReais));

        // CALCULA DESCONTO
        double precoOriginal = 438;
        double percentualDesconto = 10;
        double valorDesconto = (precoOriginal / 100) * percentualDesconto;
        double novoPreco = precoOriginal - valorDesconto;

        mensagem = """
                   Preço original: R$%.2f
                   Desconto:       R$%.2f
                   Preço final:    R$%.2f \n
                   """.formatted(precoOriginal, valorDesconto, novoPreco);
        System.out.println(mensagem);
    }
}