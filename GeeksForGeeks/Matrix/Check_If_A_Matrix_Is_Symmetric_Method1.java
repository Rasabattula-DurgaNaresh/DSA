package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:39 PM
 *
 * @author DurganNaresh
 */
public class Check_If_A_Matrix_Is_Symmetric_Method1 {
    static int MAX = 100;

    // Returns true if mat[N][N]
// is symmetric, else false
    static boolean isSymmetric(int mat[][], int N)
    {
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                if (mat[i][j] != mat[j][i])
                    return false;
        return true;
    }

// Driver code

    public static void main (String[] args)
    {
        int mat[][] = { { 1, 3, 5 },
                { 3, 2, 4 },
                { 5, 4, 1 } };

        if (isSymmetric(mat, 3))
            System.out.println(  "Yes");
        else

            System.out.println("NO");

    }
}
