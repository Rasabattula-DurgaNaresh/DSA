package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 8:52 AM
 *
 * Given a matrix and a scalar element k, our task is to find out the scalar product of that matrix.
 *
 * Examples:
 *
 * Input : mat[][] = {{2, 3}
 *                    {5, 4}}
 *         k = 5
 * Output : 10 15
 *          25 20
 * We multiply 5 with every element.
 *
 * Input : 1 2 3
 *         4 5 6
 *         7 8 9
 *         k = 4
 * Output :  4 8  12
 *           16 20 24
 *           28 32 36
 *
 * @author DurganNaresh
 */
public class Program_For_Scalar_Multiplication_Of_A_Matrix {
    static final int N = 3;
    static void scalarProductMat(int mat[][],
                                 int k)
    {

        // scalar element is multiplied
        // by the matrix
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                mat[i][j] = mat[i][j] * k;
    }

    // Driver code
    public static void main (String[] args)
    {
        int mat[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };
        int k = 4;

        scalarProductMat(mat, k);

        // to display the resultant matrix
        System.out.println("Scalar Product Matrix is : ");

        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
                System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
}
