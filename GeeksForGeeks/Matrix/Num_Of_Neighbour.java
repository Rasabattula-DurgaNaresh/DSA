package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:42 AM
 *
 * Find perimeter of shapes formed with 1s in binary matrix
 * Difficulty Level : Easy
 * Last Updated : 25 Mar, 2021
 * Given a matrix of N rows and M columns, consist of 0’s and 1’s. The task is to find the perimeter of subfigure consisting only 1’s in the matrix. Perimeter of single 1 is 4 as it can be covered from all 4 side. Perimeter of double 11 is 6.
 *
 *
 *
 * |  1  |           |  1    1  |
 *
 * Examples:
 *
 * Input : mat[][] =
 *                {
 *                  1, 0,
 *                  1, 1,
 *                }
 * Output : 8
 * Cell (1,0) and (1,1) making a L shape whose perimeter is 8.
 *
 * Input :  mat[][] =
 *                 {
 *                     0, 1, 0, 0, 0,
 *                     1, 1, 1, 0, 0,
 *                     1, 0, 0, 0, 0
 *                 }
 * Output : 12
 *
 * @author DurganNaresh
 */
public class Num_Of_Neighbour {
    static final int R = 3;
    static final int C = 5;

    // Find the number of covered side
    // for mat[i][j].
    static int numofneighbour(int mat[][],
                              int i, int j)
    {

        int count = 0;

        // UP
        if (i > 0 && mat[i - 1][j] == 1)
            count++;

        // LEFT
        if (j > 0 && mat[i][j - 1] == 1)
            count++;

        // DOWN
        if (i < R - 1 && mat[i + 1][j] == 1)
            count++;

        // RIGHT
        if (j < C - 1 && mat[i][j + 1] == 1)
            count++;

        return count;
    }

    // Returns sum of perimeter of shapes
    // formed with 1s
    static int findperimeter(int mat[][])
    {

        int perimeter = 0;

        // Traversing the matrix and
        // finding ones to calculate
        // their contribution.
        for (int i = 0; i < R; i++)
            for (int j = 0; j < C; j++)
                if (mat[i][j] == 1)
                    perimeter += (4 -
                            numofneighbour(mat, i, j));

        return perimeter;
    }

    // Driver code
    public static void main(String[] args)
    {
        int mat[][] = {{0, 1, 0, 0, 0},
                {1, 1, 1, 0, 0},
                {1, 0, 0, 0, 0}};

        System.out.println(findperimeter(mat));
    }
}
