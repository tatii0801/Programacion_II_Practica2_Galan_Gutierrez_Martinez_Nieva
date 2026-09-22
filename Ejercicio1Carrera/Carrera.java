package Ejercicio1Carrera;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Clase que representa una carrera
public class Carrera {

    private double distancia;

    // Coleccion de atletas
    private ArrayList<Atleta> competidores;

    public Carrera(double distancia) {

        this.distancia = distancia;
        competidores = new ArrayList<Atleta>();
    }

    // Agrega un atleta a la carrera
    public void agregarAtleta(Atleta atleta) {

        competidores.add(atleta);
    }

    // Punto d: cantidad de atletas
    public int cantidadAtletas() {

        return competidores.size();
    }

    // Punto e: mostrar todos los competidores
    public void mostrarCompetidores() {

        for (Atleta atleta : competidores) {

            atleta.mostrarDatos();
        }
    }

    // Punto f: determinar ganador
    // El menor tiempo es el ganador
    public Atleta obtenerGanador() {

        if (competidores.isEmpty()) {
            return null;
        }

        Atleta ganador = competidores.get(0);

        for (Atleta atleta : competidores) {

            if (atleta.getTiempo() < ganador.getTiempo()) {

                ganador = atleta;
            }
        }

        return ganador;
    }

    // Punto g: atletas uruguayos
    public void mostrarUruguayos() {

        int cantidad = 0;

        for (Atleta atleta : competidores) {

            if (atleta.getNacionalidad()
                    .equalsIgnoreCase("Uruguaya")
                    || atleta.getNacionalidad()
                    .equalsIgnoreCase("Uruguay")) {

                atleta.mostrarDatos();
                cantidad++;
            }
        }

        System.out.println("Cantidad de atletas uruguayos: " + cantidad);
    }

    // Punto h: ordenar por nombre
    public void ordenarPorNombre() {

        Collections.sort(competidores, new Comparator<Atleta>() {

            @Override
            public int compare(Atleta atleta1, Atleta atleta2) {

                return atleta1.getNombre()
                        .compareToIgnoreCase(atleta2.getNombre());
            }
        });
    }

    // Punto i: primer argentino menor de edad
    public Atleta primerArgentinoMenorEdad() {

        LocalDate hoy = LocalDate.now();

        for (Atleta atleta : competidores) {

            if (atleta.getNacionalidad()
                    .equalsIgnoreCase("Argentina")
                    || atleta.getNacionalidad()
                    .equalsIgnoreCase("Argentino")) {

                int edad = Period.between(
                        atleta.getFechaNacimiento(),
                        hoy
                ).getYears();

                if (edad < 18) {

                    return atleta;
                }
            }
        }

        return null;
    }

    // Punto j: atleta que salió último
    // El mayor tiempo corresponde al último
    public Atleta obtenerUltimo() {

        if (competidores.isEmpty()) {
            return null;
        }

        Atleta ultimo = competidores.get(0);

        for (Atleta atleta : competidores) {

            if (atleta.getTiempo() > ultimo.getTiempo()) {

                ultimo = atleta;
            }
        }

        return ultimo;
    }

    // Punto k: existe algún peruano
    public boolean existePeruano() {

        for (Atleta atleta : competidores) {

            if (atleta.getNacionalidad()
                    .equalsIgnoreCase("Peruana")
                    || atleta.getNacionalidad()
                    .equalsIgnoreCase("Peru")) {

                return true;
            }
        }

        return false;
    }

    public ArrayList<Atleta> getCompetidores() {

        return competidores;
    }
}