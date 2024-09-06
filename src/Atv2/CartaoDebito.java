package Atv2;

// Classe CartaoDebito
class CartaoDebito extends Cartao {
    @Override
    public boolean sacar(double quantia) {
        if (conta != null) {
            return conta.sacar(quantia);
        }
        return false;
    }
}
