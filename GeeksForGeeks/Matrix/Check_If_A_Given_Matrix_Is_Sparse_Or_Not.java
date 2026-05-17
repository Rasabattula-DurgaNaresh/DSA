package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:28 PM
 *
 * Check if a given matrix is sparse or not
 * Difficulty Level : Basic
 * Last Updated : 21 May, 2018
 * A matrix is a two dimensional data objects having m rows and n columns, therefore a total of m*n values. If most of the values of a matrix is 0 then we say that the matrix is sparse.
 * Consider a definition of Sparse where a matrix is considered sparse if number of 0s is more than half of the elements in matrix,
 *
 * Examples:
 *
 * Input : 1 0 3
 *         0 0 4
 *         6 0 0
 * Output : Yes
 * There are 5 zeros. This count
 * is more than half of matrix
 * size.
 *
 * Input : 1 2 3
 *         0 7 8
 *         5 0 7
 * Output: No
 *
 * @author DurganNaresh
 */
public class Check_If_A_Given_Matrix_Is_Sparse_Or_Not {
    static int MAX = 100;

    static boolean isSparse(int array[][], int m, int n)
    {
        int counter = 0;

        // Count number of zeros in the matrix
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                if (array[i][j] == 0)
                    ++counter;

        return (counter > ((m * n) / 2));
    }

    // Driver Function
    public static void main(String args[])
    {
        int array[][] = { { 1, 0, 3 },
                { 0, 0, 4 },
                { 6, 0, 0 } };

        int m = 3,
                n = 3;
        if (isSparse(array, m, n))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
