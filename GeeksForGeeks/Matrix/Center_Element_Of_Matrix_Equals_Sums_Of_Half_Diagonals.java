package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 3:32 PM
 *
 * Given a matrix of odd order i.e(5*5).
 * Task is to check if the center element of the matrix is equal to the individual sum of all the half diagonals.
 *
 * Examples:
 *
 * Input : mat[][] = {   2   9   1   4  -2
 *                       6   7   2  11   4
 *                       4    2  9   2   4
 *                       1   9   2    4  4
 *                       0   2   4    2  5 }
 * Output :Yes
 * Explanation :
 * Sum of Half Diagonal 1 = 2 + 7 = 9
 * Sum of Half Diagonal 2 = 9 + 0 = 9
 * Sum of Half Diagonal 3 = 11 + -2 = 9
 * Sum of Half Diagonal 4 = 5 + 4 = 9
 *
 * Here, All the sums equal to the center element
 * that is mat[2][2] = 9
 *
 * @author DurganNaresh
 */
public class Center_Element_Of_Matrix_Equals_Sums_Of_Half_Diagonals {
    static int MAX = 100;

    // Function to Check center element
    // is equal to the individual
    // sum of all the half diagonals
    static boolean HalfDiagonalSums(int mat[][],
                                    int n)
    {

        // Find sums of half diagonals
        int diag1_left = 0, diag1_right = 0;
        int diag2_left = 0, diag2_right = 0;
        for (int i = 0, j = n - 1; i < n;
             i++, j--)
        {

            if (i < n/2) {
                diag1_left += mat[i][i];
                diag2_left += mat[j][i];
            }
            else if (i > n/2) {
                diag1_right += mat[i][i];
                diag2_right += mat[j][i];
            }
        }

        return (diag1_left == diag2_right &&
                diag2_right == diag2_left &&
                diag1_right == diag2_left &&
                diag2_right == mat[n/2][n/2]);
    }

    // Driver code
    public static void main(String args[])
    {

        int a[][] = { { 2, 9, 1, 4, -2},
                { 6, 7, 2, 11, 4},
                { 4, 2, 9, 2, 4},
                { 1, 9, 2, 4, 4},
                { 0, 2, 4, 2, 5} };

        System.out.print ( HalfDiagonalSums(a, 5)
                ? "Yes" : "No" );
    }
}
