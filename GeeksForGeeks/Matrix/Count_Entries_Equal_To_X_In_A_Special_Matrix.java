package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:27 PM
 *
 * Count entries equal to x in a special matrix
 * Difficulty Level : Easy
 * Last Updated : 30 Nov, 2018
 * You are given a square matrix (matrix[][]) of order n, where matrix[i][j] = i*j. Find the number of cells which have entry equal to a given number x.
 * NOte : Indexing of matrix starts from 1, i.e. 1<= i,j <= n.
 *
 * Examples :
 *
 * Input : matrix[][] = {1, 2, 3, 4,
 *                       2, 4, 6, 8,
 *                       3, 6, 9, 12,
 *                       4, 8, 12, 16}
 *                 x = 4
 * Output : 3
 *
 * Input : matrix[][] = {1, 2, 3, 4,
 *                       2, 4, 6, 8,
 *                       3, 6, 9, 12,
 *                       4, 8, 12, 16}
 *                  x = 12
 * Output : 2
 *
 *
 * @author DurganNaresh
 */
public class Count_Entries_Equal_To_X_In_A_Special_Matrix {
    // function to count factors as
    // number of cell
    static int count (int n, int x)
    {
        int count = 0;

        // traverse and find the factors
        for (int i = 1; i <= n && i <= x ;
             i++)
        {
            // x%i == 0 means i is factor
            // of x. x/i <= n means i and
            // j are <= n (for i*j=x)
            if ( x / i <= n && x % i == 0)
                count++;
        }

        // return count
        return count;
    }

    // driver program
    public static void main(String args[])
    {
        int n = 8;

        // we can manually assume matrix
        // of order 8*8 where
        // mat[i][j] = i*j , 0<i,j<=n
        int x = 24;
        System.out.println(count(n, x));
    }
}
