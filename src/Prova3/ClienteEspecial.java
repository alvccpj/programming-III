package Prova3;

public class ClienteEspecial extends Cliente {
    private Investimento investimento;

    public ClienteEspecial(String nome, int idade, String conta, String agencia, double saldo) {
        super(nome, idade, conta, agencia, saldo);
        this.investimento = null;
    }

    @Override
    public void extrato() {
        System.out.println("Extrato das últimas 30 operações:");
        for (Operacoes operacao : getHistorico()) {
            if (operacao != null) {
                System.out.println(operacao);
            }
        }

        calcularMediaDeposito();
        calcularMediaSaque();
    }

    public void investimento(String dataInvestimento, String horaInvestimento, double valorInvestido, double percentual) {
        try {
            if (valorInvestido <= 0 || percentual <= 0) {
                throw new Exception("O valor investido e o percentual devem ser maiores que zero.");
            }

            if (getSaldo() < valorInvestido) {
                throw new Exception("Saldo insuficiente para realizar o investimento.");
            }

            setSaldo(getSaldo() - valorInvestido);

            Investimento investimento = new Investimento("Investimento", dataInvestimento, horaInvestimento, valorInvestido, percentual);
            adicionarOperacao(investimento);

            this.investimento = investimento;

            System.out.println("Investimento realizado com sucesso.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void adicionarOperacao(Investimento investimento) {
    }

    public void resgate(String dataResgate, String horaResgate) {
        try {
            if (investimento == null) {
                throw new Exception("Nenhum investimento realizado.");
            }

            if (!dataResgate.equals(investimento.getDataInvestimento())) {
                throw new Exception("Data de resgate diferente da data de investimento.");
            }

            Resgate resgate = new Resgate("Resgate", dataResgate, horaResgate, investimento.getValorInvestido());
            adicionarOperacao(resgate);

            this.investimento = null;

            System.out.println("Resgate realizado com sucesso.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private void calcularMediaDeposito() {
        double totalDepositos = 0;
        int countDepositos = 0;

        for (Operacoes operacao : getHistorico()) {
            if (operacao instanceof Deposito) {
                totalDepositos += ((Deposito) operacao).getValorDepositado();
                countDepositos++;
            }
        }

        if (countDepositos > 0) {
            double mediaDeposito = totalDepositos / countDepositos;
            System.out.println("Média de depósito: " + mediaDeposito);
        }
    }

    private void calcularMediaSaque() {
        double totalSaques = 0;
        int countSaques = 0;

        for (Operacoes operacao : getHistorico()) {
            if (operacao instanceof Saque) {
                totalSaques += ((Saque) operacao).getValorSacado();
                countSaques++;
            }
        }

        if (countSaques > 0) {
            double mediaSaque = totalSaques / countSaques;
            System.out.println("Média de saque: " + mediaSaque);
        }
    }
}