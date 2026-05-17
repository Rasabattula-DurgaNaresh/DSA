package com.durga.Geek_For_Geeks.Matrix;

import java.time.Duration;
import java.time.Instant;

/**
 * created 31/03/2021 - 10:50 AM
 *
 * Two common ways of traversing a matrix are row-major-order and column-major-order.
 * Row Major Order : When matrix is accessed row by row.
 * Column Major Order : When matrix is accessed column by column.
 * Examples:
 *
 *
 * Input : mat[][] = {{1, 2, 3},
 *                   {4, 5, 6},
 *                   {7, 8, 9}}
 * Output : Row-wise: 1 2 3 4 5 6 7 8 9
 *          Col-wise : 1 4 7 2 5 8 3 6 9
 *
 * @author DurganNaresh
 */
public class Row_Wise_Column_Wise_Traversal_Of_Matrix {
    static int MAX= 10000;

    static int [][]arr = new int[MAX][MAX];

    static void rowMajor()
    {

        int i, j;

        // accessing element row wise
        for (i = 0; i < MAX; i++)
        {
            for (j = 0; j < MAX; j++)
            {
                arr[i][j]++;
            }
        }
    }

    static void colMajor()
    {

        int i, j;

        // accessing element column wise
        for (i = 0; i < MAX; i++)
        {
            for (j = 0; j < MAX; j++)
            {
                arr[j][i]++;
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {

        // Time taken by row major order
        Instant start = Instant.now();
        rowMajor();
        Instant end = Instant.now();
        System.out.println("Row major access time : "+
                Duration.between(start, end));

        // Time taken by column major order
        start = Instant.now();
        colMajor();
        end = Instant.now();
        System.out.printf("Column major access time : "+
                Duration.between(start, end));
    }
}
