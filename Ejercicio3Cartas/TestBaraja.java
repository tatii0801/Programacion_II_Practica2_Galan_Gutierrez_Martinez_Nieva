package Ejercicio3Cartas;

import java.util.ArrayList;

public class TestBaraja {

    public static void main(String[] args) {

        Baraja baraja = new Baraja();

        System.out.println(
                "Cartas disponibles: "
                + baraja.cartasDisponibles()
        );

        System.out.println();
        System.out.println("BARAJANDO...");

        baraja.barajar();

        System.out.println();
        System.out.println("EXTRAYENDO CARTA");

        Carta carta = baraja.extraerCarta();

        System.out.println(carta);

        System.out.println();
        System.out.println("DANDO 5 CARTAS");

        ArrayList<Carta> cartas =
                baraja.darCartas(5);

        for (Carta c : cartas) {

            System.out.println(c);
        }

        System.out.println();
        System.out.println(
                "Cartas disponibles: "
                + baraja.cartasDisponibles()
        );

        System.out.println();
        System.out.println("CARTAS DEL MONTON");

        baraja.cartasMonton();
    }
}