package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:21 AM
 *
 * Find number of transformation to make two Matrix Equal
 * Difficulty Level : Hard
 * Last Updated : 17 Jun, 2020
 * Given two matrices A and B of order n*m. The task is to find the required number of transformation steps so that both matrices became equal, print -1 if it is not possible.
 * Transformation step is as:
 * i) Select any one matrix out of two matrices.
 * ii) Choose either row/column of the selected matrix.
 * iii) Increment every element of select row/column by 1.
 *
 * Examples :
 *
 * Input :
 * A[2][2]: 1 1
 *          1 1
 * B[2][2]: 1 2
 *          3 4
 * Output : 3
 * Explanation :
 * 1 1   ->   1 2   ->   1 2   ->   1 2
 * 1 1   ->   1 2   ->   2 3   ->   3 4
 *
 * Input :
 * A[2][2]: 1 1
 *          1 0
 * B[2][2]: 1 2
 *          3 4
 * Output : -1
 * Explanation : No transformation will make A and B equal.
 *
 * The key steps behind the solution of this problem are:
 *
 * -> Incrementing any row of A[][] is same as decrementing the same row of B[][]. So, we can have the solution after having the transformation on only one matrix either incrementing or decrementing.
 *
 * So make A[i][j] = A[i][j] - B[i][j].
 * For example,
 * If given matrices are,
 * A[2][2] : 1 1
 *           1 1
 * B[2][2] : 1 2
 *           3 4
 * After subtraction, A[][] becomes,
 * A[2][2] : 0 -1
 *          -2 -3
 * -> For every transformation either 1st row/ 1st column element necessarily got changed, same is true for other i-th row/column.
 * -> If ( A[i][j] – A[i][0] – A[0][j] + A[0][0] != 0) then no solution exists.
 *
 * -> Elements of 1st row and 1st column only leads to result.
 *
 * // Update matrix A[][]
 * // so that only A[][]
 * // has to be transformed
 * for (i = 0; i < n; i++)
 *     for (j = 0; j < m; j++)
 *         A[i][j] -= B[i][j];
 *
 * // Check necessary condition
 * // For condition for
 * // existence of full transformation
 * for (i = 1; i < n; i++)
 *     for (j = 1; j < m; j++)
 *         if (A[i][j] - A[i][0] - A[0][j] + A[0][0] != 0)
 *             return -1;
 *
 * // If transformation is possible
 * // calculate total transformation
 * result = 0;
 * for (i = 0; i < n; i++)
 *     result += abs(A[i][0])
 * for (j = 0; j < m; j++)
 *     result += abs(A[0][j] - A[0][0]);
 * return abs(result);
 *
 * @author DurganNaresh
 */
public class Number_Of_Transformation_To_Make_Two_Matrix_Equal {
    static int countOps(int A[][], int B[][],
                        int m, int n)
    {

        // Update matrix A[][] so that only
        // A[][] has to be countOpsed
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                A[i][j] -= B[i][j];

        // Check necessary condition for
        // condition for existence of full
        // countOpsation
        for (int i = 1; i < n; i++)
            for (int j = 1; j < m; j++)
                if (A[i][j] - A[i][0] -
                        A[0][j] + A[0][0] != 0)
                    return -1;

        // If countOpsation is possible
        // calculate total countOpsation
        int result = 0;

        for (int i = 0; i < n; i++)
            result += Math.abs(A[i][0]);

        for (int j = 0; j < m; j++)
            result += Math.abs(A[0][j] - A[0][0]);

        return (result);
    }

    // Driver code
    public static void main (String[] args)
    {
        int A[][] = { {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1} };

        int B[][] = { {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9} };

        System.out.println(countOps(A, B, 3, 3)) ;

    }
}
