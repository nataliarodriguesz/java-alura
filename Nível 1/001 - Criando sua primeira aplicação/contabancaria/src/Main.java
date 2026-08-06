import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int op;
        double valor;
        ContaBancaria c1 = new ContaBancaria("Jacqueline Oliveira", "Corrente", 2500);
        System.out.println(c1);

        String menu = """
                      Operações
                  
                      1- Consultar saldo
                      2- Receber valor
                      3- Transferir valor
                      4- Sair
                      
                      Digite a opção desejada: 
                      """;

        do{
            System.out.println(menu);
            op = scanner.nextInt();

            switch(op){
                case 1:
                    System.out.println("Saldo atual: R$" + c1.getSaldo() + "\n");
                    break;
                case 2:
                    System.out.println("Informe o valor a receber: R$");
                    valor = scanner.nextDouble();
                    c1.setSaldo(c1.getSaldo() + valor);
                    System.out.println("\nSaldo atualizado: R$" + c1.getSaldo() + "\n");
                    break;
                case 3:
                    System.out.println("Informe o valor que deseja transferir: R$");
                    valor = scanner.nextDouble();
                    if (c1.getSaldo() < valor) {
                        System.out.println("\nSaldo insuficiente\n");
                        break;
                    }
                    c1.setSaldo(c1.getSaldo() - valor);
                    System.out.println("\nSaldo atualizado: R$" + c1.getSaldo() + "\n");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\nOpção inválida!\n");
            }

        }while(op != 4);
    }
}