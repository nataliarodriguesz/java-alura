public class Main {
    public static void main(String[] args) {
        // 1. Crie uma classe Pessoa com um metodo que exibe 'Olá, mundo!' no console.
        Pessoa pessoa1 = new Pessoa();
        pessoa1.exibeMensagem();

        //2. Crie uma classe Calculadora com um metodo que recebe um número como parâmetro e retorna o dobro desse número.
        Calculadora calculadora = new Calculadora();
        System.out.println("O dobro de 4 é " + calculadora.dobro(4));

        //3. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para
        // exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        Musica musica = new Musica();
        musica.titulo = "Te vivo";
        musica.artista = "Luan Santana";
        musica.anoLancamento = 2012;

        musica.avaliarMusica(9);
        musica.avaliarMusica(8);
        musica.mediaAvaliacao();
        musica.exibirFichaTecnica();

        //4. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
        Carro carro = new Carro();
        carro.modelo = "Civic";
        carro.ano = 2012;
        carro.cor = "Cinza escuro";

        carro.exibirFichaTecnica();

        //5. Crie uma classe Aluno com atributos nome, idade, e um metodo para exibir informações. Crie uma instância da classe Aluno,
        // atribua valores aos seus atributos e utilize o metodo para exibir as informações.
        Aluno aluno = new Aluno();
        aluno.nome = "Natália";
        aluno.idade = 22;

        aluno.exibirInformacoes();
    }
}
