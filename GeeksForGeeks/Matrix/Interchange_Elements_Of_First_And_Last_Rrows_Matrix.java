package com.durga.Geek_For_Geeks.Matrix;

import java.io.IOException;

/**
 * created 31/03/2021 - 10:56 AM
 *
 * Given a 4 x 4 matrix, we have to interchange the elements of first and last row and show the resulting matrix.
 *
 * Examples :
 *
 * Input : 3 4 5 0
 *         2 6 1 2
 *         2 7 1 2
 *         2 1 1 2
 * Output : 2 1 1 2
 *          2 6 1 2
 *          2 7 1 2
 *          3 4 5 0
 *
 * Input : 9 7 5 1
 *         2 3 4 1
 *         5 6 6 5
 *         1 2 3 1
 * Output : 1 2 3 1
 *          2 3 4 1
 *          5 6 6 5
 *          9 7 5 1
 *
 * @author DurganNaresh
 */
public class Interchange_Elements_Of_First_And_Last_Rrows_Matrix {
    static void interchangeFirstLast(int m[][])
    {
        int rows = m.length;

        // swapping of element between first
        // and last rows
        for (int i = 0; i < m[0].length; i++) {
            int t = m[0][i];
            m[0][i] = m[rows-1][i];
            m[rows-1][i] = t;
        }
    }

    // Driver code
    public static void main(String args[]) throws IOException
    {
        // input in the array
        int m[][] = { { 8, 9, 7, 6 },
                { 4, 7, 6, 5 },
                { 3, 2, 1, 8 },
                { 9, 9, 7, 7 } };

        interchangeFirstLast(m);

        // printing the interchanged matrix
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[0].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }
    }

}
