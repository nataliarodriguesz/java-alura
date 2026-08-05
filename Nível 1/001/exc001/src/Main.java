public class Main {
    public static void main(String[] args) {
        double celsius = 18;
        double fahrenheit = (celsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit.", celsius, fahrenheit);
        System.out.println(mensagem);


        int fahrenheitInteira = (int) ((celsius * 1.8) + 32);
        System.out.println("A temperatura em Fahrenheit inteira é: " + fahrenheitInteira);
    }
}