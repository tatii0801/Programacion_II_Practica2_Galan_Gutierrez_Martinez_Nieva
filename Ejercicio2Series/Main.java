package Ejercicio2Series;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Serie serie = new Serie(
                "Serie de prueba",
                "Descripcion de la serie",
                "Creador",
                "Drama"
        );

        Temporada temporada1 = new Temporada(1);

        Episodio episodio1 = new Episodio(
                "Episodio 1",
                "Primer episodio"
        );

        Episodio episodio2 = new Episodio(
                "Episodio 2",
                "Segundo episodio"
        );

        Episodio episodio3 = new Episodio(
                "Episodio 3",
                "Tercer episodio"
        );

        temporada1.agregarEpisodio(episodio1);
        temporada1.agregarEpisodio(episodio2);
        temporada1.agregarEpisodio(episodio3);

        serie.agregarTemporada(temporada1);

        episodio1.calificar(5);
        episodio2.calificar(4);

        int opcion = 0;

        while (opcion != 5) {

            System.out.println();
            System.out.println("===================================");
            System.out.println("          MENU SERIES");
            System.out.println("===================================");
            System.out.println("1. Episodios vistos");
            System.out.println("2. Promedio temporada");
            System.out.println("3. Promedio serie");
            System.out.println("4. ¿Todos los episodios vistos?");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println(
                            "Episodios vistos: "
                            + serie.totalEpisodiosVistos()
                    );
                    break;

                case 2:
                    System.out.println(
                            "Promedio: "
                            + serie.promedioTemporada(1)
                    );
                    break;

                case 3:
                    System.out.println(
                            "Promedio de la serie: "
                            + serie.promedioSerie()
                    );
                    break;

                case 4:
                    System.out.println(
                            serie.todosVistos()
                    );
                    break;

                case 5:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opcion incorrecta.");
            }
        }

        teclado.close();
    }
}