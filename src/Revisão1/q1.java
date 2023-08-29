package Revisão1;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Informe um número para se ele é par ou ímpar: ");
        int num = in.nextInt();

        if (num % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }
    }
}