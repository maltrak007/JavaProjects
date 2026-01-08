/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaPersona;

import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class PruebaPersona {
    public static void main(String[] args) {
        Persona[] grupoPersonas;
        Scanner scanner = new Scanner(System.in);
        IO.println("***Crea Personas*** \n ¿Cuantas personas quieres crear?");
        int numCreaciones = Integer.parseInt(scanner.nextLine());
        grupoPersonas = new Persona[numCreaciones];
        for (int i = 0; i < numCreaciones; i++) {
            IO.println("\n Persona numero = " + i);
            IO.println("\nNombre:\t");
            String nombrePersona = scanner.nextLine();
            IO.println("\n Apellido: \t");
            String apellidoPersona = scanner.nextLine();
            IO.println("\n Edad: \t");
            int edadPersona = Integer.parseInt(scanner.nextLine());

            grupoPersonas[i] = new Persona(nombrePersona, apellidoPersona, edadPersona);
        }
        for (Persona persona : grupoPersonas) {
            String datosFormateados = String.format("Nombre: %s" + " Apellido: %s" + " Edad: %d", persona.getNombre(), persona.getApellido(), persona.getEdad());
            IO.println(datosFormateados);
        }
    }
}
