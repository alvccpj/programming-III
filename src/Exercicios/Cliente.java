package Exercicios;

public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private boolean bomCliente = true;
    private Item carrinhoDeCompras[] = new Item[100];
    private int quantidadeItens = 0;

    public Cliente(String nome, int idade, String cpf, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isBomCliente() {
        return bomCliente;
    }

    public void setBomCliente(boolean bomCliente) {
        this.bomCliente = bomCliente;
    }

    public Item[] getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }

    public void setCarrinhoDeCompras(Item[] vetor) {
        this.carrinhoDeCompras = vetor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public void setQuantidadeItens(int quantidadeItens) {
        this.quantidadeItens = quantidadeItens;
    }

    public void adicionar(Item item) {
        if (quantidadeItens < 100) {
            carrinhoDeCompras[quantidadeItens] = item;
            quantidadeItens++;
        } else {
            System.out.println("Sem espaco no carrinho.");
        }

    }

    public void cancelar(int codigo) {
        boolean achou = false;
        int i;
        for (i = 0; i < quantidadeItens; i++) {
            if (carrinhoDeCompras[i].getCodigo() == codigo) {
                achou = true;
                carrinhoDeCompras[i] = null;
            }
        }

        if (achou) {
            for (int j = i; j < carrinhoDeCompras.length - 1; j++) {
                carrinhoDeCompras[j] = carrinhoDeCompras[j + 1];
            }
            System.out.println("Item cancelado da compra.");
        } else {
            System.out.println("Item não encontado.");
        }
    }

    public double comprar() {
        double total = 0.0;

        if (quantidadeItens > 0) {
            for (int i = 0; i < quantidadeItens; i++) {
                total += carrinhoDeCompras[i].getValor();
                carrinhoDeCompras[i].setQtdEmEstoque(carrinhoDeCompras[i].getQtdEmEstoque() - 1);
            }
            System.out.println("A média de gastos é de: " + total / quantidadeItens);
        } else {
            System.out.println("Carrinho vazio");
        }

        for (int i = 0; i < quantidadeItens; i++) {
            carrinhoDeCompras[i] = null;
        }

        return total;
    }
}
