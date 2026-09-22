package ar.edu.unju.fi.model;

import java.util.ArrayList;

// Representa una clinica
public class Clinica {

    // Coleccion de historias clinicas
    private ArrayList<HistoriaClinica> historias;

    public Clinica() {

        historias = new ArrayList<HistoriaClinica>();
    }

    // Agrega una historia clinica
    public void agregarHistoria(HistoriaClinica historia) {

        historias.add(historia);
    }

    // Busca una historia por DNI
    public HistoriaClinica buscarHistoria(String dni) {

        for (HistoriaClinica historia : historias) {

            if (historia.getPaciente()
                    .getDni()
                    .equals(dni)) {

                return historia;
            }
        }

        return null;
    }

    // Registra una enfermedad
    public void registrarEnfermedad(
            String dni,
            Enfermedad enfermedad) {

        HistoriaClinica historia =
                buscarHistoria(dni);

        if (historia != null) {

            historia.agregarEnfermedad(enfermedad);

            System.out.println(
                    "Enfermedad registrada."
            );

        } else {

            System.out.println(
                    "No se encontro la historia clinica."
            );
        }
    }

    // Elimina una historia clinica
    public void eliminarHistoria(String dni) {

        HistoriaClinica historia =
                buscarHistoria(dni);

        if (historia != null) {

            historias.remove(historia);

            System.out.println(
                    "Historia clinica eliminada."
            );

        } else {

            System.out.println(
                    "No se encontro la historia clinica."
            );
        }
    }

    // Imprime una historia clinica
    public void imprimirHistoria(String dni) {

        HistoriaClinica historia =
                buscarHistoria(dni);

        if (historia != null) {

            System.out.println(historia);

        } else {

            System.out.println(
                    "No se encontro la historia clinica."
            );
        }
    }
}