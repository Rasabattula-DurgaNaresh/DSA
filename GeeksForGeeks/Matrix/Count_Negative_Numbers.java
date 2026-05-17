package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 10:28 AM
 *
 * Count Negative Numbers in a Column-Wise and Row-Wise Sorted Matrix
 * Difficulty Level : Easy
 * Last Updated : 12 Mar, 2021
 * Find the number of negative numbers in a column-wise / row-wise sorted matrix M[][]. Suppose M has n rows and m columns.
 * Example:
 *
 * Input:  M =  [-3, -2, -1,  1]
 *              [-2,  2,  3,  4]
 *              [4,   5,  7,  8]
 * Output : 4
 * We have 4 negative numbers in this matrix
 * We strongly recommend you to minimize your browser and try this yourself first.
 * Naive Solution
 * Here’s a naive, non-optimal solution.
 * We start from the top left corner and count the number of negative numbers one by one, from left to right and top to bottom.
 * With the given example:
 *
 * [-3, -2, -1,  1]
 * [-2,  2,  3,  4]
 * [4,   5,  7,  8]
 *
 * Evaluation process
 *
 * [?,  ?,  ?,  1]
 * [?,  2,  3,  4]
 * [4,  5,  7,  8]
 *
 * @author DurganNaresh
 */
public class Count_Negative_Numbers {
    static int countNegative(int M[][], int n,
                             int m)
    {
        int count = 0;

        // Follow the path shown using
        // arrows above
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (M[i][j] < 0)
                    count += 1;

                    // no more negative numbers
                    // in this row
                else
                    break;
            }
        }
        return count;
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        int M[][] = { { -3, -2, -1, 1 },
                { -2, 2, 3, 4 },
                { 4, 5, 7, 8 } };

        System.out.println(countNegative(M, 3, 4));
    }

}
