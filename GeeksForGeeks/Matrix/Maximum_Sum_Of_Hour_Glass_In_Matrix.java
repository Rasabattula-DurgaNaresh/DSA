package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:04 AM
 *
 * Maximum sum of hour glass in matrix
 *
 * Given a 2D matrix, the task is to find the maximum sum of an hourglass.
 *
 * An hour glass is made of 7 cells
 * in following form.
 *     A B C
 *       D
 *     E F G
 * Examples:
 *
 * Input : 1 1 1 0 0
 *         0 1 0 0 0
 *         1 1 1 0 0
 *         0 0 0 0 0
 *         0 0 0 0 0
 * Output : 7
 * Below is the hour glass with
 * maximum sum:
 * 1 1 1
 *   1
 * 1 1 1
 *
 * Input : 0 3 0 0 0
 *         0 1 0 0 0
 *         1 1 1 0 0
 *         0 0 2 4 4
 *         0 0 0 2 4
 * Output : 11
 * Below is the hour glass with
 * maximum sum
 * 1 0 0
 *   4
 * 0 2 4
 *
 * Approach:
 * It is evident from the definition of the hourglass that the number of rows and number of columns must be equal to 3. If we count the total number of hourglasses in a matrix, we can say that the count is equal to the count of possible top left cells in an hourglass. The number of top-left cells in an hourglass is equal to (R-2)*(C-2). Therefore, in a matrix total number of hourglass is (R-2)*(C-2).
 *
 * mat[][] = 2 3 0 0 0
 *           0 1 0 0 0
 *           1 1 1 0 0
 *           0 0 2 4 4
 *           0 0 0 2 0
 * Possible hour glass are :
 * 2 3 0  3 0 0   0 0 0
 *   1      0       0
 * 1 1 1  1 1 0   1 0 0
 *
 * 0 1 0  1 0 0  0 0 0
 *   1      1      0
 * 0 0 2  0 2 4  2 4 4
 *
 * 1 1 1  1 1 0  1 0 0
 *   0      2      4
 * 0 0 0  0 0 2  0 2 0
 *
 * @author DurganNaresh
 */
public class Maximum_Sum_Of_Hour_Glass_In_Matrix {
    static int R = 5;
    static int C = 5;

    // Returns maximum sum of
// hour glass in ar[][]
    static int findMaxSum(int [][]mat)
    {
        if (R < 3 || C < 3)
            return -1;

        // Here loop runs (R-2)*(C-2)
        // times considering different
        // top left cells of hour glasses.
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < R - 2; i++)
        {
            for (int j = 0; j < C - 2; j++)
            {
                // Considering mat[i][j] as top
                // left cell of hour glass.
                int sum = (mat[i][j] + mat[i][j + 1] +
                        mat[i][j + 2]) + (mat[i + 1][j + 1]) +
                        (mat[i + 2][j] + mat[i + 2][j + 1] +
                                mat[i + 2][j + 2]);

                // If previous sum is less then
                // current sum then update
                // new sum in max_sum
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }

    // Driver code
    static public void main (String[] args)
    {
        int [][]mat = {{1, 2, 3, 0, 0},
                {0, 0, 0, 0, 0},
                {2, 1, 4, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0}};
        int res = findMaxSum(mat);
        if (res == -1)
            System.out.println("Not possible");
        else
            System.out.println("Maximum sum of hour glass = "
                    + res);
    }
}
