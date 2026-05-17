package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 3:42 PM
 *
 * Given a square matrix, swap upper diagonal elements of matrix with lower diagonal elements of matrix.
 *
 * Examples :
 *
 * Input:   2  3  5  6
 *          4  5  7  9
 *          8  6  4  9
 *          1  3  5  6
 *
 * Output:  2  4  8  1
 *          3  5  6  3
 *          5  7  4  5
 *          6  9  9  6
 *
 * Input:   1  2  3
 *          4  5  6
 *          7  8  9
 *
 * Output:  1  4  7
 *          2  5  8
 *          3  6  9
 * @author DurganNaresh
 */
public class Swap_Upper_Diagonal_Elements_With_Lower_Diagonal_Elements_Of_Matrix {
    static int n = 4;

    // Function to swap the diagonal
    // elements in a matrix.
    static void swapUpperToLower(int arr[][])
    {
        // Loop for swap the elements of matrix.
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // Loop for print the matrix elements.
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
                System.out.print( arr[i][j] +" ");
            System.out.println();
        }

    }

    // Driver code
    public static void main (String[] args)
    {
        int arr[][] = { { 2, 3, 5, 6 },
                { 4, 5, 7, 9 },
                { 8, 6, 4, 9 },
                { 1, 3, 5, 6 } };

        // Function call
        swapUpperToLower(arr);

    }

}
