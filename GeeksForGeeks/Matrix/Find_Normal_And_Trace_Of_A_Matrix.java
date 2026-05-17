package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:10 AM
 *
 * Program to find Normal and Trace of a matrix
 * Difficulty Level : Basic
 * Last Updated : 18 Jan, 2019
 * Given a 2D matrix, the task is to find Trace and Normal of matrix.
 *
 * Normal of a matrix is defined as square root of sum of squares of matrix elements.
 *
 * Trace of a n x n square matrix is sum of diagonal elements.
 *
 * Examples :
 *
 * Input : mat[][] = {{7, 8, 9},
 *                    {6, 1, 2},
 *                    {5, 4, 3}};
 * Output : Normal = 16
 *          Trace  = 11
 * Explanation :
 * Normal = sqrt(7*7+ 8*8 + 9*9 + 6*6 +
 *               1*1 + 2*2 + 5*5 + 4*4 + 3*3)
 *        = 16
 * Trace  = 7+1+3 = 11
 *
 * Input :mat[][] = {{1, 2, 3},
 *                   {6, 4, 5},
 *                   {2, 1, 3}};
 * Output : Normal = 10
 *          Trace = 8
 * Explanation :
 * Normal = sqrt(1*1 +2*2 + 3*3 + 6*6 + 4*4 +
 *              5*5 + 2*2 + 1*1 + 3*3)
 * Trace = 8(1+4+3)
 *
 * @author DurganNaresh
 */
public class Find_Normal_And_Trace_Of_A_Matrix  {
    // Size of given matrix
    static  int MAX = 100;

    // Returns Normal of a matrix of size n x n
    static int findNormal(int mat[][], int n)
    {
        int sum = 0;
        for (int i=0; i<n; i++)
            for (int j=0; j<n; j++)
                sum += mat[i][j]*mat[i][j];
        return (int)Math.sqrt(sum);
    }

    // Returns trace of a matrix of size n x n
    static int findTrace(int mat[][], int n)
    {
        int sum = 0;
        for (int i=0; i<n; i++)
            sum += mat[i][i];
        return sum;
    }

    // Driven source
    public static void main (String[] args) {

        int mat[][] = {{1, 1, 1, 1, 1},
                {2, 2, 2, 2, 2},
                {3, 3, 3, 3, 3},
                {4, 4, 4, 4, 4},
                {5, 5, 5, 5, 5},
        };

        System.out.println ("Trace of Matrix = "
                + findTrace(mat, 5));
        System.out.println ("Normal of Matrix = "
                + findNormal(mat, 5));

    }

}
