package Atv2;

// Classe CartaoPrePago
class CartaoPrePago extends Cartao {
    @Override
    public boolean sacar(double quantia) {
        if (conta != null && conta instanceof ContaTemporaria) {
            return conta.sacar(quantia);
        }
        return false;
    }
}
