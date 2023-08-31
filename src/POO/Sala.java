package POO;

public class Sala {
    private String nome;
    private boolean ocupada;
    private Aluno[] turma = new Aluno[10];
    private int diaDeAula = 0;

    public Sala(String nome, boolean ocupada, Aluno[] turma, int diDeAula) {
        this.nome = nome;
        this.ocupada = ocupada;
        this.turma = turma;
        this.diaDeAula = diDeAula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public Aluno[] getTurma() {
        return turma;
    }

    public void setTurma(Aluno[] turma) {
        this.turma = turma;
    }

    public int getDiaDeAula() {
        return diaDeAula;
    }

    public void setDiaDeAula(int diaDeAula) {
        this.diaDeAula = diaDeAula;
    }

    public void alternar () {
        if (ocupada == false) {
            setOcupada(true);
        } else {
            setOcupada(true);
        }
    }
}
