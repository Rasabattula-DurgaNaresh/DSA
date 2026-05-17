package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:37 PM
 *
 * Program to check if a matrix is symmetric
 *
 * A square matrix is said to be symmetric matrix if the transpose of the matrix is same as the given matrix. Symmetric matrix can be obtain by changing row to column and column to row.
 *
 * Examples:
 *
 * Input : 1 2 3
 *         2 1 4
 *         3 4 3
 * Output : Yes
 *
 * Input : 3 5 8
 *         3 4 7
 *         8 5 3
 * Output : No
 *
 * @author DurganNaresh
 */
public class Check_If_A_Matrix_Is_Symmetric {
    static int  MAX = 100;

    // Fills transpose of mat[N][N] in tr[N][N]
    static void transpose(int mat[][], int tr[][], int N)
    {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                tr[i][j] = mat[j][i];
    }

    // Returns true if mat[N][N] is symmetric, else false
    static boolean isSymmetric(int mat[][], int N)
    {
        int tr[][] = new int[N][MAX];
        transpose(mat, tr, N);
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (mat[i][j] != tr[i][j])
                    return false;
        return true;
    }

    // Driver code
    public static void main (String[] args)
    {

        int mat[][] = { { 1, 3, 5 },
                { 3, 2, 4 },
                { 5, 4, 1 } };

        if (isSymmetric(mat, 3))
            System.out.println( "Yes");
        else
            System.out.println ( "No");

    }
}
