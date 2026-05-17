package com.durga.Geek_For_Geeks.Matrix;

import java.util.LinkedHashSet;

/**
 * created 01/04/2021 - 9:40 AM
 *
 * Find all permuted rows of a given row in a matrix
 * Difficulty Level : Easy
 * Last Updated : 09 Apr, 2019
 * We are given a m*n matrix of positive integers and a row number. The task is to find all rows in given matrix which are permutations of given row elements. It is also given that values in every row are distinct.
 *
 * Examples:
 *
 * Input : mat[][] = {{3, 1, 4, 2},
 *                    {1, 6, 9, 3},
 *                    {1, 2, 3, 4},
 *                    {4, 3, 2, 1}}
 *         row = 3
 * Output: 0, 2
 * Rows at indexes 0 and 2 are permutations of
 * row at index 3.
 *
 * @author DurganNaresh
 */
public class PermutatedRows {
    static int MAX = 100;

    // Function to find all permuted rows of a given row r
    static void permutatedRows(int mat[][], int m, int n, int r)
    {
        // Creating an empty set
        LinkedHashSet<Integer> s = new LinkedHashSet<>();


        // Count frequencies of elements in given row r
        for (int j = 0; j < n; j++)
            s.add(mat[r][j]);

        // Traverse through all remaining rows
        for (int i = 0; i < m; i++)
        {
            // we do not need to check for given row r
            if (i == r)
                continue;

            // initialize hash i.e; count frequencies
            // of elements in row i
            int j;
            for (j = 0; j < n; j++)
                if (!s.contains(mat[i][j]))
                    break;
            if (j != n)
                continue;

            System.out.print(i+", ");
        }
    }

    // Driver program to run the case
    public static void main(String[] args)
    {
        int m = 4, n = 4,r = 3;
        int mat[][] = {{3, 1, 4, 2},
                {1, 6, 9, 3},
                {1, 2, 3, 4},
                {4, 3, 2, 1}};
        permutatedRows(mat, m, n, r);
    }
}
