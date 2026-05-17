package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:12 AM
 *
 * Minimum operations required to set all elements of binary matrix
 * Difficulty Level : Medium
 * Last Updated : 03 Dec, 2018
 * Given a binary matrix of N rows and M columns. The operation allowed on the matrix is to choose any index (x, y) and toggle all the elements between the rectangle having top-left as (0, 0) and bottom-right as (x-1, y-1). Toggling the element means changing 1 to 0 and 0 to 1. The task is to find minimum operations required to make set all the elements of the matrix i.e make all elements as 1.
 *
 * Examples:
 *
 * Input : mat[][] =  0 0 0 1 1
 *                    0 0 0 1 1
 *                    0 0 0 1 1
 *                    1 1 1 1 1
 *                    1 1 1 1 1
 * Output : 1
 * In one move, choose (3, 3) to make the
 * whole matrix consisting of only 1s.
 *
 * Input : mat[][] =  0 0 1 1 1
 *                    0 0 0 1 1
 *                    0 0 0 1 1
 *                    1 1 1 1 1
 *                    1 1 1 1 1
 * Output : 3
 *
 * @author DurganNaresh
 */
public class MinOperation {
    static final int N = 5;
    static final int M = 5;

    // Return minimum operation required to make all 1s.
    static int minOperation(boolean arr[][])
    {
        int ans = 0;
        for (int i = N - 1; i >= 0; i--)
        {
            for (int j = M - 1; j >= 0; j--)
            {
                // check if this cell equals 0
                if (arr[i][j] == false)
                {
                    // increase the number of moves
                    ans++;

                    // flip from this cell to the start point
                    for (int k = 0; k <= i; k++)
                    {
                        for (int h = 0; h <= j; h++)
                        {
                            // flip the cell
                            if (arr[k][h] == true)
                            {
                                arr[k][h] = false;
                            } else {
                                arr[k][h] = true;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }

    // Driven Program
    public static void main(String[] args) {

        boolean mat[][]
                = {
                {false, false, true, true, true},
                {false, false, false, true, true},
                {false, false, false, true, true},
                {true, true, true, true, true},
                {true, true, true, true, true}
        };

        System.out.println(minOperation(mat));
    }
}
