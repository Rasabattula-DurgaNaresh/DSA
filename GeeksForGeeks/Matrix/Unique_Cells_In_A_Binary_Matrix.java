package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:24 PM
 *
 * Unique cells in a binary matrix
 * Difficulty Level : Medium
 * Last Updated : 03 Feb, 2020
 * Given a matrix of size n x m consisting of 0’s and 1’s.We need to find number of unique cells with value 1 such that corresponding entire row and entire column does not have another 1.Return the number of unique cells.
 *
 * Examples:
 *
 * Input : mat[][] = {0, 1, 0, 0
 *                    0, 0, 1, 0
 *                    1, 0, 0, 1}
 * Answer : 2
 * The two 1s that are unique
 * in their rows and columns
 * are highlighted.
 *
 * Input : mat[][] = {
 * {0, 0, 0, 0, 0, 0, 1}
 * {0, 1, 0, 0, 0, 0, 0}
 * {0, 0, 0, 0, 0, 1, 0}
 * {1, 0, 0, 0, 0, 0, 0}
 * {0, 0, 1, 0, 0, 0, 1}
 * Output : 3
 *
 * @author DurganNaresh
 */
public class Unique_Cells_In_A_Binary_Matrix {
    static final int MAX = 100;

    // Returns true if mat[i][j] is unique
    static boolean isUnique(int mat[][], int i, int j,
                            int n, int m)
    {
        // checking in row calculating sumrow
        // will be moving  column wise
        int sumrow = 0;
        for (int k = 0; k < m; k++) {
            sumrow += mat[i][k];
            if (sumrow > 1)
                return false;
        }

        // checking in column calculating sumcol
        // will be moving  row wise
        int sumcol = 0;
        for (int k = 0; k < n; k++) {
            sumcol += mat[k][j];
            if (sumcol > 1)
                return false;
        }

        return true;
    }

    static int countUnique(int mat[][], int n, int m)
    {
        int uniquecount = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (mat[i][j]!=0 &&
                        isUnique(mat, i, j, n, m))
                    uniquecount++;
        return uniquecount;
    }
    // Driver code
    static public void main(String[] args) {
        int mat[][] = {{0, 1, 0, 0},
                {0, 0, 1, 0},
                {1, 0, 0, 1}};
        System.out.print(countUnique(mat, 3, 4));
    }
}
