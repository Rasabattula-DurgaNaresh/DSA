package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 02/04/2021 - 9:24 AM
 *Print unique rows in a given boolean matrix
 * Difficulty Level : Hard
 * Last Updated : 25 Nov, 2020
 * Given a binary matrix, print all unique rows of the given matrix.
 *
 * Example:
 *
 * Input:
 *         {0, 1, 0, 0, 1}
 *         {1, 0, 1, 1, 0}
 *         {0, 1, 0, 0, 1}
 *         {1, 1, 1, 0, 0}
 * Output:
 *     0 1 0 0 1
 *     1 0 1 1 0
 *     1 1 1 0 0
 * Explanation:
 * The rows are r1={0, 1, 0, 0, 1},
 * r2={1, 0, 1, 1, 0}, r3={0, 1, 0, 0, 1},
 * r4={1, 1, 1, 0, 0}, As r1 = r3, remove r3
 * and print the other rows.
 *
 * Input:
 *         {0, 1, 0}
 *         {1, 0, 1}
 *         {0, 1, 0}
 * Output:
 *    0 1 0
 *    1 0 1
 * Explanation:
 * The rows are r1={0, 1, 0},
 * r2={1, 0, 1}, r3={0, 1, 0} As r1 = r3,
 * remove r3 and print the other rows.
 * @author DurganNaresh
 */
public class FindUniqueRows {
    static int ROW = 4;
    static int COL = 5;

    // Function that prints all
// unique rows in a given matrix.
    static void findUniqueRows(int M[][])
    {

        // Traverse through the matrix
        for(int i = 0; i < ROW; i++)
        {
            int flag = 0;

            // Check if there is similar column
            // is already printed, i.e if i and
            // jth column match.
            for(int j = 0; j < i; j++)
            {
                flag = 1;

                for(int k = 0; k < COL; k++)
                    if (M[i][k] != M[j][k])
                        flag = 0;

                if (flag == 1)
                    break;
            }

            // If no row is similar
            if (flag == 0)
            {

                // Print the row
                for(int j = 0; j < COL; j++)
                    System.out.print(M[i][j] + " ");

                System.out.println();
            }
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        int M[][] = { { 0, 1, 0, 0, 1 },
                { 1, 0, 1, 1, 0 },
                { 0, 1, 0, 0, 1 },
                { 1, 0, 1, 0, 0 } };

        findUniqueRows(M);
    }
}
