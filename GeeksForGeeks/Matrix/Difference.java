package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:58 PM
 * Find difference between sums of two diagonals
 * Given a matrix of n X n. The task is to calculate the absolute difference between the sums of its diagonal.
 *
 * Examples:
 *
 * Input : mat[][] = 11 2 4
 *                    4 5 6
 *                   10 8 -12
 * Output : 15
 * Sum of primary diagonal = 11 + 5 + (-12) = 4.
 * Sum of primary diagonal = 4 + 5 + 10 = 19.
 * Difference = |19 - 4| = 15.
 *
 *
 * Input : mat[][] = 10 2
 *                    4 5
 * Output : 7
 *
 * @author DurganNaresh
 */
public class Difference {
    public static int difference(int arr[][], int n)
    {
        // Initialize sums of diagonals
        int d1 = 0, d2 = 0;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                // finding sum of primary diagonal
                if (i == j)
                    d1 += arr[i][j];

                // finding sum of secondary diagonal
                if (i == n - j - 1)
                    d2 += arr[i][j];
            }
        }

        // Absolute difference of the sums
        // across the diagonals
        return Math.abs(d1 - d2);
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int n = 3;

        int arr[][] =
                {
                        {11, 2, 4},
                        {4 , 5, 6},
                        {10, 8, -12}
                };

        System.out.print(difference(arr, n));

    }
}
