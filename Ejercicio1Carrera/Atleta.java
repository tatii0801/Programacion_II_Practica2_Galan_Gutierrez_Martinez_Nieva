package Ejercicio1Carrera;

import java.time.LocalDate;

// Clase que representa a un atleta
public class Atleta {

    // Datos del atleta
    private String nombre;
    private int numero;
    private String nacionalidad;
    private LocalDate fechaNacimiento;
    private double tiempo;

    // Constructor
    public Atleta(String nombre, int numero, String nacionalidad,
                  LocalDate fechaNacimiento, double tiempo) {

        this.nombre = nombre;
        this.numero = numero;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public double getTiempo() {
        return tiempo;
    }

    // Muestra los datos del atleta
    public void mostrarDatos() {

        System.out.println(
                "Nombre: " + nombre
                + " | Numero: " + numero
                + " | Nacionalidad: " + nacionalidad
                + " | Fecha nacimiento: " + fechaNacimiento
                + " | Tiempo: " + tiempo
        );
    }
}