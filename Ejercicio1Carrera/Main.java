package Ejercicio1Carrera;

import java.time.LocalDate;
import java.util.Scanner;

// Programa principal
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Carrera carrera = new Carrera(100);

        // Datos de prueba
        carrera.agregarAtleta(new Atleta(
                "Juan",
                1,
                "Argentina",
                LocalDate.of(2010, 5, 10),
                12.5
        ));

        carrera.agregarAtleta(new Atleta(
                "Pedro",
                2,
                "Uruguaya",
                LocalDate.of(1999, 3, 15),
                11.2
        ));

        carrera.agregarAtleta(new Atleta(
                "Lucia",
                3,
                "Argentina",
                LocalDate.of(2005, 8, 20),
                10.8
        ));

        carrera.agregarAtleta(new Atleta(
                "Carlos",
                4,
                "Peruana",
                LocalDate.of(1998, 7, 12),
                14.3
        ));

        int opcion = 0;

        while (opcion != 8) {

            System.out.println();
            System.out.println("===================================");
            System.out.println("        CARRERA DE VELOCIDAD");
            System.out.println("===================================");
            System.out.println("1. Mostrar competidores");
            System.out.println("2. Cantidad de atletas");
            System.out.println("3. Mostrar ganador");
            System.out.println("4. Mostrar atletas uruguayos");
            System.out.println("5. Ordenar por nombre");
            System.out.println("6. Primer argentino menor de edad");
            System.out.println("7. Atleta que salio ultimo");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    carrera.mostrarCompetidores();
                    break;

                case 2:
                    System.out.println(
                            "Cantidad: "
                            + carrera.cantidadAtletas()
                    );
                    break;

                case 3:
                    Atleta ganador = carrera.obtenerGanador();

                    if (ganador != null) {
                        System.out.println("GANADOR:");
                        ganador.mostrarDatos();
                    }
                    break;

                case 4:
                    carrera.mostrarUruguayos();
                    break;

                case 5:
                    carrera.ordenarPorNombre();
                    carrera.mostrarCompetidores();
                    break;

                case 6:
                    Atleta argentino = carrera.primerArgentinoMenorEdad();

                    if (argentino != null) {
                        argentino.mostrarDatos();
                    } else {
                        System.out.println(
                                "No existe un argentino menor de edad."
                        );
                    }
                    break;

                case 7:
                    Atleta ultimo = carrera.obtenerUltimo();

                    if (ultimo != null) {
                        ultimo.mostrarDatos();
                    }
                    break;

                case 8:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }
        }

        teclado.close();
    }
}