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
        int contadorFaltas = 0;

        for (int i = 0; i < presencas.length; i++) {
            if (!presencas[i]) {
                contadorFaltas++;
            }
        }
        if (contadorFaltas > 16) {
            System.out.println("Reprovado por falta");
            return -1;
        } else if (notas.length < 3) {
            throw new UnsupportedOperationException("Aluno não tem notas suficientes");
        } else {
            double somaNotas = 0;

            for (int i = 0; i < notas.length; i++) {
                somaNotas += notas[i];
            }

            double media = somaNotas / notas.length;

            System.out.println("Média: " + media);

            if (media >= 7) {
                System.out.println("Aprovado por média");
            } else if (media >= 5) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }

            return media;
        }


    }

    @Override
    public void presenca() {
        int faltas = 0;
        int presencas = 0;

        for (int i = 0; i < this.presencas.length; i++) {
            if (this.presencas[i]) {
                presencas++;
            } else {
                faltas++;
            }
        }

        System.out.println("Faltas: " + faltas);
        System.out.println("Presenças: " + presencas);

    }

}
