package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:48 PM
 *
 * @author DurganNaresh
 */
public class printDiagonalSums_Method1 {
    static void printDiagonalSums(int [][]mat,
                                  int n)
    {
        int principal = 0, secondary = 0;
        for (int i = 0; i < n; i++) {
            principal += mat[i][i];
            secondary += mat[i][n - i - 1];
        }

        System.out.println("Principal Diagonal:"
                + principal);

        System.out.println("Secondary Diagonal:"
                + secondary);
    }

    // Driver code
    static public void main (String[] args)
    {
        int [][]a = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 } };

        printDiagonalSums(a, 4);
    }
}
