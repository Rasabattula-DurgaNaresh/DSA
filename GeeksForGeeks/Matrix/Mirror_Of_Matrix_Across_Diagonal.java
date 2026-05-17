package com.durga.Geek_For_Geeks.Matrix;

import java.util.Stack;

/**
 * created 31/03/2021 - 10:01 PM
 *
 * Given a 2-D array of order N x N, print a matrix which is mirror of given tree across diagonal. We need to print the result in a way, swap the values of the triangle above the diagonal with the values of the triangle below it like a mirror image swap. Print the 2-D array obtained in matrix layout.
 *
 * Examples:
 *
 * Input : int mat[][] = {{1 2 4 }
 *                        {5 9 0}
 *                        { 3 1 7}}
 * Output :  1 5 3
 *           2 9 1
 *           4 0 7
 *
 * Input : mat[][] = {{1  2  3  4 }
 *                    {5  6  7  8 }
 *                    {9  10 11 12}
 *                    {13 14 15 16} }
 * Output : 1 5 9 13
 *          2 6 10 14
 *          3 7 11 15
 *          4 8 12 16
 *
 * @author DurganNaresh
 */
public class Mirror_Of_Matrix_Across_Diagonal {
    static int MAX = 100;

    static void imageSwap(int mat[][], int n)
    {
        // for diagonal which start from at
        // first row of matrix
        int row = 0;

        // traverse all top right diagonal
        for (int j = 0; j < n; j++)
        {

            // here we use stack for reversing
            // the element of diagonal
            Stack<Integer> s = new Stack<>();
            int i = row, k = j;
            while (i < n && k >= 0)
            {
                s.push(mat[i++][k--]);
            }

            // push all element back to matrix
            // in reverse order
            i = row;
            k = j;
            while (i < n && k >= 0)
            {
                mat[i++][k--] = s.peek();
                s.pop();
            }
        }

        // do the same process for all the
        // diagonal which start from last
        // column
        int column = n - 1;
        for (int j = 1; j < n; j++)
        {

            // here we use stack for reversing
            // the elements of diagonal
            Stack<Integer> s = new Stack<>();
            int i = j, k = column;
            while (i < n && k >= 0)
            {
                s.push(mat[i++][k--]);
            }

            // push all element back to matrix
            // in reverse order
            i = j;
            k = column;
            while (i < n && k >= 0)
            {
                mat[i++][k--] = s.peek();
                s.pop();
            }
        }
    }

    // Utility function to print a matrix
    static void printMatrix(int mat[][], int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println("");
        }
    }

    // Driver program to test above function
    public static void main(String[] args)
    {

        int mat[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int n = 4;
        imageSwap(mat, n);
        printMatrix(mat, n);
    }
}
