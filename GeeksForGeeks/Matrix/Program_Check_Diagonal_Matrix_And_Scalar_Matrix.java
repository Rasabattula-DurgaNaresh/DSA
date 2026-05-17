package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 11:03 AM
 *
 * A square matrix is said to be diagonal matrix if the elements of matrix except main diagonal are zero.
 * A square null matrix is also a diagonal matrix whose main diagonal elements are zero.
 * Examples :
 *
 * Input :
 * Mat[4][0] = {{4, 0, 0, 0},
 *              {0, 5, 0, 0},
 *              {0, 0, 2, 0},
 *          {0, 0, 0, 1}}
 * Output : Yes
 *
 * Mat[4][0] = {{6, 10, 12, 0},
 *              {0, 5, 0, 0},
 *              {0, 0, 9, 0},
 *              {0, 0, 0, 1}}
 * Output : No
 *
 * Diagonal matrix:
 *
 * A square matrix is said to be diagonal matrix if the elements of matrix except main diagonal are zero. A square null matrix is also a diagonal matrix whose main diagonal elements are zero.
 * Examples :
 *
 * Input :
 * Mat[4][0] = {{4, 0, 0, 0},
 *              {0, 5, 0, 0},
 *              {0, 0, 2, 0},
 *          {0, 0, 0, 1}}
 * Output : Yes
 *
 * Mat[4][0] = {{6, 10, 12, 0},
 *              {0, 5, 0, 0},
 *              {0, 0, 9, 0},
 *              {0, 0, 0, 1}}
 * Output : No
 *
 * Scalar matrix:
 *
 * A square matrix is said to be scalar matrix if all the main diagonal elements are equal and other
 * elements except main diagonal are zero. Scalar matrix can also be written in form of n * I,
 * where n is any real number and I is the identity matrix.
 *
 * Examples:
 *
 * Input :
 * Mat[4][4] = {{4, 0, 0, 0},
 *              {0, 4, 0, 0},
 *              {0, 0, 4, 0},
 *              {0, 0, 0, 4}}
 * Output : Yes
 *
 * Mat[4][4] = {{4, 0, 0, 0},
 *              {0, 4, 0, 0},
 *              {0, 0, 1, 0},
 *              {0, 0, 0, 4}}
 * Output : No
 *
 * @author DurganNaresh
 */
public class Program_Check_Diagonal_Matrix_And_Scalar_Matrix {
    static int N = 4;

    // Function to check matrix
    // is diagonal matrix
    // or not.
    static boolean isDiagonalMatrix(int mat[][])
    {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)

                // condition to check
                // other elements
                // except main diagonal
                // are zero or not.
                if ((i != j) &&
                        (mat[i][j] != 0))
                    return false;

        return true;
    }
    // Function to check matrix
    // is scalar matrix or not.
    static boolean isScalarMatrix(int mat[][])
    {
        // Check all elements
        // except main diagonal are
        // zero or not.
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if ((i != j)
                        && (mat[i][j] != 0))
                    return false;

        // Check all diagonal elements
        // are same or not.
        for (int i = 0; i < N - 1; i++)
            if (mat[i][i] != mat[i + 1][i + 1])
                return false;
        return true;
    }

    // Driver function
    public static void main(String args[])
    {
        int mat[][] = { { 4, 0, 0, 0 },
                { 0, 7, 0, 0 },
                { 0, 0, 5, 0 },
                { 0, 0, 0, 1 } };

        if (isDiagonalMatrix(mat) && isScalarMatrix(mat))
            System.out.println("Yes");
        else
            System.out.println("No" );
    }
}
