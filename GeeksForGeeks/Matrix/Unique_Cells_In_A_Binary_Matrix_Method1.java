package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:25 PM
 *
 * @author DurganNaresh
 */
public class Unique_Cells_In_A_Binary_Matrix_Method1 {
    static int MAX = 100;

    static int countUnique(int mat[][], int n, int m)
    {
        int []rowsum = new int[n];
        int []colsum = new int[m];

        // Count number of 1s in each row
        // and in each column
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (mat[i][j] != 0)
                {
                    rowsum[i]++;
                    colsum[j]++;
                }

        // Using above count arrays, find
        // cells
        int uniquecount = 0;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (mat[i][j] != 0 &&
                        rowsum[i] == 1 &&
                        colsum[j] == 1)
                    uniquecount++;
        return uniquecount;
    }

    // Driver code
    public static void main(String[] args)
    {
        int mat[][] = {{0, 1, 0, 0},
                {0, 0, 1, 0},
                {1, 0, 0, 1}};
        System.out.print(countUnique(mat, 3, 4));
    }
}
