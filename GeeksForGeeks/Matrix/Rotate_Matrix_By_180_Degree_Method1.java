package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 30/03/2021 - 10:00 PM
 *
 * Given a square matrix, the task is that we turn it by 180 degrees in anti-clockwise direction without using any extra space.
 *
 * Examples :
 *
 * Input :  1  2  3
 *          4  5  6
 *          7  8  9
 * Output : 9 8 7
 *          6 5 4
 *          3 2 1
 *
 * Input :  1 2 3 4
 *          5 6 7 8
 *          9 0 1 2
 *          3 4 5 6
 * Output : 6 5 4 3
 *          2 1 0 9
 *          8 7 6 5
 *          4 3 2 1
 *
 * @author DurganNaresh
 */
public class Rotate_Matrix_By_180_Degree_Method1{
    /**
    *The solution of this problem is that to rotate a matrix by 180 degree we can easily follow that step
     *
     * Matrix =  a00 a01 a02
     *           a10 a11 a12
     *           a20 a21 a22
     *
     * when we rotate it by 90 degree
     * then matrix is
     * Matrix = a02 a12 a22
     *          a01 a11 a21
     *          a00 a10 a20
     *
     * when we rotate it by again 90
     * degree then matrix is
     * Matrix = a22 a21 a20
     *          a12 a11 a10
     *          a02 a01 a00
    * */

    static int N = 3;

    // Function to Rotate the
    // matrix by 180 degree
    static void rotateMatrix(int mat[][])
    {

        // Simply print from last
        // cell to first cell.
        for (int i = N - 1; i >= 0; i--) {
            for (int j = N - 1; j >= 0; j--)
                System.out.print(mat[i][j] + " ");

            System.out.println();
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[][] mat = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        rotateMatrix(mat);
    }
}
