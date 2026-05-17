package com.durga.Geek_For_Geeks.Matrix;

import java.util.Scanner;

/**
 * created 31/03/2021 - 10:03 AM
 *
 * @author DurganNaresh
 */
public class SumOfElementsAboveDiagonal {
    public static void main(String...args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows/columns in matrix : ");    //rows and columns in matrix must be same.
        int rows = scanner.nextInt();
        int columns=rows;
        int[][] matrix = new int[rows][rows];

        System.out.println("Enter the elements in matrix :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        //Logic to calculate sum of elements above diagonal.
        int sum=0;
        for (int j = 1; j < columns; j++) {
            for (int i=j-1 ; i>=0 ; i--) {
                sum= sum + matrix[i][j];
            }

        }

        System.out.println("\nMatrix is : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("sum of elements above diagonal is: "+sum);

    }
}
