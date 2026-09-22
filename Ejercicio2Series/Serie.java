package Ejercicio2Series;

import java.util.ArrayList;

// Representa una serie
public class Serie {

    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;

    private ArrayList<Temporada> temporadas;

    public Serie(String titulo, String descripcion,
                 String creador, String genero) {

        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;

        temporadas = new ArrayList<Temporada>();
    }

    public void agregarTemporada(Temporada temporada) {

        temporadas.add(temporada);
    }

    // Total de episodios vistos de una temporada
    public int episodiosVistosTemporada(int numero) {

        for (Temporada temporada : temporadas) {

            if (temporada.getNumero() == numero) {

                return temporada.totalVistos();
            }
        }

        return 0;
    }

    // Total de episodios vistos de toda la serie
    public int totalEpisodiosVistos() {

        int total = 0;

        for (Temporada temporada : temporadas) {

            total += temporada.totalVistos();
        }

        return total;
    }

    // Promedio de una temporada
    public double promedioTemporada(int numero) {

        for (Temporada temporada : temporadas) {

            if (temporada.getNumero() == numero) {

                return temporada.promedioCalificaciones();
            }
        }

        return 0;
    }

    // Promedio de toda la serie
    public double promedioSerie() {

        int suma = 0;
        int cantidad = 0;

        for (Temporada temporada : temporadas) {

            for (Episodio episodio : temporada.getEpisodios()) {

                if (episodio.isVisto()) {

                    suma += episodio.getCalificacion();
                    cantidad++;
                }
            }
        }

        if (cantidad == 0) {
            return 0;
        }

        return (double) suma / cantidad;
    }

    // Determina si se vieron todos los episodios
    public boolean todosVistos() {

        for (Temporada temporada : temporadas) {

            if (!temporada.todosVistos()) {
                return false;
            }
        }

        return true;
    }
}