package Exercicios;

public class ClienteEspecial extends Cliente{
    private int pontos;
    private double saldoDeCompras;

    public ClienteEspecial(String nome, int idade, String cpf, String endereco, int pontos, double saldoDeCompras) {
        super(nome, idade, cpf, endereco);
        this.pontos = pontos;
        this.saldoDeCompras = saldoDeCompras;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public double getSaldoDeCompras() {
        return saldoDeCompras;
    }

    public void setSaldoDeCompras(double saldoDeCompras) {
        this.saldoDeCompras = saldoDeCompras;
    }


    public double comprar() {
        double total = 0.0;

        if (getQuantidadeItens() > 0) {
            for (int i = 0; i < getQuantidadeItens(); i++) {
                total += getCarrinhoDeCompras()[i].getValor();
                getCarrinhoDeCompras()[i].setQtdEmEstoque(getCarrinhoDeCompras()[i].getQtdEmEstoque() - 1);
            }
            System.out.println("A média de gastos é de: " + total / getQuantidadeItens());
        } else {
            System.out.println("Carrinho vazio");
        }

        for (int i = 0; i < getQuantidadeItens(); i++) {
            getCarrinhoDeCompras()[i] = null;
        }

        return total;
    }
}
