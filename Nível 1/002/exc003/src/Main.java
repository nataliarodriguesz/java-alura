import br.com.alura.exc003.modelos.*;

public class Main {
    public static void main(String[] args) {
        // 01. Crie uma classe Carro com métodos para representar um modelo específico ao longo
        // de três anos. Implemente métodos para definir o nome do modelo, os preços médios para
        // cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro
        // para criar instâncias específicas, utilizando-a na classe principal para definir preços e
        // mostrar informações.

        ModeloCarro carro1 = new ModeloCarro();
        carro1.definirModelo("Sedan");
        carro1.definirPrecos(30000, 32000, 35000);
        carro1.exibirInfo();

        // 02. Crie uma classe Animal com um metodo emitirSom(). Em seguida, crie duas subclasses:
        //  Cachorro e Gato, que herdam da classe Animal. Adicione o metodo emitirSom() nas subclasses,
        //   utilizando a anotação @Override para indicar que estão sobrescrevendo o metodo. Além disso,
        //    adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e
        //    arranharMoveis() para o Gato.

        Cachorro cachorro1 = new Cachorro();
        cachorro1.emitirSom();
        cachorro1.abanarRabo();

        Gato gato1 = new Gato();
        gato1.emitirSom();
        gato1.arranharMoveis();

        // 03. Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(),
        // sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe
        // ContaBancaria. Adicione um metodo específico para a subclasse, como cobrarTarifaMensal(), que
        //  desconta uma tarifa mensal da conta corrente.

        ContaBancaria conta = new ContaBancaria();
        conta.depositar(1000);
        conta.consultarSaldo();

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(200);
        contaCorrente.cobrarTarifaMensal();
        contaCorrente.consultarSaldo();
        contaCorrente.sacar(150);
        contaCorrente.consultarSaldo();

        // 04. Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em
        // seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos.
        // Adicione um metodo específico para cada uma das subclasses, como verificarSeEhPrimo() para o
        //  VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.
        
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);

    }
}
