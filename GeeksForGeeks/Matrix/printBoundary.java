package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:49 PM
 *
 * Boundary elements of a Matrix
 * Difficulty Level : Basic
 * Last Updated : 15 Jun, 2020
 * Printing Boundary Elements of a Matrix.
 *
 * Given a matrix of size n x m. Print the boundary elements of the matrix. Boundary elements are those elements which are not surrounded by elements on all four directions, i.e. elements in first row, first column, last row and last column.
 * Examples:
 *
 * Input :
 *         1 2 3 4
 *         5 6 7 8
 *         1 2 3 4
 *         5 6 7 8
 * Output :
 *          1 2 3 4
 *          5     8
 *          1     4
 *          5 6 7 8
 * Explanation:The boundary elements of the
 * matrix is printed.
 *
 * Input:
 *         1 2 3
 *         5 6 7
 *         1 2 3
 * Output:
 *         1 2 3
 *         5   7
 *         1 2 3
 * Explanation:The boundary elements of the
 * matrix is printed.
 *
 * @author DurganNaresh
 */
public class printBoundary {
    public static void printBoundary(int a[][], int m,
                                     int n)
    {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0)
                    System.out.print(a[i][j] + " ");
                else if (i == m - 1)
                    System.out.print(a[i][j] + " ");
                else if (j == 0)
                    System.out.print(a[i][j] + " ");
                else if (j == n - 1)
                    System.out.print(a[i][j] + " ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };

        printBoundary(a, 4, 4);
    }
}
