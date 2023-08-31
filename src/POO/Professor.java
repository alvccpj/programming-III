package POO;

public class Professor {
    private String nome;
    private int idade;
    private int matricula;
    private Sala sala;

    public Professor(String nome, int idade, int matricula, Sala sala) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.sala = sala;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void iniciarAula () {
        if (sala.isOcupada() == false) {
            System.out.println("A aula está acontecendo com o " +getNome() + " de matrícula: " +getMatricula());
        } else {
            sala.alternar();
        }
    }

    public void chamada (boolean[] chamadaDoDia) {
        for (int i = 0; i < chamadaDoDia.length; i++) {
            boolean[] presencaAux = sala.getTurma()[i].getPresença();
            presencaAux[sala.getDiaDeAula()] = chamadaDoDia[i];
            sala.getTurma()[i].setPresença(presencaAux);
        }
    }

    public void terminarAula () {
        if (sala.isOcupada() == false) {
            System.out.println("Não existe aula");
        } else {
            System.out.println("Mensagem de finalização " +getNome() +getMatricula());
        }
    }
}
