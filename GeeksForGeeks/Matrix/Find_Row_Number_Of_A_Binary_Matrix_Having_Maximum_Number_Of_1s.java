package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:36 PM
 *
 * Find row number of a binary matrix having maximum number of 1s
 * Difficulty Level : Medium
 * Last Updated : 08 Jan, 2019
 * Given a binary matrix (containing only 0 and 1) of order n*n. All rows are sorted already, We need to find the row number with maximum number of 1s. Also find number of 1 in that row.
 * Note: in case of tie, print smaller row number.
 *
 * Examples :
 *
 * Input : mat[3][3] = {0, 0, 1,
 *                      0, 1, 1,
 *                      0, 0, 0}
 * Output : Row number = 2, MaxCount = 2
 *
 * Input : mat[3][3] = {1, 1, 1,
 *                      1, 1, 1,
 *                      0, 0, 0}
 * Output : Row number = 1, MaxCount = 3
 *
 * @author DurganNaresh
 */
public class Find_Row_Number_Of_A_Binary_Matrix_Having_Maximum_Number_Of_1s {
    static final int N = 4;

    // function for finding row with maximum 1
    static void findMax(int arr[][]) {

        int row = 0, i, j;

        for (i = 0, j = N - 1; i < N; i++) {

            // find left most position of 1 in
            // a row find 1st zero in a row
            while (j >= 0 && arr[i][j] == 1) {

                row = i;
                j--;
            }
        }

        System.out.print("Row number = "
                + (row + 1));
        System.out.print(", MaxCount = "
                + (N - 1 - j));
    }

    // Driver code
    public static void main(String[] args) {
        int arr[][] = {{0, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 1, 1, 1}};
        findMax(arr);
    }
}
