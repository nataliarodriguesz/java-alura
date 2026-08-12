import br.com.alura.exc002.modelos.*;

public class Main {
    public static void main(String[] args) {
        // 01. Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado)
        // e titular (publico). Implemente métodos getters e setters para os atributos privados.

        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(123);
        conta.setNumeroConta(1000);
        conta.titular = "João";

        System.out.println("Número da Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: R$" + conta.getSaldo());
        System.out.println("Titular: " + conta.titular);

        conta.setSaldo(1500);
        System.out.println("Novo saldo: " + conta.getSaldo());

        // 02. Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e
        // setters para acessar e modificar esses atributos. Adicione um metodo verificarIdade que imprime se
        // a pessoa é maior de idade ou não.

        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Carowl");
        pessoa1.setIdade(22);

        IdadePessoa pessoa2 = new IdadePessoa();
        pessoa2.setNome("Camila");
        pessoa2.setIdade(20);

        System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
        pessoa1.verificarIdade();

        System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
        pessoa2.verificarIdade();

        // 03. Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters
        // e setters para acessar e modificar esses atributos. Adicione um metodo aplicarDesconto que recebe
        // um valor percentual e reduz o preço do produto.

        Produto produto = new Produto("Celular", 2000);

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());

        produto.aplicarDesconto(10);
        System.out.println("Novo Preço após Desconto: " + produto.getPreco());

        // 04. Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e
        // setters para acessar e modificar esses atributos. Adicione um metodo calcularMedia que retorna a
        // média das notas do aluno.

        Aluno aluno1 = new Aluno("Lulu", 7.5, 8.0, 9.2);
        Aluno aluno2 = new Aluno("Karina", 6.8, 7.3, 8.5);

        System.out.println("Aluno 1:");
        System.out.println("Nome: " + aluno1.getNome());
        System.out.println("Nota 1: " + aluno1.getNota1());
        System.out.println("Nota 2: " + aluno1.getNota2());
        System.out.println("Nota 3: " + aluno1.getNota3());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println();

        System.out.println("Aluno 2:");
        System.out.println("Nome: " + aluno2.getNome());
        System.out.println("Nota 1: " + aluno2.getNota1());
        System.out.println("Nota 2: " + aluno2.getNota2());
        System.out.println("Nota 3: " + aluno2.getNota3());
        System.out.println("Média: " + aluno2.calcularMedia());

        // 05. Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters
        // e setters para acessar e modificar esses atributos. Adicione um metodo exibirDetalhes que imprime
        //  o título e o autor do livro.

        Livro livro1 = new Livro();
        livro1.setTitulo("Lógica de Programação");
        livro1.setAutor("Paulo Silveira");

        Livro livro2 = new Livro();
        livro2.setTitulo("A lógica do jogo");
        livro2.setAutor("Marcus Becker");

        livro1.exibirDetalhes();
        livro2.exibirDetalhes();
    }
}
