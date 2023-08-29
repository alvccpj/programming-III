package POO;

public class Main {
    public static void main(String[] args) {
        Produto lista;
        lista = Produto.PIPOCA;

        System.out.println("O produto selecionado foi: " + lista + " custando um total de: " + lista.getValor());
    }
}
