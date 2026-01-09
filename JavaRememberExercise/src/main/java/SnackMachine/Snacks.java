/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SnackMachine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class Snacks {
    
    private List<Snack> snackList;

    public Snacks() {
        this.snackList = new ArrayList<>();
    }

    public void AggregateSnack(Snack _snackToAdd) {
        Scanner scanner = new Scanner(System.in);
        IO.println("""
               *******Snack Creator**********
               *Specify a name for the snack*
                    """);
        String newSnackName = scanner.nextLine();
        double newSnackPrice = GetValidPrice(scanner);
        _snackToAdd.setSnackName(newSnackName);
        _snackToAdd.setSnackPrice(newSnackPrice);
        snackList.add(_snackToAdd);
        IO.println("Succesfully added snack to the list\n");
    }

    public void ShowSnackList() {
        IO.println("Total snacks available:" + Snack.getSnackCounter() + 
                """
                List of snacks
                --------------------
                """);
        for(Snack _snack : snackList)
        {
            IO.println(_snack.toString());
        }
    }   

    public List<Snack> RetrieveSnacks() {
        return snackList;
    }
    
    private double GetValidPrice(Scanner scanner) {
        try {
            IO.println("What's his price?");
            return Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            IO.println("Invalid input. Try again.");
            return GetValidPrice(scanner);
        }
    }
}
