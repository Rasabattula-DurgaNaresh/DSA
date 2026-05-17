package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 3:34 PM
 *
 * Introduction to Identity Matrix :
 *
 * The dictionary definition of an Identity Matrix is a square matrix in which all the elements of the principal
 * or main diagonal are 1’s and all other elements are zeros.
 * In the below image, every matrix is an Identity Matrix.
 *
 * Examples:
 *
 * Input  : 2
 * Output : 1 0
 *          0 1
 *
 * Input :  4
 * Output : 1 0 0 0
 *          0 1 0 0
 *          0 0 1 0
 *          0 0 0 1
 * The explanation is simple. We need to make all
 * the elements of principal or main diagonal as
 * 1 and everything else as 0.
 *
 * @author DurganNaresh
 */
public class Program_For_Identity_Matrix_Method1 {
    int MAX = 100;

    static boolean isIdentity(int mat[][], int N)
    {
        for (int row = 0; row < N; row++)
        {
            for (int col = 0; col < N; col++)
            {
                if (row == col && mat[row][col] != 1)
                    return false;
                else if (row != col && mat[row][col] != 0)
                    return false;
            }
        }
        return true;
    }

    // Driver Code
    public static void main(String args[])
    {
        int N = 4;
        int mat[][] = {{1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}};

        if (isIdentity(mat, N))
            System.out.println("Yes ");
        else
            System.out.println("No ");
    }
}
