package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 02/04/2021 - 9:01 AM
 *
 * Find orientation of a pattern in a matrix
 * Difficulty Level : Hard
 * Last Updated : 31 Dec, 2020
 * Given a matrix of characters and a pattern, find the orientation of pattern in the matrix. In other words, find if pattern appears in matrix in horizontal or vertical direction. Achieve this in minimum time possible.
 *
 * Input:
 * mat[N][N] = { {'a', 'b', 'c', 'd', 'e'},
 *               {'f', 'g', 'h', 'i', 'j'},
 *               {'k', 'l', 'm', 'n', 'o'},
 *               {'p', 'q', 'r', 's', 't'},
 *               {'u', 'v', 'w', 'x', 'y'}};
 * pattern = "pqrs";
 *
 * Output: Horizontal
 *
 * @author DurganNaresh
 */
public class Find_Orientation_Of_A_Pattern_In_A_Matrix {
    public static int N = 5;

    // Used in KMP Search for preprocessing the pattern
    public static void computeLPSArray(char pat[],
                                       int M, int lps[])
    {

        // length of the previous longest prefix suffix
        int len = 0;
        int i = 1;
        lps[0] = 0; // lps[0] is always 0

        // the loop calculates lps[i] for i = 1 to M-1
        while(i < M)
        {
            if(pat[i] == pat[len])
            {
                len++;
                lps[i++] = len;
            }
            else    // (pat[i] != pat[len])
            {
                if(len != 0)
                {

                    // This is tricky. Consider the example
                    // AAACAAAA and i = 7.
                    len = lps[len - 1];

                    // Also, note that we do not increment i here
                }
                else    // if (len == 0)
                {
                    lps[i++] = 0;
                }
            }
        }

    }
    public static int KMPSearch(char pat[], char txt[])
    {
        int M = pat.length;

        // create lps[] that will hold the longest
        // prefix suffix values for pattern
        int[] lps = new int[M];
        int j = 0; // index for pat[]

        // Preprocess the pattern (calculate lps[] array)
        computeLPSArray(pat, M, lps);

        int i = 0; // index for txt[]

        while(i < N)
        {
            if(pat[j] == txt[i])
            {
                j++;
                i++;
            }
            if(j == M)
            {

                // return 1 is pattern is found
                return 1;
            }

            // mismatch after j matches
            else if(i < N && pat[j] != txt[i])
            {

                // Do not match lps[0..lps[j-1]] characters,
                // they will match anyway
                if(j != 0)
                {
                    j = lps[j - 1];

                }
                else
                {
                    i = i + 1;
                }
            }
        }

        // return 0 is pattern is not found
        return 0;
    }

    // Function to find orientation of pattern in the matrix
    // It uses KMP pattern searching algorithm
    public static void findOrientation(char mat[][], char pat[])
    {

        // allocate memory for string contaning cols
        char[] col = new char[N];
        for(int i = 0; i < N; i++)
        {

            // search in row i
            if(KMPSearch(pat, mat[i]) == 1)
            {
                System.out.println("Horizontal");
                return;
            }

            // Construct an array to store i'th column
            for(int j = 0; j < N; j++)
            {
                col[j] = mat[j][i];
            }

            // Search in column i
            if(KMPSearch(pat, col) == 1)
            {
                System.out.println("Vertical");
            }
        }
    }

    // Driver Code
    public static void main (String[] args)
    {
        char[][] mat = {
                {'a', 'b', 'c', 'd', 'e'},{'f', 'g', 'h', 'i', 'j'},
                {'k', 'l', 'm', 'n', 'o'},{'p', 'q', 'r', 's', 't'},
                {'u', 'v', 'w', 'x', 'y'}};
        char pat[] = {'p','q','r','s'};
        findOrientation(mat, pat);
    }
}
