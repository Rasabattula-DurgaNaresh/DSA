package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:13 AM
 *
 * @author DurganNaresh
 */
public class swapDiagonal {
    static int N = 3;

    // Function to swap diagonal of matrix
    static void swapDiagonal(int matrix[][]) {
        for (int i = 0; i < N; i++) {
            int temp = matrix[i][i];
            matrix[i][i] = matrix[i][N - i - 1];
            matrix[i][N - i - 1] = temp;
        }
    }

    // Driver function
    public static void main(String arg[]) {
        int matrix[][] = {{0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}};

        swapDiagonal(matrix);

        // Displaying modified matrix
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
}
