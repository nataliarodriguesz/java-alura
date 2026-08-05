import java.util.Scanner;

public class exc003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        String menu = """
                     ******      MENU      ******
                     1 - Calcular área do quadrado
                     2 - Calcular área do círculo
                     -----------------------------
                     """;

        // Imprime o menu enquanto não for digitado opções válidas
        do{
            System.out.println(menu);
            opcao = scanner.nextInt();
        } while(opcao < 1 || opcao > 2);

        // Escolhe com base na opção selecionada
        switch (opcao) {
            case 1:
                System.out.println("Digite a largura do quadrado: ");
                double largura = scanner.nextDouble();
                System.out.println("A área do quadrado é igual a " + Math.pow(largura, 2));
                break;
            case 2:
                System.out.println("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                System.out.println("A área do círculo é igual a " + Math.pow(raio, 2) * 3.14);
                break;
        }
    }
}
