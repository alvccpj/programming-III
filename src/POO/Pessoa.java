package POO;

public class Pessoa {
    String nome;
    int idade;
    double altura;
    double peso;
    String etnia;
    String sexo;

    public Pessoa (String nome, int idade, double altura, double peso, String etnia, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.etnia = etnia;
        this.sexo = sexo;
    }

    public void apresentar () {
        System.out.println("Olá, meu nome é: " + this.nome + " e eu tenho " + this.idade + " anos.");
    }
}
