package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:49 AM
 *
 * Given a integer matrix of odd dimensions (3 * 3, 5 * 5). then the task is to find the sum of the middle row & column elements.
 *
 * Examples:
 *
 * Input :  2 5 7
 *          3 7 2
 *          5 6 9
 * Output : Sum of middle row = 12
 *          Sum of middle column = 18
 *
 * Input :  1 3 5 6 7
 *          3 5 3 2 1
 *          1 2 3 4 5
 *          7 9 2 1 6
 *          9 1 5 3 2
 * Output : Sum of middle row = 15
 *          Sum of middle column = 18
 *
 * @author DurganNaresh
 */
public class Sum_Of_Middle_Row_And_Column_In_Matrix {
    static  int MAX = 100;

    static void middlesum(int mat[][], int n)
    {

        int row_sum = 0, col_sum = 0;

        // loop for sum of row
        for (int i = 0; i < n; i++)
            row_sum += mat[n / 2][i];

        System.out.println ( "Sum of middle row = "
                + row_sum);

        // loop for sum of column
        for (int i = 0; i < n; i++)
            col_sum += mat[i][n / 2];

        System.out.println ( "Sum of middle column = "
                + col_sum);
    }

    // Driver function
    public static void main (String[] args) {
        int mat[][] = {{2, 5, 7},
                {3, 7, 2},
                {5, 6, 9}};

        middlesum(mat, 3);

    }
}
