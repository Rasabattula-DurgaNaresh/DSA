package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:34 PM
 *
 * Check if sums of i-th row and i-th column are same in matrix
 * Difficulty Level : Easy
 * Last Updated : 07 Jan, 2021
 * Given a matrix mat[][], we have to check if the sum of i-th row is equal to the sum of i-th column or not.
 *
 * Examples:
 *
 * Input : 1 2 3 4
 *         9 5 3 1
 *         0 3 5 6
 *         0 4 5 6
 * Output : Yes
 * Sums of 1st row = 10 and 1st column
 * are same, i.e., 10
 *
 * @author DurganNaresh
 */
public class Check_If_Sums_Of_i_th_Row_And_I_th_Column_Are_Same_in_Matrix {
    // Function to check the if sum of a row
    // is same as corresponding column
    static boolean areSumSame(int a[][],
                              int n, int m)
    {
        int sum1 = 0, sum2 = 0;
        for (int i = 0; i < n; i++)
        {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j < m; j++)
            {
                sum1 += a[i][j];
                sum2 += a[j][i];
            }

            if (sum1 == sum2)
                return true;
        }

        return false;
    }

    // Driver code
    public static void main(String args[])
    {

        int n = 4; // number of rows
        int m = 4; // number of columns

        int M[][] = { { 1, 2, 3, 4 },
                { 9, 5, 3, 1 },
                { 0, 3, 5, 6 },
                { 0, 4, 5, 6 } };

        if(areSumSame(M, n, m) == true)
            System.out.print("1\n");
        else
            System.out.print("0\n");
    }
}
