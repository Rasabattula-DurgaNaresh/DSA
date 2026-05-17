package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 10:23 PM
 *
 * Minimum cost to sort a matrix of numbers from 0 to n^2 – 1
 * Difficulty Level : Easy
 * Last Updated : 11 Oct, 2019
 * Given an n x n matrix containing all the numbers in the range 0 to n2-1. The problem is to calculate the total energy required for rearranging all the numbers in the matrix in strictly increasing order, i.e., after the rearrangement the 1st row contains ‘n’ numbers from 0 to n-1, then 2nd row from n to 2n-1 and so on up to the last or nth row. A number can be moved in any of the four directions left, right, top or bottom from its current position to reach its destination in the final modified matrix. The number of steps moved in transferring a number from its current location to its required destination is the energy required by the number for its movement. For example, in a 4 x 4 matrix, number ‘6’ is present at location (2, 3). Its destination location in the modified matrix is (1, 1). So ‘6’ is moved 2 steps towards left and 1 step up to reach location (1, 1). Total 3 steps moved and thus energy required by ‘6’ is 3 units. In this way we have to sum up all the energies required in the movement / rearrangement of all the numbers.
 *
 * Examples :
 *
 * Input : mat[][] = { {3, 0},
 *                     {2, 1} }
 * Output : 4 units
 * For number '3':
 * Move it one step right and one step down.
 * Total 2 steps thus energy required = 2 units.
 *
 * For number '0':
 * Move it one step left.
 * Total 1 step thus energy required = 1 unit.
 *
 * For number '1':
 * Move it one step up.
 * Total 1 step thus energy required = 1 unit.
 *
 * Total energy required = 4 units.
 *
 * Input : mat[][] = { {4, 7, 10, 3},
 *                 {8, 5, 6, 1},
 *                   {9, 11, 10, 2},
 *             {15, 13, 14, 12} }
 * Output : 22 units
 *
 * @author DurganNaresh
 */
public class Minimum_Cost_To_Sort_A_Matrix_Of_Numbers_From {
    private final static int SIZE  = 100;

    // function to find the total energy
    // required to rearrange the numbers
    public static int calculateEnergy(int mat[][],
                                      int n)
    {
        int i_des, j_des, q;
        int tot_energy = 0;

        // nested loops to access the elements
        // of the given matrix
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                // store quotient
                q = mat[i][j] / n;

                // final destination location
                // (i_des, j_des) of
                // the element mat[i][j] is
                // being calculated
                i_des = q;
                j_des = mat[i][j] - (n * q);

                // energy required for the
                // movement of the
                // element mat[i][j] is
                // calculated and then
                // accumulated in the 'tot_energy'
                tot_energy += Math.abs(i_des - i) +
                        Math.abs(j_des - j);
            }
        }

        // required total energy
        return tot_energy;
    }

    // Driver function
    public static void main(String argc[]){

        int[][] mat = new int[][] {{ 4, 7, 0, 3 },
                { 8, 5, 6, 1 },
                { 9, 11, 10, 2 },
                { 15, 13, 14, 12 }};

        int n = 4;

        System.out.println("Total energy required = "
                + calculateEnergy(mat, n) + " units");
    }

}
