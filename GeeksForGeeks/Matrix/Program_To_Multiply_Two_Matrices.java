package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 30/03/2021 - 10:53 PM
 *
 * Given two matrices, the task to multiply them. Matrices can either be square or rectangular.
 *
 * Examples:
 *
 * Input : mat1[][] = {{1, 2},
 *                    {3, 4}}
 *         mat2[][] = {{1, 1},
 *                     {1, 1}}
 * Output : {{3, 3},
 *           {7, 7}}
 * Input : mat1[][] = {{2, 4},
 *                     {3, 4}}
 *         mat2[][] = {{1, 2},
 *                     {1, 3}}
 * Output : {{6, 16},
 *           {7, 18}}
 *
 *
 *
 * @author DurganNaresh
 */
public class Program_To_Multiply_Two_Matrices {
    static int N = 4;

    // This function multiplies mat1[][]
    // and mat2[][], and stores the result
    // in res[][]
    static void multiply(int mat1[][],
                         int mat2[][], int res[][])
    {
        int i, j, k;
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++) {
                res[i][j] = 0;
                for (k = 0; k < N; k++)
                    res[i][j] += mat1[i][k]
                            * mat2[k][j];
            }
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        int mat1[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        int mat2[][] = { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };

        // To store result
        int res[][] = new int[N][N];
        int i, j;
        multiply(mat1, mat2, res);

        System.out.println("Result matrix"
                + " is ");
        for (i = 0; i < N; i++) {
            for (j = 0; j < N; j++)
                System.out.print(res[i][j]
                        + " ");
            System.out.println();
        }
    }
}
