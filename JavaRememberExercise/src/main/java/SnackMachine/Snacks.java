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
                   ***Snack Creator***
                Specify a name for the snack
                    """);
        String newSnackName = scanner.nextLine();
        IO.println("What's his price?");
        try
        {
           int newSnackPrice = Integer.parseInt(scanner.nextLine());
        }
        catch(Exception e)
        {
            IO.println("Input mismatch, you need to specify a numerical value");
        }
        
        
        Snack snackie = new Snack(0, "Polo", 0);
        snackList.add(snackie);
    }

    public void ShowSnackList() {

    }
    
    /*
    public List<Snack> RetrieveSnacks() {
        return 
    }
    */
}
