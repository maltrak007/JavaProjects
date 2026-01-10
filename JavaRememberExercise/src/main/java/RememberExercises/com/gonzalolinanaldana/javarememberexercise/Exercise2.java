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
public class Exercise2 {
    public static void main(String[] args) {
        String[]ingredientsArray;
        
        Scanner scanner = new Scanner(System.in);
        IO.println("***Recipes 2000***");
        IO.println("Introduce the recipe name: ");
        String recipeName = scanner.nextLine();
        IO.println("How many ingredients do you need?");
        int numIngredients = Integer.parseInt(scanner.nextLine());
        ingredientsArray = new String[numIngredients];
        for (int i = 0; i < numIngredients; i++)
        {
            IO.println(i + " Ingredient:");
            String ingredientName = scanner.nextLine();
            ingredientsArray[i] = ingredientName;
        }
        IO.println("Specify the duration of this recipe: ");
        double timeToPrepare = Double.parseDouble(scanner.nextLine());
        IO.println("What would you rate the difficulty of this recipe? E->Easy M->Medium H-Hard");
        String recipeDifficulty = scanner.nextLine();

        IO.println("***Recipe Data*** \n" + "Recipe Name:" + recipeName + "\nNecessary Ingredients: " + numIngredients);
        for(String ingredient : ingredientsArray)
        {
            IO.println(ingredient);
        }
        IO.println("Duration: " + timeToPrepare + "\nDifficulty: " + recipeDifficulty);
    }
}
