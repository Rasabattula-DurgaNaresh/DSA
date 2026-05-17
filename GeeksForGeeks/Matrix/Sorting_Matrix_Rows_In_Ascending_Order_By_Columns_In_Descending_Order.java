package com.durga.Geek_For_Geeks.Matrix;

import java.util.Arrays;
import java.util.Collections;

/**
 * created 31/03/2021 - 10:47 AM
 *
 * Given a matrix, sort the rows of matrix in ascending order followed by sorting the columns in descending order.
 * Examples :
 *
 * Input : a[3][3] = {{1, 2, 3},
 *                   {4, 5, 6},
 *                   {7, 8, 9}};
 * Output : 7 8 9
 *          4 5 6
 *          1 2 3
 *
 * Input : a[3][3] = {{3, 2, 1},
 *                   {9, 8, 7},
 *                   {6, 5, 4}};
 * Output : 7 8 9
 *          4 5 6
 *          1 2 3
 *
 * @author DurganNaresh
 */
public class Sorting_Matrix_Rows_In_Ascending_Order_By_Columns_In_Descending_Order {
    static int MAX_SIZE=10;

    // function to sort each row of the matrix
    // according to the order specified by
    // ascending.
    static void sortByRow(Integer mat[][], int n,
                          boolean ascending)
    {
        for (int i = 0; i < n; i++)
        {
            if (ascending)
                Arrays.sort(mat[i]);
            else
                Arrays.sort(mat[i], Collections.reverseOrder());
        }
    }

    // function to find transpose of the matrix
    static void transpose(Integer mat[][], int n)
    {
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j < n; j++)
            {
                // swapping element at index (i, j)
                // by element at index (j, i)
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
    }

    // function to sort the matrix row-wise
    // and column-wise
    static void sortMatRowAndColWise(Integer mat[][],
                                     int n)
    {
        // sort rows of mat[][]
        sortByRow(mat, n, true);

        // get transpose of mat[][]
        transpose(mat, n);

        // again sort rows of mat[][] in descending
        // order.
        sortByRow(mat, n, false);

        // again get transpose of mat[][]
        transpose(mat, n);
    }

    // function to print the matrix
    static void printMat(Integer mat[][], int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }

    // Driver code
    public static void main (String[] args)
    {
        int n = 3;

        Integer mat[][] = {{3, 2, 1},
                {9, 8, 7},
                {6, 5, 4}};

        System.out.print("Original Matrix:\n");
        printMat(mat, n);

        sortMatRowAndColWise(mat, n);

        System.out.print("\nMatrix After Sorting:\n");
        printMat(mat, n);
    }
}
