package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 11:13 AM
 *
 * A magic square of order n is an arrangement of n^2 numbers, usually distinct integers, in a square, such that the n numbers in all rows, all columns, and both diagonals sum to the same constant. A magic square contains the integers from 1 to n^2.
 *
 * The constant sum in every row, column and diagonal is called the magic constant or magic sum, M. The magic constant of a normal magic square depends only on n and has the following value:
 * M = n (n^2 + 1) / 2.
 *
 * Examples:
 *
 * Magic Square of order 3:
 * -----------------------
 *  2   7   6
 *  9   5   1
 *  4   3   8
 *
 * Magic Square of order 4:
 * -----------------------
 * 16 2 3 13
 * 5 11 10 8
 * 9  7 6 12
 * 4 14 15 1
 *
 * Magic Square of order 8:
 * -----------------------
 * 64 63  3  4  5  6 58 57
 * 56 55 11 12 13 14 50 49
 * 17 18 46 45 44 43 23 24
 * 25 26 38 37 36 35 31 32
 * 33 34 30 29 28 27 39 40
 * 41 42 22 21 20 19 47 48
 * 16 15 51 52 53 54 10 9
 * 8  7  59 60 61 62 2  1
 *
 * @author DurganNaresh
 */
public class Magic_Square_Even_Order {
    // Function for calculating Magic square
    static void doublyEven(int n)
    {
        int[][] arr = new int[n][n];
        int i, j;

        // filling matrix with its count value
        // starting from 1;
        for ( i = 0; i < n; i++)
            for ( j = 0; j < n; j++)
                arr[i][j] = (n*i) + j + 1;

        // change value of Array elements
        // at fix location as per rule
        // (n*n+1)-arr[i][j]
        // Top Left corner of Matrix
        // (order (n/4)*(n/4))
        for ( i = 0; i < n/4; i++)
            for ( j = 0; j < n/4; j++)
                arr[i][j] = (n*n + 1) - arr[i][j];

        // Top Right corner of Matrix
        // (order (n/4)*(n/4))
        for ( i = 0; i < n/4; i++)
            for ( j = 3 * (n/4); j < n; j++)
                arr[i][j] = (n*n + 1) - arr[i][j];

        // Bottom Left corner of Matrix
        // (order (n/4)*(n/4))
        for ( i = 3 * n/4; i < n; i++)
            for ( j = 0; j < n/4; j++)
                arr[i][j] = (n*n+1) - arr[i][j];

        // Bottom Right corner of Matrix
        // (order (n/4)*(n/4))
        for ( i = 3 * n/4; i < n; i++)
            for ( j = 3 * n/4; j < n; j++)
                arr[i][j] = (n*n + 1) - arr[i][j];

        // Centre of Matrix (order (n/2)*(n/2))
        for ( i = n/4; i < 3 * n/4; i++)
            for ( j = n/4; j < 3 * n/4; j++)
                arr[i][j] = (n*n + 1) - arr[i][j];

        // Printing the magic-square
        for (i = 0; i < n; i++)
        {
            for ( j = 0; j < n; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }

    // driver program
    public static void main (String[] args)
    {
        int n = 8;
        // Function call
        doublyEven(n);
    }

}
