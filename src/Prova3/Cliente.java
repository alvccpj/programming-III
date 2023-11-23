package Prova3;

public abstract class Cliente implements Operacoes {
    private String nome;
    private int idade;
    private String conta;
    private String agencia;
    private double saldo;
    private Operacoes historico[];

    public Cliente() {
    }

    public Cliente(String nome, int idade, String conta, String agencia, double saldo, Operacoes[] historico) {
        this.nome = nome;
        this.idade = idade;
        this.conta = conta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.historico = new Operacoes[30];
    }

    public Cliente(String nome, int idade, String conta, String agencia, double saldo) {
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

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Operacoes[] getHistorico() {
        return historico;
    }

    public void setHistorico(Operacoes[] historico) {
        this.historico = historico;
    }

    @Override
    public void depositar(String data, String hora, double valor) {
        if (valor <= 0) {
            System.out.println("O valor do depósito deve ser maior que zero.");
            return;
        }

        this.saldo += valor;
        adicionarOperacao(new Operacao("Depósito", data, hora, valor));
        System.out.println("Depósito realizado com sucesso. Novo saldo: " + this.saldo);
    }

    @Override
    public void sacar(String data, String hora, double valor) {
        try {
            if (valor <= 0) {
                throw new Exception("O valor do saque deve ser maior que zero.");
            }

            if (valor > this.saldo) {
                throw new Exception("Saldo insuficiente para realizar o saque.");
            }

            this.saldo -= valor;
            adicionarOperacao(new Operacao("Saque", data, hora, valor));
            System.out.println("Saque realizado com sucesso. Novo saldo: " + this.saldo);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void extrato() {
        if (historico.length == 0) {
            System.out.println("Nenhuma operação realizada.");
        } else {
            System.out.println("Extrato das últimas 10 operações:");
            for (Operacoes operacao : historico) {
                if (operacao != null) {
                    System.out.println(operacao);
                }
            }
        }
    }

    private void adicionarOperacao(Operacoes operacao) {
        System.arraycopy(historico, 0, historico, 1, historico.length - 1);
        historico[0] = operacao;
    }
}
