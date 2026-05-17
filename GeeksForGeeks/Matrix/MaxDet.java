package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 01/04/2021 - 9:30 AM
 *
 * Maximum determinant of a matrix with every values either 0 or n
 * Difficulty Level : Easy
 * Last Updated : 30 Nov, 2018
 * We have given a positive number n, and we have to find a 3*3 matrix which can be formed with combination of 0 or n and has maximum determinant.
 *
 * Examples :
 *
 * Input : n = 3
 * Output : Maximum determinant = 54
 * Resultant Matrix :
 * 3 3 0
 * 0 3 3
 * 3 0 3
 *
 * Input : n = 13
 * Output : Maximum determinant = 4394
 * Resultant Matrix :
 * 13 13  0
 * 0  13 13
 * 13  0 13
 * Explanation:
 * For any 3*3 matrix having elements either 0 or n, the maximum possible determinant is 2*(n^3).. Also a matrix having maximum determinant is of form:
 * n n 0
 * 0 n n
 * n 0 0
 *
 * @author DurganNaresh
 */
public class MaxDet {
    // Function for maximum determinant
    static int maxDet(int n)
    {
        return (2 * n * n * n);
    }


    // Function to print resulatant matrix
    void resMatrix(int n)
    {
        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                // three position where 0 appears
                if (i == 0 && j == 2)
                    System.out.print("0 ");
                else if (i == 1 && j == 0)
                    System.out.print("0 ");
                else if (i == 2 && j == 1)
                    System.out.print("0 ");

                    // position where n appears
                else
                    System.out.print(n +" ");
            }
            System.out.println("");
        }
    }

    // Driver code
    static public void main (String[] args)
    {
        int n = 15;
        MaxDet geeks=new MaxDet();
        System.out.println("Maximum Determinant = "
                + maxDet(n));

        System.out.println("Resultant Matrix :");
        geeks.resMatrix(n);

    }
}
