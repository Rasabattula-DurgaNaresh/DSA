package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 3:45 PM
 *
 * A matrix is a two-dimensional data object made of m rows and n columns, therefore having total m x n values. If most of the elements of the matrix have 0 value, then it is called a sparse matrix.
 *
 * Why to use Sparse Matrix instead of simple matrix ?
 *
 * Storage: There are lesser non-zero elements than zeros and thus lesser memory can be used to store only those elements.
 * Computing time: Computing time can be saved by logically designing a data structure traversing only non-zero elements..
 * Example:
 *
 * 0 0 3 0 4
 * 0 0 5 7 0
 * 0 0 0 0 0
 * 0 2 6 0 0
 *
 * @author DurganNaresh
 */
public class Sparse_Matrix_And_Its_Representations_Set1_Using_Arrays{
    public static void main(String[] args)
    {
        int sparseMatrix[][]
                = {
                {0, 0, 3, 0, 4},
                {0, 0, 5, 7, 0},
                {0, 0, 0, 0, 0},
                {0, 2, 6, 0, 0}
        };

        int size = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (sparseMatrix[i][j] != 0)
                {
                    size++;
                }
            }
        }

        // number of columns in compactMatrix (size) must be
        // equal to number of non - zero elements in
        // sparseMatrix
        int compactMatrix[][] = new int[3][size];

        // Making of new matrix
        int k = 0;
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                if (sparseMatrix[i][j] != 0)
                {
                    compactMatrix[0][k] = i;
                    compactMatrix[1][k] = j;
                    compactMatrix[2][k] = sparseMatrix[i][j];
                    k++;
                }
            }
        }

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < size; j++)
            {
                System.out.printf("%d ", compactMatrix[i][j]);
            }
            System.out.printf("\n");
        }
    }
}
