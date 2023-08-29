package Revisão1;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe o valo mínimo do intervalo: ");
        int min = in.nextInt();

        System.out.print("Informe o valo máximo do intervalo: ");
        int max = in.nextInt();

        int contador = 0;

        for (int i = min; i < max; i++) {
            if (i % 3 == 0) {
            contador++;
        }

        System.out.println("Existem " + contador + " números divisíveis por 3 no intervalo de " + min + " a " + max + ".");
    }
}}
