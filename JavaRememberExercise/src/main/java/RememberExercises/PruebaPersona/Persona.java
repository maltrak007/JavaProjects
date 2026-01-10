/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RememberExercises.PruebaPersona;

import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class Persona {

    private String nombre;
    
    private String apellido;
    
    private int edad;
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public Persona() {

    }

    public Persona(String _nombre, String _apellido, int _edad) {
        this.nombre = _nombre;
        this.apellido = _apellido;
        this.edad = _edad;
    }

    public static void main(String[] args) {
        
    }
}
