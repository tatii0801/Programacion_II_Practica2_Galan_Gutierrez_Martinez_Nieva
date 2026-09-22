package Ejercicio3Cartas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

// Representa una baraja española
public class Baraja {

    private ArrayList<Carta> cartas;
    private ArrayList<Carta> monton;

    public Baraja() {

        cartas = new ArrayList<Carta>();
        monton = new ArrayList<Carta>();

        crearBaraja();
    }

    // Crea las 40 cartas
    public void crearBaraja() {

        cartas.clear();
        monton.clear();

        String[] palos = {
            "Oro",
            "Basto",
            "Espada",
            "Copa"
        };

        int[] numeros = {
            1, 2, 3, 4, 5, 6, 7, 10, 11, 12
        };

        for (String palo : palos) {

            for (int numero : numeros) {

                cartas.add(new Carta(numero, palo));
            }
        }
    }

    // Baraja las cartas
    public void barajar() {

        Collections.shuffle(cartas);
    }

    // Cantidad de cartas disponibles
    public int cartasDisponibles() {

        return cartas.size();
    }

    // Extrae una carta aleatoriamente
    public Carta extraerCarta() {

        if (cartas.isEmpty()) {

            return null;
        }

        Random random = new Random();

        int posicion = random.nextInt(cartas.size());

        Carta carta = cartas.remove(posicion);

        monton.add(carta);

        return carta;
    }

    // Devuelve una cantidad de cartas
    public ArrayList<Carta> darCartas(int cantidad) {

        if (cantidad > cartas.size()) {

            System.out.println(
                    "No hay suficientes cartas disponibles."
            );

            return new ArrayList<Carta>();
        }

        ArrayList<Carta> cartasEntregadas =
                new ArrayList<Carta>();

        for (int i = 0; i < cantidad; i++) {

            cartasEntregadas.add(
                    extraerCarta()
            );
        }

        return cartasEntregadas;
    }

    // Muestra las cartas disponibles
    public void mostrarBaraja() {

        for (Carta carta : cartas) {

            System.out.println(carta);
        }
    }

    // Muestra las cartas que ya salieron
    public void cartasMonton() {

        for (Carta carta : monton) {

            System.out.println(carta);
        }
    }

    // Restablece la baraja
    public void restablecerBaraja() {

        crearBaraja();
    }
}