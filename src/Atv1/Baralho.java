package Atv1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

class Baralho {
    private final List<Carta> cartas;

    public Baralho() {
        cartas = new ArrayList<>();
        for (Naipe naipe : Naipe.values()) {
            for (int i = 2; i <= 10; i++) {
                cartas.add(new Carta(naipe, String.valueOf(i)));
            }
            cartas.add(new Carta(naipe, "J"));
            cartas.add(new Carta(naipe, "Q"));
            cartas.add(new Carta(naipe, "K"));
            cartas.add(new Carta(naipe, "A"));
        }
        Collections.shuffle(cartas, new Random());
    }

    public Carta retirarCarta() {
        return cartas.isEmpty() ? null : cartas.remove(cartas.size() - 1);
    }
}
