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
public class Maximum_Product_Of_4_Adjacent_Elements_In_Matrix_Method1 {
    public static int maxPro(int[][] a,
                             int n, int m,
                             int k)
    {
        int maxi = 1, mp = 1;
        for (int i = 0; i < n; ++i)
        {
            // Window Product for each row.
            int wp = 1;
            for (int l = 0; l < k; ++l)
            {
                wp *= a[i][l];
            }

            // Maximum window product for each row
            mp = wp;
            for (int j = k; j < m; ++j)
            {
                wp = wp * a[i][j] / a[i][j - k];

                // Global maximum
                // window product
                maxi = Math.max(
                        maxi,
                        Math.max(mp, wp));
            }
        }
        return maxi;
    }

    // Driver Code
    public static void main(String[] args)
    {


        int n = 6, m = 5, k = 4;
        int[][] a = new int[][] {
                { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 1 },
                { 2, 3, 4, 5, 6 }, { 7, 8, 9, 1, 0 },
                { 9, 6, 4, 2, 3 }, { 1, 1, 2, 1, 1 }
        };


        // Function call
        int maxpro = maxPro(a, n, m, k);
        System.out.println(maxpro);
    }
}
