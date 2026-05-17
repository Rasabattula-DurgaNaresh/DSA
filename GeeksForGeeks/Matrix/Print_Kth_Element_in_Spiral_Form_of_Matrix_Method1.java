package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 10:24 AM
 *
 * @author DurganNaresh
 */
public class Print_Kth_Element_in_Spiral_Form_of_Matrix_Method1 {
    static int MAX = 100;

    /* function for Kth element */
    static int findK(int A[][], int i, int j,
                     int n, int m, int k)
    {
        if (n < 1 || m < 1)
            return -1;

        /*.....If element is in outermost ring ....*/
        /* Element is in first row */
        if (k <= m)
            return A[i + 0][j + k - 1];

        /* Element is in last column */
        if (k <= (m + n - 1))
            return A[i + (k - m)][j + m - 1];

        /* Element is in last row */
        if (k <= (m + n - 1 + m - 1))
            return A[i + n - 1][j + m - 1 - (k - (m + n - 1))];

        /* Element is in first column */
        if (k <= (m + n - 1 + m - 1 + n - 2))
            return A[i + n - 1 - (k - (m + n - 1 + m - 1))][j + 0];

        /*.....If element is NOT in outermost ring ....*/
        /* Recursion for sub-matrix. &A[1][1] is
    address to next inside sub matrix.*/
        return findK(A, i + 1, j + 1, n - 2,
                m - 2, k - (2 * n + 2 * m - 4));
    }

    /* Driver code */
    public static void main(String args[])
    {
        int a[][] = { { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 },
                { 13, 14, 15, 16, 17, 18 } };
        int k = 17;
        System.out.println(findK(a, 0, 0, 3, 6, k));
    }
}
