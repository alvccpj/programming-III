package Exercicios3;

public class Coordenador extends Professor {
    private String horarioDeAtendimento;

    public Coordenador() {

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

    public void solicitarAluno(Aluno aluno) {
        if (aluno.isStatus()) {
            aluno.setStatus(false); // Setar como inativo
        } else {
            aluno.setStatus(true);  // Setar como ativo
        }
    }

    public void removerAlunoDaTurma(Aluno aluno, Professor professor) {
        boolean alunoRemovido = false;

        for (int i = 0; i < professor.getTurma().length; i++) {
            if (professor.getTurma()[i] == aluno) {
                professor.getTurma()[i] = null;
                alunoRemovido = true;
                break;
            }
        }

        if (!alunoRemovido) {
            throw new UnsupportedOperationException("Aluno não está presente na turma do professor.");
        }
    }


}

