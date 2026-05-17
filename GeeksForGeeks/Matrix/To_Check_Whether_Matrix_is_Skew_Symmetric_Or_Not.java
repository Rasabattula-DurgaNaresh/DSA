package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:16 AM
 *
 * To Check whether Matrix is Skew Symmetric or not
 * Difficulty Level : Basic
 * Last Updated : 29 Nov, 2020
 * A Skew Symmetric Matrix or Anti-Symmetric Matrix is a square matrix whose transpose is negative to that of the original matrix. If the entry in the ith row and jth column of a matrix is a[i][j], i.e. if A = (a[i][j]) then the skew symmetric condition is -A = -a[j][i].
 * Examples :
 *
 *
 * Input : matrix:     0   5  -4
 *                    -5   0   1
 *                     4  -1   0
 *
 * Output:
 * Transpose matrix:   0  -5   4
 *                     5   0  -1
 *                    -4   1   0
 * Skew Symmetric matrix
 *
 * Steps:
 *
 *
 * Find the transpose of the input matrix.
 * If the input matrix is equal to the negative of its transpose matrix, then the matrix is Skew Symmetrical.
 *
 * @author DurganNaresh
 */
public class To_Check_Whether_Matrix_is_Skew_Symmetric_Or_Not {
    static int ROW =3;
    static int COL =3;

    // Utility function to create transpose matrix
    static void transpose(int transpose_matrix[][],
                          int matrix[][])
    {
        for (int i = 0; i < ROW; i++)
            for (int j = 0; j < COL; j++)
                transpose_matrix[j][i] = matrix[i][j];
    }

    // Utility function to check skew - symmetric
// matrix condition
    static boolean check(int transpose_matrix[][],
                         int matrix[][])
    {
        for (int i = 0; i < ROW; i++)
            for (int j = 0; j < COL; j++)
                if (matrix[i][j] != -transpose_matrix[i][j])
                    return false;
        return true;
    }

    // Utility function to print a matrix
    static void printMatrix(int matrix[][])
    {
        for (int i = 0; i < ROW; i++)
        {
            for (int j = 0; j < COL; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    // Driver program to test above functions
    public static void main (String[] args) {
        int matrix[][] = {
                {0, 5, -4},
                {-5, 0, 1},
                {4, -1, 0},
        };

        int transpose_matrix[][] = new int[ROW][COL];

        // Function create transpose matrix
        transpose(transpose_matrix, matrix);

        System.out.println ("Transpose matrix: ");
        printMatrix(transpose_matrix);

        // Check whether matrix is skew-symmetric or not
        if (check(transpose_matrix, matrix))
            System.out.println("Skew Symmetric Matrix");
        else
            System.out.println("Not Skew Symmetric Matrix");


    }
}
