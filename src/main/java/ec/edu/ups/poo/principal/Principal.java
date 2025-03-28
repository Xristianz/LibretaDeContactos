package ec.edu.ups.poo.principal;

import ec.edu.ups.poo.clases.Familiar;
import ec.edu.ups.poo.clases.Persona;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        System.out.println("Voy a perder el ciclo si me sigo llevando con el Sebastian!");

        Scanner scanner = new Scanner(System.in);

        Persona persona= new Persona();
        persona.setNombre("Cr7");
        persona.setDireccion("Las pencas");
        persona.setCedula("01010");
        persona.setApellido("ronaldo");


        // Pedir cantidad de personas y familiares
        System.out.print("Ingrese la cantidad de personas: ");
        int cantidadPersonas = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la cantidad de familiares: ");
        int cantidadFamiliares = scanner.nextInt();
        scanner.nextLine();

        // Arreglos para almacenar los objetos
        Persona[] personas = new Persona[cantidadPersonas];
        Familiar[] familiares = new Familiar[cantidadFamiliares];

        // Ingreso de datos para Personas
        for (int i = 0; i < cantidadPersonas; i++) {
            System.out.println("\nIngrese los datos de la persona " + (i + 1) + ":");
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();

            personas[i] = new Persona(cedula, nombre, apellido, direccion);
        }

        // Ingreso de datos para Familiares
        for (int i = 0; i < cantidadFamiliares; i++) {
            System.out.println("\nIngrese los datos del familiar " + (i + 1) + ":");
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Dirección: ");
            String direccion = scanner.nextLine();
            System.out.print("Parentesco: ");
            String parentesco = scanner.nextLine();
            System.out.print("Tipo de sangre: ");
            String tipoSangre = scanner.nextLine();
            System.out.print("Día de nacimiento (1-31): ");
            int dia = scanner.nextInt();
            System.out.print("Mes de nacimiento (1-12): ");
            int mes = scanner.nextInt() - 1; // GregorianCalendar usa meses 0-11
            System.out.print("Año de nacimiento: ");
            int anio = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            GregorianCalendar fechaNac = new GregorianCalendar(anio, mes, dia);
            familiares[i] = new Familiar(cedula, nombre, apellido, direccion,
                    parentesco, tipoSangre, fechaNac);
        }

        // Mostrar información
        System.out.println("\n=== LISTADO DE PERSONAS ===");
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
            System.out.println("----------------------");
        }

        System.out.println("\n=== LISTADO DE FAMILIARES ===");
        for (int i = 0; i < familiares.length; i++) {
            System.out.println(familiares[i]);
            System.out.println("----------------------");
        }

        scanner.close();
    }
}
