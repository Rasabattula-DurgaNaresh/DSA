package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:07 AM
 *
 * Maximum and Minimum in a square matrix.
 * Difficulty Level : Easy
 * Last Updated : 14 Jun, 2019
 * Given a square matrix of order n*n, find the maximum and minimum from the matrix given.
 *
 * Examples:
 *
 * Input : arr[][] = {5, 4, 9,
 *                    2, 0, 6,
 *                    3, 1, 8};
 * Output : Maximum = 9, Minimum = 0
 *
 * Input : arr[][] = {-5, 3,
 *                    2, 4};
 * Output : Maximum = 4, Minimum = -5
 *
 * @author DurganNaresh
 */
public class Maximum_And_Minimum_In_A_Square_Matrix {
    static final int MAX = 100;

    // Finds maximum and minimum
    // in arr[0..n-1][0..n-1]
    // using pair wise comparisons
    static void maxMin(int arr[][], int n)
    {
        int min = +2147483647;
        int max = -2147483648;

        // Traverses rows one by one
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= n/2; j++)
            {
                // Compare elements from beginning
                // and end of current row
                if (arr[i][j] > arr[i][n - j - 1])
                {
                    if (min > arr[i][n - j - 1])
                        min = arr[i][n - j - 1];
                    if (max< arr[i][j])
                        max = arr[i][j];
                }
                else
                {
                    if (min > arr[i][j])
                        min = arr[i][j];
                    if (max< arr[i][n - j - 1])
                        max = arr[i][n - j - 1];
                }
            }
        }
        System.out.print("Maximum = "+max+
                ", Minimum = "+min);
    }

    // Driver program
    public static void main (String[] args)
    {
        int arr[][] = {{5, 9, 11},
                {25, 0, 14},
                {21, 6, 4}};
        maxMin(arr, 3);
    }
}
