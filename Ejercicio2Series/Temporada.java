package Ejercicio2Series;

import java.util.ArrayList;

// Representa una temporada
public class Temporada {

    private int numero;
    private ArrayList<Episodio> episodios;

    public Temporada(int numero) {

        this.numero = numero;
        episodios = new ArrayList<Episodio>();
    }

    public void agregarEpisodio(Episodio episodio) {

        episodios.add(episodio);
    }

    // Total de episodios vistos
    public int totalVistos() {

        int cantidad = 0;

        for (Episodio episodio : episodios) {

            if (episodio.isVisto()) {
                cantidad++;
            }
        }

        return cantidad;
    }

    // Promedio de episodios vistos
    public double promedioCalificaciones() {

        int suma = 0;
        int cantidad = 0;

        for (Episodio episodio : episodios) {

            if (episodio.isVisto()) {

                suma += episodio.getCalificacion();
                cantidad++;
            }
        }

        if (cantidad == 0) {
            return 0;
        }

        return (double) suma / cantidad;
    }

    // Determina si todos fueron vistos
    public boolean todosVistos() {

        for (Episodio episodio : episodios) {

            if (!episodio.isVisto()) {
                return false;
            }
        }

        return true;
    }

    public ArrayList<Episodio> getEpisodios() {
        return episodios;
    }

    public int getNumero() {
        return numero;
    }
}