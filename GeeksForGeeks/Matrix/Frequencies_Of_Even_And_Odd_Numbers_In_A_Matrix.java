package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 3:28 PM
 *Given a matrix of order m*n then the task is to find the frequency of even and odd numbers in matrix
 * Examples:
 *
 * Input : m = 3, n = 3
 *         { 1, 2, 3 },
 *         { 4, 5, 6 },
 *         { 7, 8, 9 }
 * Output : Frequency of odd number =  5
 *          Frequency of even number = 4
 *
 *
 * Input :   m = 3, n = 3
 *          { 10, 11, 12 },
 *          { 13, 14, 15 },
 *          { 16, 17, 18 }
 * Output : Frequency of odd number  =  4
 *          Frequency of even number  = 5
 *
 * @author DurganNaresh
 */
public class Frequencies_Of_Even_And_Odd_Numbers_In_A_Matrix {
    static final int MAX = 100;

    // function for calculating frequency
    static void freq(int ar[][], int m, int n) {
        int even = 0, odd = 0;

        for (int i = 0; i < m; ++i)
        {
            for (int j = 0; j < n; ++j)
            {
                // modulo by 2 to check
                // even and odd
                if ((ar[i][j] % 2) == 0)
                    ++even;
                else
                    ++odd;
            }
        }

        // print Frequency of numbers
        System.out.print(" Frequency of odd number =" +
                odd + " \n");
        System.out.print(" Frequency of even number = " +
                even + " \n");
    }

    // Driver code
    public static void main(String[] args) {
        int m = 3, n = 3;

        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        freq(array, m, n);
    }
}
