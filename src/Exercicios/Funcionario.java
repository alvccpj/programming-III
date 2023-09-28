package Exercicios;

public class Funcionario {
    private String setor;
    private int id;
    private double salario;

    public Funcionario(String setor, int id, double salario) {
        this.setor = setor;
        this.id = id;
        this.salario = salario;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void renovarEstoque () {

    }

    public void bloquearItem (Item item) {

    }
}
