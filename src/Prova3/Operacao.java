package Prova3;

public class Operacao {
    private String tipoDaOperacao;
    private double valor;
    private String data;

    private String hora;

    public Operacao() {
    }

    public Operacao(String tipoDaOperacao, double valor, String data, String hora) {
        this.tipoDaOperacao = tipoDaOperacao;
        this.valor = valor;
        this.data = data;
        this.hora = hora;
    }

    public String getTipoDaOperacao() {
        return tipoDaOperacao;
    }

    public void setTipoDaOperacao(String tipoDaOperacao) {
        this.tipoDaOperacao = tipoDaOperacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
