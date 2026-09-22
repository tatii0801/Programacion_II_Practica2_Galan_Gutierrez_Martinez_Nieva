package Ejercicio3Cartas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Baraja baraja = new Baraja();

        int opcion = 0;

        while (opcion != 7) {

            System.out.println();
            System.out.println("===================================");
            System.out.println("          BARAJA ESPANOLA");
            System.out.println("===================================");
            System.out.println("1. Barajar");
            System.out.println("2. Cartas disponibles");
            System.out.println("3. Extraer carta");
            System.out.println("4. Dar cartas");
            System.out.println("5. Mostrar baraja");
            System.out.println("6. Mostrar monton");
            System.out.println("7. Restablecer y salir");
            System.out.print("Ingrese una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    baraja.barajar();
                    System.out.println("Baraja mezclada.");

                    break;

                case 2:

                    System.out.println(
                            "Cartas disponibles: "
                            + baraja.cartasDisponibles()
                    );

                    break;

                case 3:

                    Carta carta = baraja.extraerCarta();

                    if (carta != null) {
                        System.out.println(
                                "Carta extraida: " + carta
                        );
                    }

                    break;

                case 4:

                    System.out.print(
                            "Cantidad de cartas: "
                    );

                    int cantidad = teclado.nextInt();

                    ArrayList<Carta> cartas =
                            baraja.darCartas(cantidad);

                    for (Carta c : cartas) {

                        System.out.println(c);
                    }

                    break;

                case 5:

                    baraja.mostrarBaraja();

                    break;

                case 6:

                    baraja.cartasMonton();

                    break;

                case 7:

                    baraja.restablecerBaraja();

                    System.out.println(
                            "Baraja restablecida."
                    );

                    break;

                default:

                    System.out.println(
                            "Opcion incorrecta."
                    );
            }
        }

        teclado.close();
    }
}