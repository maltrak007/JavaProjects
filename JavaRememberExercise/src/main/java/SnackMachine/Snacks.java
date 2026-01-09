/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SnackMachine;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class Snacks {
    
    private List<Snack> snackList;

    public void AggregateSnack() {
        Scanner scanner = new Scanner(System.in);
        IO.println("""
               *******Snack Creator**********
               *Specify a name for the snack*
                    """);
        String newSnackName = scanner.nextLine();
        double newSnackPrice = GetValidPrice(scanner);
        int newSnackUniqueID = GetValidSnackID(scanner);
        Snack snackie = new Snack(newSnackUniqueID, newSnackName, newSnackPrice);
        snackList.add(snackie);
    }

    public void ShowSnackList() {
        IO.println("Total snacks available:" + Snack.getSnackCounter() + 
                """
                List of snacks
                --------------------
                """);
        for(Snack _snack : snackList)
        {
            _snack.toString();
        }
    }   

    /*
    public List<Snack> RetrieveSnacks() {
        return 
    }
     */
    private double GetValidPrice(Scanner scanner) {
        try {
            IO.println("What's his price?");
            return Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            IO.println("Invalid input. Try again.");
            return GetValidPrice(scanner);
        }
    }
    
    private int GetValidSnackID(Scanner scanner)
    {
        /*
        try {
            IO.println("Specify an unique ID");
            int finalSnackID = 
            return Integer.parseInt(scanner.nextLine());
        } catch (Exception e) {
            IO.println("Invalid input. Try again.");
            return GetValidSnackID(scanner); 
        }
        */
        return 0;
    }
    
}
