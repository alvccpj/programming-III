package Prova3;

import Exercicios3.Professor;

public class Investimento extends Produto {
    private String dataInvestimento;
    private double valorInvestido;

    public Investimento() {
    }

    public Investimento(double valor, String data, String hora) {
        super(valor, data, hora);
    }

    public Investimento(String investimento, String dataInvestimento, String horaInvestimento, double valorInvestido, double percentual) {
    }


    public String getDataInvestimento() {
        return dataInvestimento;
    }

    public void setDataInvestimento(String dataInvestimento) {
        this.dataInvestimento = dataInvestimento;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }
}

