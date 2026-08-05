import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100);
        int numeroDigitado = 0;
        int tentativas = 0;

        System.out.println("*********      JOGO DE ADIVINHAÇÃO      *********\n");
        while(tentativas < 5){
            System.out.println("Digite um número entre 0 e 100: ");
            numeroDigitado = scanner.nextInt();
            tentativas++;

            if (numeroDigitado == numeroGerado){
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
                break;
            } else if(numeroDigitado < numeroGerado) {
                System.out.println("Errou :( O número que estou pensando é maior\n");
            } else {
                System.out.println("Errou :( O número que estou pensando é menor\n");
            }

            if(tentativas == 5 && numeroDigitado != numeroGerado){
                System.out.println("Você não consegiu acertar o número em 05 tentativas. O número era: " + numeroGerado);
            }
        }
    }
}