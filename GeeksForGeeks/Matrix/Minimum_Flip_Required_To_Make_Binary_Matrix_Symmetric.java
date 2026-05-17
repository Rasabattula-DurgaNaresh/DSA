package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 3:17 PM
 *
 * Given a Binary Matrix of size N X N, consisting of 1s and 0s. The task is to find the minimum flips required to make the matrix symmetric along main diagonal.
 *
 * Examples :
 *
 * Input : mat[][] = { { 0, 0, 1 },
 *                     { 1, 1, 1 },
 *                     { 1, 0, 0 } };
 * Output : 2
 * Value of mat[1][0] is not equal to mat[0][1].
 * Value of mat[2][1] is not equal to mat[1][2].
 * So, two flip are required.
 *
 * Input : mat[][] = { { 1, 1, 1, 1, 0 },
 *                     { 0, 1, 0, 1, 1 },
 *                     { 1, 0, 0, 0, 1 },
 *                     { 0, 1, 0, 1, 0 },
 *                     { 0, 1, 0, 0, 1 } };
 * Output : 3
 *
 * @author DurganNaresh
 */
public class Minimum_Flip_Required_To_Make_Binary_Matrix_Symmetric {
    // Return the minimum flip required
    // to make Binary Matrix symmetric
    // along main diagonal.
    static int minimumflip(int mat[][], int n)
    {
        int transpose[][] = new int[n][n];

        // finding the transpose of the matrix
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                transpose[i][j] = mat[j][i];

        // Finding the number of position
        // where element are not same.
        int flip = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (transpose[i][j] != mat[i][j])
                    flip++;

        return flip / 2;
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int n = 3;
        int mat[][] = {{ 0, 0, 1 },
                { 1, 1, 1 },
                { 1, 0, 0 }};

        System.out.println(minimumflip(mat, n));
    }
}
