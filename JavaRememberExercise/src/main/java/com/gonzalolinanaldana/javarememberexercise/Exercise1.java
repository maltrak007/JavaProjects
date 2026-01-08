/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.gonzalolinanaldana.javarememberexercise;

import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class Exercise1 {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         IO.println("Introduce tu nombre: ");
         String nombreUsuario = scanner.nextLine();
         IO.println("Introduce tu edad: ");
         int edadUsuario = Integer.parseInt(scanner.nextLine());
         IO.println("Introduce el salario estimado: ");
         double salarioUsuario = Double.parseDouble(scanner.nextLine());
         IO.println("Eres jefe de dpt: Yes/Y No/N");
         Boolean esJefeDpt = Boolean.parseBoolean(scanner.nextLine());
         System.out.println("Tus datos son: Nombre de usuario = " + nombreUsuario + "\n" 
                 + "Edad usuario = " + edadUsuario + "\n" + "Salario estimado = " + "$%.2f".formatted(salarioUsuario) + "\n" + "Es jefe del dpt = " + esJefeDpt);
     }
}
