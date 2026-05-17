package com.durga.Geek_For_Geeks.Matrix;

import java.util.Arrays;

/**
 * created 31/03/2021 - 11:27 AM
 *
 * Given a n x n matrix of integers and a positive integer k. The problem is to count all sub-matrices having sum divisible by the given value k.
 *
 * Examples:
 *
 * Input : mat[][] = { {5, -1, 6},
 *             {-2, 3, 8},
 *             {7, 4, -9} }
 *
 *         k = 4
 *
 * Output : 6
 * The index range for the sub-matrices are:
 * (0, 0) to (0, 1)
 * (1, 0) to (2, 1)
 * (0, 0) to (2, 1)
 * (2, 1) to (2, 1)
 * (0, 1) to (1, 2)
 * (1, 2) to (1, 2)
 * @author DurganNaresh
 */
public class Count_Sub_Matrices_Having_Sum_Divisible_K {
    static final int SIZE = 10;

    // function to count all
// sub-arrays divisible by k
    static int subCount(int arr[], int n, int k)
    {
        // create auxiliary hash array to
        // count frequency of remainders
        int mod[] = new int[k];
        Arrays.fill(mod, 0);

        // Traverse original array and compute cumulative
        // sum take remainder of this current cumulative
        // sum and increase count by 1 for this remainder
        // in mod[] array
        int cumSum = 0;
        for (int i = 0; i < n; i++) {
            cumSum += arr[i];

            // as the sum can be negative,
            // taking modulo twice
            mod[((cumSum % k) + k) % k]++;
        }

        // Initialize result
        int result = 0;

        // Traverse mod[]
        for (int i = 0; i < k; i++)

            // If there are more than one prefix subarrays
            // with a particular mod value.
            if (mod[i] > 1)
                result += (mod[i] * (mod[i] - 1)) / 2;

        // add the subarrays starting from the arr[i]
        // which are divisible by k itself
        result += mod[0];

        return result;
    }

    // function to count all sub-matrices
// having sum divisible by the value 'k'
    static int countSubmatrix(int mat[][], int n, int k)
    {
        // Variable to store the final output
        int tot_count = 0;

        int left, right, i;
        int temp[] = new int[n];

        // Set the left column
        for (left = 0; left < n; left++) {

            // Initialize all elements of temp as 0
            Arrays.fill(temp, 0);

            // Set the right column for the left column
            // set by outer loop
            for (right = left; right < n; right++) {

                // Calculate sum between current left
                // and right for every row 'i'
                for (i = 0; i < n; ++i)
                    temp[i] += mat[i][right];

                // Count number of subarrays in temp[]
                // having sum divisible by 'k' and then
                // add it to 'tot_count'
                tot_count += subCount(temp, n, k);
            }
        }

        // required count of sub-matrices having sum
        // divisible by 'k'
        return tot_count;
    }

    // Driver code
    public static void main(String[] args)
    {
        int mat[][] = {{5, -1, 6},
                {-2, 3, 8},
                {7, 4, -9}};
        int n = 3, k = 4;
        System.out.print("Count = " +
                countSubmatrix(mat, n, k));
    }
}
