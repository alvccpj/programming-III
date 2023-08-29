package Revisão2;

public class q2 {
    public static void main(String[] args) {
        int[] vetor = {5, 2, 9, 1, 7, 3, 6};

        encontrarEMostrarMenorValor(vetor);
    }

    public static void encontrarEMostrarMenorValor(int[] vetor) {
        if (vetor.length == 0) {
            System.out.println("O vetor está vazio.");
            return;
        }

        int menor = vetor[0]; 

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("O menor valor no vetor é: " + menor);
    }
}
