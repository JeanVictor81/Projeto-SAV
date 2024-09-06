package Atv2;

// Classe abstrata Cartao
abstract class Cartao {
    protected Conta conta;

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public abstract boolean sacar(double quantia);
}
