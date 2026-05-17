package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:23 AM
 *
 * Form coils in a matrix
 * Difficulty Level : Medium
 * Last Updated : 20 Mar, 2020
 * Given a positive integer n that represents dimensions of a 4n x 4n matrix with values from 1 to n filled from left to right and top to bottom. Form two coils from matrix and print the coils.
 *
 * Examples:
 *
 * Input  : n = 1;
 * Output : Coil 1 : 10 6 2 3 4 8 12 16
 *          Coil 2 : 7 11 15 14 13 9 5 1
 * Explanation : Matrix is
 * 1  2  3  4
 * 5  6  7  8
 * 9  10 11 12
 * 13 14 15 16
 *
 * Input  : n = 2;
 * Output : Coil 1 : 36 28 20 21 22 30 38 46 54
 *                   53 52 51 50 42 34 26 18 10
 *                   2 3 4 5 6 7 8 16 24 32 40
 *                   48 56 64
 *         Coil 2 : 29 37 45 44 43 35 27 19 11 12
 *                  13 14 15 23 31 39 47 55 63 62
 *                  61 60 59 58 57 49 41 33 25 17
 *                  9 1
 *
 * @author DurganNaresh
 */
public class Form_Coils_In_A_Matrix {
    // Print coils in a matrix of size 4n x 4n
    static void printCoils(int n)
    {
        // Number of elements in each coil
        int m = 8 * n * n;

        // Let us fill elements in coil 1.
        int coil1[] = new int[m];

        // First element of coil1
        // 4*n*2*n + 2*n;
        coil1[0] = 8 * n * n + 2 * n;
        int curr = coil1[0];

        int nflg = 1, step = 2;

        // Fill remaining m-1 elements in coil1[]
        int index = 1;
        while (index < m)
        {
            // Fill elements of current step from
            // down to up
            for (int i = 0; i < step; i++)
            {
                // Next element from current element
                curr = coil1[index++] = (curr - 4 * n * nflg);
                if (index >= m)
                    break;
            }
            if (index >= m)
                break;

            // Fill elements of current step from
            // up to down.
            for (int i = 0; i < step; i++)
            {
                curr = coil1[index++] = curr + nflg;
                if (index >= m)
                    break;
            }

            nflg = nflg * (-1);
            step += 2;
        }

        /* get coil2 from coil1 */
        int coil2[] = new int[m];
        for (int i = 0; i < 8 * n * n; i++)
            coil2[i] = 16 * n * n + 1 - coil1[i];

        // Print both coils
        System.out.print("Coil 1 : ");

        for (int i = 0; i < 8 * n * n; i++)
            System.out.print(coil1[i] + " ");

        System.out.print("\nCoil 2 : ");

        for (int i = 0; i < 8 * n * n; i++)
            System.out.print(coil2[i] + " ");
    }

    // Driver code
    public static void main(String[] args)
    {
        int n = 1;
        printCoils(n);
    }

}
