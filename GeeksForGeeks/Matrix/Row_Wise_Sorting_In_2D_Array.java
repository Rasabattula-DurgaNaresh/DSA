package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:59 AM
 *
 * Given a 2D array, sort each row of this array and print the result.
 * Examples:
 *
 * Input :
 * 77 11 22 3
 * 11 89 1 12
 * 32 11 56 7
 * 11 22 44 33
 * Output :
 * 3 11 22 77
 * 1 11 12 89
 * 7 11 32 56
 * 11 22 33 44
 *
 * Input :
 * 8 6 4 5
 * 3 5 2 1
 * 9 7 4 2
 * 7 8 9 5
 * Output :
 * 4 5 6 8
 * 1 2 3 5
 * 2 4 7 9
 * 5 7 8 9
 *
 * @author DurganNaresh
 */
public class Row_Wise_Sorting_In_2D_Array {
    static int sortRowWise(int m[][])
    {
        // loop for rows of matrix
        for (int i = 0; i < m.length; i++) {

            // loop for column of matrix
            for (int j = 0; j < m[i].length; j++) {

                // loop for comparison and swapping
                for (int k = 0; k < m[i].length - j - 1; k++) {
                    if (m[i][k] > m[i][k + 1]) {

                        // swapping of elements
                        int t = m[i][k];
                        m[i][k] = m[i][k + 1];
                        m[i][k + 1] = t;
                    }
                }
            }
        }

        // printing the sorted matrix
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++)
                System.out.print(m[i][j] + " ");
            System.out.println();
        }

        return 0;
    }

    // driver code
    public static void main(String args[])
    {
        int m[][] = { { 9, 8, 7, 1 },
                { 7, 3, 0, 2 },
                { 9, 5, 3, 2 },
                { 6, 3, 1, 2 } };
        sortRowWise(m);
    }
}
