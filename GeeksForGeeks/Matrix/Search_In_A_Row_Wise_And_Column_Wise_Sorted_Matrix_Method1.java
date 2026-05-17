package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 30/03/2021 - 9:45 PM
 *
 * Given an n x n matrix and a number x,
 *  * find the position of x in the matrix if it is present in it. Otherwise, print “Not Found”.
 *  *
 *  * Input: mat[4][4] = { {10, 20, 30, 40},
 *  *                       {15, 25, 35, 45},
 *  *                       {27, 29, 37, 48},
 *  *                       {32, 33, 39, 50}};
 *  *               x = 29
 *  * Output: Found at (2, 1)
 *  * Explanation: Element at (2,1) is 29
 *  *
 *  * Input : mat[4][4] = { {10, 20, 30, 40},
 *  *                       {15, 25, 35, 45},
 *  *                       {27, 29, 37, 48},
 *  *                       {32, 33, 39, 50}};
 *  *               x = 100
 *  * Output : Element not found
 *  * Explanation: Element 100 is not found
 *
 * @author DurganNaresh
 */
public class Search_In_A_Row_Wise_And_Column_Wise_Sorted_Matrix_Method1 {
    /* Searches the element x in mat[][]. If the
    element is found, then prints its position
    and returns true, otherwise prints "not found"
    and returns false */
    private static void search(int[][] mat,
                               int n, int x)
    {

        // set indexes for top right
        int i = 0, j = n - 1;
        // element

        while (i < n && j >= 0)
        {
            if (mat[i][j] == x)
            {
                System.out.print("n Found at " +
                        i + " " + j);
                return;
            }
            if (mat[i][j] > x)
                j--;
            else // if mat[i][j] < x
                i++;
        }

        System.out.print("n Element not found");
        return; // if ( i==n || j== -1 )
    }
    // driver program to test above function
    public static void main(String[] args)
    {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        search(mat, 4, 29);
    }
}
