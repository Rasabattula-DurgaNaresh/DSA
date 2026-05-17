package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:44 PM
 *
 * Print all palindromic paths from top left to bottom right in a matrix
 * Difficulty Level : Medium
 * Last Updated : 29 Apr, 2019
 * Given a matrix containing lower alphabetical characters only, we need to print all palindromic paths in given matrix. A path is defined as a sequence of cells starting from top-left cell and ending at bottom-right cell. We are allowed to move to right and down only from current cell. We cannot go down diagonally.
 * Example:
 *
 * Input : mat[][] = {"aaab”,
 *                    "baaa”
 *                    “abba”}
 * Output :aaaaaa, aaaaaa, abaaba
 *
 * Explanation :
 * aaaaaa (0, 0) -> (0, 1) -> (1, 1) ->
 *        (1, 2) -> (1, 3) -> (2, 3)
 * aaaaaa (0, 0) -> (0, 1) -> (0, 2) ->
 *        (1, 2) -> (1, 3) -> (2, 3)
 * abaaba (0, 0) -> (1, 0) -> (1, 1) ->
 *        (1, 2) -> (2, 2) -> (2, 3)
 *
 * @author DurganNaresh
 */
public class PalinPath {
    public static boolean isPalin(String str)
    {
        int len = str.length() / 2;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1))
                return false;
        }
        return true;
    }

    // i and j are row and column indexes of current cell
    // (initially these are 0 and 0).
    public static void palindromicPath(String str, char a[][],
                                       int i, int j, int m, int n)
    {

        // If we have not reached bottom right corner, keep
        // exlporing
        if (j < m - 1 || i < n - 1) {
            if (i < n - 1)
                palindromicPath(str + a[i][j], a, i + 1, j, m, n);
            if (j < m - 1)
                palindromicPath(str + a[i][j], a, i, j + 1, m, n);
        }

        // If we reach bottom right corner, we check if
        // if the path used is palindrome or not.
        else {
            str = str + a[n - 1][m - 1];
            if (isPalin(str))
                System.out.println(str);
        }
    }

    // Driver code
    public static void main(String args[])
    {
        char arr[][] = { { 'a', 'a', 'a', 'b' },
                { 'b', 'a', 'a', 'a' },
                { 'a', 'b', 'b', 'a' } };
        String str = "";
        palindromicPath(str, arr, 0, 0, 4, 3);
    }
}
