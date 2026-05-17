package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 10:08 AM
 *Queries in a Matrix
 * Difficulty Level : Medium
 * Last Updated : 20 Feb, 2019
 * Given a matrix M of size m x n ( 1 <= m,n <= 1000 ). It is initially filled with integers from 1 to m x n sequentially in a row major order. The task is to process a list of queries manipulating M such that every query is one of the following three.
 *
 * R(x, y): swaps the x-th and y-th rows of M where x and y vary from 1 to m.
 * C(x, y): swaps the x-th and y-th columns of M where x and y vary from 1 to n.
 * P(x, y): prints the element at x-th row and y-th column where x varies from 1 to m and y varies from 1 to n.
 * Note that the given matrix is stored as a typical 2D array with indexes start from 0, but values of x and y start from 1.
 *
 * Examples:
 *
 * Input : m = 3, n = 3
 *         R(1, 2)
 *         P(1, 1)
 *         P(2, 1)
 *         C(1, 2)
 *         P(1, 1)
 *         P(2, 1)
 * Output: value at (1, 1) = 4
 *         value at (2, 1) = 1
 *         value at (1, 1) = 5
 *         value at (2, 1) = 2
 * Explanation:
 * The matrix is {{1, 2, 3},
 *                {4, 5, 6},
 *                {7, 8, 9}}
 * After first R(1, 2) matrix becomes,
 *               {{4, 5, 6},
 *                {1, 2, 3},
 *                {7, 8, 9}}
 * After first C(1, 2) matrix becomes,
 *               {{5, 4, 6},
 *                {2, 1, 3},
 *                {8, 7, 9}}
 *
 *
 * Input : m = 1234, n = 5678
 *         R(1, 2)
 *         P(1, 1)
 *         P(2, 1)
 *         C(1, 2)
 *         P(1, 1)
 *         P(2, 1)
 * Output: value at (1, 1) = 5679
 *         value at (2, 1) = 1
 *         value at (1, 1) = 5680
 *         value at (2, 1) = 2
 * @author DurganNaresh
 */
public class Queries_in_A_Matrix {
    // Fills initial values in rows[] and cols[]
    static void preprocessMatrix(int rows[], int cols[],
                                 int m, int n)
    {
        // Fill rows with 1 to m-1
        for (int i = 0; i < m; i++)
        {
            rows[i] = i;
        }

        // Fill columns with 1 to n-1
        for (int i = 0; i < n; i++)
        {
            cols[i] = i;
        }
    }

    // Function to perform queries on matrix
    // m --> number of rows
    // n --> number of columns
    // ch --> type of query
    // x --> number of row for query
    // y --> number of column for query
    static void queryMatrix(int rows[], int cols[], int m,
                            int n, char ch, int x, int y)
    {
        // perform queries
        int tmp;
        switch (ch)
        {
            case 'R':

                // swap row x with y
                swap(rows, x - 1, y - 1);
                break;

            case 'C':

                // swap coloumn x with y
                swap(cols, x - 1, y - 1);
                break;

            case 'P':

                // Print value at (x, y)
                System.out.printf("value at (%d, %d) = %d\n", x, y,
                        rows[x - 1] * n + cols[y - 1] + 1);
                break;
        }
        return;
    }

    static int[] swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    // Driver code
    public static void main(String[] args)
    {
        int m = 1234, n = 5678;

        // row[] is array for rows and cols[]
        // is array for coloumns
        int rows[] = new int[m], cols[] = new int[n];

        // Fill initial values in rows[] and cols[]
        preprocessMatrix(rows, cols, m, n);

        queryMatrix(rows, cols, m, n, 'R', 1, 2);
        queryMatrix(rows, cols, m, n, 'P', 1, 1);
        queryMatrix(rows, cols, m, n, 'P', 2, 1);
        queryMatrix(rows, cols, m, n, 'C', 1, 2);
        queryMatrix(rows, cols, m, n, 'P', 1, 1);
        queryMatrix(rows, cols, m, n, 'P', 2, 1);
    }
}
