package POO;

public enum Produto {
    PIPOCA(50.0),
    REFRIGERANTE(10.5),
    CHOCOLATE(7.3),
    AGUA(4.0),
    CACHORROQUENTE(15.0);

    private double valor;

    Produto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
