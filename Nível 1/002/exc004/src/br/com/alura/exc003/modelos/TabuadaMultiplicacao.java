package br.com.alura.exc003.modelos;

public class TabuadaMultiplicacao implements MostrarTabuada {

    @Override
    public void mostrarTabuada(int numero) {
        for (int i = 0; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
