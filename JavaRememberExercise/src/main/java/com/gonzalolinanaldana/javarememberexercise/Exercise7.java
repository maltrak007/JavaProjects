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
public class Exercise7 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IO.println("***Matrix Creator & Diagonal Add*** \n Specify a number of rows");
        int rowNumber = Integer.parseInt(scanner.nextLine());
        IO.println("Specify a number of columns");
        int columnNumber = Integer.parseInt(scanner.nextLine());
        int[][]matrixArray = CreateMatrix(rowNumber,columnNumber);
        
        if(rowNumber == columnNumber)
        {
            MatrixDiagonalAddition(matrixArray);
        }
        else
        {
            IO.println("Diagonal addition require a square matrix");
        }
    }
    
    public static int[][] CreateMatrix(int _row, int _column)
    {
        Scanner matrixScanner = new Scanner(System.in);
        int[][] matrixArray = new int[_row][_column];
        for(int i = 0; i < matrixArray.length; i++)
        {
           for(int x=0; x < matrixArray[i].length; x++)
           {
                IO.println("Specify the value at row | column: \t" + i + " " + x);
                matrixArray[i][x] = Integer.parseInt(matrixScanner.nextLine());
           }
        }
        return matrixArray;
    }
    
    public static void MatrixDiagonalAddition(int _matrix[][])
    {
        int sum = 0;
        
        for (int i = 0; i < _matrix.length; i++) {
            sum += _matrix[i][i];
        }
        System.out.println("The sum of the primary diagonal is: " + sum);
    }
}
