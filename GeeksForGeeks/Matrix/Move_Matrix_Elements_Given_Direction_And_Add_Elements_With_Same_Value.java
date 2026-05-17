package com.durga.Geek_For_Geeks.Matrix;

import java.util.ArrayList;

/**
 * created 31/03/2021 - 10:19 AM
 *
 * Given a matrix m[ ][ ] of size n x n consisting of integers and given a character ‘x’ indicating the direction. Value of ‘x’ can be ‘u’, ‘d’, ‘l’, ‘r’ indicating Up, Down, Left, Right correspondingly. The task is to move the element to given direction such that the consecutive elements having same value are added into single value and shift the rest element. Also, shift the element if the next element in given direction is 0.
 * For example :
 * Consider x = ‘l’ and matrix m[][],
 * 32 3 3
 * 0 0 1
 * 10 10 8
 * After adding 3 in first row, 10 in third row and moving 1 in second row,
 * Matrix will become
 * 32 6 0
 * 1 0 0
 * 20 8 0
 * Examples :
 *
 *
 * Input : x = 'l'
 * m[][] = { { 32, 3, 3, 3, 3 },
 *           { 0, 0, 1, 0, 0 },
 *           { 10, 10, 8, 1, 2},
 *           { 0, 0, 0, 0, 1},
 *           { 4, 5, 6, 7, 8 } }
 * Output :
 * 32 6 6 0 0
 * 1 0 0 0 0
 * 20 8 1 2 0
 * 1 0 0 0 0 0
 * 4 5 6 7 8
 *
 * Input : x = 'u'
 * m[][] = { { 10, 3, 32 },
 *         { 10, 0, 96 },
 *         { 5, 32, 96 } }
 * Output :
 * 20 3 32
 * 5 32 192
 * 0 0 0
 * @author DurganNaresh
 */
public class Move_Matrix_Elements_Given_Direction_And_Add_Elements_With_Same_Value {
    // Function to shift the matrix
    // in the given direction
    static void moveMatrix(char d,
                           int n,
                           int a[][])
    {

        // For right shift move.
        if (d == 'r') {

            // for each row from
            // top to bottom
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> v = new ArrayList<Integer>();
                ArrayList<Integer> w = new ArrayList<Integer>();
                int j;

                // for each element of
                // row from right to left
                for (j = n - 1; j >= 0; j--) {
                    // if not 0
                    if (a[i][j] != 0)
                        v.add(a[i][j]);
                }

                // for each temporary array
                for (j = 0; j < v.size(); j++) {
                    // if two element have
                    // same value at
                    // consecutive position.
                    if (j < v.size() - 1 && v.get(j) == v.get(j + 1)) {
                        // insert only one element
                        // as sum of two same element.
                        w.add(2 * v.get(j));
                        j++;
                    }
                    else
                        w.add(v.get(j));
                }

                // filling the each
                // row element to 0.
                for (j = 0; j < n; j++)
                    a[i][j] = 0;

                j = n - 1;

                // Copying the temporary
                // array to the current row.
                for (int it = 0; it < w.size(); it++)
                    a[i][j--] = w.get(it);
            }
        }

        // for left shift move
        else if (d == 'l') {

            // for each row
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> v = new ArrayList<Integer>();
                ArrayList<Integer> w = new ArrayList<Integer>();
                int j;

                // for each element of the
                // row from left to right
                for (j = 0; j < n; j++) {
                    // if not 0
                    if (a[i][j] != 0)
                        v.add(a[i][j]);
                }

                // for each temporary array
                for (j = 0; j < v.size(); j++) {
                    // if two element have
                    // same value at
                    // consecutive position.
                    if (j < v.size() - 1 && v.get(j) == v.get(j + 1)) {
                        // insert only one
                        // element as sum
                        // of two same element.
                        w.add(2 * v.get(j));
                        j++;
                    }
                    else
                        w.add(v.get(j));
                }

                // filling the each
                // row element to 0.
                for (j = 0; j < n; j++)
                    a[i][j] = 0;

                j = 0;

                for (int it = 0; it < w.size(); it++)
                    a[i][j++] = w.get(it);
            }
        }

        // for down shift move.
        else if (d == 'd') {
            // for each column
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> v = new ArrayList<Integer>();
                ArrayList<Integer> w = new ArrayList<Integer>();
                int j;

                // for each element of
                // column from bottom to top
                for (j = n - 1; j >= 0; j--) {
                    // if not 0
                    if (a[j][i] != 0)
                        v.add(a[j][i]);
                }

                // for each temporary array
                for (j = 0; j < v.size(); j++) {

                    // if two element have
                    // same value at consecutive
                    // position.
                    if (j < v.size() - 1 && v.get(j) == v.get(j + 1)) {
                        // insert only one element
                        // as sum of two same element.
                        w.add(2 * v.get(j));
                        j++;
                    }
                    else
                        w.add(v.get(j));
                }

                // filling the each
                // column element to 0.
                for (j = 0; j < n; j++)
                    a[j][i] = 0;

                j = n - 1;

                // Copying the temporary array
                // to the current column
                for (int it = 0; it < w.size(); it++)
                    a[j--][i] = w.get(it);
            }
        }

        // for up shift move
        else if (d == 'u') {
            // for each column
            for (int i = 0; i < n; i++) {
                ArrayList<Integer> v = new ArrayList<Integer>();
                ArrayList<Integer> w = new ArrayList<Integer>();
                int j;

                // for each element of column
                // from top to bottom
                for (j = 0; j < n; j++) {
                    // if not 0
                    if (a[j][i] != 0)
                        v.add(a[j][i]);
                }

                // for each temporary array
                for (j = 0; j < v.size(); j++) {
                    // if two element have
                    // same value at
                    // consecutive position.
                    if (j < v.size() - 1 && v.get(j) == v.get(j + 1)) {
                        // insert only one element
                        // as sum of two same element.
                        w.add(2 * v.get(j));
                        j++;
                    }
                    else
                        w.add(v.get(j));
                }

                // filling the each
                // column element to 0.
                for (j = 0; j < n; j++)
                    a[j][i] = 0;

                j = 0;

                // Copying the temporary
                // array to the current
                // column
                for (int it = 0; it < w.size(); it++)
                    a[j++][i] = w.get(it);
            }
        }
    }

    // Driver Code
    public static void main(String args[])
    {
        char d = 'l';
        int n = 5;
        int a[][] = { { 32, 3, 3, 3, 3 },
                { 0, 0, 1, 0, 0 },
                { 10, 10, 8, 1, 2 },
                { 0, 0, 0, 0, 1 },
                { 4, 5, 6, 7, 8 } };

        moveMatrix(d, n, a);

        // Printing the
        // final array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                System.out.print(a[i][j] + " ");

            System.out.println();
        }
    }
}
