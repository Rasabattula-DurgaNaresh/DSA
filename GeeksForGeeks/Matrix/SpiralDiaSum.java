package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:31 AM
 *Sum of both diagonals of a spiral odd-order square matrix
 * Difficulty Level : Easy
 * Last Updated : 23 May, 2018
 * We have given a spiral matrix of odd-order, in which we start with the number 1 as center and moving to the right in a clockwise direction.
 *
 * Examples :
 *
 * Input : n = 3
 * Output : 25
 * Explanation : spiral matrix =
 * 7 8 9
 * 6 1 2
 * 5 4 3
 * The sum of diagonals is 7+1+3+9+5 = 25
 *
 * Input : n = 5
 * Output : 101
 * Explanation : spiral matrix of order 5
 * 21 22 23 23 25
 * 20  7  8  9 10
 * 19  6  1  2 11
 * 18  5  4  3 12
 * 17 16 15 14 13
 * The sum of diagonals is 21+7+1+3+13+
 * 25+9+5+17 = 101
 *
 * @author DurganNaresh
 */
public class SpiralDiaSum {
    // function returns sum of diagonals
    static int spiralDiaSum(int n)
    {
        if (n == 1)
            return 1;

        // as order should be only odd
        // we should pass only odd-integers
        return (4 * n * n - 6 * n + 6 +
                spiralDiaSum(n - 2));
    }

    // Driver program to test
    public static void main (String[] args)
    {
        int n = 7;
        System.out.print(spiralDiaSum(n));
    }
}
