package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 30/03/2021 - 9:58 PM
 *
 * Given a square matrix, turn it by 90 degrees in anti-clockwise direction without using any extra space.
 *
 * Examples:
 *
 * Input:
 *  1  2  3
 *  4  5  6
 *  7  8  9
 * Output:
 *  3  6  9
 *  2  5  8
 *  1  4  7
 * Rotated the input matrix by
 * 90 degrees in anti-clockwise direction.
 *
 * Input:
 *  1  2  3  4
 *  5  6  7  8
 *  9 10 11 12
 * 13 14 15 16
 * Output:
 *  4  8 12 16
 *  3  7 11 15
 *  2  6 10 14
 *  1  5  9 13
 * Rotated the input matrix by
 * 90 degrees in anti-clockwise direction.
 *
 * @author DurganNaresh
 */
public class Rotate_Matrix_By_90_Degree_Without_Using_Any_Extra_Space_Set2 {
    // After transpose we swap elements of
    // column one by one for finding left
    // rotation of matrix by 90 degree
    static void reverseColumns(int arr[][])
    {
        for (int i = 0; i < arr[0].length; i++)
            for (int j = 0, k = arr[0].length - 1;
                 j < k; j++, k--) {
                int temp = arr[j][i];
                arr[j][i] = arr[k][i];
                arr[k][i] = temp;
            }
    }

    // Function for do transpose of matrix
    static void transpose(int arr[][])
    {
        for (int i = 0; i < arr.length; i++)
            for (int j = i; j < arr[0].length;
                 j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
    }

    // Function for print matrix
    static void printMatrix(int arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length;
                 j++)
                System.out.print(arr[i][j] + " ");
            System.out.println("");
        }
    }

    // Function to anticlockwise rotate
    // matrix by 90 degree
    static void rotate90(int arr[][])
    {
        transpose(arr);
        reverseColumns(arr);
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int arr[][] = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };

        rotate90(arr);
        printMatrix(arr);
    }
}
