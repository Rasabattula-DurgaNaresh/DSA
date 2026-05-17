package com.durga.Geek_For_Geeks.Matrix;

import java.util.Arrays;

/**
 * created 01/04/2021 - 10:12 AM
 *
 * Maximum mirrors which can transfer light from bottom to right
 * Difficulty Level : Medium
 * Last Updated : 23 Jul, 2019
 * A square matrix is given in which each cell represents either a blank or an obstacle. We can place mirrors at blank positionl. All mirrors will be situated at 45 degree, i.e. they can transfer light from bottom to right if no obstacle is there in their path.
 * In this question we need to count how many such mirrors can be placed in square matrix which can transfer light from bottom to right.
 *
 * In above diagram, mirror at (3, 1) and (5, 5) are able
 * to send light from bottom to right so total possible
 * mirror count is 2.
 *
 * @author DurganNaresh
 */
public class Maximum_Mirror_In_Matrix {
    // method returns number of mirror which can transfer
    // light from bottom to right
    static int maximumMirrorInMatrix(String mat[], int N)
    {
        // To store first obstacles horizontaly (from right)
        // and vertically (from bottom)
        int[] horizontal = new int[N];
        int[] vertical = new int[N];

        // initialize both array as -1, signifying no obstacle
        Arrays.fill(horizontal, -1);
        Arrays.fill(vertical, -1);

        // looping matrix to mark column for obstacles
        for (int i = 0; i < N; i++)
        {
            for (int j = N - 1; j >= 0; j--)
            {
                if (mat[i].charAt(j) == 'B')
                {
                    continue;
                }

                // mark rightmost column with obstacle
                horizontal[i] = j;
                break;
            }
        }

        // looping matrix to mark rows for obstacles
        for (int j = 0; j < N; j++)
        {
            for (int i = N - 1; i >= 0; i--)
            {
                if (mat[i].charAt(j) == 'B')
                {
                    continue;
                }

                // mark leftmost row with obstacle
                vertical[j] = i;
                break;
            }
        }

        int res = 0; // Initialize result

        // if there is not obstacle on right or below,
        // then mirror can be placed to transfer light
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
                /* if i > vertical[j] then light can from bottom
                if j > horizontal[i] then light can go to right */
                if (i > vertical[j] && j > horizontal[i])
                {
                    /* uncomment this code to print actual mirror
                    position also
                    cout << i << " " << j << endl; */
                    res++;
                }
            }
        }

        return res;
    }

    // Driver code
    public static void main(String[] args)
    {
        int N = 5;

        // B - Blank     O - Obstacle
        String mat[] = {"BBOBB",
                "BBBBO",
                "BBBBB",
                "BOOBO",
                "BBBOB"
        };

        System.out.println(maximumMirrorInMatrix(mat, N));
    }
}
