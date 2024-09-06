package Atv1;

class Carta {
    private final Naipe naipe;
    private final String valor;

    public Carta(Naipe naipe, String valor) {
        this.naipe = naipe;
        this.valor = valor;
    }

    public Naipe getNaipe() {
        return naipe;
    }

    public String getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return naipe.getSimbolo() + valor;
    }
}
