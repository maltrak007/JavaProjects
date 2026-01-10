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
public class SnacksServiceList implements ISnacksService {

    private SnacksServiceFile snackSF;

    public SnacksServiceList() {
        snackSF = new SnacksServiceFile();
    }

    @Override
    public void AggregateSnack(Snack _snackToAdd) {
        Scanner scanner = new Scanner(System.in);
        String newSnackName;
        //snackSF.LoadSnacksFromFile();
        // 1. Validation Logic
        while (true) {
            IO.println("Specify a name for the snack:");
            newSnackName = scanner.nextLine();

            // Use Java Streams to check for duplicates cleanly
            String finalName = newSnackName;
            boolean alreadyExists = snackSF.RetrieveSnacks().stream()
                    .anyMatch(s -> s.getSnackName().equalsIgnoreCase(finalName));

            if (alreadyExists) {
                IO.println("There is already a product with that name.");
            } else {
                break; // Exit loop if name is valid
            }
        }

        // 2. Setting Data
        double newSnackPrice = GetValidPrice(scanner);
        _snackToAdd.setSnackName(newSnackName);
        _snackToAdd.setSnackPrice(newSnackPrice);

        // 3. Storing
        snackSF.AggregateSnack(_snackToAdd);

        IO.println("Successfully added snack to the list\n");
    }

    @Override
    public void ShowSnackList() {
        IO.println("Total snacks available:" + Snack.getSnackCounter() + "\n"
                + """
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
