package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 11:24 AM
 *
 * Given a matrix, check whether it’s Magic Square or not. A Magic Square is a n x n matrix of distinct element from 1 to n2 where sum of any row, column or diagonal is always equal to same number.
 *
 * Examples:
 *
 * Input : n = 3
 *   2   7   6
 *   9   5   1
 *   4   3   8
 * Output : Magic matrix
 * Explanation:In matrix sum of each
 * row and each column and diagonals sum is
 * same = 15.
 *
 * Input : n = 3
 *   1   2   2
 *   2   2   1
 *   2   1   2
 * Output : Not a Magic Matrix
 * Explanation:In matrix sum of each
 * row and each column and diagonals sum is
 * not same.
 *
 * @author DurganNaresh
 */
public class Check_Given_Matrix_Is_Magic_Square_Not {
    static int N = 3;

    // Returns true if mat[][] is magic
    // square, else returns false.
    static boolean isMagicSquare(int mat[][])
    {

        // calculate the sum of
        // the prime diagonal
        int sum = 0,sum2=0;
        for (int i = 0; i < N; i++)
            sum = sum + mat[i][i];

        // the secondary diagonal
        for (int i = 0; i < N; i++)
            sum2 = sum2 + mat[i][N-1-i];

        if(sum!=sum2)
            return false;

        // For sums of Rows
        for (int i = 0; i < N; i++) {

            int rowSum = 0;
            for (int j = 0; j < N; j++)
                rowSum += mat[i][j];

            // check if every row sum is
            // equal to prime diagonal sum
            if (rowSum != sum)
                return false;
        }

        // For sums of Columns
        for (int i = 0; i < N; i++) {

            int colSum = 0;
            for (int j = 0; j < N; j++)
                colSum += mat[j][i];

            // check if every column sum is
            // equal to prime diagonal sum
            if (sum != colSum)
                return false;
        }

        return true;
    }

    // driver program to
    // test above function
    public static void main(String[] args)
    {
        int mat[][] = {{ 2, 7, 6 },
                { 9, 5, 1 },
                { 4, 3, 8 }};

        if (isMagicSquare(mat))
            System.out.println("Magic Square");
        else
            System.out.println("Not a magic" +
                    " Square");
    }
}
