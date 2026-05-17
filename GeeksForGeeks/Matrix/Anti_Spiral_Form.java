package com.durga.Geek_For_Geeks.Matrix;

import java.util.Stack;

/**
 * created 01/04/2021 - 9:08 AM
 *
 * Print matrix in anti spiral form
 *
 * Given a 2D array, the task is to print matrix in anti spiral form:
 *
 * Examples:
 * spiral
 * Output: 16 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
 *
 * Input : arr[][4] = {1, 2, 3, 4
 *                     5, 6, 7, 8
 *                     9, 10, 11, 12
 *                     13, 14, 15, 16};
 * Output : 10 11 7 6 5 9 13 14 15 16 12 8 4 3 2 1
 *
 * Input :arr[][6] = {1, 2, 3, 4, 5, 6
 *                   7, 8, 9, 10, 11, 12
 *                   13, 14, 15, 16, 17, 18};
 * Output : 11 10 9 8 7 13 14 15 16 17 18 12 6 5 4 3 2 1
 *
 * @author DurganNaresh
 */
public class Anti_Spiral_Form {
    public static void antiSpiralTraversal(int m, int n,
                                           int a[][])
    {
        int i, k = 0, l = 0;

        /*  k - starting row index
            m - ending row index
            l - starting column index
            n - ending column index
            i - iterator  */
        Stack<Integer> stk=new Stack<Integer>();

        while (k <= m && l <= n)
        {
            /* Print the first row from the remaining
             rows */
            for (i = l; i <= n; ++i)
                stk.push(a[k][i]);
            k++;

            /* Print the last column from the remaining
            columns */
            for (i = k; i <= m; ++i)
                stk.push(a[i][n]);
            n--;

            /* Print the last row from the remaining
            rows */
            if ( k <= m)
            {
                for (i = n; i >= l; --i)
                    stk.push(a[m][i]);
                m--;
            }

            /* Print the first column from the remaining
            columns */
            if (l <= n)
            {
                for (i = m; i >= k; --i)
                    stk.push(a[i][l]);
                l++;
            }
        }

        while (!stk.empty())
        {
            System.out.print(stk.peek() + " ");
            stk.pop();
        }
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int mat[][] =
                {
                        {1,  2,  3,  4,  5},
                        {6,  7,  8,  9,  10},
                        {11, 12, 13, 14, 15},
                        {16, 17, 18, 19, 20}
                };

        antiSpiralTraversal(mat.length - 1, mat[0].length - 1,
                mat);
    }
}
