package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 02/04/2021 - 8:56 AM
 *
 * Print n x n spiral matrix using O(1) extra space
 * Difficulty Level : Hard
 * Last Updated : 03 Jul, 2018
 * Given a number n, print a n x n spiral matrix (of numbers from 1 to n x n) in clockwise direction using O(1) space.
 * Example :
 *
 * Input: n = 5
 * Output:
 * 25 24 23 22 21
 * 10  9  8  7 20
 * 11  2  1  6 19
 * 12  3  4  5 18
 * 13 14 15 16 17
 * We strongly recommend you to minimize your browser and try this yourself first.
 *
 * The solution becomes simple if extra space is allowed. We allocate memory for n x n matrix and for every element starting from n*n to 1, we start filling out matrix in spiral order. To maintain the spiral order four loops are used, each for top, right, bottom and left corner of the matrix.
 *
 * But how to solve it in O(1) space?
 *
 * An n x n matrix has ceil(n/2) square cycles. A cycle is formed by ith row, (n-i+1)th column, (n-i+1)th row and ith column where i varies from 1 to ceil(n/2).
 *
 * 25 24 23 22 21
 * 10 9  8  7  20
 * 11 2  1  6  19
 * 12 3  4  5  18
 * 13 14 15 16 17
 * The first cycle is formed by elements of its first row, last column, last row and first column (marked by red). The first cycle consists of elements from n*n to (n-2)*(n-2) + 1. i.e. from 25 to 10.
 * The second cycle is formed by elements of second row, second-last column, second-last row and second column(marked by blue). The second cycle consists of elements from (n-2)*(n-2) to (n-4)*(n-4) + 1. i.e. from 9 to 2.
 * The third cycle is formed by elements of third row, third-last column, third-last row and third column(marked by black). The third cycle consists of elements from (n-4)*(n-4) to 1. i.e. only 1.
 * The idea is for each square cycle, we associate a marker to it. For outer cycle, the marker will have value 0, for second cycle, it will have value 1 and for third cycle it has value 2. In general for a n x n matrix, i’th cycle will have marker value of i – 1.
 *
 * If we divide the matrix into two parts, upper right triangle(marked by orange) and lower left triangle(marked by green), then using the marker x, we can easily calculate the value that will be present at the index(i, j) in any n x n spiral matrix using the below formula –
 *
 * 25  24 23 22 21
 * 10  9  8  7  20
 * 11  2  1  6  19
 * 12  3  4  5  18
 * 13  14 15 16 17
 * For upper right half,
 * mat[i][j] = (n-2*x)*(n-2*x)-(i-x)-(j-x)
 *
 * For lower left half,
 * mat[i][j] = (n-2*x-2)*(n-2*x-2) + (i-x) + (j-x)
 *
 * @author DurganNaresh
 */
public class Print_N_N_Spiral_Matrix_Clockwise_Direction {
    // Prints spiral matrix of size n x n
    // containing numbers from 1 to n x n
    static void printSpiral(int n)
    {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                // x stores the layer in which (i, j)th
                // element lies
                int x;

                // Finds minimum of four inputs
                x = Math.min(Math.min(i, j),
                        Math.min(n - 1 - i, n - 1 - j));

                // For upper right half
                if (i <= j)
                    System.out.print((n - 2 * x) * (n - 2 * x) -
                            (i - x) - (j - x) + "\t");

                    // for lower left half
                else
                    System.out.print((n - 2 * x - 2) * (n - 2 * x - 2) +
                            (i - x) + (j - x) + "\t");
            }
            System.out.println();
        }
    }

    // Driver code
    public static void main(String args[])
    {
        int n = 5;

        // print a n x n spiral matrix in O(1) space
        printSpiral(n);
    }
}
