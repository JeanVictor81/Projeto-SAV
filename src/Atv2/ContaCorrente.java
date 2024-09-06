package Atv2;

// Classe ContaCorrente
class ContaCorrente extends Conta {
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public boolean sacar(double quantia) {
        if (quantia <= saldo) {
            saldo -= quantia;
            return true;
        }
        return false;
    }
}
