import java.util.Scanner;

public class exc001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero >= 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }
    }
}