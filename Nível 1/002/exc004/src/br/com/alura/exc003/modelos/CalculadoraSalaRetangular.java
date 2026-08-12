package br.com.alura.exc003.modelos;

public class CalculadoraSalaRetangular implements CalculoGeometrico {
    private double altura;
    private double largura;

    @Override
    public void calcularArea(double altura, double largura) {
        double area = altura * largura;
        System.out.println("A área da sala retangular é: " + area);
    }

    @Override
    public void calcularPerimetro(double altura, double largura) {
        double perimetro = 2 * (altura + largura);
        System.out.println("O perímetro da sala retangular é: " + perimetro);
    }
}
