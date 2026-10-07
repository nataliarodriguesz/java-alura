package br.com.alura.exc001;

import br.com.alura.exc001.model.Contagem;
import br.com.alura.exc001.model.Tarefa;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.util.Scanner;

@SpringBootApplication
public class Exc001Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Exc001Application.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        // 1. Crie um novo projeto com Spring Boot, usando o site start.spring.io. Esse projeto será
        // o contador, e funcionará na linha de comando. Você deve pedir para um usuário digitar um
        // número e depois imprimir na tela uma contagem de 1 até o número digitado pelo usuário.

        Scanner scanner = new Scanner(System.in);
        Contagem contagem = new Contagem();

        System.out.println("Digite um número para contagem: ");
        int n = scanner.nextInt();
        contagem.contar(n);

        // 4. Lembre-se: serializar um objeto é conseguir representá-lo de alguma forma em um arquivo.
        // Aqui, você deve instanciar um objeto do tipo Tarefa e fazer com que o conteúdo do objeto vá
        // para o arquivo tarefa.json. Para isso, utilize o Jackson para te auxiliar na tarefa.
        // Observação: para criar novos arquivos, podemos utilizar new File("tarefa.json").

        Tarefa tarefa = new Tarefa("Assistir aula 1", false, "João");
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.writeValue(new File("tarefa.json"), tarefa);
        System.out.println("Dados salvos no arquivo tarefa.json!");

        // 5. Agora, você fará o oposto da atividade anterior: a desserialização de um arquivo, que
        // é ler os valores de um arquivo específico e transformar em um objeto. Leia o conteúdo do
        // arquivo tarefa.json, produzido no exercício anterior, e o transforme em um objeto do tipo
        // Tarefa. Exiba o conteúdo do objeto na tela.

        Tarefa tarefaLida = objectMapper.readValue(new File("tarefa.json"), Tarefa.class);
        System.out.println("Tarefa lida do JSON: " + tarefaLida);
    }
}
