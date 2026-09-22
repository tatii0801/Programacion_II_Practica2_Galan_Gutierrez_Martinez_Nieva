package Ejercicio1Carrera;

import java.time.LocalDate;

// Clase para realizar pruebas
public class TestCarrera {

    public static void main(String[] args) {

        Carrera carrera = new Carrera(100);

        carrera.agregarAtleta(new Atleta(
                "Juan", 1, "Argentina",
                LocalDate.of(2010, 5, 10), 12.5
        ));

        carrera.agregarAtleta(new Atleta(
                "Pedro", 2, "Uruguaya",
                LocalDate.of(1999, 3, 15), 11.2
        ));

        carrera.agregarAtleta(new Atleta(
                "Lucia", 3, "Argentina",
                LocalDate.of(2005, 8, 20), 10.8
        ));

        carrera.agregarAtleta(new Atleta(
                "Carlos", 4, "Peruana",
                LocalDate.of(1998, 7, 12), 14.3
        ));

        System.out.println("TODOS LOS ATLETAS");
        carrera.mostrarCompetidores();

        System.out.println();
        System.out.println("CANTIDAD: "
                + carrera.cantidadAtletas());

        System.out.println();
        System.out.println("GANADOR");
        carrera.obtenerGanador().mostrarDatos();

        System.out.println();
        System.out.println("URUGUAYOS");
        carrera.mostrarUruguayos();

        System.out.println();
        System.out.println("ORDENADOS POR NOMBRE");
        carrera.ordenarPorNombre();
        carrera.mostrarCompetidores();

        System.out.println();
        System.out.println("ARGENTINO MENOR DE EDAD");
        carrera.primerArgentinoMenorEdad().mostrarDatos();

        System.out.println();
        System.out.println("ULTIMO");
        carrera.obtenerUltimo().mostrarDatos();

        System.out.println();
        System.out.println("¿EXISTE PERUANO?");
        System.out.println(carrera.existePeruano());
    }
}