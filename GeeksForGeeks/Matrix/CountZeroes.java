package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 10:27 AM
 *
 * Count zeros in a row wise and column wise sorted matrix
 * Difficulty Level : Easy
 * Last Updated : 31 Mar, 2021
 * Given a N x N binary matrix (elements in matrix can be either 1 or 0) where each row and column of the matrix is sorted in ascending order, count number of 0s present in it.
 * Expected time complexity is O(N).
 * Examples:
 *
 *
 * Input:
 * [0, 0, 0, 0, 1]
 * [0, 0, 0, 1, 1]
 * [0, 1, 1, 1, 1]
 * [1, 1, 1, 1, 1]
 * [1, 1, 1, 1, 1]
 *
 * Output: 8
 *
 *
 * Input:
 * [0, 0]
 * [0, 0]
 *
 * Output: 4
 *
 *
 * Input:
 * [1, 1, 1, 1]
 * [1, 1, 1, 1]
 * [1, 1, 1, 1]
 * [1, 1, 1, 1]
 *
 * Output: 0
 *
 * @author DurganNaresh
 */
public class CountZeroes {
    public static int N = 5;

    // Function to count number of 0s in the given
    // row-wise and column-wise sorted binary matrix.
    static int countZeroes(int mat[][])
    {
        // start from bottom-left corner of the matrix
        int row = N - 1, col = 0;

        // stores number of zeroes in the matrix
        int count = 0;

        while (col < N)
        {
            // move up until you find a 0
            while (mat[row][col] > 0)

                // if zero is not found in current column,
                // we are done
                if (--row < 0)
                    return count;

            // add 0s present in current column to result
            count += (row + 1);

            // move right to next column
            col++;
        }

        return count;
    }

    // Driver program
    public static void main (String[] args)
    {
        int mat[][] = { { 0, 0, 0, 0, 1 },
                { 0, 0, 0, 1, 1 },
                { 0, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 },
                { 1, 1, 1, 1, 1 } };
        System.out.println(countZeroes(mat));
    }
}
