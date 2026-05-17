package com.durga.Geek_For_Geeks.Matrix;

import java.util.Arrays;

/**
 * created 31/03/2021 - 8:56 AM
 *
 * Given a n x n matrix. The problem is to find all the distinct elements common to all rows of the matrix. The elements can be printed in any order.
 * Examples:
 *
 * Input : mat[][] = {  {2, 1, 4, 3},
 *                      {1, 2, 3, 2},
 *                      {3, 6, 2, 3},
 *                      {5, 2, 5, 3}  }
 * Output : 2 3
 *
 * Input : mat[][] = {  {12, 1, 14, 3, 16},
 *                      {14, 2, 1, 3, 35},
 *                      {14, 1, 14, 3, 11},
 *                      {14, 25, 3, 2, 1},
 *                      {1, 18, 3, 21, 14}  }
 * Output : 1 3 14
 *
 * @author DurganNaresh
 */
public class Find_Distinct_Elements_Common_To_All_Rows_Of_Matrix {
    // function to individually sort
    // each row in increasing order
    public static void sortRows(int mat[][], int n)
    {
        for (int i=0; i<n; i++)
            Arrays.sort(mat[i]);
    }

    // function to find all the common elements
    public static void findAndPrintCommonElements(int mat[][],
                                                  int n)
    {
        // sort rows individually
        sortRows(mat, n);

        // current column index of each row is stored
        // from where the element is being searched in
        // that row
        int curr_index[] = new int[n];

        int f = 0;

        for (; curr_index[0]<n; curr_index[0]++)
        {
            // value present at the current column index
            // of 1st row
            int value = mat[0][curr_index[0]];

            boolean present = true;

            // 'value' is being searched in all the
            // subsequent rows
            for (int i=1; i<n; i++)
            {
                // iterate through all the elements of
                // the row from its current column index
                // till an element greater than the 'value'
                // is found or the end of the row is
                // encountered
                while (curr_index[i] < n &&
                        mat[i][curr_index[i]] <= value)
                    curr_index[i]++;

                // if the element was not present at the
                // column before to the 'curr_index' of the
                // row
                if (mat[i][curr_index[i]-1] != value)
                    present = false;

                // if all elements of the row have
                // been traversed
                if (curr_index[i] == n)
                {
                    f = 1;
                    break;
                }
            }

            // if the 'value' is common to all the rows
            if (present)
                System.out.print(value+" ");

            // if any row have been completely traversed
            // then no more common elements can be found
            if (f == 1)
                break;
        }
    }

    /* Driver program to test above function */
    public static void main(String[] args)
    {
        int mat[][] = {  {12, 1, 14, 3, 16},
                {14, 2, 1, 3, 35},
                {14, 1, 14, 3, 11},
                {14, 25, 3, 2, 1},
                {1, 18, 3, 21, 14}
        };

        int n = 5;
        findAndPrintCommonElements(mat, n);
    }
}
