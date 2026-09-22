package Ejercicio3Cartas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TP2Prog2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Baraja baraja = new Baraja();
        int opcion = 0;

        do {
            System.out.println("\n===== MENÚ DE BARAJA ESPAÑOLA =====");
            System.out.println("1. Barajar");
            System.out.println("2. Ver cartas disponibles");
            System.out.println("3. Extraer una carta");
            System.out.println("4. Dar cartas");
            System.out.println("5. Mostrar cartas del montón");
            System.out.println("6. Mostrar baraja completa");
            System.out.println("7. Restablecer baraja");
            System.out.println("8. Salir");
            System.out.print("Selecciona una opcion: ");

            try {
                opcion = scanner.nextInt();

                switch (opcion) {
                    case 1:
                        baraja.barajar();
                        System.out.println("Se mezclaron las cartas.");
                        break;

                    case 2:
                        System.out.println("Cartas disponibles: " + baraja.cartasDisponibles());
                        break;

                    case 3:
                        baraja.extraerCarta();
                        break;

                    case 4:
                        System.out.print("¿Cuántas cartas deseas pedir?: ");
                        int cantidad = scanner.nextInt();
                        if (cantidad <= 0) {
                            System.out.println("Ingresa un número mayor a cero.");
                        } else {
                            baraja.darCartas(cantidad);
                        }
                        break;

                    case 5:
                        System.out.println("--- Cartas en el monton ---");
                        baraja.mostrarMonton();
                        break;

                    case 6:
                        System.out.println("--- Cartas en la baraja ---");
                        baraja.mostrarBaraja();
                        break;

                    case 7:
                        baraja.restablecerBaraja();
                        break;

                    case 8:
                        System.out.println("Finalizando programa.");
                        break;

                    default:
                        System.out.println("Opción fuera de rango (1-8).");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa un número entero.");
                scanner.nextLine(); // Limpia el buffer del Scanner
                opcion = 0;
            }

        } while (opcion != 8);

        scanner.close();
    }
}
