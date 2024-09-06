package Atv2;

// Classe ContaTemporaria
class ContaTemporaria extends Conta {
    private boolean ativa;

    public ContaTemporaria(double saldo) {
        super(saldo);
        this.ativa = true;
    }

    @Override
    public boolean sacar(double quantia) {
        if (ativa && quantia <= saldo) {
            saldo -= quantia;
            if (saldo == 0) {
                ativa = false;
            }
            return true;
        }
        return false;
    }

    public boolean isAtiva() {
        return ativa;
    }
}
