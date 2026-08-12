import br.com.alura.exc003.modelos.*;

public class Main {
    public static void main(String[] args) {
        // 01.
        ConversorMoeda conversor =  new ConversorMoeda();
        conversor.converterDolarParaReal(50);

        // 02.
        CalculadoraSalaRetangular calculadora =  new CalculadoraSalaRetangular();
        calculadora.calcularArea(5, 8);
        calculadora.calcularPerimetro(5,8);

        // 03.
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao();
        tabuada.mostrarTabuada(5);

        // 04.
        ConversorTemperaturaPadrao conversorTemperatura = new ConversorTemperaturaPadrao();
        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = conversorTemperatura.celsiusParaFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " Celsius é igual a " + temperaturaFahrenheit + " Fahrenheit");

        temperaturaFahrenheit = 77;
        temperaturaCelsius = conversorTemperatura.fahrenheitParaCelsius(temperaturaFahrenheit);
        System.out.println(temperaturaFahrenheit + " Fahrenheit é igual a " + temperaturaCelsius + " Celsius");

        // 05.
        Livro livro = new Livro();
        livro.setPreco(10);
        System.out.println("Preço final do livro: R$ " + livro.calcularPrecoFinal());

        ProdutoFisico produtoFisico = new ProdutoFisico();
        produtoFisico.setPreco(10);
        System.out.println("Preço final do produto físico: R$ " + produtoFisico.calcularPrecoFinal());
    }
}
