package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 11:25 AM
 *
 * Given a  {m}\times{n}  matrix A and a  {p}\times{q}  matrix B, their Kronecker product C = A tensor B, also called their matrix direct product, is an  {(mp)}\times{(nq)}  matrix.
 *
 * A tensor B =  |a11B   a12B|
 *               |a21B   a22B|
 *
 * = |a11b11   a11b12   a12b11  a12b12|
 *   |a11b21   a11b22   a12b21  a12b22|
 *   |a11b31   a11b32   a12b31  a12b32|
 *   |a21b11   a21b12   a22b11  a22b12|
 *   |a21b21   a21b22   a22b21  a22b22|
 *   |a21b31   a21b32   a22b31  a22b32|
 * Examples :
 *
 * 1. The matrix direct(kronecker) product of the 2×2 matrix A
 *    and the 2×2 matrix B is given by the 4×4 matrix :
 *
 * Input : A = 1 2    B = 0 5
 *             3 4        6 7
 *
 * Output : C = 0  5  0  10
 *              6  7  12 14
 *              0  15 0  20
 *              18 21 24 28
 *
 * 2. The matrix direct(kronecker) product of the 2×3 matrix A
 *    and the 3×2 matrix B is given by the 6×6 matrix :
 *
 * Input : A = 1 2    B = 0 5 2
 *             3 4        6 7 3
 *             1 0
 *
 * Output : C = 0      5    2    0     10    4
 *              6      7    3   12     14    6
 *              0     15    6    0     20    8
 *             18     21    9   24     28   12
 *              0      5    2    0      0    0
 *              6      7    3    0      0    0
 *
 * @author DurganNaresh
 */
public class Kronecker_Product_Of_Two_Matrices {
    // rowa and cola are no of rows and columns
    // of matrix A
    // rowb and colb are no of rows and columns
    // of matrix B
    static int cola = 2, rowa = 3, colb = 3, rowb = 2;

    // Function to computes the Kronecker Product
    // of two matrices
    static void Kroneckerproduct(int A[][], int B[][])
    {

        int[][] C= new int[rowa * rowb][cola * colb];

        // i loops till rowa
        for (int i = 0; i < rowa; i++)
        {

            // k loops till rowb
            for (int k = 0; k < rowb; k++)
            {

                // j loops till cola
                for (int j = 0; j < cola; j++)
                {

                    // l loops till colb
                    for (int l = 0; l < colb; l++)
                    {

                        // Each element of matrix A is
                        // multiplied by whole Matrix B
                        // resp and stored as Matrix C
                        C[i + l + 1][j + k + 1] = A[i][j] * B[k][l];
                        System.out.print( C[i + l + 1][j + k + 1]+" ");
                    }
                }
                System.out.println();
            }
        }
    }

    // Driver program
    public static void main (String[] args)
    {
        int A[][] = { { 1, 2 },
                { 3, 4 },
                { 1, 0 } };

        int B[][] = { { 0, 5, 2 },
                { 6, 7, 3 } };

        Kroneckerproduct(A, B);
    }
}
