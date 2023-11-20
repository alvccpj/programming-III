package Exercicios3;

public class Professor extends User implements Operacoes {
    private String curso;
    private String matricula;
    private Aluno turma[];

    public Professor() {
    }

    public Professor(String curso, String matricula, Aluno[] turma) {
        this.curso = curso;
        this.matricula = matricula;
        this.turma = new Aluno[10];
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

    public Aluno[] getTurma() {
        return turma;
    }

    public void setTurma(Aluno[] turma) {
        this.turma = turma;
    }

    @Override
    public void atividade() {
        System.out.println(getNome() + " está dando aula para: ");
        for (int i = 0; i < turma.length; i++) {
            System.out.println(turma[i].getNome() + " ");
        }
    }


    @Override
    public double media() {
        return 0;
    }

    @Override
    public void presenca() {

    }
}
