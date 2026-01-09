/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Snack_Machine_Files.service;

import Snack_Machine_Files.domain.Snack;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class SnacksServiceList implements ISnacksService{
    
    private List<Snack> snackList;
    private SnacksServiceFile snackSF;
    
    public SnacksServiceList() {
        snackSF = new SnacksServiceFile();
        this.snackList = snackSF.RetrieveSnacks();
    }

    @Override
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
        snackSF.AggregateSnack(_snackToAdd);
        IO.println("Succesfully added snack to the list\n");
    }

    @Override
    public void ShowSnackList() {
        IO.println("Total snacks available:" + Snack.getSnackCounter() + "\n" +
                """
                List of snacks
                --------------------
                """);
        snackSF.ShowSnackList();
    }   

    @Override
    public List<Snack> RetrieveSnacks() {
        return snackSF.RetrieveSnacks();
    }
    
    public double GetValidPrice(Scanner scanner) {
        try {
            IO.println("What's his price?");
            return Double.parseDouble(scanner.nextLine());
        } catch (Exception e) {
            IO.println("Invalid input. Try again.");
            return GetValidPrice(scanner);
        }
    }
}
