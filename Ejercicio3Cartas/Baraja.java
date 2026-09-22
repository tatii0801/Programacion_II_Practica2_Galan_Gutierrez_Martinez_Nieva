package Ejercicio3Cartas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Baraja {

    private ArrayList<Carta> baraja;
    private ArrayList<Carta> monton;

    public void crearMazo() {
        if (this.baraja == null) {
            this.baraja = new ArrayList<>();
        } else {
            this.baraja.clear();
        }
        String[] palos = {"Oro", "Copa", "Espada", "Basto"};
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};
        for (String palo : palos) {
            for (int numero : numeros) {
                this.baraja.add(new Carta(numero, palo));
            }
        }
        System.out.println("Baraja creada con Exito");
    }

    public void barajar() {
        if (this.baraja == null) {
            System.out.println("Error, debe crear el mazo");
        } else {
            Collections.shuffle(this.baraja);
        }
    }

    public int cartasDisponibles() {
        return baraja.size();
    }

    public boolean extraerCarta() {
        if (this.baraja == null || this.baraja.isEmpty()) {
            System.out.println("Error");
            return false;
        }
        if (this.monton == null) {
            this.monton = new ArrayList<>();
        }
        Random random = new Random();
        int indiceAleatorio = random.nextInt(this.baraja.size());
        Carta cartaExtraida = this.baraja.remove(indiceAleatorio);

        this.monton.add(cartaExtraida);
        System.out.println("Carta Extraida: " + cartaExtraida);
        return true;
    }

    public ArrayList<Carta> darCartas(int cantidadPedida) {
        if (this.baraja == null || cantidadPedida > this.baraja.size()) {
            System.out.println("No hay suficientes cartas disponibles");
            return null;
        }
        ArrayList<Carta> cartasDadas = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < cantidadPedida; i++) {
            int indiceAleatorio = random.nextInt(this.baraja.size());
            Carta carta = this.baraja.remove(indiceAleatorio);
            cartasDadas.add(carta);
            this.monton.add(carta);
        }
        mostrarCartas(cartasDadas);

        return cartasDadas;
    }

    public void restablecerBaraja() {
        if (this.monton != null) {
            this.monton.clear();
        }
        crearMazo();
        System.out.println("Baraja restablecida.");
    }

    public void mostrarBaraja() {
        for (Carta carta : this.baraja) {
            System.out.println(carta.toString());
        }
    }

    public void mostrarMonton() {
        for (Carta carta : this.monton) {
            System.out.println(carta.toString());
        }
    }

    public void mostrarCartas(ArrayList<Carta> mazo) {
        for (Carta carta : mazo) {
            System.out.println(carta.toString());
        }
    }

//Constructores, Getters y Setters
    public Baraja() {
        this.baraja = new ArrayList<>();
        this.monton = new ArrayList<>();
        crearMazo();
    }

    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
        this.monton = new ArrayList<>();
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getMonton() {
        return monton;
    }

    public void setMonton(ArrayList<Carta> monton) {
        this.monton = monton;
    }

}
