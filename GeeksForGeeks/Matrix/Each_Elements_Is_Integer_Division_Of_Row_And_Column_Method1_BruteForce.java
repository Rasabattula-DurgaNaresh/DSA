package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:18 AM
 *
 * Sum of matrix element where each elements is integer division of row and column
 * Difficulty Level : Medium
 * Last Updated : 07 Jun, 2019
 * Consider a N X N matrix where each element is row number divide by column number (integer division), i.e. mat[i][j] = floor((i+1)/(j+1)) where 0 <= i < n and 0 <= j < n. The task is to find the sum of all matrix element.
 *
 * Examples :
 *
 * Input  : N = 2
 * Output : 4
 * 2 X 2 matrix with given constraint:
 * 1 0
 * 2 1
 * Sum of matrix element: 4
 *
 * Input  : N = 3
 * Output : 9
 *
 * @author DurganNaresh
 */
public class Each_Elements_Is_Integer_Division_Of_Row_And_Column_Method1_BruteForce {
    // Return sum of matrix element
    // where each element is division
    // of its corresponding row and
    // column.
    static int findSum(int n)
    {
        int ans = 0;

        // for rows
        for (int i = 1; i <= n; i++)

            // for columns
            for (int j = 1; j <= n; j++)
                ans += (i/j);

        return ans;
    }

    // Driven Program
    public static void main (String[] args)
    {
        int N = 2;
        System.out.println( findSum(N));
    }
}
