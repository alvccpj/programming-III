package Exercicios3;

import java.util.Random;

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
        double somaNotas = 0;

        for (int i = 0; i < turma.length; i++) {
            double[] notas = turma[i].getNotas();
            for (int j = 0; j < notas.length; j++) {
                if (notas[j] == 0.0) {
                    throw new UnsupportedOperationException("A turma ainda não foi finalizada. Aluno: " + turma[i].getNome());
                }
                somaNotas += notas[j];
            }
        }

        return somaNotas / (turma.length * turma[0].getNotas().length);
    }

    @Override
    public void presenca() {
        Random random = new Random();

        for (int i = 0; i < turma.length; i++) {
            double numeroAleatorio = random.nextDouble();
            if (numeroAleatorio >= 0.8) {
                turma[i].getPresencas()[0] = false;
            } else {
                turma[i].getPresencas()[0] = true;
            }
        }
    }
}
