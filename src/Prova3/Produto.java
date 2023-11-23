package Prova3;

public abstract class Produto {
    private double valor;
    private String data;
    private String hora;

    public Produto() {
    }

    public Produto(double valor, String data, String hora) {
        this.valor = valor;
        this.data = data;
        this.hora = hora;
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
