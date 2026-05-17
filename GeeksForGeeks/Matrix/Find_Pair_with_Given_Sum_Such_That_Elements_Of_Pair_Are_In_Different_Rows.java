package com.durga.Geek_For_Geeks.Matrix;

import java.util.Arrays;

/**
 * created 01/04/2021 - 10:02 AM
 *
 * Find pairs with given sum such that elements of pair are in different rows
 * Difficulty Level : Medium
 * Last Updated : 10 Mar, 2021
 * Given a matrix of distinct values and a sum. The task is to find all the pairs in given whose summation is equal to given sum. Each element of pair must be from different rows i.e; pair must not lie in same row.
 * Examples:
 *
 *
 * Input : mat[4][4] = {{1, 3, 2, 4},
 *                      {5, 8, 7, 6},
 *                      {9, 10, 13, 11},
 *                      {12, 0, 14, 15}}
 *         sum = 11
 * Output: (1, 10), (3, 8), (2, 9), (4, 7), (11, 0)
 *
 * Sort all the rows in ascending order. Time complexity for this preprocessing will be O(n2 logn).
 * Now we will select each row one by one and find pair element in remaining rows after current row.
 * Take two iterators left and right. left iterator points left corner of current i’th row and right iterator points right corner of next j’th row in which we are going to find pair element.
 * If mat[i][left] + mat[j][right] < sum then left++ i.e; move in i’th row towards right corner, otherwise right++ i.e; move in j’th row towards left corner.
 *
 * @author DurganNaresh
 */
public class Find_Pair_with_Given_Sum_Such_That_Elements_Of_Pair_Are_In_Different_Rows {
    static final int MAX = 100;

    // Function to find pair for given sum in
// matrix mat[][] --> given matrix
// n --> order of matrix
// sum --> given sum for which we need to find pair
    static void pairSum(int mat[][], int n, int sum) {

        // First sort all the rows in ascending order
        for (int i = 0; i < n; i++)
            Arrays.sort(mat[i]);

        // Select i'th row and find pair for element in i'th
        // row in j'th row whose summation is equal to given sum
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int left = 0, right = n - 1;
                while (left < n && right >= 0) {
                    if ((mat[i][left] + mat[j][right]) == sum) {
                        System.out.print("(" + mat[i][left] + ", " +
                                mat[j][right] + "), ");
                        left++;
                        right--;
                    }
                    else {
                        if ((mat[i][left] + mat[j][right]) < sum)
                            left++;
                        else
                            right--;
                    }
                }
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        int n = 4, sum = 11;
        int mat[]
                [] = {{1 ,  3,  2,  4},
                {5 ,  8,  7,  6},
                {9 , 10, 13, 11},
                {12,  0, 14, 15}};
        pairSum(mat, n, sum);
    }
}
