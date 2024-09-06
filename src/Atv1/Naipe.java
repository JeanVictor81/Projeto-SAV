package Atv1;

enum Naipe {
    PAUS("P"),
    OURO("O"),
    COPAS("C"),
    ESPADAS("E");

    private final String simbolo;

    Naipe(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
}
