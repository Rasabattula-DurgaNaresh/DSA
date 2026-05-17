package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 30/03/2021 - 9:52 PM
 *
 * Given a square matrix, turn it by 90 degrees in anti-clockwise direction without using any extra space.
 *
 * Examples :
 *
 * Input:
 * Matrix:
 *  1  2  3
 *  4  5  6
 *  7  8  9
 * Output:
 *  3  6  9
 *  2  5  8
 *  1  4  7
 * The given matrix is rotated by 90 degree
 * in anti-clockwise direction.
 *
 * Input:
 *  1  2  3  4
 *  5  6  7  8
 *  9 10 11 12
 * 13 14 15 16
 * Output:
 *  4  8 12 16
 *  3  7 11 15
 *  2  6 10 14
 *  1  5  9 13
 * The given matrix is rotated by 90 degree
 * in anti-clockwise direction.
 *
 * @author DurganNaresh
 */
public class Inplace_Rotate_Square_Matrix_By_90_Degrees_Set1 {
    // An Inplace function to
    // rotate a N x N matrix
    // by 90 degrees in
    // anti-clockwise direction
    static void rotateMatrix(
            int N, int mat[][])
    {
        // Consider all squares one by one
        for (int x = 0; x < N / 2; x++) {
            // Consider elements in group
            // of 4 in current square
            for (int y = x; y < N - x - 1; y++) {
                // Store current cell in
                // temp variable
                int temp = mat[x][y];

                // Move values from right to top
                mat[x][y] = mat[y][N - 1 - x];

                // Move values from bottom to right
                mat[y][N - 1 - x]
                        = mat[N - 1 - x][N - 1 - y];

                // Move values from left to bottom
                mat[N - 1 - x][N - 1 - y] = mat[N - 1 - y][x];

                // Assign temp to left
                mat[N - 1 - y][x] = temp;
            }
        }
    }

    // Function to print the matrix
    static void displayMatrix(
            int N, int mat[][])
    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(
                        " " + mat[i][j]);

            System.out.print("\n");
        }
        System.out.print("\n");
    }

    /* Driver program to test above functions */
    public static void main(String[] args)
    {
        int N = 4;

        // Test Case 1
        int mat[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 }
        };

        // Tese Case 2
        /* int mat[][] = {
                            {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                        };
         */

        // Tese Case 3
        /*int mat[][] = {
                        {1, 2},
                        {4, 5}
                    };*/

        // displayMatrix(mat);

        rotateMatrix(N, mat);

        // Print rotated matrix
        displayMatrix(N, mat);
    }

}
