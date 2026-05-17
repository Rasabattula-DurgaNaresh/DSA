package com.durga.Geek_For_Geeks.Arrays;

/**
 * created 20/04/2021 - 10:38 AM
 *
 * @author DurganNaresh
 *
 * Input : arr[] = {1, 3, 5, 7, 9}
 *         k1 = 1
 *         k2 = 3
 *         k3 = 4
 *         k4 = 6
 * Output : 3 5 7 9 1
 *          7 9 1 3 5
 *          9 1 3 5 7
 *          3 5 7 9 1
 *
 * Input : arr[] = {1, 3, 5, 7, 9}
 *         k1 = 14
 * Output : 9 1 3 5 7
 *
 *
 */
public class Quickly_Find_Multiple_Left_Rotations_Of_An_Array_Set1_Method1 {
    // Function to left rotate
// an array k times
    static void leftRotate(int arr[],
                           int n, int k)
    {
        // Print array after
        // k rotations
        for (int i = k; i < k + n; i++)
            System.out.print(arr[i % n] + " ");
    }

    // Driver Code
    public static void main (String[] args)
    {
        int arr[] = {1, 3, 5, 7, 9};
        int n = arr.length;

        int k = 2;
        leftRotate(arr, n, k);
        System.out.println();

        k = 3;
        leftRotate(arr, n, k);
        System.out.println();

        k = 4;
        leftRotate(arr, n, k);
        System.out.println();
    }
}
