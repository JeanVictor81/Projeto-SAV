package Atv1;

public class JogoDeCartas {
    private final Baralho baralho;

    public JogoDeCartas() {
        baralho = new Baralho();
    }

    public void jogar() {
        Carta cartaComputador = baralho.retirarCarta();
        Carta cartaJogador = baralho.retirarCarta();

        if (cartaComputador == null || cartaJogador == null) {
            System.out.println("O baralho está vazio!");
            return;
        }

        System.out.println("Computador: " + cartaComputador);
        System.out.println("Jogador: " + cartaJogador);

        String resultado = compararCartas(cartaComputador, cartaJogador);
        System.out.println("RESULTADO: " + resultado);
    }

    private String compararCartas(Carta carta1, Carta carta2) {
        String[] ordemValores = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        int valor1 = obterValor(carta1.getValor(), ordemValores);
        int valor2 = obterValor(carta2.getValor(), ordemValores);

        if (valor1 > valor2) {
            return "GANHOU!";
        } else if (valor1 < valor2) {
            return "PERDEU!";
        } else {
            return "Empate";
        }
    }

    private int obterValor(String valor, String[] ordemValores) {
        for (int i = 0; i < ordemValores.length; i++) {
            if (ordemValores[i].equals(valor)) {
                return i;
            }
        }
        return -1;  // Caso improvável
    }

    public static void main(String[] args) {
        JogoDeCartas jogo = new JogoDeCartas();
        jogo.jogar();
    }
}
