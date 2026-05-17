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
public class Program_For_Identity_Matrix {
    static int identity(int num)
    {
        int row, col;

        for (row = 0; row < num; row++)
        {
            for (col = 0; col < num; col++)
            {
                // Checking if row is equal to column
                if (row == col)
                    System.out.print( 1+" ");
                else
                    System.out.print( 0+" ");
            }
            System.out.println();
        }
        return 0;
    }

    // Driver Code
    public static void main(String args[])
    {
        int size = 5;
        identity(size);
    }
}
