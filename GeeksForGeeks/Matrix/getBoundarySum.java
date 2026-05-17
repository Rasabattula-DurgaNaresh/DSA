package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:51 PM
 *
 * Finding sum of boundary elements
 *
 * Given an matrix of size n x m. Find the sum of boundary elements of the matrix. Boundary elements are those elements which is not surrounded by elements on all four directions, i.e. elements in first row, first column, last row and last column.
 * Examples:
 *
 * Input :
 *         1 2 3 4
 *         5 6 7 8
 *         1 2 3 4
 *         5 6 7 8
 * Output : 54
 * Explanation:The boundary elements of the matrix
 *          1 2 3 4
 *          5     8
 *          1     4
 *          5 6 7 8
 * Sum = 1+2+3+4+5+8+1+4+5+6+7+8 =54
 *
 * Input :
 *         1 2 3
 *         5 6 7
 *         1 2 3
 * Output : 24
 * Explanation:The boundary elements of the matrix
 *         1 2 3
 *         5   7
 *         1 2 3
 * Sum = 1+2+3+5+7+1+2+3 = 24
 *
 * @author DurganNaresh
 */
public class getBoundarySum {
    public static long getBoundarySum(int a[][], int m,
                                      int n)
    {
        long sum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0)
                    sum += a[i][j];
                else if (i == m - 1)
                    sum += a[i][j];
                else if (j == 0)
                    sum += a[i][j];
                else if (j == n - 1)
                    sum += a[i][j];
            }
        }
        return sum;
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int a[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 1, 2, 3, 4 }, { 5, 6, 7, 8 } };
        long sum = getBoundarySum(a, 4, 4);
        System.out.println("Sum of boundary elements"
                + " is " + sum);
    }
}
