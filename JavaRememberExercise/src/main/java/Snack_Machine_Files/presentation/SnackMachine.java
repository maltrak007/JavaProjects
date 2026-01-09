/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Snack_Machine_Files.presentation;

import Snack_Machine_Files.domain.Snack;
import Snack_Machine_Files.service.SnacksServiceList;
import SnackMachine.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author maltr
 */
class SnackMachine {

    public static void main(String[] args) {
        SnacksMachine();
    }

    public static void SnacksMachine() {
        SnacksServiceList snacks = new SnacksServiceList();
        ShowMenu();
        ExecuteOptions(snacks);
    }

    private static void ShowMenu() {
        IO.println("""
                       *******Menu Snacks****
                       ***1. Buy Snack   ****
                       ***2. Show Ticket ****
                       ***3. Add Snack   ****
                       ***4. Exit        ****
                       **********************
                   """);

    }

    private static void ExecuteOptions(SnacksServiceList _snacks) {
        Boolean exitApp = false;
        List<Snack> userBasket = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (!exitApp) {
            int menuOption = Integer.parseInt(scanner.nextLine());
            switch (menuOption) {
                case 1 -> {
                    BuySnack(_snacks, userBasket, scanner);
                    ShowMenu();
                }
                case 2 -> {
                    ShowTicket(userBasket);
                    ShowMenu();
                }
                case 3 ->{
                    AddSnack(_snacks);
                    ShowMenu();
                }
                case 4 -> {
                    IO.println("Goodbye");
                    exitApp = true;
                }
                default -> {
                    IO.println("Enter a valid input");
                    ShowMenu();
                }
            }
        }
    }

    private static void BuySnack(SnacksServiceList _machineSnacks, List<Snack> _userBasket, Scanner _scanner) {
        boolean continueBuying = true;
        while (continueBuying) {
            IO.println("Enter the snack ID to add it:");
            _machineSnacks.ShowSnackList();
            int userSnackOption = Integer.parseInt(_scanner.nextLine());
            for (Snack _snackToRetrieve : _machineSnacks.RetrieveSnacks()) {
                if (userSnackOption == _snackToRetrieve.getIdSnack()) {
                    _userBasket.add(_snackToRetrieve);

                    IO.println("Snack succesfully agregated\n Would you like to purchase another? (Y/N)");
                    continueBuying = _scanner.nextLine().equalsIgnoreCase("Y");
                }
            }
        }
    }

    private static void ShowTicket(List<Snack> _userBasket) {
        double totalAmount = 0;
        IO.println("Snacks added:\n");
        for (Snack _snackie : _userBasket) {
            totalAmount += _snackie.getSnackPrice();
            IO.println(_snackie.getSnackName() + "->" + Double.toString(_snackie.getSnackPrice()) + "\n");
        }
        IO.println("Total amount:" + totalAmount + "\n");
    }

    private static void AddSnack(SnacksServiceList _snacks) {
        Snack newSnack = new Snack();
        _snacks.AggregateSnack(newSnack);
    }
}
