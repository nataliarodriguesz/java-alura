import java.time.LocalDate;

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica(){
        System.out.println("Modelo: "+ modelo);
        System.out.println("Ano: "+ ano);
        System.out.println("Cor: "+ cor);
        System.out.println("Idade: " + (LocalDate.now().getYear() - ano));
    }
}
