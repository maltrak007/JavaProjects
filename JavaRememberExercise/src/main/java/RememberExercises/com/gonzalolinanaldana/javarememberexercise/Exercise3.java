/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RememberExercises.com.gonzalolinanaldana.javarememberexercise;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IO.println("***ID Generator***");
        IO.println("Your Name: ");
        String username = scanner.nextLine();
        IO.println("Your Surname: ");
        String surname = scanner.nextLine();
        IO.println("Year of birth(YYYY):  ");
        int yearDate = Integer.parseInt(scanner.nextLine());
        String formattedYearDate = Integer.toString(yearDate);
        
        Random random = new Random();
        int randomDigit = random.nextInt(9999)+1;
        String formattedRandomDigit = String.format("%04d", randomDigit);
        
        String uniqueID = username.substring(0,2).toUpperCase() + surname.substring(0,2).toUpperCase() 
                + formattedYearDate.substring(formattedYearDate.length()-2)
                + formattedRandomDigit;
        
        IO.println("Name:\t" + username + "\nSurname:\t" + surname + "\nBirth:\t" + yearDate 
                + "\nRandom Digit:\t" + formattedRandomDigit + "\nUnique ID:\t" + uniqueID);
    }
}
