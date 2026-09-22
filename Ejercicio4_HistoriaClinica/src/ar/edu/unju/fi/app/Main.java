package ar.edu.unju.fi.app;

import java.time.LocalDate;
import java.util.Scanner;

import ar.edu.unju.fi.model.Clinica;
import ar.edu.unju.fi.model.Enfermedad;
import ar.edu.unju.fi.model.HistoriaClinica;
import ar.edu.unju.fi.model.Paciente;

// Programa principal
public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Clinica clinica = new Clinica();

        // Paciente de prueba
        Paciente paciente = new Paciente(
                "12345678",
                "Juan Perez",
                "3884000000",
                LocalDate.of(2000, 5, 10)
        );

        HistoriaClinica historia =
                new HistoriaClinica(paciente);

        clinica.agregarHistoria(historia);

        int opcion = 0;

        while (opcion != 4) {

            System.out.println();
            System.out.println("===================================");
            System.out.println("          HISTORIA CLINICA");
            System.out.println("===================================");
            System.out.println("1. Registrar enfermedad");
            System.out.println("2. Imprimir historia clinica");
            System.out.println("3. Eliminar historia clinica");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");

            opcion = teclado.nextInt();

            switch (opcion) {

                case 1:

                    teclado.nextLine();

                    System.out.print("DNI del paciente: ");
                    String dni = teclado.nextLine();

                    System.out.print("Nombre de la enfermedad: ");
                    String nombre = teclado.nextLine();

                    System.out.print("Sintomas: ");
                    String sintomas = teclado.nextLine();

                    System.out.print("Tratamiento: ");
                    String tratamiento = teclado.nextLine();

                    Enfermedad enfermedad =
                            new Enfermedad(
                                    nombre,
                                    sintomas,
                                    tratamiento
                            );

                    clinica.registrarEnfermedad(
                            dni,
                            enfermedad
                    );

                    break;

                case 2:

                    teclado.nextLine();

                    System.out.print("DNI del paciente: ");
                    String dniBuscar = teclado.nextLine();

                    clinica.imprimirHistoria(
                            dniBuscar
                    );

                    break;

                case 3:

                    teclado.nextLine();

                    System.out.print("DNI del paciente: ");
                    String dniEliminar = teclado.nextLine();

                    clinica.eliminarHistoria(
                            dniEliminar
                    );

                    break;

                case 4:

                    System.out.println(
                            "Programa finalizado."
                    );

                    break;

                default:

                    System.out.println(
                            "Opcion incorrecta."
                    );
            }
        }

        teclado.close();
    }
}