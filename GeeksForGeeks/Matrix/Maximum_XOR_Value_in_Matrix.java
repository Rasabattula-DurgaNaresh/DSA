package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 10:11 AM
 *
 * Maximum XOR value in matrix
 * Difficulty Level : Easy
 * Last Updated : 08 May, 2018
 * Given a square matrix (N X N), the task is to find the maximum XOR value of a complete row or a complete column.
 *
 * Examples :
 *
 * Input :  N = 3
 *         mat[3][3] = {{1, 0, 4},
 *                     {3, 7, 2},
 *                     {5, 9, 10} };
 * Output : 14
 * We get this maximum XOR value by doing XOR
 * of elements in second column 0 ^ 7 ^ 9 = 14
 *
 * Input : N = 4
 *         mat[4][4] = { {1, 2, 3, 6},
 *                       {4, 5, 6,7},
 *                       {7, 8, 9, 10},
 *                       {2, 4, 5, 11}}
 * Output : 12
 *
 * @author DurganNaresh
 */
public class Maximum_XOR_Value_in_Matrix {
    // maximum number of row and column
    static final int MAX = 1000;

    // function return the maximum xor value
    // that is either row or column wise
    static int maxXOR(int mat[][], int N)
    {

        // for row xor and column xor
        int r_xor, c_xor;
        int max_xor = 0;

        // traverse matrix
        for (int i = 0 ; i < N ; i++)
        {
            r_xor = 0; c_xor = 0;

            for (int j = 0 ; j < N ; j++)
            {

                // xor row element
                r_xor = r_xor^mat[i][j];

                // for each column : j is act as row & i
                // act as column xor column element
                c_xor = c_xor^mat[j][i];
            }

            // update maximum between r_xor , c_xor
            if (max_xor < Math.max(r_xor, c_xor))
                max_xor = Math.max(r_xor, c_xor);
        }

        // return maximum xor value
        return max_xor;
    }

    //driver code
    public static void main (String[] args)
    {

        int N = 3;

        int mat[][] = { {1, 5, 4},
                {3, 7, 2},
                {5, 9, 10}};

        System.out.print("maximum XOR value : "
                + maxXOR(mat, N));
    }
}
