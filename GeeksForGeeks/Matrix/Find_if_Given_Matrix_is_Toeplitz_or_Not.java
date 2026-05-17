package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 10:25 AM
 *
 * Find if given matrix is Toeplitz or not
 * Difficulty Level : Easy
 * Last Updated : 26 Nov, 2020
 * Given a square matrix, find if it’s a Toeplitz matrix or not. A Toeplitz (or diagonal-constant) matrix is a matrix in which each descending diagonal from left to right is constant, i.e., all elements in a diagonal are same.
 * In general, any n×n matrix mat[][] is a Toeplitz matrix if every cell mat[i][j] is same as mat[i-1][j-1], mat[i+1][j+1], mat[i-2][j-2], mat[i+2][j+2], .. for every cell mat[i][j] and all the valid cells mat[i+k][j+k] or mat[i-k][j-k]
 *
 * Examples :
 *
 * Input: mat[N][N] = {{ 6, 7, 8},
 *                     { 4, 6, 7},
 *                     { 1, 4, 6}},
 * Output : True;
 * Values in all diagonals are same.
 *
 * Input: mat[N][N] = {{ 6, 7, 8, 9 },
 *                     { 4, 6, 7, 8 },
 *                     { 1, 4, 6, 7 },
 *                     { 0, 1, 4, 6 },
 *                     { 2, 0, 1, 4 }};
 * Output : True;
 *
 * Input: mat[N][N] = {{ 6, 3, 8},
 *                     { 4, 9, 7},
 *                     { 1, 4, 6}},
 * Output : False;
 *
 * @author DurganNaresh
 */
public class Find_if_Given_Matrix_is_Toeplitz_or_Not {
    public static int N = 5;
    public static int M = 4;

    // Function to check if all elements present in
    // descending diagonal starting from position
    // (i, j) in the matrix are all same or not
    static boolean checkDiagonal(int mat[][], int i, int j)
    {
        int res = mat[i][j];
        while (++i < N && ++j < M)
        {
            // mismatch found
            if (mat[i][j] != res)
                return false;
        }

        // we only reach here when all elements
        // in given diagonal are same
        return true;
    }

    // Function to check whether given matrix is a
    // Toeplitz matrix or not
    static boolean isToepliz(int mat[][])
    {
        // do for each element in first row
        for (int i = 0; i < M; i++)
        {
            // check descending diagonal starting from
            // position (0, j) in the matrix
            if (!checkDiagonal(mat, 0, i))
                return false;
        }

        // do for each element in first column
        for (int i = 1; i < N; i++)
        {
            // check descending diagonal starting from
            // position (i, 0) in the matrix
            if (!checkDiagonal(mat, i, 0))
                return false;
        }

        // we only reach here when each descending
        // diagonal from left to right is same
        return true;
    }

    // Driver code
    public static void main(String[] args)
    {
        int mat[][] = { { 6, 7, 8, 9 },
                { 4, 6, 7, 8 },
                { 1, 4, 6, 7 },
                { 0, 1, 4, 6 },
                { 2, 0, 1, 4 } };

        // Function call
        if (isToepliz(mat))
            System.out.println("Matrix is a Toepliz ");
        else
            System.out.println("Matrix is not a Toepliz ");
    }
}
