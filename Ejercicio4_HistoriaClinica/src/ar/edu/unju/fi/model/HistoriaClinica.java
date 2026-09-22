package ar.edu.unju.fi.model;

import java.util.ArrayList;

// Representa la historia clinica de un paciente
public class HistoriaClinica {

    private Paciente paciente;

    private ArrayList<Enfermedad> enfermedades;

    public HistoriaClinica(Paciente paciente) {

        this.paciente = paciente;

        enfermedades = new ArrayList<Enfermedad>();
    }

    // Agrega una enfermedad
    public void agregarEnfermedad(Enfermedad enfermedad) {

        enfermedades.add(enfermedad);
    }

    public Paciente getPaciente() {

        return paciente;
    }

    @Override
    public String toString() {

        String texto = "";

        texto += "---------------HISTORIA CLINICA----------------\n";
        texto += paciente.toString();
        texto += "\n\nENFERMEDADES:\n";

        for (Enfermedad enfermedad : enfermedades) {

            texto += "\n" + enfermedad.toString();
            texto += "\n-----------------------------------------------";
        }

        return texto;
    }
}