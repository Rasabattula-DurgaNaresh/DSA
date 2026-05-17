package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:47 PM
 *
 * Efficiently compute sums of diagonals of a matrix
 * Difficulty Level : Basic
 * Last Updated : 02 Jan, 2019
 * Given a 2D square matrix, find sum of elements in Principal and Secondary diagonals. For example, consider the following 4 X 4 input matrix.
 *
 * A00 A01 A02 A03
 * A10 A11 A12 A13
 * A20 A21 A22 A23
 * A30 A31 A32 A33
 * The primary diagonal is formed by the elements A00, A11, A22, A33.
 *
 * Condition for Principal Diagonal: The row-column condition is row = column.
 * The secondary diagonal is formed by the elements A03, A12, A21, A30.
 * Condition for Secondary Diagonal: The row-column condition is row = numberOfRows – column -1.
 * Examples :
 *
 * Input :
 * 4
 * 1 2 3 4
 * 4 3 2 1
 * 7 8 9 6
 * 6 5 4 3
 * Output :
 * Principal Diagonal: 16
 * Secondary Diagonal: 20
 *
 * Input :
 * 3
 * 1 1 1
 * 1 1 1
 * 1 1 1
 * Output :
 * Principal Diagonal: 3
 * Secondary Diagonal: 3
 *
 * @author DurganNaresh
 */
public class printDiagonalSums {
    static void printDiagonalSums(int [][]mat,
                                  int n)
    {
        int principal = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // Condition for principal
                // diagonal
                if (i == j)
                    principal += mat[i][j];

                // Condition for secondary
                // diagonal
                if ((i + j) == (n - 1))
                    secondary += mat[i][j];
            }
        }

        System.out.println("Principal Diagonal:"
                + principal);

        System.out.println("Secondary Diagonal:"
                + secondary);
    }

    // Driver code
    static public void main (String[] args)
    {

        int [][]a = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 } };

        printDiagonalSums(a, 4);
    }
}
