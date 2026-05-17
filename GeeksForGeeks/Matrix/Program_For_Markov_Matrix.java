package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 11:01 AM
 *
 * Markov Matrix : The matrix in which the sum of each row is equal to 1.
 *
 * Input :
 * 1    0   0
 * 0.5  0  0.5
 * 0    0   1
 * Output : yes
 *
 * Explanation :
 * Sum of each row results to 1,
 * therefore it is a Markov Matrix.
 *
 * Input :
 * 1 0 0
 * 0 0 2
 * 1 0 0
 * Output :
 * no
 *
 *
 * @author DurganNaresh
 */
public class Program_For_Markov_Matrix {
    static boolean checkMarkov(double m[][])
    {
        // outer loop to access rows
        // and inner to access columns
        for (int i = 0; i < m.length; i++) {

            // Find sum of current row
            double sum = 0;
            for (int j = 0; j < m[i].length; j++)
                sum = sum + m[i][j];

            if (sum != 1)
                return false;
        }

        return true;
    }

    public static void main(String args[])
    {
        // Matrix to check
        double m[][] = { { 0, 0, 1 },
                { 0.5, 0, 0.5 },
                { 1, 0, 0 } };

        // calls the function check()
        if (checkMarkov(m))
            System.out.println(" yes ");
        else
            System.out.println(" no ");
    }
}
