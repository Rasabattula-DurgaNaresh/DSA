package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:42 PM
 *
 * Program to Print Matrix in Z form
 * Difficulty Level : Basic
 * Last Updated : 21 Dec, 2020
 * Given a square matrix of order n*n, we need to print elements of the matrix in Z form
 *
 *
 * Examples:
 * Input : mat[][] =  {1, 2, 3,
 *                     4, 5, 6,
 *                     7, 8, 9}
 * Output : 1 2 3 5 7 8 9
 *
 * Input : mat[][] = {5, 19, 8, 7,
 *                    4, 1, 14, 8,
 *                    2, 20, 1, 9,
 *                    1, 2, 55, 4}
 * Output: 5 19 8 7 14 20 1 2 55 4
 *
 * @author DurganNaresh
 */
public class Print_Matrix_in_Z_Form {
    public static void diag(int arr[][], int n)
    {
        int i = 0, j, k;

        // print first row
        for (j = 0; j < n - 1; j++) {
            System.out.print(arr[i][j] + " ");
        }

        // Print diagonal
        k = 1;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n; j++) {
                if (j == n - k) {
                    System.out.print(arr[i][j] + " ");
                    break;
                }
            }
            k++;
        }
        // Print last row
        i = n - 1;
        for (j = 0; j < n; j++)
            System.out.print(arr[i][j] + " ");

        System.out.print("\n");
    }

    public static void main(String[] args)
    {
        int a[][] = { { 4, 5, 6, 8 },
                { 1, 2, 3, 1 },
                { 7, 8, 9, 4 },
                { 1, 8, 7, 5 } };

        diag(a, 4);
    }
}
