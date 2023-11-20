package Exercicios3;

public class Aluno extends User implements Operacoes {
    private String curso;
    private String matricula;
    private double notas[];
    private boolean presencas[];
    private boolean status;

    public Aluno() {
    }

    public Aluno(String curso, String matricula, double[] notas, boolean[] presencas, boolean status) {
        this.curso = curso;
        this.matricula = matricula;
        this.notas = new double[3];
        this.presencas = new boolean[20];
        this.status = status;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public boolean[] getPresencas() {
        return presencas;
    }

    public void setPresencas(boolean[] presencas) {
        this.presencas = presencas;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void atividade() {
        System.out.println(getNome() + " está vendo aula");
    }

    @Override
    public double media() {
        return 0;
    }

    @Override
    public void presenca() {

    }
}
