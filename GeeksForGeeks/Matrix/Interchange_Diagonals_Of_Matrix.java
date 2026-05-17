package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:57 PM
 *
 * Program to Interchange Diagonals of Matrix
 * Difficulty Level : Basic
 * Last Updated : 08 Jun, 2020
 * Given a square matrix of order n*n, you have to interchange the elements of both diagonals.
 *
 * Examples :
 *
 * Input : matrix[][] = {1, 2, 3,
 *                       4, 5, 6,
 *                       7, 8, 9}
 * Output : matrix[][] = {3, 2, 1,
 *                        4, 5, 6,
 *                        9, 8, 7}
 *
 * Input : matrix[][] = {4,  2,  3,  1,
 *                       5,  7,  6,  8,
 *                       9, 11, 10, 12,
 *                      16, 14, 15, 13}
 * Output : matrix[][] = {1,  2,  3,  4,
 *                        5,  6,  7,  8,
 *                        9, 10, 11, 12,
 *                       11, 14, 15, 16}
 *
 * @author DurganNaresh
 */
public class Interchange_Diagonals_Of_Matrix {
    public static int N = 3;

    // Function to interchange diagonals
    static void interchangeDiagonals(int array[][])
    {
        // swap elements of diagonal
        for (int i = 0; i < N; ++i)
            if (i != N / 2)
            {
                int temp = array[i][i];
                array[i][i] = array[i][N - i - 1];
                array[i][N - i - 1] = temp;
            }

        for (int i = 0; i < N; ++i)
        {
            for (int j = 0; j < N; ++j)
                System.out.print(array[i][j]+" ");
            System.out.println();
        }
    }

    // Driver Code
    public static void main (String[] args)
    {
        int array[][] = { {4, 5, 6},
                {1, 2, 3},
                {7, 8, 9}
        };
        interchangeDiagonals(array);
    }
}
