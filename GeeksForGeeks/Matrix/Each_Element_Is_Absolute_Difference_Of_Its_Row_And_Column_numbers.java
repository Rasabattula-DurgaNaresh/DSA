package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:25 AM
 *
 * Sum of matrix in which each element is absolute difference of its row and column numbers
 * Difficulty Level : Medium
 * Last Updated : 08 Jan, 2019
 * Given a positive integer n. Consider a matrix of n rows and n columns, in which each element contain absolute difference of its row number and numbers. The task is to calculate sum of each element of the matrix.
 *
 * Examples :
 *
 * Input : n = 2
 * Output : 2
 * Matrix formed with n = 2 with given constraint:
 * 0 1
 * 1 0
 * Sum of matrix = 2.
 *
 * Input : n = 3
 * Output : 8
 * Matrix formed with n = 3 with given constraint:
 * 0 1 2
 * 1 0 1
 * 2 1 0
 * Sum of matrix = 8.
 * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
 * Method 1 (Brute Force):
 * Simply construct a matrix of n rows and n columns and initialize each cell with absolute difference of its corresponding row number and column number.
 * Now, find the sum of each cell.
 * @author DurganNaresh
 */
public class Each_Element_Is_Absolute_Difference_Of_Its_Row_And_Column_numbers {
    // Retuen the sum of matrix in which
// each element is absolute difference
// of its corresponding row and column
// number row
    static int findSum(int n)
    {

        // Generate matrix
        int [][]arr = new int[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = Math.abs(i - j);

        // Compute sum
        int sum = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                sum += arr[i][j];

        return sum;
    }

    // Driver Code
    static public void main (String[] args)
    {
        int n = 3;
        System.out.println(findSum(n));
    }

}
