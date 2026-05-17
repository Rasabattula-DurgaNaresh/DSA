package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 11:34 AM
 * Count frequency of k in a matrix of size n where matrix(i, j) = i+j
 *
 * Difficulty Level : Easy
 * Last Updated : 21 May, 2018
 * Given a matrix of size n*n. Count the frequency of given element k in that matrix. Here base index is 1.
 *
 * Examples:
 *
 * Input : n = 4, k = 7
 * Output : 2
 * Explanation
 * The matrix will be
 * 2 3 4 5
 * 3 4 5 6
 * 4 5 6 7
 * 5 6 7 8
 * in the given matrix where M(i, j) = i+j,
 * frequency of 7 is 2
 *
 * Input : n = 5, k = 4
 * Output : 3
 * Explanation
 * The matrix will be
 * 2 3 4 5 6
 * 3 4 5 6 7
 * 4 5 6 7 8
 * 5 6 7 8 9
 * 6 7 8 9 10
 * Explanation
 * In the given matrix where M(i, j) = i+j,
 * frequency of 4 is 3
 * @author DurganNaresh
 */
public class Count_Frequency_Of_K_Matrix_Of_Size_N {
    public static int find(int n, int k)
    {
        if (n + 1 >= k)
            return (k - 1);
        else
            return (2 * n + 1 - k);
    }

    // Driver function
    public static void main(String argc[])
    {
        int n = 4, k = 7;
        int freq = find(n, k);
        if (freq < 0)
            System.out.print(" element"
                    + " not exist \n ");
        else
            System.out.print(" Frequency"
                    + " of " + k + " is " +
                    freq + "\n");
    }
}
