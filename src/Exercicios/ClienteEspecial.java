package Exercicios;

public class ClienteEspecial extends Cliente{
    private int pontos;
    private double saldoDeCompras;

    public ClienteEspecial(String nome, int idade, String cpf, String endereco, boolean bomCliente, Item[] vetor, int pontos, double saldoDeCompras) {
        super(nome, idade, cpf, endereco, bomCliente, vetor);
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

    public void compra () {

    }
}
