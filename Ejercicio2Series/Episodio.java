package Ejercicio2Series;

// Representa un episodio
public class Episodio {

    private String titulo;
    private String descripcion;
    private boolean visto;
    private int calificacion;

    public Episodio(String titulo, String descripcion) {

        this.titulo = titulo;
        this.descripcion = descripcion;
        this.visto = false;

        // Valor negativo porque todavía no fue visto
        this.calificacion = -1;
    }

    // Ingresa una calificacion
    public void calificar(int calificacion) {

        if (calificacion < 1 || calificacion > 5) {

            System.out.println(
                    "La calificacion debe estar entre 1 y 5."
            );

        } else {

            this.calificacion = calificacion;
            this.visto = true;

            System.out.println("Calificacion ingresada.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isVisto() {
        return visto;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void mostrarDatos() {

        System.out.println(
                "Titulo: " + titulo
                + " | Visto: " + visto
                + " | Calificacion: " + calificacion
        );
    }
}