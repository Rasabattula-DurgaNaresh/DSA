package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 9:56 AM
 *
 * Given a square matrix mat[][] and a number k. The task is to shift first k elements of each row in the right of the matrix.
 *
 * Examples :
 *
 * Input : mat[N][N] = {{1, 2, 3},
 *                      {4, 5, 6},
 *                      {7, 8, 9}}
 *         k = 2
 * Output :mat[N][N] = {{3, 1, 2}
 *                      {6, 4, 5}
 *                      {9, 7, 8}}
 *
 * Input : mat[N][N] = {{1, 2, 3, 4}
 *                      {5, 6, 7, 8}
 *                      {9, 10, 11, 12}
 *                      {13, 14, 15, 16}}
 *         k = 2
 * Output :mat[N][N] = {{3, 4, 1, 2}
 *                      {7, 8, 5, 6}
 *                      {11, 12, 9, 10}
 *                      {15, 16, 13, 14}}
 *
 * Note: Matrix should be a square matrix
 *
 * @author DurganNaresh
 */
public class Shift_Matrix_Elements_Row_Wise_By_K {
    static int N = 4;

    // Function to shift first k elements
    // of each row of matrix.
    static void shiftMatrixByK(int [][]mat,
                               int k)
    {
        if (k > N) {
            System.out.print("Shifting is"
                    + " not possible");
            return;
        }

        int j = 0;
        while (j < N) {

            // Print elements from index k
            for (int i = k; i < N; i++)
                System.out.print(mat[j][i] + " ");

            // Print elements before index k
            for (int i = 0; i < k; i++)
                System.out.print(mat[j][i] + " ");

            System.out.println();
            j++;
        }
    }

    // Driver code
    public static void main(String args[])
    {
        int [][]mat = new int [][]
                { {1, 2, 3, 4},
                        {5, 6, 7, 8},
                        {9, 10, 11, 12},
                        {13, 14, 15, 16} };
        int k = 2;

        // Function call
        shiftMatrixByK(mat, k);
    }
}
