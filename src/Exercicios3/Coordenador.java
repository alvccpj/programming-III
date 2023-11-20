package Exercicios3;

public class Coordenador extends Professor{
    private String horarioDeAtendimento;

    public Coordenador () {

    }

    public Coordenador(String horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }

    public Coordenador(String curso, String matricula, Aluno[] turma, String horarioDeAtendimento) {
        super(curso, matricula, turma);
        this.horarioDeAtendimento = horarioDeAtendimento;
    }

    public String getHorarioDeAtendimento() {
        return horarioDeAtendimento;
    }

    public void setHorarioDeAtendimento(String horarioDeAtendimento) {
        this.horarioDeAtendimento = horarioDeAtendimento;
    }

    public boolean solicitacaoAluno () {

    }


}

