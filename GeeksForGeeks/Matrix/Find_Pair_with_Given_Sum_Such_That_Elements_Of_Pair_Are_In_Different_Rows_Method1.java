package com.durga.Geek_For_Geeks.Matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * created 01/04/2021 - 10:03 AM
 *
 * @author DurganNaresh
 */
public class Find_Pair_with_Given_Sum_Such_That_Elements_Of_Pair_Are_In_Different_Rows_Method1 {
    static int MAX = 100;

    // Function to find pair for given sum in matrix
    // mat[][] --> given matrix
    // n --> order of matrix
    // sum --> given sum for which we need to find pair
    static void pairSum(int mat[][], int n, int sum)
    {

        // Create a hash and store all elements of matrix
        // as keys, and row and column numbers as values
        Map<Integer, ArrayList<Integer>> hm = new HashMap<Integer, ArrayList<Integer>>();
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                hm.put(mat[i][j], new ArrayList<Integer>(Arrays.asList(i, j)) );
            }

        }

        // Traverse the matrix again to check for every
        // element whether its pair exists or not.
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {

                // Look for remaining sum in hash
                int remSum = sum - mat[i][j];

                // If an element with value equal to remaining sum exists
                if(hm.containsKey(remSum))
                {

                    // Find row and column numbers of element with
                    // value equal to remaining sum.
                    ArrayList<Integer> p = hm.get(remSum);
                    int row = p.get(0), col = p.get(1);

                    // If row number of pair is not same as current
                    // row, then print it as part of result.
                    // Second condition is there to make sure that a
                    // pair is printed only once.
                    if (row != i && row > i)
                    {
                        System.out.print("(" + mat[i][j] + "," + mat[row][col] + "), ");
                    }
                }
            }
        }
    }

    // Driver code
    public static void main (String[] args) {
        int n = 4, sum = 11;
        int[][] mat = {{1, 3, 2, 4},
                {5, 8, 7, 6},
                {9, 10, 13, 11},
                {12, 0, 14, 15}};
        pairSum(mat, n, sum);
    }
}
