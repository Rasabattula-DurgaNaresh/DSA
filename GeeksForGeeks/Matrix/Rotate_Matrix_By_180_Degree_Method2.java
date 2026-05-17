package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 30/03/2021 - 10:02 PM
 *
 * There are four steps :
 * 1- Find transpose of matrix.
 * 2- Reverse columns of the transpose.
 * 3- Find transpose of matrix.
 * 4- Reverse columns of the transpose
 *
 * Let the given matrix be
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 *
 * First we find transpose.
 * 1 5 9 13
 * 2 6 10 14
 * 3 7 11 15
 * 4 8 12 16
 *
 * Then we reverse elements of every column.
 * 4 8 12 16
 * 3 7 11 15
 * 2 6 10 14
 * 1 5  9 13
 *
 * then transpose again
 * 4 3 2 1
 * 8 7 6 5
 * 12 11 10 9
 * 16 15 14 13
 *
 * Then we reverse elements of every column again
 * 16 15 14 13
 * 12 11 10 9
 * 8 7 6 5
 * 4 3 2 1
 *
 * @author DurganNaresh
 */
public class Rotate_Matrix_By_180_Degree_Method2 {
    static int R = 4, C = 4, t = 0;

    // Function to rotate the
    // matrix by 180 degree
    static void reverseColumns(int arr[][])
    {
        for (int i = 0; i < C; i++) {
            for (int j = 0, k = C - 1; j < k; j++, k--) {
                t = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = t;
            }
        }
    }

    // Function for transpose of matrix
    static void transpose(int arr[][])
    {
        for (int i = 0; i < R; i++) {
            for (int j = i; j < C; j++) {
                t = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = t;
            }
        }
    }

    // Function for display the matrix
    static void printMatrix(int arr[][])
    {
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    // Function to anticlockwise
    // rotate matrix by 180 degree
    static void rotate180(int arr[][])
    {
        transpose(arr);
        reverseColumns(arr);
        transpose(arr);
        reverseColumns(arr);
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        rotate180(arr);
        printMatrix(arr);
    }

}
