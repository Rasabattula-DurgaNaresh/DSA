package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 10:29 AM
 *
 * @author DurganNaresh
 */
public class Count_Negative_Numbers_Method1 {
    static int countNegative(int M[][], int n,
                             int m)
    {
        // initialize result
        int count = 0;

        // Start with top right corner
        int i = 0;
        int j = m - 1;

        // Follow the path shown using
        // arrows above
        while (j >= 0 && i < n) {
            if (M[i][j] < 0) {
                // j is the index of the
                // last negative number
                // in this row. So there
                // must be ( j+1 )
                count += j + 1;

                // negative numbers in
                // this row.
                i += 1;
            }

            // move to the left and see
            // if we can find a negative
            // number there
            else
                j -= 1;
        }
        return count;
    }

    // Driver program to test above functions
    public static void main(String[] args)
    {
        int M[][] = { { -3, -2, -1, 1 },
                { -2, 2, 3, 4 },
                { 4, 5, 7, 8 } };

        System.out.println(countNegative(M, 3, 4));
    }

}
