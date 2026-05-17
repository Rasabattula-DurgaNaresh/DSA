package com.durga.Geek_For_Geeks.Matrix;

import java.util.HashMap;

/**
 * created 01/04/2021 - 10:26 AM
 *
 * @author DurganNaresh
 */
public class isToeplitz {
    static boolean isToeplitz(int[][] matrix)
    {
        // row = number of rows
        // col = number of columns
        int row = matrix.length;
        int col = matrix[0].length;
        // HashMap to store key,value pairs
        HashMap<Integer, Integer> map
                = new HashMap<Integer, Integer>();
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < col; j++)
            {
                int key = i - j;
                // if key value exists in the hashmap,
                if (map.containsKey(key))
                {
                    // we check whether the current value
                    // stored in this key matches to element
                    // at current index or not. If not,
                    // return false
                    if (map.get(key) != matrix[i][j])
                        return false;
                }
                // else we put key,value pair in hashmap
                else {
                    map.put(i - j, matrix[i][j]);
                }
            }
        }
        return true;
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[][] matrix = { { 12, 23, -32 },
                { -20, 12, 23 },
                { 56, -20, 12 },
                { 38, 56, -20 } };

        // Function call
        String result = (isToeplitz(matrix)) ? "Yes" : "No";
        System.out.println(result);
    }

}
