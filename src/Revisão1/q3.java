package Revisão1;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = in.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = in.nextDouble();

        System.out.print("Digite o terceiro número: ");
        double numero3 = in.nextDouble();

        double[] numeros = {numero1, numero2, numero3};

        // Usando o algoritmo de ordenação de bolha
        for (int i = 0; i < numeros.length - 1; i++) {
            for (int j = 0; j < numeros.length - i - 1; j++) {
                if (numeros[j] > numeros[j + 1]) {
                    // Troca os números
                    double temp = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = temp;
                }
            }
        }

        System.out.println("Os números ordenados do menor para o maior são: " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
    }
}
