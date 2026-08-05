import java.util.Scanner;

public class exc002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o 1º número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o 2º número: ");
        int numero2 = scanner.nextInt();

        if(numero1 == numero2) {
            System.out.println("Os número são iguais.");
        } else if (numero1 < numero2) {
            System.out.println("O primeiro número é menor que o segundo número");
        } else {
            System.out.println("O primeiro número é maior que o segundo número");
        }
    }
}
