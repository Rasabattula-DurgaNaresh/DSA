package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 9:55 AM
 *
 * Given a matrix mat[][] having n rows and m columns. We need to find unique elements in matrix i.e, those elements which are not repeated in the matrix or those elements whose frequency is 1.
 *
 * Examples:
 *
 * Input :  20  15  30  2
 *          2   3   5   30
 *          6   7   6   8
 * Output : 3  20  5  7  8  15
 *
 * Input :  1  2  3
 *          5  6  2
 *          1  3  5
 *          6  2  2
 * Output : No unique element in the matrix
 *
 * @author DurganNaresh
 */
public class Find_Unique_Elements_In_Matrix {
    static int R = 4, C = 4;

    // function that calculate
// unique element
    static void unique(int mat[][],
                       int n, int m)
    {
        int maximum = 0, flag = 0;
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)

                // Find maximum element
                // in a matrix
                if(maximum < mat[i][j])
                    maximum = mat[i][j];

        // Take 1-D array of
        // (maximum + 1) size
        int b[] = new int [maximum + 1];
        for(int i = 0 ; i < n; i++)
            for(int j = 0; j < m; j++)
                b[mat[i][j]]++;

        //print unique element
        for(int i = 1; i <= maximum; i++)
            if(b[i] == 1)
                System.out.print(i + " ");
        flag = 1;

        if(flag == 0)
        {
            System.out.println("No unique element " +
                    "in the matrix");
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        int mat[][] = {{1, 2, 3, 20},
                {5, 6, 20, 25},
                {1, 3, 5, 6},
                {6, 7, 8, 15}};

        // function that calculate
        // unique element
        unique(mat, R, C);
    }
}
