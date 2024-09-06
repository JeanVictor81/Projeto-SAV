package Atv2;

// Classe CartaoCredito
class CartaoCredito extends Cartao {
    private double limiteAprovado;

    public CartaoCredito(double limiteAprovado) {
        this.limiteAprovado = limiteAprovado;
    }

    @Override
    public boolean sacar(double quantia) {
        if (conta != null && quantia <= limiteAprovado) {
            return conta.sacar(quantia);
        }
        return false;
    }
}
