import java.util.Scanner;

public class exc004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero =  scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + numero + " = " + (numero * i));
        }
    }
}
