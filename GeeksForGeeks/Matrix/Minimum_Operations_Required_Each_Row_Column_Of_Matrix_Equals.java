package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 11:31 AM
 *
 * Given a square matrix of size n \times n. Find minimum number of operation are required such that sum of elements on each row and column becomes equals. In one operation, increment any value of cell of matrix by 1. In first line print minimum operation required and in next ‘n’ lines print ‘n’ integers representing the final matrix after operation.
 * Example:
 *
 * Input:
 * 1 2
 * 3 4
 * Output:
 * 4
 * 4 3
 * 3 4
 * Explanation
 * 1. Increment value of cell(0, 0) by 3
 * 2. Increment value of cell(0, 1) by 1
 * Hence total 4 operation are required
 *
 * Input: 9
 * 1 2 3
 * 4 2 3
 * 3 2 1
 * Output:
 * 6
 * 2 4 3
 * 4 2 3
 * 3 3 3
 *
 * @author DurganNaresh
 */
public class Minimum_Operations_Required_Each_Row_Column_Of_Matrix_Equals {
    // Function to find minimum
    // operation required
    // to make sum of each row
    // and column equals
    static int findMinOpeartion(int matrix[][],
                                int n)
    {
        // Initialize the sumRow[]
        // and sumCol[] array to 0
        int[] sumRow = new int[n];
        int[] sumCol = new int[n];

        // Calculate sumRow[] and
        // sumCol[] array
        for (int i = 0; i < n; ++i)

            for (int j = 0; j < n; ++j)
            {
                sumRow[i] += matrix[i][j];
                sumCol[j] += matrix[i][j];
            }

        // Find maximum sum value
        // in either row or in column
        int maxSum = 0;
        for (int i = 0; i < n; ++i)
        {
            maxSum = Math.max(maxSum, sumRow[i]);
            maxSum = Math.max(maxSum, sumCol[i]);
        }

        int count = 0;
        for (int i = 0, j = 0; i < n && j < n;)
        {
            // Find minimum increment
            // required in either row
            // or column
            int diff = Math.min(maxSum - sumRow[i],
                    maxSum - sumCol[j]);

            // Add difference in
            // corresponding cell,
            // sumRow[] and sumCol[]
            // array
            matrix[i][j] += diff;
            sumRow[i] += diff;
            sumCol[j] += diff;

            // Update the count
            // variable
            count += diff;

            // If ith row satisfied,
            // increment ith value
            // for next iteration
            if (sumRow[i] == maxSum)
                ++i;

            // If jth column satisfied,
            // increment jth value for
            // next iteration
            if (sumCol[j] == maxSum)
                ++j;
        }
        return count;
    }

    // Utility function to
    // print matrix
    static void printMatrix(int matrix[][],
                            int n)
    {
        for (int i = 0; i < n; ++i)
        {
            for (int j = 0; j < n; ++j)
                System.out.print(matrix[i][j] +
                        " ");

            System.out.println();
        }
    }

    /* Driver program */
    public static void main(String[] args)
    {
        int matrix[][] = {{1, 2},
                {3, 4}};

        System.out.println(findMinOpeartion(matrix, 2));
        printMatrix(matrix, 2);

    }
}
