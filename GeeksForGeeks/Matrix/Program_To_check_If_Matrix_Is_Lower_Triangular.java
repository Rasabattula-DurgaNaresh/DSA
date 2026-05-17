package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 3:24 PM
 *
 * Given a square matrix and the task is to check the matrix is in lower triangular form or not.
 * A square matrix is called lower triangular if all the entries above the main diagonal are zero.
 *
 * Examples:
 *
 * Input : mat[4][4] = {{1, 0, 0, 0},
 *                      {1, 4, 0, 0},
 *                      {4, 6, 2, 0},
 *                      {0, 4, 7, 6}};
 * Output : Matrix is in lower triangular form.
 *
 * Input : mat[4][4] = {{1, 0, 0, 0},
 *                      {4, 3, 0, 1},
 *                      {7, 9, 2, 0},
 *                      {8, 5, 3, 6}};
 * Output : Matrix is not in lower triangular form.
 *
 * @author DurganNaresh
 */
public class Program_To_check_If_Matrix_Is_Lower_Triangular {
    int N = 4;

    // Function to check matrix is
    // in lower triangular form or not.
    boolean isLowerTriangularMatrix(int mat[][])
    {
        for (int i = 0; i < N; i++)
            for (int j = i + 1; j < N; j++)
                if (mat[i][j] != 0)
                    return false;

        return true;
    }

    // Driver function.
    public static void main(String args[])
    {
        Program_To_check_If_Matrix_Is_Lower_Triangular ob = new Program_To_check_If_Matrix_Is_Lower_Triangular();
        int mat[][] = { { 1, 0, 0, 0 },
                { 1, 4, 0, 0 },
                { 4, 6, 2, 0 },
                { 0, 4, 7, 6 } };

        // Function call
        if (ob.isLowerTriangularMatrix(mat))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
