package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:26 AM
 *
 * @author DurganNaresh
 */
public class Each_Element_Is_Absolute_Difference_Of_Its_Row_And_Column_numbers_Method1 {
    // Retuen the sum of matrix in which each
// element is absolute difference of its
// corresponding row and column number row
    static int findSum(int n)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += i * (n - i);
        return 2 * sum;
    }

    // Driver Code
    static public void main(String[] args)
    {
        int n = 3;
        System.out.println(findSum(n));
    }
}
