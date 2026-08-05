import java.util.Scanner;

public class exc006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        int total = 1;

        for (int i = numero; i > 1; i--) {
            total *= i;
        }

        System.out.print("O fatorial de " + numero + " é  " + total);
    }
}
