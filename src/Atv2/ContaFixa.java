package Atv2;

// Classe ContaFixa
class ContaFixa extends Conta {
    public ContaFixa(double saldo) {
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
