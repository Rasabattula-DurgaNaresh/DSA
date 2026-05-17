package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 02/04/2021 - 9:20 AM
 *
 * Given a Boolean Matrix, find k such that all elements in k’th row are 0 and k’th column are 1.
 * Difficulty Level : Hard
 * Last Updated : 24 Dec, 2018
 * Given a square boolean matrix mat[n][n], find k such that all elements in k’th row are 0 and all elements in k’th column are 1. The value of mat[k][k] can be anything (either 0 or 1). If no such k exists, return -1.
 *
 * Examples:
 *
 * Input: bool mat[n][n] = { {1, 0, 0, 0},
 *                           {1, 1, 1, 0},
 *                           {1, 1, 0, 0},
 *                           {1, 1, 1, 0},
 *                         };
 * Output: 0
 * All elements in 0'th row are 0 and all elements in
 * 0'th column are 1.  mat[0][0] is 1 (can be any value)
 *
 *
 * Input: bool mat[n][n] = {{0, 1, 1, 0, 1},
 *                          {0, 0, 0, 0, 0},
 *                          {1, 1, 1, 0, 0},
 *                          {1, 1, 1, 1, 0},
 *                          {1, 1, 1, 1, 1}};
 * Output: 1
 * All elements in 1'st row are 0 and all elements in
 * 1'st column are 1.  mat[1][1] is 0 (can be any value)
 *
 *
 * Input: bool mat[n][n] = {{0, 1, 1, 0, 1},
 *                          {0, 0, 0, 0, 0},
 *                          {1, 1, 1, 0, 0},
 *                          {1, 0, 1, 1, 0},
 *                          {1, 1, 1, 1, 1}};
 * Output: -1
 * There is no k such that k'th row elements are 0 and
 * k'th column elements are 1.
 * Expected time complexity is O(n)
 *
 * We strongly recommend you to minimize your browser and try this yourself first.
 *
 * A Simple Solution is check all rows one by one. If we find a row ‘i’ such that all elements of this row are 0 except mat[i][i] which may be either 0 or 1, then we check all values in column ‘i’. If all values are 1 in the column, then we return i. Time complexity of this solution is O(n2).
 *
 * An Efficient Solution can solve this problem in O(n) time. The solution is based on below facts.
 * 1) There can be at most one k that can be qualified to be an answer (Why? Note that if k’th row has all 0’s probably except mat[k][k], then no column can have all 1′)s.
 * 2) If we traverse the given matrix from a corner (preferably from top right and bottom left), we can quickly discard complete row or complete column based on below rules.
 * ….a) If mat[i][j] is 0 and i != j, then column j cannot be the solution.
 * ….b) If mat[i][j] is 1 and i != j, then row i cannot be the solution.
 *
 * Below is complete algorithm based on above observations.
 *
 * 1) Start from top right corner, i.e., i = 0, j = n-1.
 *    Initialize result as -1.
 *
 * 2) Do following until we find the result or reach outside the matrix.
 *
 * ......a) If mat[i][j] is 0, then check all elements on left of j in current row.
 * .........If all elements on left of j are also 0, then set result as i. Note
 * .........that i may not be result, but if there is a result, then it must be i
 * .........(Why? we reach mat[i][j] after discarding all rows above it and all
 * .........columns on right of it)
 *
 * .........If all left side elements of i'th row are not 0, them this row cannot
 * .........be a solution, increment i.
 *
 * ......b) If mat[i][j] is 1, then check all elements below i in current column.
 * .........If all elements below i are 1, then set result as j. Note that j may
 * ......... not be result, but if there is a result, then it must be j
 *
 * .........If all elements of j'th column are not 1, them this column cannot be a
 * .........solution decrement j.
 *
 * 3) If result is -1, return it.
 *
 * 4) Else check validity of result by checking all row and column
 *           elements of result
 * @author DurganNaresh
 */
public class Find {
    static int n = 5;

    static int find(boolean arr[][]) {
        // Start from top-most rightmost corner
        // (We could start from other corners also)
        int i = 0, j = n - 1;

        // Initialize result
        int res = -1;

        // Find the index (This loop runs at most 2n times, we either
        // increment row number or decrement column number)
        while (i < n && j >= 0) {
            // If current element is false, then this row may be a solution
            if (arr[i][j] == false) {
                // Check for all elements in this row
                while (j >= 0 && (arr[i][j] == false || i == j)) {
                    j--;
                }

                // If all values are false, then store this row as result
                if (j == -1) {
                    res = i;
                    break;
                } // We reach here if we found a 1 in current row, so this
                //  row cannot be a solution, increment row number
                else {
                    i++;
                }
            } else // If current element is 1
            {
                // Check for all elements in this column
                while (i < n && (arr[i][j] == true || i == j)) {
                    i++;
                }

                // If all elements are 1
                if (i == n) {
                    res = j;
                    break;
                } // We reach here if we found a 0 in current column, so this
                // column cannot be a solution, increment column number
                else {
                    j--;
                }
            }
        }

        // If we could not find result in above loop, then result doesn't exist
        if (res == -1) {
            return res;
        }

        // Check if above computed res is valid
        for (int k = 0; k < n; k++) {
            if (res != k && arr[k][res] != true) {
                return -1;
            }
        }
        for (int l = 0; l < n; l++) {
            if (res != l && arr[res][l] != false) {
                return -1;
            }
        }

        return res;
    }

    /* Driver program to test above functions */
    public static void main(String[] args) {
        boolean mat[][] = {{false, false, true, true, false},
                {false, false, false, true, false},
                {true, true, true, true, false},
                {false, false, false, false, false},
                {true, true, true, true, true}};
        System.out.println(find(mat));
    }
}
