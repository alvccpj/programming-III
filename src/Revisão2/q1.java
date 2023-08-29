package Revisão2;

public class q1 {
    public static void main(String[] args) {
        int[][] matrizOriginal = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrizTransposta = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTransposta[i][j] = matrizOriginal[j][i];
            }
        }

        System.out.println("Matriz Original:");
        imprimirMatriz(matrizOriginal);

        System.out.println("Matriz Transposta:");
        imprimirMatriz(matrizTransposta);
    }

    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
