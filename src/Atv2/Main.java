package Atv2;

// Exemplo de execução
public class Main {
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(100);
        CartaoCredito t1 = new CartaoCredito(500);
        t1.setConta(c1);
        t1.sacar(50);
        System.out.printf("t1.sacar(50); -> c1.saldo = %.0f%n", c1.getSaldo());

        ContaCorrente c2 = new ContaCorrente(500);
        CartaoCredito t2 = new CartaoCredito(500);
        t2.setConta(c2);
        t2.sacar(50);
        System.out.printf("t2.sacar(50); -> t2.saldo = %.0f%n", c2.getSaldo());

        ContaTemporaria tempAcc = new ContaTemporaria(100);
        CartaoPrePago t3 = new CartaoPrePago();
        t3.setConta(tempAcc);
        t3.sacar(100);
        System.out.printf("t3.sacar(100) -> t3.saldo = %.0f, c3.disabled%n", tempAcc.getSaldo());
    }
}
