package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 10:05 AM
 *Total coverage of all zeros in a binary matrix
 * Difficulty Level : Basic
 * Last Updated : 20 Mar, 2020
 * Given a binary matrix that is, it contains 0s and 1s only, we need to find sum of coverage of all zeros of the matrix where coverage for a particular 0 is defined as total number of ones around a zero in left, right, up and bottom directions. The ones can be anywhere till corner point in a direction.
 * Examples:
 *
 * Input : mat[][] = {0 0 0 0
 *                    1 0 0 1
 *                    0 1 1 0
 *                    0 1 0 0}
 * Output : 20
 * First four zeros are surrounded by only
 * one 1.  So coverage for zeros in first
 * row is 1 + 1 + 1 + 1
 * Zeros in second row are surrounded by
 * three 1's. Note that there is no 1 above.
 * There are 1's in all other three directions.
 * Coverage of zeros in second row = 3 + 3.
 * Similarly counting for others also, we get
 * overall count as below.
 * 1 + 1 + 1 + 1 + 3 + 3 + 2 + 2 + 2 + 2 + 2 = 20
 *
 * Input : mat[][] = {1 1 1 0
 *                    1 0 0 1}
 * Output : 8
 * Coverage of first zero is 2
 * Coverages of other two zeros is 3
 * Total coverage = 2 + 3 + 3 = 8
 * @author DurganNaresh
 */
public class GetTotalCoverageOfMatrix {
    static int R = 4;
    static int C = 4;

    // Returns total coverage
// of all zeros in mat[][]
    static int getTotalCoverageOfMatrix(int [][]mat)
    {
        int res = 0;

        // looping for all
        // rows of matrix
        for (int i = 0; i < R; i++)
        {
            // 1 is not seen yet
            boolean isOne = false;

            // looping in columns from
            // left to right direction
            // to get left ones
            for (int j = 0; j < C; j++)
            {
                // If one is found
                // from left
                if (mat[i][j] == 1)
                    isOne = true;

                    // If 0 is found and we
                    // have found a 1 before.
                else if (isOne)
                    res++;
            }

            // Repeat the above
            // process for right
            // to left direction.
            isOne = false;
            for (int j = C - 1; j >= 0; j--)
            {
                if (mat[i][j] == 1)
                    isOne = true;
                else if (isOne)
                    res++;
            }
        }

        // Traversing across columms
        // for up and down directions.
        for (int j = 0; j < C; j++)
        {
            // 1 is not seen yet
            boolean isOne = false;
            for (int i = 0; i < R; i++)
            {
                if (mat[i][j] == 1)
                    isOne = true;
                else if (isOne)
                    res++;
            }

            isOne = false;
            for (int i = R - 1; i >= 0; i--)
            {
                if (mat[i][j] == 1)
                    isOne = true;
                else if (isOne)
                    res++;
            }
        }
        return res;
    }

    // Driver code
    static public void main (String[] args)
    {
        int [][]mat = {{0, 0, 0, 0},
                {1, 0, 0, 1},
                {0, 1, 1, 0},
                {0, 1, 0, 0}};

        System.out.println(
                getTotalCoverageOfMatrix(mat));
    }
}
