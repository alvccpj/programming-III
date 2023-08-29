package Revisão2;

public class q4 {
    public static void main(String[] args) {
        int limiteInferior = 10;
        int limiteSuperior = 50;
        imprimirNumerosPrimosNoIntervalo(limiteInferior, limiteSuperior);
    }

    public static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void imprimirNumerosPrimosNoIntervalo(int limiteInferior, int limiteSuperior) {
        for (int i = limiteInferior; i <= limiteSuperior; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
