package ar.edu.unju.fi.model;

// Representa una enfermedad
public class Enfermedad {

    private String nombre;
    private String sintomas;
    private String tratamiento;

    public Enfermedad(String nombre,
                      String sintomas,
                      String tratamiento) {

        this.nombre = nombre;
        this.sintomas = sintomas;
        this.tratamiento = tratamiento;
    }

    @Override
    public String toString() {

        return "Enfermedad: " + nombre
                + "\nSintomas: " + sintomas
                + "\nTratamiento: " + tratamiento;
    }
}