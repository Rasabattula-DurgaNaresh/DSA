package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 11:28 AM
 *
 * In mathematics, a square matrix is said to be diagonally dominant if for every row of the matrix, the magnitude of the diagonal entry in a row is larger than or equal to the sum of the magnitudes of all the other (non-diagonal) entries in that row. More precisely, the matrix A is diagonally dominant if
 *
 * is diagonally dominant because
 * |a11| ≥ |a12| + |a13| since |+3| ≥ |-2| + |+1|
 * |a22| ≥ |a21| + |a23| since |-3| ≥ |+1| + |+2|
 * |a33| ≥ |a31| + |a32| since |+4| ≥ |-1| + |+2|
 *
 * Given a matrix A of n rows and n columns. The task is tho check whether matrix A is diagonally dominant or not.
 *
 * Examples :
 *
 * Input : A = { { 3, -2, 1 },
 *               { 1, -3, 2 },
 *               { -1, 2, 4 } };
 * Output : YES
 * Given matrix is diagonally dominant
 * because absolute value of every diagonal
 * element is more than sum of absolute values
 * of corresponding row.
 *
 * Input : A = { { -2, 2, 1 },
 *               { 1, 3, 2 },
 *               { 1, -2, 0 } };
 * Output : NO
 *
 * @author DurganNaresh
 */
public class Diagonally_Dominant_Matrix {
    // check the given given matrix is Diagonally
    // Dominant Matrix or not.
    static boolean isDDM(int m[][], int n)
    {
        // for each row
        for (int i = 0; i < n; i++)
        {

            // for each column, finding
            //sum of each row.
            int sum = 0;
            for (int j = 0; j < n; j++)
                sum += Math.abs(m[i][j]);

            // removing the diagonal element.
            sum -= Math.abs(m[i][i]);

            // checking if diagonal element is less
            // than sum of non-diagonal element.
            if (Math.abs(m[i][i]) < sum)
                return false;

        }

        return true;
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int n = 3;
        int m[][] = { { 3, -2, 1 },
                { 1, -3, 2 },
                { -1, 2, 4 } };

        if (isDDM(m, n))
            System.out.println("YES") ;
        else
            System.out.println("NO");

    }
}
