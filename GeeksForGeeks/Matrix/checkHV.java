package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:28 AM
 *
 * Check horizontal and vertical symmetry in binary matrix
 * Difficulty Level : Easy
 * Last Updated : 20 Mar, 2020
 * Given a 2D binary matrix of N rows and M columns. The task is to check whether the matrix is horizontal symmetric, vertical symmetric or both. The matrix is said to be horizontal symmetric if the first row is same as the last row, the second row is same as the second last row and so on. And the matrix is said to be vertical symmetric if the first column is same as the last column, the second column is same as the second last column and so on. Print “VERTICAL” if the matrix is vertical symmetric, “HORIZONTAL” if the matrix is vertical symmetric, “BOTH” if the matrix is vertical and horizontal symmetric and “NO” if not symmetric.
 *
 * Examples :
 *
 * Input : N = 3 M = 3
 * 0 1 0
 * 0 0 0
 * 0 1 0
 * Output : Both
 * First and third row are same and also second row
 * is in middle. So Horizontal Symmetric.
 * Similarly, First and third column are same and
 * also second column is in middle, so Vertical
 * Symmetric.
 *
 * Input :
 * 0 0 1
 * 1 1 0
 * 0 0 1.
 * Output : Horizontal
 *
 * @author DurganNaresh
 */
public class checkHV {
    static void checkHV(int[][] arr, int N,
                        int M)
    {

        // Initializing as both horizontal
        // and vertical symmetric.
        boolean horizontal = true;
        boolean vertical = true;

        // Checking for Horizontal Symmetry.
        // We compare first row with last
        // row, second row with second
        // last row and so on.
        for (int i = 0, k = N - 1;
             i < N / 2; i++, k--) {

            // Checking each cell of a column.
            for (int j = 0; j < M; j++) {
                // check if every cell is identical
                if (arr[i][j] != arr[k][j]) {
                    horizontal = false;
                    break;
                }
            }
        }

        // Checking for Vertical Symmetry. We compare
        // first column with last column, second xolumn
        // with second last column and so on.
        for (int i = 0, k = M - 1;
             i < M / 2; i++, k--) {

            // Checking each cell of a row.
            for (int j = 0; j < N; j++) {
                // check if every cell is identical
                if (arr[i][j] != arr[k][j]) {
                    horizontal = false;
                    break;
                }
            }
        }

        if (!horizontal && !vertical)
            System.out.println("NO");

        else if (horizontal && !vertical)
            System.out.println("HORIZONTAL");

        else if (vertical && !horizontal)
            System.out.println("VERTICAL");

        else
            System.out.println("BOTH");
    }

    // Driver Code
    static public void main(String[] args)
    {
        int[][] mat = { { 1, 0, 1 },
                { 0, 0, 0 },
                { 1, 0, 1 } };

        checkHV(mat, 3, 3);
    }
}
