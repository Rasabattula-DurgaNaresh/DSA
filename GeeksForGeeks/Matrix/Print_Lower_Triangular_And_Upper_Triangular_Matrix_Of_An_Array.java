package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 8:53 AM
 *
 * Input : matrix[3][3] = {1 2 3
 *                        4 5 6
 *                        7 8 9}
 * Output :
 * Lower : 1 0 0        Upper : 1 2 3
 *         4 5 0                0 5 6
 *         7 8 9                0 0 9
 *
 * Input : matrix[3][3] = {7 8 9
 *                         3 2 1
 *                         6 5 4}
 * Output :
 * Lower : 7 0 0       Upper : 7 8 9
 *         3 2 0               0 2 1
 *         6 5 4               0 0 4
 * Steps:
 *
 * For lower triangular matrix, we check the index position i and j i.e row and column respectively.
 * If column position is greater than row position we simply make that position 0.
 * For upper triangular matrix, we check the index position i and j i.e row and column respectively.
 * If column position is smaller than row position we simply make that position 0.
 *
 * @author DurganNaresh
 */
public class Print_Lower_Triangular_And_Upper_Triangular_Matrix_Of_An_Array {
    // method to form lower
    // triangular matrix
    static void lower(int matrix[][],
                      int row, int col)
    {
        int i, j;
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < col; j++)
            {
                if (i < j)
                {
                    System.out.print("0" + " ");
                }
                else
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to form upper
    // triangular matrix
    static void upper(int matrix[][],
                      int row, int col)
    {
        int i, j;
        for (i = 0; i < row; i++)
        {
            for (j = 0; j < col; j++)
            {
                if (i > j)
                {
                    System.out.print("0" + " ");
                }
                else
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        int matrix[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int row = 3, col = 3;

        System.out.println("Lower triangular matrix: ");
        lower(matrix, row, col);

        System.out.println("Upper triangular matrix: ");
        upper(matrix, row, col);
    }
}
