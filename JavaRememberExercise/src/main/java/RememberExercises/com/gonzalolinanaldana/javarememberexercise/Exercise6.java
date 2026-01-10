/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package RememberExercises.com.gonzalolinanaldana.javarememberexercise;

import java.util.Scanner;

/**
 *
 * @author maltr
 */
public class Exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float accountBalance = 1000.0f;
        Boolean exitApp = false;
        while (!exitApp) {
            IO.println("""
                   ***BANK ACCOUNT***
                   
                   SELECT YOUR ACTION
                   
                   1.DEPOSIT
                   2.WITHDRAW
                   3.CHECK BALANCE
                   4.EXIT
                   ******************
                   """);
            int option = Integer.parseInt(scanner.nextLine());
            switch(option)
            {
                case 1: IO.println("How much you want to deposit?");
                float amountToDeposit = Float.parseFloat(scanner.nextLine());
                accountBalance += amountToDeposit;
                break;
                
                case 2: IO.println("How much you want to withdraw");
                float amountToWithdraw = Float.parseFloat(scanner.nextLine());
                if(amountToWithdraw > accountBalance)
                {
                    IO.println("Not enough money to withdraw");
                    break;
                }
                accountBalance -= amountToWithdraw;
                break;
                
                case 3: 
                    String formatedBalance = String.format("$%.2f", accountBalance);
                    IO.println("Current Balance:\t" + formatedBalance);
                break;
                
                case 4:
                    IO.println("Goodbye");
                    exitApp = true;
                break;
                
                default: IO.println("Not available choice");
                break;
            }
        }
    }
}
