package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:59 AM
 *
 * Maximum difference of sum of elements in two rows in a matrix
 * Difficulty Level : Medium
 * Last Updated : 04 Jul, 2018
 * Given a matrix of m*n order, the task is to find the maximum difference between two rows Rj and Ri such that i < j, i.e., we need to find maximum value of sum(Rj) – sum(Ri) such that row i is above row j.
 *
 * Examples:
 *
 * Input : mat[5][4] = {{-1, 2, 3, 4},
 *                      {5, 3, -2, 1},
 *                      {6, 7, 2, -3},
 *                      {2, 9, 1, 4},
 *                      {2, 1, -2, 0}}
 * Output: 9
 * // difference of R3 - R1 is maximum
 * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
 * A simple solution for this problem is to one by one select each row, compute sum of elements in it and take difference from sum of next rows in forward direction. Finally return the maximum difference. Time complexity for this approach will be O(n*m2).
 *
 * An efficient solution solution for this problem is to first calculate the sum of all elements of each row and store them in an auxiliary array rowSum[] and then calculate maximum difference of two elements max(rowSum[j] – rowSum[i]) such that rowSum[i] < rowSum[j] in linear time. See this article. In this method, we need to keep track of 2 things:
 * 1) Maximum difference found so far (max_diff).
 * 2) Minimum number visited so far (min_element).
 *
 * @author DurganNaresh
 */
public class Max_Row_Diff {
    static final int MAX = 100;

    // Function to find maximum difference of sum
// of elements of two rows such that second
// row appears before first row.
    static int maxRowDiff(int mat[][], int m, int n) {

        // auxiliary array to store sum
        // of all elements of each row
        int rowSum[] = new int[m];

        // calculate sum of each row and
        // store it in rowSum array
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++)
                sum += mat[i][j];
            rowSum[i] = sum;
        }

        // calculating maximum difference of two elements
        // such that rowSum[i]<rowsum[j]
        int max_diff = rowSum[1] - rowSum[0];
        int min_element = rowSum[0];
        for (int i = 1; i < m; i++) {

            // if current difference is greater than
            // previous then update it
            if (rowSum[i] - min_element > max_diff)
                max_diff = rowSum[i] - min_element;

            // if new element is less than previous
            // minimum element then update it so that
            // we may get maximum difference in remaining array
            if (rowSum[i] < min_element)
                min_element = rowSum[i];
        }

        return max_diff;
    }

    // Driver code
    public static void main(String[] args) {
        int m = 5, n = 4;
        int mat[][] = {{-1, 2,  3, 4 },
                {5,  3, -2, 1 },
                {6,  7,  2, -3},
                {2,  9,  1, 4 },
                {2,  1, -2, 0}};

        System.out.print(maxRowDiff(mat, m, n));
    }
}
