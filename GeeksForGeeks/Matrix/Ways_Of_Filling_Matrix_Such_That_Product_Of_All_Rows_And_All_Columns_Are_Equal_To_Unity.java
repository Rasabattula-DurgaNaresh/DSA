package com.durga.Geek_For_Geeks.Matrix;

import java.io.IOException;

/**
 * created 31/03/2021 - 9:59 PM
 *
 * Ways of filling matrix such that product of all rows and all columns are equal to unity
 *
 * We are given three values n, m and k where n is number of rows in matrix,
 * m is number of columns in the matrix and k is the number that can have only two values -1 and 1.
 * Our aim is to find the number of ways of filling the matrix of  n \times m such that the product of all the elements in each row and each column is equal to k.
 * Since the number of ways can be large we will output ans \mod{1000000007}
 *
 * Examples:
 *
 * Input : n = 2, m = 4, k = -1
 * Output : 8
 * Following configurations satisfy the conditions:-
 * Different configirations
 * different configurations
 *
 * Input  : n = 2, m = 1, k = -1
 * Output : The number of filling the matrix
 *          are 0
 * Recommended: Please try your approach on {IDE} first, before moving on to the solution.
 * From the above conditions, it is clear that the only elements that can be entered in the matrix are 1 and -1. Now we can easily deduce some of the corner cases
 *
 * If k = -1, then the sum of number of rows and columns cannot be odd because -1 will be present odd
 * number of times in each row and column therefore if the sum is odd then answer is 0.
 * If n = 1 or m = 1 then there is only one way of filling the matrix therefore answer is 1.
 * If none of the above cases are applicable then we fill the first n-1 rows and the first m-1 columns with 1 and -1. Then the remaining numbers can be uniquely identified since the product of each row an each column is already known therefore the answer is 2 ^ {(n-1) \times (m-1)}.
 * @author DurganNaresh
 */
public class Ways_Of_Filling_Matrix_Such_That_Product_Of_All_Rows_And_All_Columns_Are_Equal_To_Unity {
    final static long mod = 100000007;

    /* Returns a raised power t under modulo mod */
    static long modPower(long a, long t, long mod)
    {
        long now = a, ret = 1;

        // Counting number of ways of filling the
        // matrix
        while (t > 0) {
            if (t % 2 == 1)
                ret = now * (ret % mod);
            now = now * (now % mod);
            t >>= 1;
        }
        return ret;
    }

    // Function calculating the answer
    static long countWays(int n, int m, int k)
    {
        // if sum of numbers of rows and columns is
        // odd i.e (n + m) % 2 == 1 and k = -1,
        // then there are 0 ways of filiing the matrix.
        if (n == 1 || m == 1)
            return 1;

            // If there is one row or one column then
            // there is only one way of filling the matrix
        else if ((n + m) % 2 == 1 && k == -1)
            return 0;

        // If the above cases are not followed then we
        // find ways to fill the n - 1 rows and m - 1
        // columns which is 2 ^ ((m-1)*(n-1)).
        return (modPower(modPower((long)2, n - 1, mod),
                m - 1, mod) % mod);
    }

    // Driver function for the program
    public static void main(String args[]) throws IOException
    {
        int n = 2, m = 7, k = 1;
        System.out.println(countWays(n, m, k));
    }
}
