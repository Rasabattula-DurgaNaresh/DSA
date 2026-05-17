package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 30/03/2021 - 10:18 PM
 *
 * Given a matrix of n*n size, the task is to find whether all rows are circular rotations of each other or not.
 * Examples:
 *
 * Input: mat[][] = 1, 2, 3
 *                  3, 1, 2
 *                  2, 3, 1
 * Output:  Yes
 * All rows are rotated permutation
 * of each other.
 *
 * Input: mat[3][3] = 1, 2, 3
 *                    3, 2, 1
 *                    1, 3, 2
 * Output:  No
 * Explanation : As 3, 2, 1 is not a rotated or
 * circular permutation of 1, 2, 3
 *
 * @author DurganNaresh
 */
public class Check_If_All_Rows_Of_A_Matrix_Are_Circular_Rotations_Of_Each_Other {
    static int MAX = 1000;

    // Returns true if all rows of mat[0..n-1][0..n-1]
    // are rotations of each other.
    static boolean isPermutedMatrix(int mat[][], int n)
    {
        // Creating a string that contains
        // elements of first row.
        String str_cat = "";
        for (int i = 0; i < n; i++)
        {
            str_cat = str_cat + "-" + String.valueOf(mat[0][i]);
        }

        // Concatenating the string with itself
        // so that substring search operations
        // can be performed on this
        str_cat = str_cat + str_cat;

        // Start traversing remaining rows
        for (int i = 1; i < n; i++)
        {
            // Store the matrix into vector in the form
            // of strings
            String curr_str = "";
            for (int j = 0; j < n; j++)
            {
                curr_str = curr_str + "-" + String.valueOf(mat[i][j]);
            }

            // Check if the current string is present in
            // the concatenated string or not
            if (str_cat.contentEquals(curr_str))
            {
                return false;
            }
        }

        return true;
    }

    // Drivers code
    public static void main(String[] args)
    {
        int n = 4;
        int mat[][] = {{1, 2, 3, 4},
                {4, 1, 2, 3},
                {3, 4, 1, 2},
                {2, 3, 4, 1}
        };
        if (isPermutedMatrix(mat, n))
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}
