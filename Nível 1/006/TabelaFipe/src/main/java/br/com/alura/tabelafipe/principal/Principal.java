package br.com.alura.tabelafipe.principal;

import br.com.alura.tabelafipe.model.Dados;
import br.com.alura.tabelafipe.model.Modelos;
import br.com.alura.tabelafipe.model.Veiculo;
import br.com.alura.tabelafipe.service.ConsumoApi;
import br.com.alura.tabelafipe.service.ConverteDados;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Principal {
    Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private ConverteDados conversor = new ConverteDados();

    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1/";

    public void exibeMenu() {
        String menu = """
                      -----------------   OPÇÕES   ----------------
                      1 - Carro
                      2 - Moto
                      3 - Caminhão
                      ---------------------------------------------
                      Digite uma opção: """;

        int op = 0;
        do{
            System.out.println(menu);
            op =  leitura.nextInt();

            if (op < 1 || op > 3){
                System.out.println("Opção Inválida! O número deve estar entre 1 e 3\n");
            }
        } while(op < 1 || op > 3);

        String endereco, automovel;

        if (op == 1) {
            automovel = "carros";
        } else if (op == 2) {
            automovel = "motos";
        } else {
            automovel = "caminhoes";
        }

        endereco = URL_BASE + automovel + "/marcas";

        var json = consumo.obterDados(endereco);
        var marcas = conversor.obterLista(json, Dados.class);

        System.out.println("-----------------   MARCAS   ----------------");
        marcas.stream()
              .sorted(Comparator.comparing(d -> Integer.parseInt(d.codigo())))
              .forEach(System.out::println);
        System.out.println("---------------------------------------------");

        System.out.println("Digite o código da marca que deseja buscar: ");
        int marca = leitura.nextInt();
        leitura.nextLine();
        endereco += "/" + marca + "/modelos";

        json = consumo.obterDados(endereco);
        var modeloLista = conversor.obterDados(json, Modelos.class);

        System.out.println("----------------   MODELOS   ----------------");
        modeloLista.modelos().stream()
                             .sorted(Comparator.comparing(d -> Integer.parseInt(d.codigo())))
                             .forEach(System.out::println);
        System.out.println("---------------------------------------------");

        System.out.println("Digite um trecho do nome do carro para busca: ");
        var nomeVeiculo = leitura.nextLine();

        System.out.println("------------   MODELOS FILTRADOS -------------");
        List<Dados> modelosFiltrados = modeloLista.modelos().stream()
                                                            .filter(m -> m.nome().toLowerCase().contains(nomeVeiculo.toLowerCase()))
                                                            .collect(Collectors.toList());
        modelosFiltrados.forEach(System.out::println);
        System.out.println("----------------------------------------------");

        System.out.println("Digite o código do modelo: ");
        int modeloCodigo = leitura.nextInt();
        leitura.nextLine();
        endereco += "/" + modeloCodigo + "/anos";

        json =  consumo.obterDados(endereco);
        List<Dados> anos = conversor.obterLista(json, Dados.class);

        List<Veiculo> veiculos = new ArrayList<>();

        for (int i = 0; i < anos.size(); i++) {
            var enderecoAnos = endereco + "/" + anos.get(i).codigo();
            json = consumo.obterDados(enderecoAnos);

            Veiculo veiculo = conversor.obterDados(json, Veiculo.class);
            veiculos.add(veiculo);
        }

        System.out.println("------------   VEICULOS FILTRADOS ------------");
        veiculos.forEach(System.out::println);
    }
}
