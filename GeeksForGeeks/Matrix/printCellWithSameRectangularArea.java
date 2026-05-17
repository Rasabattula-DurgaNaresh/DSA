package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:44 AM
 *
 * Print cells with same rectangular sums in a matrix
 * Difficulty Level : Easy
 * Last Updated : 14 Apr, 2018
 * Given a matrix of m x n matrix, we need to print all those cells at which sum of sub-matrix ended at this cell and sub-matrix starting at this cell is equal to remaining elements. For better understanding please see below diagram,
 *
 * Examples :
 *
 * Input : mat[][] = {1, 2, 3, 5,
 *                    4, 1, 0, 2,
 *                    0, 1, 2, 0,
 *                    7, 1, 1, 0};
 * Output : (1, 1), (2, 2)
 *
 * In above matrix, cell (1, 1) and cell (2, 2)
 * are our required cells because,
 * For cell (1, 1), sum of red and green areas is same
 * 1+2+4+1+0+2+1+2+0+1+1+0 = 3+5+0+7
 * Same is true for cell (2, 2)
 * 1+2+3+4+1+0+0+1+2+0+1+0 = 5+2+7+1
 *
 * We need to print all blue boundary cells for
 * which sum of red area is equal to green area.
 *
 * @author DurganNaresh
 */
public class printCellWithSameRectangularArea {
    static final int R = 4;
    static final int C = 4;

    // Method prints cell index at which
// rectangular sum is same at
// prime diagonal and other diagonal
    static void printCellWithSameRectangularArea(int mat[][],
                                                 int m, int n)
    {
    /* sum[i][j] denotes sum of sub-matrix, mat[0][0]
    to mat[i][j]
    sumr[i][j] denotes sum of sub-matrix, mat[i][j]
    to mat[m - 1][n - 1] */
        int sum[][] = new int[m][n];
        int sumr[][] = new int[m][n];

        // Initialize both sum matrices by mat
        int totalSum = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                sumr[i][j] = sum[i][j] = mat[i][j];
                totalSum += mat[i][j];
            }
        }

        // updating first and last row separately
        for (int i = 1; i < m; i++) {
            sum[i][0] += sum[i - 1][0];
            sumr[m - i - 1][n - 1] += sumr[m - i][n - 1];
        }

        // updating first and last column separately
        for (int j = 1; j < n; j++) {
            sum[0][j] += sum[0][j - 1];
            sumr[m - 1][n - j - 1] += sumr[m - 1][n - j];
        }

        // updating sum and sumr indices by nearby indices
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                sum[i][j] += sum[i - 1][j] + sum[i][j - 1] -
                        sum[i - 1][j - 1];
                sumr[m - i - 1][n - j - 1] += sumr[m - i][n - j - 1] +
                        sumr[m - i - 1][n - j] -
                        sumr[m - i][n - j];
            }
        }

        // Uncomment below code to print sum and reverse sum
        // matrix
    /*
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print( sum[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(sumr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(); */

    /* print all those indices at which sum of prime diagonal
    rectangles is half of the total sum of matrix */
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int mainDiagRectangleSum = sum[i][j] +
                        sumr[i][j] - mat[i][j];
                if (totalSum == 2 * mainDiagRectangleSum)
                    System.out.println("(" + i + ", " + j + ")");
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int mat[][] = {{1, 2, 3, 5},
                {4, 1, 0, 2},
                {0, 1, 2, 0},
                {7, 1, 1, 0}};

        printCellWithSameRectangularArea(mat, R, C);
    }
}
