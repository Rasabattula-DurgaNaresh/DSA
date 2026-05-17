package com.durga.Geek_For_Geeks.Matrix;

import java.util.Arrays;

/**
 * created 31/03/2021 - 11:08 AM
 *
 * Given a n x n matrix. The problem is to sort the matrix row-wise and column wise.
 *
 * Examples:
 *
 * Input : mat[][] = { {4, 1, 3},
 *                     {9, 6, 8},
 *                     {5, 2, 7} }
 * Output : 1 3 4
 *          2 5 7
 *          6 8 9
 *
 * Input : mat[][] = { {12, 7, 1, 8},
 *                     {20, 9, 11, 2},
 *                     {15, 4, 5, 13},
 *                     {3, 18, 10, 6} }
 * Output : 1 5 8 12
 *          2 6 10 15
 *          3 7 11 18
 *          4 9 13 20
 *
 * @author DurganNaresh
 */
public class Sort_The_Matrix_Row_Wise_And_Column_Wise {
    static final int MAX_SIZE=10;

    // function to sort each row of the matrix
    static void sortByRow(int mat[][], int n)
    {
        for (int i = 0; i < n; i++)

            // sorting row number 'i'
            Arrays.sort(mat[i]);
    }

    // function to find transpose of the matrix
    static void transpose(int mat[][], int n)
    {
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
            {
                // swapping element at index (i, j)
                // by element at index (j, i)
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
    }

    // function to sort the matrix row-wise
    // and column-wise
    static void sortMatRowAndColWise(int mat[][],int n)
    {
        // sort rows of mat[][]
        sortByRow(mat, n);

        // get transpose of mat[][]
        transpose(mat, n);

        // again sort rows of mat[][]
        sortByRow(mat, n);

        // again get transpose of mat[][]
        transpose(mat, n);
    }

    // function to print the matrix
    static void printMat(int mat[][], int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

    // Driver code
    public static void main (String[] args)
    {
        int mat[][] = { { 4, 1, 3 },
                { 9, 6, 8 },
                { 5, 2, 7 } };
        int n = 3;

        System.out.print("Original Matrix:\n");
        printMat(mat, n);

        sortMatRowAndColWise(mat, n);

        System.out.print("\nMatrix After Sorting:\n");
        printMat(mat, n);
    }
}
