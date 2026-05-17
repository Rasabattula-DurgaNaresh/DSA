package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:27 AM
 *
 * @author DurganNaresh
 */
public class Each_Element_Is_Absolute_Difference_Of_Its_Row_And_Column_numbers_Method2 {
    // Retuen the sum of matrix in which each element
// is absolute difference of its corresponding
// row and column number row
    static int findSum(int n)
    {
        n--;
        int sum = 0;
        sum += (n * (n + 1)) / 2;
        sum += (n * (n + 1) * (2 * n + 1)) / 6;
        return sum;
    }

    // Driver Code
    static public void main (String[] args)
    {
        int n = 3;
        System.out.println(findSum(n));
    }
}
