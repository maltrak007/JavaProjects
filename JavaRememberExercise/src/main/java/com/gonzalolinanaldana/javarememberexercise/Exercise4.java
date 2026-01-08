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


public class Exercise4 {
    
    private static final String CORRECT_EMAIL = "pepepin";
    private static final String CORRECT_PASSWORD = "123";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IO.println("Username:\n");
        String username = scanner.nextLine();
        IO.println("Password:\n");
        String password = scanner.nextLine();
        if(username.contentEquals(CORRECT_EMAIL) && password.contentEquals(CORRECT_PASSWORD))
        {
            IO.println("Access Granted");
            IO.println("Calculate the area of this rectangle");
        }
        else
        {
            IO.println("Access Denied");
        }
        
    }
}
