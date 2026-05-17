package com.durga.Geek_For_Geeks.Matrix;

import java.util.Arrays;

/**
 * created 30/03/2021 - 10:19 PM
 *
 * Given a n x n matrix. The problem is to sort the given matrix in strict order. Here strict order means that matrix is sorted in a way such that all elements in a row are sorted in increasing order and for row ‘i’, where 1 <= i <= n-1, first element of row 'i' is greater than or equal to the last element of row 'i-1'.
 *
 * Examples:
 *
 * Input : mat[][] = { {5, 4, 7},
 *                     {1, 3, 8},
 *                     {2, 9, 6} }
 * Output : 1 2 3
 *          4 5 6
 *          7 8 9
 *
 *
 * @author DurganNaresh
 */
public class Sort_The_Given_Matrix {
    static int SIZE = 10;

    // function to sort the given matrix
    static void sortMat(int mat[][], int n)
    {
        // temporary matrix of size n^2
        int temp[] = new int[n * n];
        int k = 0;

        // copy the elements of matrix
        // one by one into temp[]
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                temp[k++] = mat[i][j];

        // sort temp[]
        Arrays.sort(temp);

        // copy the elements of temp[]
        // one by one in mat[][]
        k = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                mat[i][j] = temp[k++];
    }

    // function to print the given matrix
    static void printMat(int mat[][], int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print( mat[i][j] + " ");
            System.out.println();
        }
    }

    // Driver program to test above
    public static void main(String args[])
    {
        int mat[][] = { { 5, 4, 7 },
                { 1, 3, 8 },
                { 2, 9, 6 } };
        int n = 3;

        System.out.println("Original Matrix:");
        printMat(mat, n);

        sortMat(mat, n);

        System.out.println("Matrix After Sorting:");
        printMat(mat, n);

    }
}
