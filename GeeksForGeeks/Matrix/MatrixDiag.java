package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:58 AM
 *
 * @author DurganNaresh
 */
public class MatrixDiag {
    public static void main(String[] args)
    {
        // Initialize matrix
        int[][] mat = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        // n - size
        // mode - switch to derive up/down traversal
        // it - iterator count - increases until it
        // reaches n and then decreases
        int n = 4, mode = 0, it = 0, lower = 0;

        // 2n will be the number of iterations
        for (int t = 0; t < (2 * n - 1); t++) {
            int t1 = t;
            if (t1 >= n) {
                mode++;
                t1 = n - 1;
                it--;
                lower++;
            }
            else {
                lower = 0;
                it++;
            }
            for (int i = t1; i >= lower; i--) {
                if ((t1 + mode) % 2 == 0) {
                    System.out.println(mat[i][t1 + lower - i]);
                }
                else {
                    System.out.println(mat[t1 + lower - i][i]);
                }
            }
        }
    }
}
