package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 30/03/2021 - 10:04 PM
 *
 * Given a matrix of order M*N and a value K, the task is to rotate each ring of the matrix anticlockwise by K elements. If in any ring elements are less than and equal K then don’t rotate it.
 *
 * Examples:
 *
 * Input : k = 3
 *         mat[4][4] = {{1, 2, 3, 4},
 *                     {5, 6, 7, 8},
 *                     {9, 10, 11, 12},
 *                     {13, 14, 15, 16}}
 * Output: 4 8  12 16
 *         3 10  6 15
 *         2 11  7 14
 *         1  5  9 13
 *
 * Input : k = 2
 *         mat[3][4] = {{1, 2, 3, 4},
 *                     {10, 11, 12, 5},
 *                     {9, 8, 7, 6}}
 * Output: 3 4  5  6
 *         2 11 12 7
 *         1 10  9 8
 *
 * @author DurganNaresh
 */
public class Rotate_Each_Ring_Of_Matrix_Anticlockwise_By_K_Elements {
    // size of matrix
    static final int M=3;
    static final int N=3;
    // Function to rotate matrix by k times
    static void rotateMatrix(int matrix[][], int k)
    {
// Temporary array of size M
        int temp[]=new int[M];

        k = k % M;
        for (int i = 0; i < N; i++)
        {
// copy first M-k elements to temporary array
            for (int t = 0; t < M - k; t++)
                temp[t] = matrix[i][t];

// copy the elements from k to end to starting
            for (int j = M - k; j < M; j++)
                matrix[i][j - M + k] = matrix[i][j];

// copy elements from temporary array to end
            for (int j = k; j < M; j++)
                matrix[i][j] = temp[j - k];
        }
    }

    // Function to display the matrix
    static void printMatrix(int matrix[][])
    {
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < M; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

    // Driver code
    public static void main (String[] args)
    {
        int matrix[][] = {{1,2,3} ,{4,5,6} ,{7,8,9}};
        System.out.println("The inputted matrix : ");
        printMatrix(matrix);
        int k = 2;

// Rotate matrix k times
        rotateMatrix(matrix, k);

// Print rotated matrix
        System.out.println("\nThe Rotated Matrix : \n");
        printMatrix(matrix);
    }
}
