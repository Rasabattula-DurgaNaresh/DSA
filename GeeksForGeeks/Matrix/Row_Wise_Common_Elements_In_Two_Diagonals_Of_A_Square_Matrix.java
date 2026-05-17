package com.durga.Geek_For_Geeks.Matrix;

import java.io.IOException;

/**
 * created 31/03/2021 - 10:31 PM
 *
 * Row-wise common elements in two diagonals of a square matrix
 * Difficulty Level : Easy
 * Last Updated : 14 Jun, 2018
 * Given a square matrix, find out count of numbers that are same in same row and same in both primary and secondary diagonals.
 *
 * Examples :
 *
 * Input : 1 2 1
 *         4 5 2
 *         0 5 1
 * Output : 2
 * Primary diagonal is 1 5 1
 * Secondary diagonal is 1 5 0
 * Two elements (1 and 5) match
 * in two diagonals and same.
 *
 * Input : 1 0 0
 *         0 1 0
 *         0 0 1
 * Output : 1
 * Primary diagonal is 1 1 1
 * Secondary diagonal is 0 1 0
 * Only one element is same.
 *
 * @author DurganNaresh
 */
public class Row_Wise_Common_Elements_In_Two_Diagonals_Of_A_Square_Matrix {
    int MAX = 100;

    // Returns count of row wise same elements
    // in two diagonals of mat[n][n]
    static int countCommon(int mat[][], int n)
    {
        int res = 0;
        for (int i = 0; i < n; i++)
            if (mat[i][i] == mat[i][n - i - 1])
                res++;
        return res;
    }

    // Driver Code
    public static void main(String args[])throws IOException
    {
        int mat[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        System.out.println(countCommon(mat, 3));
    }
}
