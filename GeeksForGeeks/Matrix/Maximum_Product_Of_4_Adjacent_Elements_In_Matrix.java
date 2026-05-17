package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 11:38 AM
 *
 * Given a square matrix, find the maximum product of four adjacent elements of matrix. The adjacent elements of matrix can be top, down, left, right, diagonal or anti diagonal. The four or more numbers should be adjacent to each other.
 *
 * Note: n should be greater than or equal to 4 i.e n >= 4
 *
 * Examples :
 *
 * Input : n = 4
 *         {{6, 2, 3 4},
 *          {5, 4, 3, 1},
 *          {7, 4, 5, 6},
 *          {8, 3, 1, 0}}
 *
 * Output : 1680
 *
 * Explanation:
 * Multiplication of 6 5 7 8 produces maximum
 * result and all element are adjacent to
 * each other in one direction
 *
 * Input : n = 5
 *         {{1, 2, 3, 4, 5},
 *          {6, 7, 8, 9, 1},
 *          {2, 3, 4, 5, 6},
 *          {7, 8, 9, 1, 0},
 *          {9, 6, 4, 2, 3}}
 *
 *
 * Output: 3024
 *
 * Explanation:
 * Multiplication of 6 7 8 9 produces maximum
 * result and all elements are adjacent to
 * each other in one direction.
 *
 * @author DurganNaresh
 */
public class Maximum_Product_Of_4_Adjacent_Elements_In_Matrix {
    static final int n = 5;

    // function to find max product
    static int FindMaxProduct(int arr[][], int n)
    {
        int max = 0, result;

        // iterate the rows.
        for (int i = 0; i < n; i++)
        {
            // iterate the columns.
            for (int j = 0; j < n; j++)
            {
                // check the maximum product
                // in horizontal row.
                if ((j - 3) >= 0)
                {
                    result = arr[i][j] * arr[i][j - 1]
                            * arr[i][j - 2]
                            * arr[i][j - 3];
                    if (max < result)
                        max = result;
                }

                // check the maximum product
                // in vertical row.
                if ((i - 3) >= 0)
                {
                    result = arr[i][j] * arr[i - 1][j]
                            * arr[i - 2][j]
                            * arr[i - 3][j];

                    if (max < result)
                        max = result;
                }

                // check the maximum product in
                // diagonal (going through down - right)
                if ((i - 3) >= 0 && (j - 3) >= 0)
                {
                    result = arr[i][j] * arr[i - 1][j - 1]
                            * arr[i - 2][j - 2]
                            * arr[i - 3][j - 3];

                    if (max < result)
                        max = result;
                }

                // check the maximum product in
                // diagonal (going through up - right)
                if ((i - 3) >= 0 && (j - 1) <= 0)
                {
                    result = arr[i][j] * arr[i - 1][j + 1]
                            * arr[i - 2][j + 2]
                            * arr[i - 3][j + 3];

                    if (max < result)
                        max = result;
                }
            }
        }

        return max;
    }

    // Driver code
    public static void main(String[] args)
    {

        /* int arr[][4] = {{6, 2, 3, 4},
                           {5, 4, 3, 1},
                           {7, 4, 5, 6},
                           {8, 3, 1, 0}};*/
        /* int arr[][5] = {{1, 2, 1, 3, 4},
                           {5, 6, 3, 9, 2},
                           {7, 8, 8, 1, 2},
                           {1, 0, 7, 9, 3},
                           {3, 0, 8, 4, 9}};*/

        int arr[][] = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 1 },
                { 2, 3, 4, 5, 6 },
                { 7, 8, 9, 1, 0 },
                { 9, 6, 4, 2, 3 } };

        System.out.print(FindMaxProduct(arr, n));
    }
}
