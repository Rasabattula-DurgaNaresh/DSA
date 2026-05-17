package com.durga.Geek_For_Geeks.Matrix;

/**
 * created 31/03/2021 - 9:06 AM
 *
 * Given a matrix, the task is to find the maximum element of each row.
 *
 * Examples:
 *
 * Input :  [1, 2, 3]
 *          [1, 4, 9]
 *          [76, 34, 21]
 *
 * Output :
 * 3
 * 9
 * 76
 *
 * Input : [1, 2, 3, 21]
 *         [12, 1, 65, 9]
 *         [1, 56, 34, 2]
 * Output :
 * 21
 * 65
 * 56
 *
 * @author DurganNaresh
 */
public class Find_Maximum_Element_Of_Each_Row_In_A_Matrix {
    // Function to get max element
    public static void maxelement(int no_of_rows, int[][] arr) {
        int i = 0;

        // Initialize max to 0 at beginning
        // of finding max element of each row
        int max = 0;
        int[] result = new int[no_of_rows];
        while (i < no_of_rows) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            result[i] = max;
            max =0;
            i++;

        }
        printArray(result);

    }

    // Print array element
    private static void printArray(int[] result) {
        for (int i =0; i<result.length;i++) {
            System.out.println(result[i]);
        }

    }

    // Driver code
    public static void main(String[] args) {
        int[][] arr = new int[][] { {3, 4, 1, 8},
                {1, 4, 9, 11},
                {76, 34, 21, 1},
                {2, 1, 4, 5} };
        // Calling the function
        maxelement(4, arr);
    }
}
