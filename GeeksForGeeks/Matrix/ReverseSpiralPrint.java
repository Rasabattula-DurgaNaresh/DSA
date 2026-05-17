package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:14 AM
 *
 * Print a given matrix in reverse spiral form
 * Difficulty Level : Medium
 * Last Updated : 03 Apr, 2019
 * Given a 2D array, print it in reverse spiral form. We have already discussed Print a given matrix in spiral form. This article discusses how to do the reverse printing. See the following examples.
 *
 * Input:
 *         1    2   3   4
 *         5    6   7   8
 *         9   10  11  12
 *         13  14  15  16
 * Output:
 * 10 11 7 6 5 9 13 14 15 16 12 8 4 3 2 1
 * Input:
 *         1   2   3   4  5   6
 *         7   8   9  10  11  12
 *         13  14  15 16  17  18
 * Output:
 * 11 10 9 8 7 13 14 15 16 17 18 12 6 5 4 3 2 1
 *
 * @author DurganNaresh
 */
public class ReverseSpiralPrint {
    public static int R = 3, C = 6;

    // Function that print matrix in reverse spiral form.
    public static void ReversespiralPrint(int m, int n,
                                          int a[][])
    {
        // Large array to initialize it
        // with elements of matrix
        long b[] = new long[100];

        /* k - starting row index
        l - starting column index*/
        int i, k = 0, l = 0;

        // Counter for single dimension array
        //in which elements will be stored
        int z = 0;

        // Total elements in matrix
        int size = m * n;

        while (k < m && l < n)
        {
            // Variable to store value of matrix.
            int val;

            /* Print the first row from the remaining
            rows */
            for (i = l; i < n; ++i)
            {

                val = a[k][i];
                b[z] = val;
                ++z;
            }
            k++;

            /* Print the last column from the remaining
            columns */
            for (i = k; i < m; ++i)
            {

                val = a[i][n-1];
                b[z] = val;
                ++z;
            }
            n--;

            /* Print the last row from the remaining
            rows */
            if ( k < m)
            {
                for (i = n-1; i >= l; --i)
                {

                    val = a[m-1][i];
                    b[z] = val;
                    ++z;
                }
                m--;
            }

            /* Print the first column from the remaining
            columns */
            if (l < n)
            {
                for (i = m-1; i >= k; --i)
                {

                    val = a[i][l];
                    b[z] = val;
                    ++z;
                }
                l++;
            }
        }

        for (int x = size-1 ; x>=0 ; --x)
        {
            System.out.print(b[x]+" ");
        }
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int a[][] = { {1, 2, 3, 4, 5, 6},
                {7, 8, 9, 10, 11, 12},
                {13, 14, 15, 16, 17, 18}};

        ReversespiralPrint(R, C, a);

    }
}
